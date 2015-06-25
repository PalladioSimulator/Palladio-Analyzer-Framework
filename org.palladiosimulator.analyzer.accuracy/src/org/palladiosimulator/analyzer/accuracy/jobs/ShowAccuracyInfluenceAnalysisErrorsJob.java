package org.palladiosimulator.analyzer.accuracy.jobs;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.IProgressMonitor;
import org.palladiosimulator.analyzer.workflow.jobs.IIssueReceiver;

import de.uka.ipd.sdq.errorhandling.SeverityAndIssue;
import de.uka.ipd.sdq.errorhandling.dialogs.issues.DisplayIssuesDialog;
import de.uka.ipd.sdq.workflow.jobs.CleanupFailedException;
import de.uka.ipd.sdq.workflow.jobs.IJob;
import de.uka.ipd.sdq.workflow.jobs.JobFailedException;
import de.uka.ipd.sdq.workflow.jobs.UserCanceledException;
import de.uka.ipd.sdq.workflow.launchconfig.AbstractWorkflowBasedRunConfiguration;

public class ShowAccuracyInfluenceAnalysisErrorsJob
implements IJob, IIssueReceiver {
	/** Logger for this class. */
	private static final Logger LOGGER = Logger.getLogger(ShowAccuracyInfluenceAnalysisErrorsJob.class);

	/**	Run configuration. */
	private final AbstractWorkflowBasedRunConfiguration configuration;

	/**List of known issues. */
	private final List<SeverityAndIssue> issues;

	public ShowAccuracyInfluenceAnalysisErrorsJob(AbstractWorkflowBasedRunConfiguration configuration) {
		super();
		this.configuration = configuration;
		issues = new ArrayList<SeverityAndIssue>();
	}

	@Override
	public void execute(IProgressMonitor monitor) throws JobFailedException,
			UserCanceledException {
		if (issues.size() > 0) {
			LOGGER.warn("Found validation problems in the models");
			displayValidationErrors(issues);
			LOGGER.warn("Continuing workflow, ignoring model validation issues");
		}

	}

	@Override
	public String getName() {
		return "Show accuracy influence analysis errors";
	}

	@Override
	public void cleanup(IProgressMonitor monitor)
			throws CleanupFailedException {
		// Intentionally left empty
	}

	private void displayValidationErrors(
			List<SeverityAndIssue> overallResult)
			throws UserCanceledException {

		/**
		 * Disable the IssuesDialog, if job is run in non-interactive mode.
		 */
		if (configuration.isInteractive()) {
			DisplayIssuesDialog runner = new DisplayIssuesDialog(overallResult);
			DisplayIssuesDialog.showDialogSync(runner);
			if (!runner.shouldProceedAfterErrorDialog())
				throw new UserCanceledException();
		}
	}

	/* (non-Javadoc)
	 * @see org.palladiosimulator.analyzer.accuracy.jobs.IIssueReceiver#addIssues(java.util.List)
	 */
	public void addIssues(List<SeverityAndIssue> issues) {
		if (issues != null) {
			this.issues.addAll(issues);
		}
	}
}
