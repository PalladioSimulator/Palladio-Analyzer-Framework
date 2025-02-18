package org.palladiosimulator.analyzer.workflow.jobs;

import org.palladiosimulator.analyzer.workflow.core.ConstantsContainer;
import org.palladiosimulator.analyzer.workflow.core.configurations.AbstractCodeGenerationWorkflowRunConfiguration;

import de.uka.ipd.sdq.workflow.jobs.SequentialBlackboardInteractingJob;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.MDSDBlackboard;

public class LoadMiddlewareConfigurationIntoBlackboardJob extends SequentialBlackboardInteractingJob<MDSDBlackboard> {

    @Deprecated
	public static final String RMI_MIDDLEWARE_PARTITION_ID = ConstantsContainer.RMI_MIDDLEWARE_REPOSITORY_PARTITION_ID;
	
	@Deprecated
	public static final String EVENT_MIDDLEWARE_PARTITION_ID = ConstantsContainer.EVENT_MIDDLEWARE_REPOSITORY_PARTITION_ID;

	public LoadMiddlewareConfigurationIntoBlackboardJob(AbstractCodeGenerationWorkflowRunConfiguration config) {
        add(new CreateBlackboardPartitionJob(ConstantsContainer.RMI_MIDDLEWARE_REPOSITORY_PARTITION_ID));
        add(new CreateBlackboardPartitionJob(ConstantsContainer.EVENT_MIDDLEWARE_REPOSITORY_PARTITION_ID));
        LoadModelIntoBlackboardJob.parseUriAndAddModelLoadJob(config.getRMIMiddlewareFile(),
                ConstantsContainer.RMI_MIDDLEWARE_REPOSITORY_PARTITION_ID, this);
        LoadModelIntoBlackboardJob.parseUriAndAddModelLoadJob(config.getEventMiddlewareFile(),
                ConstantsContainer.EVENT_MIDDLEWARE_REPOSITORY_PARTITION_ID, this);
	}

	@Override
    public String getName() {
		return "Load Middleware Configuration into Blackboard";
	}

}
