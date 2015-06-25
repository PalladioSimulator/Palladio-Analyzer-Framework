/**
 */
package org.palladiosimulator.analyzer.quality.qualityannotation;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.palladiosimulator.pcm.seff.ResourceDemandingInternalBehaviour;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>PCMRECI Behavior</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>
 * {@link org.palladiosimulator.analyzer.quality.qualityannotation.PCMRECIBehavior#getInternalBehaviour
 * <em>Internal Behaviour</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.analyzer.quality.qualityannotation.QualityAnnotationPackage#getPCMRECIBehavior()
 * @model
 * @generated
 */
public interface PCMRECIBehavior extends PCMRE {

    /**
     * Returns the value of the '<em><b>Internal Behaviour</b></em>' reference. <!-- begin-user-doc
     * -->
     * <p>
     * If the meaning of the '<em>Internal Behaviour</em>' reference isn't clear, there really
     * should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Internal Behaviour</em>' reference.
     * @see #setInternalBehaviour(ResourceDemandingInternalBehaviour)
     * @see org.palladiosimulator.analyzer.quality.qualityannotation.QualityAnnotationPackage#getPCMRECIBehavior_InternalBehaviour()
     * @model required="true" ordered="false"
     * @generated
     */
    ResourceDemandingInternalBehaviour getInternalBehaviour();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.analyzer.quality.qualityannotation.PCMRECIBehavior#getInternalBehaviour
     * <em>Internal Behaviour</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Internal Behaviour</em>' reference.
     * @see #getInternalBehaviour()
     * @generated
     */
    void setInternalBehaviour(ResourceDemandingInternalBehaviour value);

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
    boolean ThisIsTheLowestComponentInternalHierarchyLevel(DiagnosticChain diagnostics, Map<Object, Object> context);

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
     * 
     * @param diagnostics
     *            The chain of diagnostics to which problems are to be appended.
     * @param context
     *            The cache of context-specific information. <!-- end-model-doc -->
     * @model annotation=
     *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='self.parentRE.childREs->select(pcmre | pcmre.oclAsType(PCMRECIBehavior).internalBehaviour = self.internalBehaviour)->size() = 1'"
     * @generated
     */
    boolean EachRETargetMustBeReferencedOnlyFromOneRE(DiagnosticChain diagnostics, Map<Object, Object> context);

} // PCMRECIBehavior
