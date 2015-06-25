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
import org.palladiosimulator.analyzer.quality.qualityannotation.PCMRECIBehavior;
import org.palladiosimulator.analyzer.quality.qualityannotation.QualityAnnotationPackage;
import org.palladiosimulator.analyzer.quality.qualityannotation.util.QualityAnnotationValidator;
import org.palladiosimulator.pcm.seff.ResourceDemandingInternalBehaviour;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>PCMRECI Behavior</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>
 * {@link org.palladiosimulator.analyzer.quality.qualityannotation.impl.PCMRECIBehaviorImpl#getInternalBehaviour
 * <em>Internal Behaviour</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PCMRECIBehaviorImpl extends PCMREImpl implements PCMRECIBehavior {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected PCMRECIBehaviorImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return QualityAnnotationPackage.Literals.PCMRECI_BEHAVIOR;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public ResourceDemandingInternalBehaviour getInternalBehaviour() {
        return (ResourceDemandingInternalBehaviour) this.eDynamicGet(
                QualityAnnotationPackage.PCMRECI_BEHAVIOR__INTERNAL_BEHAVIOUR,
                QualityAnnotationPackage.Literals.PCMRECI_BEHAVIOR__INTERNAL_BEHAVIOUR, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public ResourceDemandingInternalBehaviour basicGetInternalBehaviour() {
        return (ResourceDemandingInternalBehaviour) this.eDynamicGet(
                QualityAnnotationPackage.PCMRECI_BEHAVIOR__INTERNAL_BEHAVIOUR,
                QualityAnnotationPackage.Literals.PCMRECI_BEHAVIOR__INTERNAL_BEHAVIOUR, false, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setInternalBehaviour(final ResourceDemandingInternalBehaviour newInternalBehaviour) {
        this.eDynamicSet(QualityAnnotationPackage.PCMRECI_BEHAVIOR__INTERNAL_BEHAVIOUR,
                QualityAnnotationPackage.Literals.PCMRECI_BEHAVIOR__INTERNAL_BEHAVIOUR, newInternalBehaviour);
    }

    /**
     * The cached OCL expression body for the '
     * {@link #ThisIsTheLowestComponentInternalHierarchyLevel(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
     * <em>This Is The Lowest Component Internal Hierarchy Level</em>}' operation. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #ThisIsTheLowestComponentInternalHierarchyLevel(org.eclipse.emf.common.util.DiagnosticChain,
     *      java.util.Map)
     * @generated
     * @ordered
     */
    protected static final String THIS_IS_THE_LOWEST_COMPONENT_INTERNAL_HIERARCHY_LEVEL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.childREs->isEmpty()";

    /**
     * The cached OCL invariant for the '
     * {@link #ThisIsTheLowestComponentInternalHierarchyLevel(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
     * <em>This Is The Lowest Component Internal Hierarchy Level</em>}' invariant operation. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #ThisIsTheLowestComponentInternalHierarchyLevel(org.eclipse.emf.common.util.DiagnosticChain,
     *      java.util.Map)
     * @generated
     * @ordered
     */
    protected static Constraint THIS_IS_THE_LOWEST_COMPONENT_INTERNAL_HIERARCHY_LEVEL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public boolean ThisIsTheLowestComponentInternalHierarchyLevel(final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        if (THIS_IS_THE_LOWEST_COMPONENT_INTERNAL_HIERARCHY_LEVEL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
            final OCL.Helper helper = EOCL_ENV.createOCLHelper();
            helper.setContext(QualityAnnotationPackage.Literals.PCMRECI_BEHAVIOR);
            try {
                THIS_IS_THE_LOWEST_COMPONENT_INTERNAL_HIERARCHY_LEVEL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper
                        .createInvariant(
                                THIS_IS_THE_LOWEST_COMPONENT_INTERNAL_HIERARCHY_LEVEL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
            } catch (final ParserException pe) {
                throw new UnsupportedOperationException(pe.getLocalizedMessage());
            }
        }
        if (!EOCL_ENV.createQuery(THIS_IS_THE_LOWEST_COMPONENT_INTERNAL_HIERARCHY_LEVEL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV)
                .check(this)) {
            if (diagnostics != null) {
                diagnostics
                        .add(new BasicDiagnostic(Diagnostic.ERROR, QualityAnnotationValidator.DIAGNOSTIC_SOURCE,
                                QualityAnnotationValidator.PCMRECI_BEHAVIOR__THIS_IS_THE_LOWEST_COMPONENT_INTERNAL_HIERARCHY_LEVEL,
                                EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic",
                                        new Object[] { "ThisIsTheLowestComponentInternalHierarchyLevel",
                                                EObjectValidator.getObjectLabel(this, context) }),
                        new Object[] { this }));
            }
            return false;
        }
        return true;
    }

    /**
     * The cached OCL expression body for the '
     * {@link #EachRETargetMustBeReferencedOnlyFromOneRE(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
     * <em>Each RE Target Must Be Referenced Only From One RE</em>}' operation. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @see #EachRETargetMustBeReferencedOnlyFromOneRE(org.eclipse.emf.common.util.DiagnosticChain,
     *      java.util.Map)
     * @generated
     * @ordered
     */
    protected static final String EACH_RE_TARGET_MUST_BE_REFERENCED_ONLY_FROM_ONE_RE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.parentRE.childREs->select(pcmre | pcmre.oclAsType(PCMRECIBehavior).internalBehaviour = self.internalBehaviour)->size() = 1";

    /**
     * The cached OCL invariant for the '
     * {@link #EachRETargetMustBeReferencedOnlyFromOneRE(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
     * <em>Each RE Target Must Be Referenced Only From One RE</em>}' invariant operation. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #EachRETargetMustBeReferencedOnlyFromOneRE(org.eclipse.emf.common.util.DiagnosticChain,
     *      java.util.Map)
     * @generated
     * @ordered
     */
    protected static Constraint EACH_RE_TARGET_MUST_BE_REFERENCED_ONLY_FROM_ONE_RE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public boolean EachRETargetMustBeReferencedOnlyFromOneRE(final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        if (EACH_RE_TARGET_MUST_BE_REFERENCED_ONLY_FROM_ONE_RE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
            final OCL.Helper helper = EOCL_ENV.createOCLHelper();
            helper.setContext(QualityAnnotationPackage.Literals.PCMRECI_BEHAVIOR);
            try {
                EACH_RE_TARGET_MUST_BE_REFERENCED_ONLY_FROM_ONE_RE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper
                        .createInvariant(
                                EACH_RE_TARGET_MUST_BE_REFERENCED_ONLY_FROM_ONE_RE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
            } catch (final ParserException pe) {
                throw new UnsupportedOperationException(pe.getLocalizedMessage());
            }
        }
        if (!EOCL_ENV.createQuery(EACH_RE_TARGET_MUST_BE_REFERENCED_ONLY_FROM_ONE_RE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV)
                .check(this)) {
            if (diagnostics != null) {
                diagnostics
                        .add(new BasicDiagnostic(Diagnostic.ERROR, QualityAnnotationValidator.DIAGNOSTIC_SOURCE,
                                QualityAnnotationValidator.PCMRECI_BEHAVIOR__EACH_RE_TARGET_MUST_BE_REFERENCED_ONLY_FROM_ONE_RE,
                                EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic",
                                        new Object[] { "EachRETargetMustBeReferencedOnlyFromOneRE",
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
        case QualityAnnotationPackage.PCMRECI_BEHAVIOR__INTERNAL_BEHAVIOUR:
            if (resolve) {
                return this.getInternalBehaviour();
            }
            return this.basicGetInternalBehaviour();
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
        case QualityAnnotationPackage.PCMRECI_BEHAVIOR__INTERNAL_BEHAVIOUR:
            this.setInternalBehaviour((ResourceDemandingInternalBehaviour) newValue);
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
        case QualityAnnotationPackage.PCMRECI_BEHAVIOR__INTERNAL_BEHAVIOUR:
            this.setInternalBehaviour((ResourceDemandingInternalBehaviour) null);
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
        case QualityAnnotationPackage.PCMRECI_BEHAVIOR__INTERNAL_BEHAVIOUR:
            return this.basicGetInternalBehaviour() != null;
        }
        return super.eIsSet(featureID);
    }

} // PCMRECIBehaviorImpl
