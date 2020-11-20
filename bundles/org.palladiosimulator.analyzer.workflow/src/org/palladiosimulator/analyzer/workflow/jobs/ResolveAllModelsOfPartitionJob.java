package org.palladiosimulator.analyzer.workflow.jobs;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.util.EcoreUtil;

import de.uka.ipd.sdq.workflow.jobs.AbstractBlackboardInteractingJob;
import de.uka.ipd.sdq.workflow.jobs.CleanupFailedException;
import de.uka.ipd.sdq.workflow.jobs.JobFailedException;
import de.uka.ipd.sdq.workflow.jobs.UserCanceledException;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.MDSDBlackboard;

public class ResolveAllModelsOfPartitionJob extends AbstractBlackboardInteractingJob<MDSDBlackboard> {

    private final String blackboardId;

    public ResolveAllModelsOfPartitionJob(String blackboardId) {
        this.blackboardId = blackboardId;
    }
    
    @Override
    public void execute(IProgressMonitor monitor) throws JobFailedException, UserCanceledException {
        var partition = myBlackboard.getPartition(blackboardId);
        
        EcoreUtil.resolveAll(partition.getResourceSet());
    }

    @Override
    public void cleanup(IProgressMonitor monitor) throws CleanupFailedException {
    }

    @Override
    public String getName() {
        return "Resolve all models of Partition \"" + blackboardId + "\"";
    }

}
