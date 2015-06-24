/**
 *
 */
package org.palladiosimulator.analyzer.workflow.runconfig;

/**The list of states for the accuracy analysis.
 * @author groenda
 */
public enum AccuracyInfluenceAnalysisState {
	/** The minimal value within the tolerance bound is used. */
	MINIMUM,
	/** The values are used without any modification. */
	AS_SPECIFIED,
	/** The maximal value within the tolerance bound is used.*/
	MAXIMUM
}
