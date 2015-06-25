/**
 */
package org.palladiosimulator.analyzer.quality;

import de.uka.ipd.sdq.identifier.Identifier;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Statement</b></em>'. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.analyzer.quality.QualityStatement#getQualityRepository
 * <em>Quality Repository</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.analyzer.quality.QualityPackage#getQualityStatement()
 * @model abstract="true"
 * @generated
 */
public interface QualityStatement extends Identifier {

    /**
     * Returns the value of the '<em><b>Quality Repository</b></em>' container reference. It is
     * bidirectional and its opposite is '
     * {@link org.palladiosimulator.analyzer.quality.QualityRepository#getQualityStatements
     * <em>Quality Statements</em>}'. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Quality Repository</em>' container reference isn't clear, there
     * really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Quality Repository</em>' container reference.
     * @see #setQualityRepository(QualityRepository)
     * @see org.palladiosimulator.analyzer.quality.QualityPackage#getQualityStatement_QualityRepository()
     * @see org.palladiosimulator.analyzer.quality.QualityRepository#getQualityStatements
     * @model opposite="qualityStatements" required="true" transient="false" ordered="false"
     * @generated
     */
    QualityRepository getQualityRepository();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.analyzer.quality.QualityStatement#getQualityRepository
     * <em>Quality Repository</em>}' container reference. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @param value
     *            the new value of the '<em>Quality Repository</em>' container reference.
     * @see #getQualityRepository()
     * @generated
     */
    void setQualityRepository(QualityRepository value);

} // QualityStatement
