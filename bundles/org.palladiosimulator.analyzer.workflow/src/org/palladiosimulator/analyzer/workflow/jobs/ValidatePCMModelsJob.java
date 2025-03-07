/**
 * 
 */
package org.palladiosimulator.analyzer.workflow.jobs;

import org.palladiosimulator.analyzer.workflow.core.configurations.AbstractPCMWorkflowRunConfiguration;
import org.palladiosimulator.analyzer.workflow.core.jobs.LoadPCMModelsIntoBlackboardJob;

import de.uka.ipd.sdq.errorhandling.core.SeverityEnum;
import de.uka.ipd.sdq.workflow.jobs.SequentialBlackboardInteractingJob;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.MDSDBlackboard;
import de.uka.ipd.sdq.workflow.mdsd.emf.CheckEMFConstraintsJob;
import de.uka.ipd.sdq.workflow.mdsd.validation.ModelValidationJob;
import de.uka.ipd.sdq.workflow.mdsd.validation.ShowValidationErrorsJob;


/**
 * A job for running model validation checks. The job executes both, OCL and oAW check, validations on a PCM model instance.
 * If errors are found, they are reported to the user for corrections.
 * @author Steffen Becker
 */
public class ValidatePCMModelsJob 
extends SequentialBlackboardInteractingJob<MDSDBlackboard> {

	
	/* (non-Javadoc)
	 * @see de.uka.ipd.sdq.codegen.simucontroller.workflow.ISimulationJob#execute()
	 */
	public ValidatePCMModelsJob(AbstractPCMWorkflowRunConfiguration configuration) {
		super(false);
		this.setName("Checking PCM model constraints");
		this.addJob(new CheckEMFConstraintsJob(SeverityEnum.WARNING,LoadPCMModelsIntoBlackboardJob.PCM_MODELS_PARTITION_ID));
		this.addJob(new ShowValidationErrorsJob(configuration, this.toArray(new ModelValidationJob[]{})));
	}
}
