/**
 */
package org.palladiosimulator.analyzer.quality.qualityannotation;

import org.eclipse.emf.cdo.CDOObject;
import org.palladiosimulator.analyzer.quality.parameters.ParameterReference;
import org.palladiosimulator.analyzer.quality.parameters.ParameterValue;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Parameter Value Deviation</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>
 * {@link org.palladiosimulator.analyzer.quality.qualityannotation.ParameterValueDeviation#getParameterReference
 * <em>Parameter Reference</em>}</li>
 * <li>
 * {@link org.palladiosimulator.analyzer.quality.qualityannotation.ParameterValueDeviation#getInternalStateInfluenceAnalysisAggregation
 * <em>Internal State Influence Analysis Aggregation</em>}</li>
 * <li>
 * {@link org.palladiosimulator.analyzer.quality.qualityannotation.ParameterValueDeviation#getRequiredElementDeviation
 * <em>Required Element Deviation</em>}</li>
 * <li>
 * {@link org.palladiosimulator.analyzer.quality.qualityannotation.ParameterValueDeviation#getParameterValue
 * <em>Parameter Value</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.analyzer.quality.qualityannotation.QualityAnnotationPackage#getParameterValueDeviation()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface ParameterValueDeviation extends CDOObject {

    /**
     * Returns the value of the '<em><b>Parameter Reference</b></em>' containment reference. It is
     * bidirectional and its opposite is '
     * {@link org.palladiosimulator.analyzer.quality.parameters.ParameterReference#getParameterValueDeviation
     * <em>Parameter Value Deviation</em>}'. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Parameter Reference</em>' containment reference isn't clear, there
     * really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Parameter Reference</em>' containment reference.
     * @see #setParameterReference(ParameterReference)
     * @see org.palladiosimulator.analyzer.quality.qualityannotation.QualityAnnotationPackage#getParameterValueDeviation_ParameterReference()
     * @see org.palladiosimulator.analyzer.quality.parameters.ParameterReference#getParameterValueDeviation
     * @model opposite="parameterValueDeviation" containment="true" required="true" ordered="false"
     * @generated
     */
    ParameterReference getParameterReference();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.analyzer.quality.qualityannotation.ParameterValueDeviation#getParameterReference
     * <em>Parameter Reference</em>}' containment reference. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Parameter Reference</em>' containment reference.
     * @see #getParameterReference()
     * @generated
     */
    void setParameterReference(ParameterReference value);

    /**
     * Returns the value of the '<em><b>Internal State Influence Analysis Aggregation</b></em>'
     * container reference. It is bidirectional and its opposite is '
     * {@link org.palladiosimulator.analyzer.quality.qualityannotation.InternalStateInfluenceAnalysisAggregation#getParameterValueDeviations
     * <em>Parameter Value Deviations</em>}'. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Internal State Influence Analysis Aggregation</em>' container
     * reference isn't clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Internal State Influence Analysis Aggregation</em>' container
     *         reference.
     * @see #setInternalStateInfluenceAnalysisAggregation(InternalStateInfluenceAnalysisAggregation)
     * @see org.palladiosimulator.analyzer.quality.qualityannotation.QualityAnnotationPackage#getParameterValueDeviation_InternalStateInfluenceAnalysisAggregation()
     * @see org.palladiosimulator.analyzer.quality.qualityannotation.InternalStateInfluenceAnalysisAggregation#getParameterValueDeviations
     * @model opposite="parameterValueDeviations" transient="false" ordered="false"
     * @generated
     */
    InternalStateInfluenceAnalysisAggregation getInternalStateInfluenceAnalysisAggregation();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.analyzer.quality.qualityannotation.ParameterValueDeviation#getInternalStateInfluenceAnalysisAggregation
     * <em>Internal State Influence Analysis Aggregation</em>}' container reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Internal State Influence Analysis Aggregation</em>'
     *            container reference.
     * @see #getInternalStateInfluenceAnalysisAggregation()
     * @generated
     */
    void setInternalStateInfluenceAnalysisAggregation(InternalStateInfluenceAnalysisAggregation value);

    /**
     * Returns the value of the '<em><b>Required Element Deviation</b></em>' container reference. It
     * is bidirectional and its opposite is '
     * {@link org.palladiosimulator.analyzer.quality.qualityannotation.RequiredElementDeviation#getMaximumDeviationCallParameterValues
     * <em>Maximum Deviation Call Parameter Values</em>}'. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Required Element Deviation</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Required Element Deviation</em>' container reference.
     * @see #setRequiredElementDeviation(RequiredElementDeviation)
     * @see org.palladiosimulator.analyzer.quality.qualityannotation.QualityAnnotationPackage#getParameterValueDeviation_RequiredElementDeviation()
     * @see org.palladiosimulator.analyzer.quality.qualityannotation.RequiredElementDeviation#getMaximumDeviationCallParameterValues
     * @model opposite="maximumDeviationCallParameterValues" transient="false" ordered="false"
     * @generated
     */
    RequiredElementDeviation getRequiredElementDeviation();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.analyzer.quality.qualityannotation.ParameterValueDeviation#getRequiredElementDeviation
     * <em>Required Element Deviation</em>}' container reference. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Required Element Deviation</em>' container reference.
     * @see #getRequiredElementDeviation()
     * @generated
     */
    void setRequiredElementDeviation(RequiredElementDeviation value);

    /**
     * Returns the value of the '<em><b>Parameter Value</b></em>' containment reference. It is
     * bidirectional and its opposite is '
     * {@link org.palladiosimulator.analyzer.quality.parameters.ParameterValue#getParameterValueDeviation
     * <em>Parameter Value Deviation</em>}'. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Parameter Value</em>' containment reference isn't clear, there
     * really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Parameter Value</em>' containment reference.
     * @see #setParameterValue(ParameterValue)
     * @see org.palladiosimulator.analyzer.quality.qualityannotation.QualityAnnotationPackage#getParameterValueDeviation_ParameterValue()
     * @see org.palladiosimulator.analyzer.quality.parameters.ParameterValue#getParameterValueDeviation
     * @model opposite="parameterValueDeviation" containment="true" required="true" ordered="false"
     * @generated
     */
    ParameterValue getParameterValue();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.analyzer.quality.qualityannotation.ParameterValueDeviation#getParameterValue
     * <em>Parameter Value</em>}' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @param value
     *            the new value of the '<em>Parameter Value</em>' containment reference.
     * @see #getParameterValue()
     * @generated
     */
    void setParameterValue(ParameterValue value);

} // ParameterValueDeviation
