/**
 */
package org.palladiosimulator.analyzer.quality.qualityannotation;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.palladiosimulator.pcm.repository.InfrastructureSignature;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>PCMRE Infrastructure Signature</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>
 * {@link org.palladiosimulator.analyzer.quality.qualityannotation.PCMREInfrastructureSignature#getSignature
 * <em>Signature</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.analyzer.quality.qualityannotation.QualityAnnotationPackage#getPCMREInfrastructureSignature()
 * @model
 * @generated
 */
public interface PCMREInfrastructureSignature extends PCMRE {

    /**
     * Returns the value of the '<em><b>Signature</b></em>' reference. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Signature</em>' reference isn't clear, there really should be more
     * of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Signature</em>' reference.
     * @see #setSignature(InfrastructureSignature)
     * @see org.palladiosimulator.analyzer.quality.qualityannotation.QualityAnnotationPackage#getPCMREInfrastructureSignature_Signature()
     * @model required="true" ordered="false"
     * @generated
     */
    InfrastructureSignature getSignature();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.analyzer.quality.qualityannotation.PCMREInfrastructureSignature#getSignature
     * <em>Signature</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Signature</em>' reference.
     * @see #getSignature()
     * @generated
     */
    void setSignature(InfrastructureSignature value);

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
     * 
     * @param diagnostics
     *            The chain of diagnostics to which problems are to be appended.
     * @param context
     *            The cache of context-specific information. <!-- end-model-doc -->
     * @model annotation=
     *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='self.childREs->isEmpty()'"
     * @generated
     */
    boolean ThisIsTheLowestInfrastructureHierarchyLevel(DiagnosticChain diagnostics, Map<Object, Object> context);

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
     * 
     * @param diagnostics
     *            The chain of diagnostics to which problems are to be appended.
     * @param context
     *            The cache of context-specific information. <!-- end-model-doc -->
     * @model annotation=
     *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='self.parentRE.childREs->select(pcmre | pcmre.oclAsType(PCMREInfrastructureSignature).signature = self.signature)->size() = 1'"
     * @generated
     */
    boolean EachRETargetMustBeReferencedOnlyFromOneRE(DiagnosticChain diagnostics, Map<Object, Object> context);

} // PCMREInfrastructureSignature
