/**
 */
package org.palladiosimulator.pcm.resultdecorator.repositorydecorator;

import org.palladiosimulator.pcm.allocation.AllocationContext;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Allocation Context Results</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>
 * {@link org.palladiosimulator.pcm.resultdecorator.repositorydecorator.AllocationContextResults#getAllocationContext_AllocationContextResult
 * <em>Allocation Context Allocation Context Result</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.resultdecorator.repositorydecorator.RepositorydecoratorPackage#getAllocationContextResults()
 * @model
 * @generated
 */
public interface AllocationContextResults extends ComponentResult {

    /**
     * Returns the value of the '<em><b>Allocation Context Allocation Context Result</b></em>'
     * reference. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Allocation Context Allocation Context Result</em>' reference isn't
     * clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Allocation Context Allocation Context Result</em>' reference.
     * @see #setAllocationContext_AllocationContextResult(AllocationContext)
     * @see org.palladiosimulator.pcm.resultdecorator.repositorydecorator.RepositorydecoratorPackage#getAllocationContextResults_AllocationContext_AllocationContextResult()
     * @model ordered="false"
     * @generated
     */
    AllocationContext getAllocationContext_AllocationContextResult();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.pcm.resultdecorator.repositorydecorator.AllocationContextResults#getAllocationContext_AllocationContextResult
     * <em>Allocation Context Allocation Context Result</em>}' reference. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Allocation Context Allocation Context Result</em>'
     *            reference.
     * @see #getAllocationContext_AllocationContextResult()
     * @generated
     */
    void setAllocationContext_AllocationContextResult(AllocationContext value);

} // AllocationContextResults
