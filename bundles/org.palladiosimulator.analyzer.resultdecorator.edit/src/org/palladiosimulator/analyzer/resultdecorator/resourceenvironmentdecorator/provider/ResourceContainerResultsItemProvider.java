/**
 */
package org.palladiosimulator.analyzer.resultdecorator.resourceenvironmentdecorator.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.palladiosimulator.analyzer.resultdecorator.resourceenvironmentdecorator.ResourceContainerResults;
import org.palladiosimulator.analyzer.resultdecorator.resourceenvironmentdecorator.ResourceenvironmentdecoratorPackage;

/**
 * This is the item provider adapter for a
 * {@link org.palladiosimulator.analyzer.resultdecorator.resourceenvironmentdecorator.ResourceContainerResults}
 * object. <!-- begin-user-doc --> <!-- end-user-doc -->
 *
 * @generated
 */
public class ResourceContainerResultsItemProvider extends ActiveResourceUtilisationResultItemProvider {

    /**
     * This constructs an instance from a factory and a notifier. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    public ResourceContainerResultsItemProvider(final AdapterFactory adapterFactory) {
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

            this.addResourceContainer_ResourceContainerResultsPropertyDescriptor(object);
        }
        return this.itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Resource Container Resource Container Results
     * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected void addResourceContainer_ResourceContainerResultsPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString("_UI_ResourceContainerResults_resourceContainer_ResourceContainerResults_feature"),
                this.getString("_UI_PropertyDescriptor_description",
                        "_UI_ResourceContainerResults_resourceContainer_ResourceContainerResults_feature",
                        "_UI_ResourceContainerResults_type"),
                ResourceenvironmentdecoratorPackage.Literals.RESOURCE_CONTAINER_RESULTS__RESOURCE_CONTAINER_RESOURCE_CONTAINER_RESULTS,
                true, false, true, null, null, null));
    }

    /**
     * This returns ResourceContainerResults.gif. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object getImage(final Object object) {
        return this.overlayImage(object, this.getResourceLocator().getImage("full/obj16/ResourceContainerResults"));
    }

    /**
     * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @generated
     */
    @Override
    public String getText(final Object object) {
        final String label = ((ResourceContainerResults) object).getEntityName();
        return label == null || label.length() == 0 ? this.getString("_UI_ResourceContainerResults_type")
                : this.getString("_UI_ResourceContainerResults_type") + " " + label;
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
