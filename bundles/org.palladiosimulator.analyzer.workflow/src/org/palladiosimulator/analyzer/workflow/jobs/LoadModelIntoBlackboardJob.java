package org.palladiosimulator.analyzer.workflow.jobs;

import java.util.Collections;
import java.util.Objects;
import java.util.Optional;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;

import de.uka.ipd.sdq.workflow.jobs.AbstractBlackboardInteractingJob;
import de.uka.ipd.sdq.workflow.jobs.CleanupFailedException;
import de.uka.ipd.sdq.workflow.jobs.ICompositeJob;
import de.uka.ipd.sdq.workflow.jobs.JobFailedException;
import de.uka.ipd.sdq.workflow.jobs.UserCanceledException;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.MDSDBlackboard;

public class LoadModelIntoBlackboardJob extends AbstractBlackboardInteractingJob<MDSDBlackboard> {

    private final URI modelURI;
    private final String partitionID;
    
    public static void parseUriAndAddModelLoadJob(String modelUri, ICompositeJob container) {
        parseUriAndAddModelLoadJob(modelUri, LoadPCMModelsIntoBlackboardJob.PCM_MODELS_PARTITION_ID, container);
    }
    
    public static void parseUriAndAddModelLoadJob(String modelUri, String partitionId, ICompositeJob container) {
        if (modelUri == null || modelUri.isBlank()) return;
        if (partitionId == null || partitionId.isBlank()) return;
        
        var uri = URI.createURI(modelUri);
        container.addJob(new LoadModelIntoBlackboardJob(uri, partitionId));
    }
    
    public LoadModelIntoBlackboardJob(URI modelURI, String partitionID) {
        this.modelURI = Objects.requireNonNull(modelURI);
        this.partitionID = Objects.requireNonNull(partitionID);
    }
    
    @Override
    public void execute(IProgressMonitor monitor) throws JobFailedException, UserCanceledException {
        var partition = Optional.ofNullable(myBlackboard.getPartition(partitionID))
            .orElseThrow(() -> new IllegalStateException(String.format("The blackboard does not contain the requested partition \"%s\"", partitionID)));

        if (!partition.getResourceSet().getURIConverter().exists(modelURI, Collections.emptyMap())) {
            throw new JobFailedException(String.format("Job %s failed: The model uri \"%s\" does not point to a valid file", getName(), modelURI));
        }
        
        partition.loadModel(modelURI);        
    }

    @Override
    public void cleanup(IProgressMonitor monitor) throws CleanupFailedException {
        // Nothing to do here, blackboard partitions are not reused
    }

    @Override
    public String getName() {
        return String.format("LoadModelIntoBlackboardJob<%s->%s>", modelURI.lastSegment(), partitionID);
    }


}
