/**
 */
package org.palladiosimulator.analyzer.quality.qualityannotation.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.palladiosimulator.analyzer.quality.provider.QualityEditPlugin;
import org.palladiosimulator.analyzer.quality.qualityannotation.CharacterisedPCMParameterPartition;
import org.palladiosimulator.analyzer.quality.qualityannotation.QualityAnnotationPackage;

import de.uka.ipd.sdq.identifier.provider.IdentifierItemProvider;

/**
 * This is the item provider adapter for a
 * {@link org.palladiosimulator.analyzer.quality.qualityannotation.CharacterisedPCMParameterPartition}
 * object. <!-- begin-user-doc --> <!-- end-user-doc -->
 *
 * @generated
 */
public class CharacterisedPCMParameterPartitionItemProvider extends IdentifierItemProvider {

    /**
     * This constructs an instance from a factory and a notifier. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    public CharacterisedPCMParameterPartitionItemProvider(final AdapterFactory adapterFactory) {
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

            this.addForCharacterisationPropertyDescriptor(object);
            this.addQualifiedElementNamePropertyDescriptor(object);
        }
        return this.itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the For Characterisation feature. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected void addForCharacterisationPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString("_UI_CharacterisedPCMParameterPartition_forCharacterisation_feature"),
                this.getString("_UI_PropertyDescriptor_description",
                        "_UI_CharacterisedPCMParameterPartition_forCharacterisation_feature",
                        "_UI_CharacterisedPCMParameterPartition_type"),
                QualityAnnotationPackage.Literals.CHARACTERISED_PCM_PARAMETER_PARTITION__FOR_CHARACTERISATION, true,
                false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Qualified Element Name feature. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected void addQualifiedElementNamePropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString("_UI_CharacterisedPCMParameterPartition_qualifiedElementName_feature"),
                this.getString("_UI_PropertyDescriptor_description",
                        "_UI_CharacterisedPCMParameterPartition_qualifiedElementName_feature",
                        "_UI_CharacterisedPCMParameterPartition_type"),
                QualityAnnotationPackage.Literals.CHARACTERISED_PCM_PARAMETER_PARTITION__QUALIFIED_ELEMENT_NAME, true,
                false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @generated
     */
    @Override
    public String getText(final Object object) {
        final String label = ((CharacterisedPCMParameterPartition) object).getId();
        return label == null || label.length() == 0 ? this.getString("_UI_CharacterisedPCMParameterPartition_type")
                : this.getString("_UI_CharacterisedPCMParameterPartition_type") + " " + label;
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

        switch (notification.getFeatureID(CharacterisedPCMParameterPartition.class)) {
        case QualityAnnotationPackage.CHARACTERISED_PCM_PARAMETER_PARTITION__FOR_CHARACTERISATION:
        case QualityAnnotationPackage.CHARACTERISED_PCM_PARAMETER_PARTITION__QUALIFIED_ELEMENT_NAME:
            this.fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
            return;
        }
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
