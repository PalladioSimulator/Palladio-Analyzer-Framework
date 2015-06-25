/**
 */
package org.palladiosimulator.analyzer.quality.qualityannotation;

import org.eclipse.emf.common.util.EList;

import de.uka.ipd.sdq.identifier.Identifier;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Internal State Influence Analysis Aggregation</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>
 * {@link org.palladiosimulator.analyzer.quality.qualityannotation.InternalStateInfluenceAnalysisAggregation#getQualityAnnotation
 * <em>Quality Annotation</em>}</li>
 * <li>
 * {@link org.palladiosimulator.analyzer.quality.qualityannotation.InternalStateInfluenceAnalysisAggregation#getParameterValueDeviations
 * <em>Parameter Value Deviations</em>}</li>
 * <li>
 * {@link org.palladiosimulator.analyzer.quality.qualityannotation.InternalStateInfluenceAnalysisAggregation#getRequiredElementDeviations
 * <em>Required Element Deviations</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.analyzer.quality.qualityannotation.QualityAnnotationPackage#getInternalStateInfluenceAnalysisAggregation()
 * @model
 * @generated
 */
public interface InternalStateInfluenceAnalysisAggregation extends Identifier {

    /**
     * Returns the value of the '<em><b>Quality Annotation</b></em>' container reference. It is
     * bidirectional and its opposite is '
     * {@link org.palladiosimulator.analyzer.quality.qualityannotation.QualityAnnotation#getInternalStateInfluenceAnalysisResults
     * <em>Internal State Influence Analysis Results</em>}'. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Quality Annotation</em>' container reference isn't clear, there
     * really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Quality Annotation</em>' container reference.
     * @see #setQualityAnnotation(QualityAnnotation)
     * @see org.palladiosimulator.analyzer.quality.qualityannotation.QualityAnnotationPackage#getInternalStateInfluenceAnalysisAggregation_QualityAnnotation()
     * @see org.palladiosimulator.analyzer.quality.qualityannotation.QualityAnnotation#getInternalStateInfluenceAnalysisResults
     * @model opposite="internalStateInfluenceAnalysisResults" required="true" transient="false"
     *        ordered="false"
     * @generated
     */
    QualityAnnotation getQualityAnnotation();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.analyzer.quality.qualityannotation.InternalStateInfluenceAnalysisAggregation#getQualityAnnotation
     * <em>Quality Annotation</em>}' container reference. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @param value
     *            the new value of the '<em>Quality Annotation</em>' container reference.
     * @see #getQualityAnnotation()
     * @generated
     */
    void setQualityAnnotation(QualityAnnotation value);

    /**
     * Returns the value of the '<em><b>Parameter Value Deviations</b></em>' containment reference
     * list. The list contents are of type
     * {@link org.palladiosimulator.analyzer.quality.qualityannotation.ParameterValueDeviation}. It
     * is bidirectional and its opposite is '
     * {@link org.palladiosimulator.analyzer.quality.qualityannotation.ParameterValueDeviation#getInternalStateInfluenceAnalysisAggregation
     * <em>Internal State Influence Analysis Aggregation</em>}'. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Parameter Value Deviations</em>' containment reference list isn't
     * clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Parameter Value Deviations</em>' containment reference list.
     * @see org.palladiosimulator.analyzer.quality.qualityannotation.QualityAnnotationPackage#getInternalStateInfluenceAnalysisAggregation_ParameterValueDeviations()
     * @see org.palladiosimulator.analyzer.quality.qualityannotation.ParameterValueDeviation#getInternalStateInfluenceAnalysisAggregation
     * @model opposite="internalStateInfluenceAnalysisAggregation" containment="true"
     * @generated
     */
    EList<ParameterValueDeviation> getParameterValueDeviations();

    /**
     * Returns the value of the '<em><b>Required Element Deviations</b></em>' containment reference
     * list. The list contents are of type
     * {@link org.palladiosimulator.analyzer.quality.qualityannotation.RequiredElementDeviation}. It
     * is bidirectional and its opposite is '
     * {@link org.palladiosimulator.analyzer.quality.qualityannotation.RequiredElementDeviation#getInternalStateInfluenceAnalysisAggregation
     * <em>Internal State Influence Analysis Aggregation</em>}'. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Required Element Deviations</em>' containment reference list isn't
     * clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Required Element Deviations</em>' containment reference list.
     * @see org.palladiosimulator.analyzer.quality.qualityannotation.QualityAnnotationPackage#getInternalStateInfluenceAnalysisAggregation_RequiredElementDeviations()
     * @see org.palladiosimulator.analyzer.quality.qualityannotation.RequiredElementDeviation#getInternalStateInfluenceAnalysisAggregation
     * @model opposite="internalStateInfluenceAnalysisAggregation" containment="true"
     * @generated
     */
    EList<RequiredElementDeviation> getRequiredElementDeviations();

} // InternalStateInfluenceAnalysisAggregation
