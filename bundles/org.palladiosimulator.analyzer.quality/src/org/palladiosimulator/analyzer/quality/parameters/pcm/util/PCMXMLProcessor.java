/**
 */
package org.palladiosimulator.analyzer.quality.parameters.pcm.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.util.XMLProcessor;
import org.palladiosimulator.analyzer.quality.parameters.pcm.PCMPackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents <!-- begin-user-doc
 * --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class PCMXMLProcessor extends XMLProcessor {

    /**
     * Public constructor to instantiate the helper. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public PCMXMLProcessor() {
        super((EPackage.Registry.INSTANCE));
        PCMPackage.eINSTANCE.eClass();
    }

    /**
     * Register for "*" and "xml" file extensions the PCMResourceFactoryImpl factory. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected Map<String, Resource.Factory> getRegistrations() {
        if (this.registrations == null) {
            super.getRegistrations();
            this.registrations.put(XML_EXTENSION, new PCMResourceFactoryImpl());
            this.registrations.put(STAR_EXTENSION, new PCMResourceFactoryImpl());
        }
        return this.registrations;
    }

} // PCMXMLProcessor
