package org.palladiosimulator.analyzer.workflow.core.jobs;

import java.util.List;

import de.uka.ipd.sdq.errorhandling.core.SeverityAndIssue;

/**Interface to describe that issues can be added to an implementing class.
 * Used for error reporting.
 * @author groenda
 *
 */
public interface IIssueReceiver {

	/**Makes issues known.
	 * @param issues List of issues.
	 */
	public void addIssues(List<SeverityAndIssue> issues);
}
