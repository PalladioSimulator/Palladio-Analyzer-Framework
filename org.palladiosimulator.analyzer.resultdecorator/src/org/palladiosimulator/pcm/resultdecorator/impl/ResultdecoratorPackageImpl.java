/**
 */
package org.palladiosimulator.pcm.resultdecorator.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.palladiosimulator.pcm.PcmPackage;
import org.palladiosimulator.pcm.core.entity.EntityPackage;
import org.palladiosimulator.pcm.resultdecorator.ResultDecoratorRepository;
import org.palladiosimulator.pcm.resultdecorator.ResultdecoratorFactory;
import org.palladiosimulator.pcm.resultdecorator.ResultdecoratorPackage;
import org.palladiosimulator.pcm.resultdecorator.repositorydecorator.RepositorydecoratorPackage;
import org.palladiosimulator.pcm.resultdecorator.repositorydecorator.impl.RepositorydecoratorPackageImpl;
import org.palladiosimulator.pcm.resultdecorator.resourceenvironmentdecorator.ResourceenvironmentdecoratorPackage;
import org.palladiosimulator.pcm.resultdecorator.resourceenvironmentdecorator.impl.ResourceenvironmentdecoratorPackageImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!-- end-user-doc -->
 *
 * @generated
 */
public class ResultdecoratorPackageImpl extends EPackageImpl implements ResultdecoratorPackage {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass resultDecoratorRepositoryEClass = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package package URI
     * value.
     * <p>
     * Note: the correct way to create the package is via the static factory method {@link #init
     * init()}, which also performs initialization of the package, or returns the registered
     * package, if one already exists. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see org.palladiosimulator.pcm.resultdecorator.ResultdecoratorPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private ResultdecoratorPackageImpl() {
        super(eNS_URI, ResultdecoratorFactory.eINSTANCE);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others
     * upon which it depends.
     *
     * <p>
     * This method is used to initialize {@link ResultdecoratorPackage#eINSTANCE} when that field is
     * accessed. Clients should not invoke it directly. Instead, they should simply access that
     * field to obtain the package. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static ResultdecoratorPackage init() {
        if (isInited) {
            return (ResultdecoratorPackage) EPackage.Registry.INSTANCE.getEPackage(ResultdecoratorPackage.eNS_URI);
        }

        // Obtain or create and register package
        final ResultdecoratorPackageImpl theResultdecoratorPackage = (ResultdecoratorPackageImpl) (EPackage.Registry.INSTANCE
                .get(eNS_URI) instanceof ResultdecoratorPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
                        : new ResultdecoratorPackageImpl());

        isInited = true;

        // Initialize simple dependencies
        PcmPackage.eINSTANCE.eClass();

        // Obtain or create and register interdependencies
        final RepositorydecoratorPackageImpl theRepositorydecoratorPackage = (RepositorydecoratorPackageImpl) (EPackage.Registry.INSTANCE
                .getEPackage(RepositorydecoratorPackage.eNS_URI) instanceof RepositorydecoratorPackageImpl
                        ? EPackage.Registry.INSTANCE.getEPackage(RepositorydecoratorPackage.eNS_URI)
                        : RepositorydecoratorPackage.eINSTANCE);
        final ResourceenvironmentdecoratorPackageImpl theResourceenvironmentdecoratorPackage = (ResourceenvironmentdecoratorPackageImpl) (EPackage.Registry.INSTANCE
                .getEPackage(
                        ResourceenvironmentdecoratorPackage.eNS_URI) instanceof ResourceenvironmentdecoratorPackageImpl
                                ? EPackage.Registry.INSTANCE.getEPackage(ResourceenvironmentdecoratorPackage.eNS_URI)
                                : ResourceenvironmentdecoratorPackage.eINSTANCE);

        // Create package meta-data objects
        theResultdecoratorPackage.createPackageContents();
        theRepositorydecoratorPackage.createPackageContents();
        theResourceenvironmentdecoratorPackage.createPackageContents();

        // Initialize created meta-data
        theResultdecoratorPackage.initializePackageContents();
        theRepositorydecoratorPackage.initializePackageContents();
        theResourceenvironmentdecoratorPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theResultdecoratorPackage.freeze();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(ResultdecoratorPackage.eNS_URI, theResultdecoratorPackage);
        return theResultdecoratorPackage;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getResultDecoratorRepository() {
        return this.resultDecoratorRepositoryEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getResultDecoratorRepository_ComponentResults_ResultDecoratorRepository() {
        return (EReference) this.resultDecoratorRepositoryEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getResultDecoratorRepository_UtilisationResults_ResultDecoratorRepository() {
        return (EReference) this.resultDecoratorRepositoryEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getResultDecoratorRepository_ServiceResult_ResultDecoratorRepository() {
        return (EReference) this.resultDecoratorRepositoryEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ResultdecoratorFactory getResultdecoratorFactory() {
        return (ResultdecoratorFactory) this.getEFactoryInstance();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private boolean isCreated = false;

    /**
     * Creates the meta-model objects for the package. This method is guarded to have no affect on
     * any invocation but its first. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public void createPackageContents() {
        if (this.isCreated) {
            return;
        }
        this.isCreated = true;

        // Create classes and their features
        this.resultDecoratorRepositoryEClass = this.createEClass(RESULT_DECORATOR_REPOSITORY);
        this.createEReference(this.resultDecoratorRepositoryEClass,
                RESULT_DECORATOR_REPOSITORY__COMPONENT_RESULTS_RESULT_DECORATOR_REPOSITORY);
        this.createEReference(this.resultDecoratorRepositoryEClass,
                RESULT_DECORATOR_REPOSITORY__UTILISATION_RESULTS_RESULT_DECORATOR_REPOSITORY);
        this.createEReference(this.resultDecoratorRepositoryEClass,
                RESULT_DECORATOR_REPOSITORY__SERVICE_RESULT_RESULT_DECORATOR_REPOSITORY);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private boolean isInitialized = false;

    /**
     * Complete the initialization of the package and its meta-model. This method is guarded to have
     * no affect on any invocation but its first. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public void initializePackageContents() {
        if (this.isInitialized) {
            return;
        }
        this.isInitialized = true;

        // Initialize package
        this.setName(eNAME);
        this.setNsPrefix(eNS_PREFIX);
        this.setNsURI(eNS_URI);

        // Obtain other dependent packages
        final RepositorydecoratorPackage theRepositorydecoratorPackage = (RepositorydecoratorPackage) EPackage.Registry.INSTANCE
                .getEPackage(RepositorydecoratorPackage.eNS_URI);
        final ResourceenvironmentdecoratorPackage theResourceenvironmentdecoratorPackage = (ResourceenvironmentdecoratorPackage) EPackage.Registry.INSTANCE
                .getEPackage(ResourceenvironmentdecoratorPackage.eNS_URI);
        final EntityPackage theEntityPackage = (EntityPackage) EPackage.Registry.INSTANCE
                .getEPackage(EntityPackage.eNS_URI);

        // Add subpackages
        this.getESubpackages().add(theRepositorydecoratorPackage);
        this.getESubpackages().add(theResourceenvironmentdecoratorPackage);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        this.resultDecoratorRepositoryEClass.getESuperTypes().add(theEntityPackage.getNamedElement());

        // Initialize classes and features; add operations and parameters
        this.initEClass(this.resultDecoratorRepositoryEClass, ResultDecoratorRepository.class,
                "ResultDecoratorRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getResultDecoratorRepository_ComponentResults_ResultDecoratorRepository(),
                theRepositorydecoratorPackage.getComponentResult(), null, "componentResults_ResultDecoratorRepository",
                null, 0, -1, ResultDecoratorRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        this.initEReference(this.getResultDecoratorRepository_UtilisationResults_ResultDecoratorRepository(),
                theResourceenvironmentdecoratorPackage.getUtilisationResult(), null,
                "utilisationResults_ResultDecoratorRepository", null, 0, -1, ResultDecoratorRepository.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        this.initEReference(this.getResultDecoratorRepository_ServiceResult_ResultDecoratorRepository(),
                theRepositorydecoratorPackage.getServiceResult(), null, "serviceResult_ResultDecoratorRepository", null,
                0, -1, ResultDecoratorRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        // Create resource
        this.createResource(eNS_URI);
    }

} // ResultdecoratorPackageImpl
