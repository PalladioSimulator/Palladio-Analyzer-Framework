/**
 */
package org.palladiosimulator.analyzer.quality.parameters.pcm.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.palladiosimulator.analyzer.quality.parameters.pcm.PCMPackage;
import org.palladiosimulator.analyzer.quality.parameters.pcm.PCMRequiredBusinessOperationReturnParameterReference;

/**
 * This is the item provider adapter for a
 * {@link org.palladiosimulator.analyzer.quality.parameters.pcm.PCMRequiredBusinessOperationReturnParameterReference}
 * object. <!-- begin-user-doc --> <!-- end-user-doc -->
 *
 * @generated
 */
public class PCMRequiredBusinessOperationReturnParameterReferenceItemProvider
        extends PCMParameterReferenceItemProvider {

    /**
     * This constructs an instance from a factory and a notifier. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    public PCMRequiredBusinessOperationReturnParameterReferenceItemProvider(final AdapterFactory adapterFactory) {
        super(adapterFactory);
    }

    /**
     * This returns the property descriptors for the adapted class. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    @Override
    public List<IItemPropertyDescriptor> getPropertyDescriptors(final Object object) {
        if (this.itemPropertyDescriptors == null) {
            super.getPropertyDescriptors(object);

            this.addRequiredRolePropertyDescriptor(object);
            this.addSignaturePropertyDescriptor(object);
        }
        return this.itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Required Role feature. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected void addRequiredRolePropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString("_UI_PCMRequiredBusinessOperationReturnParameterReference_requiredRole_feature"),
                this.getString("_UI_PropertyDescriptor_description",
                        "_UI_PCMRequiredBusinessOperationReturnParameterReference_requiredRole_feature",
                        "_UI_PCMRequiredBusinessOperationReturnParameterReference_type"),
                PCMPackage.Literals.PCM_REQUIRED_BUSINESS_OPERATION_RETURN_PARAMETER_REFERENCE__REQUIRED_ROLE, true,
                false, true, null, null, null));
    }

    /**
     * This adds a property descriptor for the Signature feature. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected void addSignaturePropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString("_UI_PCMRequiredBusinessOperationReturnParameterReference_signature_feature"),
                this.getString("_UI_PropertyDescriptor_description",
                        "_UI_PCMRequiredBusinessOperationReturnParameterReference_signature_feature",
                        "_UI_PCMRequiredBusinessOperationReturnParameterReference_type"),
                PCMPackage.Literals.PCM_REQUIRED_BUSINESS_OPERATION_RETURN_PARAMETER_REFERENCE__SIGNATURE, true, false,
                true, null, null, null));
    }

    /**
     * This returns PCMRequiredBusinessOperationReturnParameterReference.gif. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object getImage(final Object object) {
        return this.overlayImage(object,
                this.getResourceLocator().getImage("full/obj16/PCMRequiredBusinessOperationReturnParameterReference"));
    }

    /**
     * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @generated
     */
    @Override
    public String getText(final Object object) {
        final String label = ((PCMRequiredBusinessOperationReturnParameterReference) object).getId();
        return label == null || label.length() == 0
                ? this.getString("_UI_PCMRequiredBusinessOperationReturnParameterReference_type")
                : this.getString("_UI_PCMRequiredBusinessOperationReturnParameterReference_type") + " " + label;
    }

    /**
     * This handles model notifications by calling {@link #updateChildren} to update any cached
     * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}
     * . <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void notifyChanged(final Notification notification) {
        this.updateChildren(notification);
        super.notifyChanged(notification);
    }

    /**
     * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children that
     * can be created under this object. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected void collectNewChildDescriptors(final Collection<Object> newChildDescriptors, final Object object) {
        super.collectNewChildDescriptors(newChildDescriptors, object);
    }

}
