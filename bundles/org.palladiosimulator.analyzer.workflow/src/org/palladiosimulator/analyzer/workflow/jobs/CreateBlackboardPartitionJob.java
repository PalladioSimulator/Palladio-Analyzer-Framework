package org.palladiosimulator.analyzer.workflow.jobs;

import java.util.function.Supplier;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.IProgressMonitor;

import de.uka.ipd.sdq.workflow.jobs.AbstractBlackboardInteractingJob;
import de.uka.ipd.sdq.workflow.jobs.CleanupFailedException;
import de.uka.ipd.sdq.workflow.jobs.JobFailedException;
import de.uka.ipd.sdq.workflow.jobs.UserCanceledException;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.MDSDBlackboard;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.ResourceSetPartition;

public class CreateBlackboardPartitionJob extends AbstractBlackboardInteractingJob<MDSDBlackboard> {
    
    /** The logger for this class */
    private static final Logger LOGGER = Logger.getLogger(CreateBlackboardPartitionJob.class);

    private final String blackboardId;
    private final Supplier<ResourceSetPartition> partitionSupplier;

    public CreateBlackboardPartitionJob(String blackboardId) {
        this(blackboardId, ResourceSetPartition::new);
    }
    
    public CreateBlackboardPartitionJob(String blackboardId, Supplier<ResourceSetPartition> partitionSupplier) {
        this.blackboardId = blackboardId;
        this.partitionSupplier = partitionSupplier;
    }
    
    @Override
    public void execute(IProgressMonitor monitor) throws JobFailedException, UserCanceledException {
        var partition = partitionSupplier.get();
        
        if (myBlackboard.hasPartition(blackboardId)) {
            LOGGER.warn("The blackboard already contained a partition with id:" + blackboardId);
        }
        
        myBlackboard.addPartition(blackboardId, partition);
    }

    @Override
    public void cleanup(IProgressMonitor monitor) throws CleanupFailedException {
    }

    @Override
    public String getName() {
        return "Create Blackboard Partition \"" + blackboardId + "\"";
    }

}
