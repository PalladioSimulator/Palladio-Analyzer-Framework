package org.palladiosimulator.analyzer.workflow.jobs;

import org.palladiosimulator.analyzer.workflow.ConstantsContainer;

import de.uka.ipd.sdq.workflow.jobs.SequentialBlackboardInteractingJob;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.MDSDBlackboard;

/**
 * Creates and fills the PCM model partition.
 * 
 * @author Sebastian Lehrig
 */
public class PreparePCMBlackboardPartitionJob extends SequentialBlackboardInteractingJob<MDSDBlackboard> {
    
    public PreparePCMBlackboardPartitionJob() {
        this(ConstantsContainer.DEFAULT_PCM_INSTANCE_PARTITION_ID);
    }
    
    public PreparePCMBlackboardPartitionJob(String partitionId) {
        add(new CreateBlackboardPartitionJob(partitionId));
        add(new LoadSharedPCMLibrariesIntoBlackboard(partitionId));
    }

    @Override
    public String getName() {
        return "Prepare PCM Blackboard Partitions";
    }
}
