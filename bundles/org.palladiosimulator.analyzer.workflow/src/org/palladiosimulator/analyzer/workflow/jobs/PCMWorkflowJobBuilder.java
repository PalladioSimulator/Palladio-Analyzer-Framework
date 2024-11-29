/**
 *
 */
package org.palladiosimulator.analyzer.workflow.jobs;

import org.palladiosimulator.analyzer.workflow.core.configurations.AbstractPCMWorkflowRunConfiguration;

import de.uka.ipd.sdq.workflow.jobs.IJob;

/**Builder for jobs with configurations of type {@link AbstractPCMWorkflowRunConfiguration}.
 * @author groenda
 *
 */
public abstract class PCMWorkflowJobBuilder {

	/**Template method which returns a new job for the given configuration.
	 * @param config The configuration for the job.
	 * @return Executable job.
	 */
	public abstract IJob buildJob(AbstractPCMWorkflowRunConfiguration config);
}
