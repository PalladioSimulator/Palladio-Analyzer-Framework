/**
 */
package org.palladiosimulator.analyzer.quality.qualityannotation.impl;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.palladiosimulator.analyzer.quality.qualityannotation.PCMPEDecision;
import org.palladiosimulator.analyzer.quality.qualityannotation.QualityAnnotationPackage;
import org.palladiosimulator.analyzer.quality.qualityannotation.util.QualityAnnotationValidator;
import org.palladiosimulator.pcm.seff.BranchAction;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>PCMPE Decision</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>
 * {@link org.palladiosimulator.analyzer.quality.qualityannotation.impl.PCMPEDecisionImpl#getBranchAction
 * <em>Branch Action</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PCMPEDecisionImpl extends PCMPEImpl implements PCMPEDecision {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected PCMPEDecisionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return QualityAnnotationPackage.Literals.PCMPE_DECISION;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public BranchAction getBranchAction() {
        return (BranchAction) this.eDynamicGet(QualityAnnotationPackage.PCMPE_DECISION__BRANCH_ACTION,
                QualityAnnotationPackage.Literals.PCMPE_DECISION__BRANCH_ACTION, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public BranchAction basicGetBranchAction() {
        return (BranchAction) this.eDynamicGet(QualityAnnotationPackage.PCMPE_DECISION__BRANCH_ACTION,
                QualityAnnotationPackage.Literals.PCMPE_DECISION__BRANCH_ACTION, false, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setBranchAction(final BranchAction newBranchAction) {
        this.eDynamicSet(QualityAnnotationPackage.PCMPE_DECISION__BRANCH_ACTION,
                QualityAnnotationPackage.Literals.PCMPE_DECISION__BRANCH_ACTION, newBranchAction);
    }

    /**
     * The cached OCL expression body for the '
     * {@link #ThisIsTheLowestDecisionHierarchyLevel(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
     * <em>This Is The Lowest Decision Hierarchy Level</em>}' operation. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #ThisIsTheLowestDecisionHierarchyLevel(org.eclipse.emf.common.util.DiagnosticChain,
     *      java.util.Map)
     * @generated
     * @ordered
     */
    protected static final String THIS_IS_THE_LOWEST_DECISION_HIERARCHY_LEVEL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.childPEs->size() = 0";

    /**
     * The cached OCL invariant for the '
     * {@link #ThisIsTheLowestDecisionHierarchyLevel(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
     * <em>This Is The Lowest Decision Hierarchy Level</em>}' invariant operation. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #ThisIsTheLowestDecisionHierarchyLevel(org.eclipse.emf.common.util.DiagnosticChain,
     *      java.util.Map)
     * @generated
     * @ordered
     */
    protected static Constraint THIS_IS_THE_LOWEST_DECISION_HIERARCHY_LEVEL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public boolean ThisIsTheLowestDecisionHierarchyLevel(final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        if (THIS_IS_THE_LOWEST_DECISION_HIERARCHY_LEVEL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
            final OCL.Helper helper = EOCL_ENV.createOCLHelper();
            helper.setContext(QualityAnnotationPackage.Literals.PCMPE_DECISION);
            try {
                THIS_IS_THE_LOWEST_DECISION_HIERARCHY_LEVEL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper
                        .createInvariant(THIS_IS_THE_LOWEST_DECISION_HIERARCHY_LEVEL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
            } catch (final ParserException pe) {
                throw new UnsupportedOperationException(pe.getLocalizedMessage());
            }
        }
        if (!EOCL_ENV.createQuery(THIS_IS_THE_LOWEST_DECISION_HIERARCHY_LEVEL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV)
                .check(this)) {
            if (diagnostics != null) {
                diagnostics
                        .add(new BasicDiagnostic(Diagnostic.ERROR, QualityAnnotationValidator.DIAGNOSTIC_SOURCE,
                                QualityAnnotationValidator.PCMPE_DECISION__THIS_IS_THE_LOWEST_DECISION_HIERARCHY_LEVEL,
                                EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic",
                                        new Object[] { "ThisIsTheLowestDecisionHierarchyLevel",
                                                EObjectValidator.getObjectLabel(this, context) }),
                        new Object[] { this }));
            }
            return false;
        }
        return true;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
        case QualityAnnotationPackage.PCMPE_DECISION__BRANCH_ACTION:
            if (resolve) {
                return this.getBranchAction();
            }
            return this.basicGetBranchAction();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
        case QualityAnnotationPackage.PCMPE_DECISION__BRANCH_ACTION:
            this.setBranchAction((BranchAction) newValue);
            return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void eUnset(final int featureID) {
        switch (featureID) {
        case QualityAnnotationPackage.PCMPE_DECISION__BRANCH_ACTION:
            this.setBranchAction((BranchAction) null);
            return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
        case QualityAnnotationPackage.PCMPE_DECISION__BRANCH_ACTION:
            return this.basicGetBranchAction() != null;
        }
        return super.eIsSet(featureID);
    }

} // PCMPEDecisionImpl
