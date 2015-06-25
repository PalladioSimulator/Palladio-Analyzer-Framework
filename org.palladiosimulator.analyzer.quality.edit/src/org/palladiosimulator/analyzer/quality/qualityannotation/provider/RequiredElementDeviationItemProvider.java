/**
 */
package org.palladiosimulator.analyzer.quality.qualityannotation.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.palladiosimulator.analyzer.quality.provider.QualityEditPlugin;
import org.palladiosimulator.analyzer.quality.qualityannotation.QualityAnnotationFactory;
import org.palladiosimulator.analyzer.quality.qualityannotation.QualityAnnotationPackage;
import org.palladiosimulator.analyzer.quality.qualityannotation.RequiredElementDeviation;

/**
 * This is the item provider adapter for a
 * {@link org.palladiosimulator.analyzer.quality.qualityannotation.RequiredElementDeviation} object.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 *
 * @generated
 */
public class RequiredElementDeviationItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
        IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {

    /**
     * This constructs an instance from a factory and a notifier. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    public RequiredElementDeviationItemProvider(final AdapterFactory adapterFactory) {
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

            this.addMaximumDeviationNumberOfCallsPropertyDescriptor(object);
        }
        return this.itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Maximum Deviation Number Of Calls feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected void addMaximumDeviationNumberOfCallsPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString("_UI_RequiredElementDeviation_maximumDeviationNumberOfCalls_feature"),
                this.getString("_UI_PropertyDescriptor_description",
                        "_UI_RequiredElementDeviation_maximumDeviationNumberOfCalls_feature",
                        "_UI_RequiredElementDeviation_type"),
                QualityAnnotationPackage.Literals.REQUIRED_ELEMENT_DEVIATION__MAXIMUM_DEVIATION_NUMBER_OF_CALLS, true,
                false, true, null, null, null));
    }

    /**
     * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate
     * feature for an {@link org.eclipse.emf.edit.command.AddCommand},
     * {@link org.eclipse.emf.edit.command.RemoveCommand} or
     * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Collection<? extends EStructuralFeature> getChildrenFeatures(final Object object) {
        if (this.childrenFeatures == null) {
            super.getChildrenFeatures(object);
            this.childrenFeatures.add(
                    QualityAnnotationPackage.Literals.REQUIRED_ELEMENT_DEVIATION__MAXIMUM_DEVIATION_CALL_PARAMETER_VALUES);
            this.childrenFeatures.add(QualityAnnotationPackage.Literals.REQUIRED_ELEMENT_DEVIATION__REQUIRED_ELEMENT);
        }
        return this.childrenFeatures;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EStructuralFeature getChildFeature(final Object object, final Object child) {
        // Check the type of the specified child object and return the proper feature to use for
        // adding (see {@link AddCommand}) it as a child.

        return super.getChildFeature(object, child);
    }

    /**
     * This returns RequiredElementDeviation.gif. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object getImage(final Object object) {
        return this.overlayImage(object, this.getResourceLocator().getImage("full/obj16/RequiredElementDeviation"));
    }

    /**
     * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @generated
     */
    @Override
    public String getText(final Object object) {
        return this.getString("_UI_RequiredElementDeviation_type");
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

        switch (notification.getFeatureID(RequiredElementDeviation.class)) {
        case QualityAnnotationPackage.REQUIRED_ELEMENT_DEVIATION__MAXIMUM_DEVIATION_CALL_PARAMETER_VALUES:
        case QualityAnnotationPackage.REQUIRED_ELEMENT_DEVIATION__REQUIRED_ELEMENT:
            this.fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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

        newChildDescriptors.add(this.createChildParameter(
                QualityAnnotationPackage.Literals.REQUIRED_ELEMENT_DEVIATION__MAXIMUM_DEVIATION_CALL_PARAMETER_VALUES,
                QualityAnnotationFactory.eINSTANCE.createParameterValueDeviation()));

        newChildDescriptors.add(this.createChildParameter(
                QualityAnnotationPackage.Literals.REQUIRED_ELEMENT_DEVIATION__REQUIRED_ELEMENT,
                QualityAnnotationFactory.eINSTANCE.createPCMRECategory()));

        newChildDescriptors.add(this.createChildParameter(
                QualityAnnotationPackage.Literals.REQUIRED_ELEMENT_DEVIATION__REQUIRED_ELEMENT,
                QualityAnnotationFactory.eINSTANCE.createPCMREInterface()));

        newChildDescriptors.add(this.createChildParameter(
                QualityAnnotationPackage.Literals.REQUIRED_ELEMENT_DEVIATION__REQUIRED_ELEMENT,
                QualityAnnotationFactory.eINSTANCE.createPCMRERole()));

        newChildDescriptors.add(this.createChildParameter(
                QualityAnnotationPackage.Literals.REQUIRED_ELEMENT_DEVIATION__REQUIRED_ELEMENT,
                QualityAnnotationFactory.eINSTANCE.createPCMRESignature()));

        newChildDescriptors.add(this.createChildParameter(
                QualityAnnotationPackage.Literals.REQUIRED_ELEMENT_DEVIATION__REQUIRED_ELEMENT,
                QualityAnnotationFactory.eINSTANCE.createPCMREResourceInterface()));

        newChildDescriptors.add(this.createChildParameter(
                QualityAnnotationPackage.Literals.REQUIRED_ELEMENT_DEVIATION__REQUIRED_ELEMENT,
                QualityAnnotationFactory.eINSTANCE.createPCMREResourceSignature()));

        newChildDescriptors.add(this.createChildParameter(
                QualityAnnotationPackage.Literals.REQUIRED_ELEMENT_DEVIATION__REQUIRED_ELEMENT,
                QualityAnnotationFactory.eINSTANCE.createPCMREResource()));

        newChildDescriptors.add(this.createChildParameter(
                QualityAnnotationPackage.Literals.REQUIRED_ELEMENT_DEVIATION__REQUIRED_ELEMENT,
                QualityAnnotationFactory.eINSTANCE.createPCMREResourceRole()));

        newChildDescriptors.add(this.createChildParameter(
                QualityAnnotationPackage.Literals.REQUIRED_ELEMENT_DEVIATION__REQUIRED_ELEMENT,
                QualityAnnotationFactory.eINSTANCE.createPCMRECIBehavior()));

        newChildDescriptors.add(this.createChildParameter(
                QualityAnnotationPackage.Literals.REQUIRED_ELEMENT_DEVIATION__REQUIRED_ELEMENT,
                QualityAnnotationFactory.eINSTANCE.createPCMREInfrastructureInterface()));

        newChildDescriptors.add(this.createChildParameter(
                QualityAnnotationPackage.Literals.REQUIRED_ELEMENT_DEVIATION__REQUIRED_ELEMENT,
                QualityAnnotationFactory.eINSTANCE.createPCMREInfrastructureRole()));

        newChildDescriptors.add(this.createChildParameter(
                QualityAnnotationPackage.Literals.REQUIRED_ELEMENT_DEVIATION__REQUIRED_ELEMENT,
                QualityAnnotationFactory.eINSTANCE.createPCMREInfrastructureSignature()));
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
