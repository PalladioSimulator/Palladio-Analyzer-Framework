/**
 */
package org.palladiosimulator.analyzer.quality.parameters.impl;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.palladiosimulator.analyzer.quality.parameters.CallInstance;
import org.palladiosimulator.analyzer.quality.parameters.OperationReference;
import org.palladiosimulator.analyzer.quality.parameters.ParametersPackage;

import de.uka.ipd.sdq.identifier.impl.IdentifierImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Operation Reference</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>
 * {@link org.palladiosimulator.analyzer.quality.parameters.impl.OperationReferenceImpl#getCallInstance
 * <em>Call Instance</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class OperationReferenceImpl extends IdentifierImpl implements OperationReference {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected OperationReferenceImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ParametersPackage.Literals.OPERATION_REFERENCE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public CallInstance getCallInstance() {
        return (CallInstance) this.eDynamicGet(ParametersPackage.OPERATION_REFERENCE__CALL_INSTANCE,
                ParametersPackage.Literals.OPERATION_REFERENCE__CALL_INSTANCE, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain basicSetCallInstance(final CallInstance newCallInstance, NotificationChain msgs) {
        msgs = this.eBasicSetContainer((InternalEObject) newCallInstance,
                ParametersPackage.OPERATION_REFERENCE__CALL_INSTANCE, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setCallInstance(final CallInstance newCallInstance) {
        this.eDynamicSet(ParametersPackage.OPERATION_REFERENCE__CALL_INSTANCE,
                ParametersPackage.Literals.OPERATION_REFERENCE__CALL_INSTANCE, newCallInstance);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(final InternalEObject otherEnd, final int featureID, NotificationChain msgs) {
        switch (featureID) {
        case ParametersPackage.OPERATION_REFERENCE__CALL_INSTANCE:
            if (this.eInternalContainer() != null) {
                msgs = this.eBasicRemoveFromContainer(msgs);
            }
            return this.basicSetCallInstance((CallInstance) otherEnd, msgs);
        }
        return super.eInverseAdd(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID,
            final NotificationChain msgs) {
        switch (featureID) {
        case ParametersPackage.OPERATION_REFERENCE__CALL_INSTANCE:
            return this.basicSetCallInstance(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public NotificationChain eBasicRemoveFromContainerFeature(final NotificationChain msgs) {
        switch (this.eContainerFeatureID()) {
        case ParametersPackage.OPERATION_REFERENCE__CALL_INSTANCE:
            return this.eInternalContainer().eInverseRemove(this, ParametersPackage.CALL_INSTANCE__OPERATION_REFERENCE,
                    CallInstance.class, msgs);
        }
        return super.eBasicRemoveFromContainerFeature(msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
        case ParametersPackage.OPERATION_REFERENCE__CALL_INSTANCE:
            return this.getCallInstance();
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
        case ParametersPackage.OPERATION_REFERENCE__CALL_INSTANCE:
            this.setCallInstance((CallInstance) newValue);
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
        case ParametersPackage.OPERATION_REFERENCE__CALL_INSTANCE:
            this.setCallInstance((CallInstance) null);
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
        case ParametersPackage.OPERATION_REFERENCE__CALL_INSTANCE:
            return this.getCallInstance() != null;
        }
        return super.eIsSet(featureID);
    }

} // OperationReferenceImpl
