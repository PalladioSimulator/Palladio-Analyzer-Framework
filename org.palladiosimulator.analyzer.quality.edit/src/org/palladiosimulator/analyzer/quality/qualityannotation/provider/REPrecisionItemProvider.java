/**
 */
package org.palladiosimulator.analyzer.quality.qualityannotation.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.palladiosimulator.analyzer.quality.provider.QualityEditPlugin;
import org.palladiosimulator.analyzer.quality.qualityannotation.QualityAnnotationFactory;
import org.palladiosimulator.analyzer.quality.qualityannotation.QualityAnnotationPackage;
import org.palladiosimulator.analyzer.quality.qualityannotation.REPrecision;

import de.uka.ipd.sdq.identifier.provider.IdentifierItemProvider;

/**
 * This is the item provider adapter for a
 * {@link org.palladiosimulator.analyzer.quality.qualityannotation.REPrecision} object. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 *
 * @generated
 */
public class REPrecisionItemProvider extends IdentifierItemProvider {

    /**
     * This constructs an instance from a factory and a notifier. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    public REPrecisionItemProvider(final AdapterFactory adapterFactory) {
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

        }
        return this.itemPropertyDescriptors;
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
            this.childrenFeatures
                    .add(QualityAnnotationPackage.Literals.RE_PRECISION__DEFAULT_PRECISION_NUMBER_OF_CALLS);
            this.childrenFeatures.add(QualityAnnotationPackage.Literals.RE_PRECISION__DEFAULT_PRECISION_CALL_PARAMETER);
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
     * This returns REPrecision.gif. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object getImage(final Object object) {
        return this.overlayImage(object, this.getResourceLocator().getImage("full/obj16/REPrecision"));
    }

    /**
     * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @generated
     */
    @Override
    public String getText(final Object object) {
        final String label = ((REPrecision) object).getId();
        return label == null || label.length() == 0 ? this.getString("_UI_REPrecision_type")
                : this.getString("_UI_REPrecision_type") + " " + label;
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

        switch (notification.getFeatureID(REPrecision.class)) {
        case QualityAnnotationPackage.RE_PRECISION__DEFAULT_PRECISION_NUMBER_OF_CALLS:
        case QualityAnnotationPackage.RE_PRECISION__DEFAULT_PRECISION_CALL_PARAMETER:
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
                QualityAnnotationPackage.Literals.RE_PRECISION__DEFAULT_PRECISION_NUMBER_OF_CALLS,
                QualityAnnotationFactory.eINSTANCE.createExactlyAsSpecifiedPrecision()));

        newChildDescriptors.add(this.createChildParameter(
                QualityAnnotationPackage.Literals.RE_PRECISION__DEFAULT_PRECISION_NUMBER_OF_CALLS,
                QualityAnnotationFactory.eINSTANCE.createLimitedDeviationPrecision()));

        newChildDescriptors.add(this.createChildParameter(
                QualityAnnotationPackage.Literals.RE_PRECISION__DEFAULT_PRECISION_NUMBER_OF_CALLS,
                QualityAnnotationFactory.eINSTANCE.createNoPrecision()));

        newChildDescriptors.add(this.createChildParameter(
                QualityAnnotationPackage.Literals.RE_PRECISION__DEFAULT_PRECISION_CALL_PARAMETER,
                QualityAnnotationFactory.eINSTANCE.createExactlyAsSpecifiedPrecision()));

        newChildDescriptors.add(this.createChildParameter(
                QualityAnnotationPackage.Literals.RE_PRECISION__DEFAULT_PRECISION_CALL_PARAMETER,
                QualityAnnotationFactory.eINSTANCE.createLimitedDeviationPrecision()));

        newChildDescriptors.add(this.createChildParameter(
                QualityAnnotationPackage.Literals.RE_PRECISION__DEFAULT_PRECISION_CALL_PARAMETER,
                QualityAnnotationFactory.eINSTANCE.createNoPrecision()));
    }

    /**
     * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public String getCreateChildText(final Object owner, final Object feature, final Object child,
            final Collection<?> selection) {
        final Object childFeature = feature;
        final Object childObject = child;

        final boolean qualify = childFeature == QualityAnnotationPackage.Literals.RE_PRECISION__DEFAULT_PRECISION_NUMBER_OF_CALLS
                || childFeature == QualityAnnotationPackage.Literals.RE_PRECISION__DEFAULT_PRECISION_CALL_PARAMETER;

        if (qualify) {
            return this.getString("_UI_CreateChild_text2", new Object[] { this.getTypeText(childObject),
                    this.getFeatureText(childFeature), this.getTypeText(owner) });
        }
        return super.getCreateChildText(owner, feature, child, selection);
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
