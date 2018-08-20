/**
 */
package org.palladiosimulator.analyzer.quality.parameters.pcm.impl;

import org.eclipse.emf.ecore.EClass;
import org.palladiosimulator.analyzer.quality.parameters.pcm.PCMOperationParameterReference;
import org.palladiosimulator.analyzer.quality.parameters.pcm.PCMPackage;
import org.palladiosimulator.pcm.repository.Parameter;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Operation Parameter Reference</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>
 * {@link org.palladiosimulator.analyzer.quality.parameters.pcm.impl.PCMOperationParameterReferenceImpl#getParameter
 * <em>Parameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PCMOperationParameterReferenceImpl extends PCMParameterReferenceImpl
        implements PCMOperationParameterReference {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected PCMOperationParameterReferenceImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PCMPackage.Literals.PCM_OPERATION_PARAMETER_REFERENCE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Parameter getParameter() {
        return (Parameter) this.eDynamicGet(PCMPackage.PCM_OPERATION_PARAMETER_REFERENCE__PARAMETER,
                PCMPackage.Literals.PCM_OPERATION_PARAMETER_REFERENCE__PARAMETER, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public Parameter basicGetParameter() {
        return (Parameter) this.eDynamicGet(PCMPackage.PCM_OPERATION_PARAMETER_REFERENCE__PARAMETER,
                PCMPackage.Literals.PCM_OPERATION_PARAMETER_REFERENCE__PARAMETER, false, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setParameter(final Parameter newParameter) {
        this.eDynamicSet(PCMPackage.PCM_OPERATION_PARAMETER_REFERENCE__PARAMETER,
                PCMPackage.Literals.PCM_OPERATION_PARAMETER_REFERENCE__PARAMETER, newParameter);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
        case PCMPackage.PCM_OPERATION_PARAMETER_REFERENCE__PARAMETER:
            if (resolve) {
                return this.getParameter();
            }
            return this.basicGetParameter();
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
        case PCMPackage.PCM_OPERATION_PARAMETER_REFERENCE__PARAMETER:
            this.setParameter((Parameter) newValue);
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
        case PCMPackage.PCM_OPERATION_PARAMETER_REFERENCE__PARAMETER:
            this.setParameter((Parameter) null);
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
        case PCMPackage.PCM_OPERATION_PARAMETER_REFERENCE__PARAMETER:
            return this.basicGetParameter() != null;
        }
        return super.eIsSet(featureID);
    }

} // PCMOperationParameterReferenceImpl
