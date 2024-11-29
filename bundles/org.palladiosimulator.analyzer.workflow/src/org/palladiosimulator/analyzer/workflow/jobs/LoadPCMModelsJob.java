package org.palladiosimulator.analyzer.workflow.jobs;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.core.runtime.IProgressMonitor;
import org.palladiosimulator.analyzer.workflow.core.ConstantsContainer;
import org.palladiosimulator.analyzer.workflow.core.configurations.AbstractPCMWorkflowRunConfiguration;

import de.uka.ipd.sdq.workflow.jobs.CleanupFailedException;
import de.uka.ipd.sdq.workflow.jobs.IBlackboardInteractingJob;
import de.uka.ipd.sdq.workflow.jobs.IJob;
import de.uka.ipd.sdq.workflow.jobs.JobFailedException;
import de.uka.ipd.sdq.workflow.jobs.SequentialBlackboardInteractingJob;
import de.uka.ipd.sdq.workflow.jobs.UserCanceledException;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.MDSDBlackboard;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.ResourceSetPartition;

/**
 * Loads the PCM models given in the configuration into a MDSD blackboard and store the models in a
 * temporary eclipse project. The temporary storage allows to transform and modify input PCM models
 * without a modification of the source models and can be accessed after the analysis to check the
 * model used in the analysis.
 * 
 * @author groenda
 *
 */
public class LoadPCMModelsJob extends SequentialBlackboardInteractingJob<MDSDBlackboard> {

    private static final Logger LOGGER = Logger.getLogger(LoadPCMModelsJob.class);

    public LoadPCMModelsJob(final AbstractPCMWorkflowRunConfiguration configuration) {
        for (final String modelFile : configuration.getPCMModelFiles()) {
            LoadModelIntoBlackboardJob.parseUriAndAddModelLoadJob(modelFile, this);
        }
        LoadModelIntoBlackboardJob.parseUriAndAddModelLoadJob(configuration.getRMIMiddlewareFile(), this);
        LoadModelIntoBlackboardJob.parseUriAndAddModelLoadJob(configuration.getEventMiddlewareFile(), this);
        this.add(new ResolveAllModelsOfPartitionJob(ConstantsContainer.DEFAULT_PCM_INSTANCE_PARTITION_ID));
    }

    
    @Override
    public void execute(final IProgressMonitor monitor) throws JobFailedException, UserCanceledException {
        // Load the PCM model itself
        if (LOGGER.isEnabledFor(Level.INFO))
            LOGGER.info("Loading PCM models");
        
        super.execute(monitor);
    }

    @Override
    public String getName() {
        return "Perform PCM Model Load";
    }
}
