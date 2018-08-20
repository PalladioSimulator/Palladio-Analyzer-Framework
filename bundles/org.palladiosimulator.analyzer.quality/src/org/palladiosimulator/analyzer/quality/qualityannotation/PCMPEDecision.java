/**
 */
package org.palladiosimulator.analyzer.quality.qualityannotation;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.palladiosimulator.pcm.seff.BranchAction;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>PCMPE Decision</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.analyzer.quality.qualityannotation.PCMPEDecision#getBranchAction
 * <em>Branch Action</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.analyzer.quality.qualityannotation.QualityAnnotationPackage#getPCMPEDecision()
 * @model
 * @generated
 */
public interface PCMPEDecision extends PCMPE {

    /**
     * Returns the value of the '<em><b>Branch Action</b></em>' reference. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Branch Action</em>' reference isn't clear, there really should be
     * more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Branch Action</em>' reference.
     * @see #setBranchAction(BranchAction)
     * @see org.palladiosimulator.analyzer.quality.qualityannotation.QualityAnnotationPackage#getPCMPEDecision_BranchAction()
     * @model required="true" ordered="false"
     * @generated
     */
    BranchAction getBranchAction();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.analyzer.quality.qualityannotation.PCMPEDecision#getBranchAction
     * <em>Branch Action</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Branch Action</em>' reference.
     * @see #getBranchAction()
     * @generated
     */
    void setBranchAction(BranchAction value);

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
     * 
     * @param diagnostics
     *            The chain of diagnostics to which problems are to be appended.
     * @param context
     *            The cache of context-specific information. <!-- end-model-doc -->
     * @model annotation=
     *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='self.childPEs->size() = 0'"
     * @generated
     */
    boolean ThisIsTheLowestDecisionHierarchyLevel(DiagnosticChain diagnostics, Map<Object, Object> context);

} // PCMPEDecision
