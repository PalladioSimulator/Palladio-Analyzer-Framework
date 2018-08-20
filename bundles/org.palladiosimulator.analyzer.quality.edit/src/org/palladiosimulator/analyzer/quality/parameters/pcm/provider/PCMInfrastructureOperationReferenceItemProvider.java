/**
 */
package org.palladiosimulator.analyzer.quality.parameters.pcm.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.palladiosimulator.analyzer.quality.parameters.pcm.PCMInfrastructureOperationReference;
import org.palladiosimulator.analyzer.quality.parameters.pcm.PCMPackage;
import org.palladiosimulator.analyzer.quality.parameters.provider.OperationReferenceItemProvider;
import org.palladiosimulator.analyzer.quality.provider.QualityEditPlugin;

/**
 * This is the item provider adapter for a
 * {@link org.palladiosimulator.analyzer.quality.parameters.pcm.PCMInfrastructureOperationReference}
 * object. <!-- begin-user-doc --> <!-- end-user-doc -->
 *
 * @generated
 */
public class PCMInfrastructureOperationReferenceItemProvider extends OperationReferenceItemProvider {

    /**
     * This constructs an instance from a factory and a notifier. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    public PCMInfrastructureOperationReferenceItemProvider(final AdapterFactory adapterFactory) {
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

            this.addRolePropertyDescriptor(object);
            this.addSignaturePropertyDescriptor(object);
        }
        return this.itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Role feature. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected void addRolePropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString("_UI_PCMInfrastructureOperationReference_role_feature"),
                this.getString("_UI_PropertyDescriptor_description",
                        "_UI_PCMInfrastructureOperationReference_role_feature",
                        "_UI_PCMInfrastructureOperationReference_type"),
                PCMPackage.Literals.PCM_INFRASTRUCTURE_OPERATION_REFERENCE__ROLE, true, false, true, null, null, null));
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
                this.getString("_UI_PCMInfrastructureOperationReference_signature_feature"),
                this.getString("_UI_PropertyDescriptor_description",
                        "_UI_PCMInfrastructureOperationReference_signature_feature",
                        "_UI_PCMInfrastructureOperationReference_type"),
                PCMPackage.Literals.PCM_INFRASTRUCTURE_OPERATION_REFERENCE__SIGNATURE, true, false, true, null, null,
                null));
    }

    /**
     * This returns PCMInfrastructureOperationReference.gif. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object getImage(final Object object) {
        return this.overlayImage(object,
                this.getResourceLocator().getImage("full/obj16/PCMInfrastructureOperationReference"));
    }

    /**
     * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @generated
     */
    @Override
    public String getText(final Object object) {
        final String label = ((PCMInfrastructureOperationReference) object).getId();
        return label == null || label.length() == 0 ? this.getString("_UI_PCMInfrastructureOperationReference_type")
                : this.getString("_UI_PCMInfrastructureOperationReference_type") + " " + label;
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

    /**
     * Return the resource locator for this item provider's resources. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    @Override
    public ResourceLocator getResourceLocator() {
        return QualityEditPlugin.INSTANCE;
    }

}
