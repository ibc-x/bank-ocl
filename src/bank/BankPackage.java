/**
 */
package bank;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see bank.BankFactory
 * @model kind="package"
 * @generated
 */
public interface BankPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "bank";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org/eclipse/compte/bank";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.eclipse.compe.bank";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BankPackage eINSTANCE = bank.impl.BankPackageImpl.init();

	/**
	 * The meta object id for the '{@link bank.impl.CompteImpl <em>Compte</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bank.impl.CompteImpl
	 * @see bank.impl.BankPackageImpl#getCompte()
	 * @generated
	 */
	int COMPTE = 0;

	/**
	 * The feature id for the '<em><b>Numero</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPTE__NUMERO = 0;

	/**
	 * The feature id for the '<em><b>Solde</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPTE__SOLDE = 1;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPTE__OPERATIONS = 2;

	/**
	 * The feature id for the '<em><b>Client</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPTE__CLIENT = 3;

	/**
	 * The number of structural features of the '<em>Compte</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPTE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Compte</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link bank.impl.CompteCourantImpl <em>Compte Courant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bank.impl.CompteCourantImpl
	 * @see bank.impl.BankPackageImpl#getCompteCourant()
	 * @generated
	 */
	int COMPTE_COURANT = 1;

	/**
	 * The feature id for the '<em><b>Numero</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPTE_COURANT__NUMERO = COMPTE__NUMERO;

	/**
	 * The feature id for the '<em><b>Solde</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPTE_COURANT__SOLDE = COMPTE__SOLDE;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPTE_COURANT__OPERATIONS = COMPTE__OPERATIONS;

	/**
	 * The feature id for the '<em><b>Client</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPTE_COURANT__CLIENT = COMPTE__CLIENT;

	/**
	 * The feature id for the '<em><b>Decouvert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPTE_COURANT__DECOUVERT = COMPTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Compte Courant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPTE_COURANT_FEATURE_COUNT = COMPTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Compte Courant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPTE_COURANT_OPERATION_COUNT = COMPTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bank.impl.CompteEpargneImpl <em>Compte Epargne</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bank.impl.CompteEpargneImpl
	 * @see bank.impl.BankPackageImpl#getCompteEpargne()
	 * @generated
	 */
	int COMPTE_EPARGNE = 2;

	/**
	 * The feature id for the '<em><b>Numero</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPTE_EPARGNE__NUMERO = COMPTE__NUMERO;

	/**
	 * The feature id for the '<em><b>Solde</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPTE_EPARGNE__SOLDE = COMPTE__SOLDE;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPTE_EPARGNE__OPERATIONS = COMPTE__OPERATIONS;

	/**
	 * The feature id for the '<em><b>Client</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPTE_EPARGNE__CLIENT = COMPTE__CLIENT;

	/**
	 * The feature id for the '<em><b>Taux Interet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPTE_EPARGNE__TAUX_INTERET = COMPTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Compte Epargne</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPTE_EPARGNE_FEATURE_COUNT = COMPTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Compte Epargne</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPTE_EPARGNE_OPERATION_COUNT = COMPTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bank.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bank.impl.OperationImpl
	 * @see bank.impl.BankPackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 3;

	/**
	 * The feature id for the '<em><b>Numero</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__NUMERO = 0;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__DATE = 1;

	/**
	 * The feature id for the '<em><b>Montant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__MONTANT = 2;

	/**
	 * The feature id for the '<em><b>Type Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__TYPE_OPERATION = 3;

	/**
	 * The feature id for the '<em><b>Compte</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__COMPTE = 4;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link bank.impl.PersonneImpl <em>Personne</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bank.impl.PersonneImpl
	 * @see bank.impl.BankPackageImpl#getPersonne()
	 * @generated
	 */
	int PERSONNE = 5;

	/**
	 * The feature id for the '<em><b>Numero</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONNE__NUMERO = 0;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONNE__NOM = 1;

	/**
	 * The number of structural features of the '<em>Personne</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONNE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Personne</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONNE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link bank.impl.EmployeImpl <em>Employe</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bank.impl.EmployeImpl
	 * @see bank.impl.BankPackageImpl#getEmploye()
	 * @generated
	 */
	int EMPLOYE = 4;

	/**
	 * The feature id for the '<em><b>Numero</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYE__NUMERO = PERSONNE__NUMERO;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYE__NOM = PERSONNE__NOM;

	/**
	 * The number of structural features of the '<em>Employe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYE_FEATURE_COUNT = PERSONNE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Employe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYE_OPERATION_COUNT = PERSONNE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bank.impl.ClientImpl <em>Client</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bank.impl.ClientImpl
	 * @see bank.impl.BankPackageImpl#getClient()
	 * @generated
	 */
	int CLIENT = 6;

	/**
	 * The feature id for the '<em><b>Numero</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__NUMERO = PERSONNE__NUMERO;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__NOM = PERSONNE__NOM;

	/**
	 * The feature id for the '<em><b>Comptes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__COMPTES = PERSONNE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__IDENTIFIER = PERSONNE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__CODE = PERSONNE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_FEATURE_COUNT = PERSONNE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Display</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT___DISPLAY = PERSONNE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_OPERATION_COUNT = PERSONNE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link bank.impl.GroupeImpl <em>Groupe</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bank.impl.GroupeImpl
	 * @see bank.impl.BankPackageImpl#getGroupe()
	 * @generated
	 */
	int GROUPE = 7;

	/**
	 * The feature id for the '<em><b>Numero</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPE__NUMERO = PERSONNE__NUMERO;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPE__NOM = PERSONNE__NOM;

	/**
	 * The number of structural features of the '<em>Groupe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPE_FEATURE_COUNT = PERSONNE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Groupe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPE_OPERATION_COUNT = PERSONNE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bank.TypeOperation <em>Type Operation</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bank.TypeOperation
	 * @see bank.impl.BankPackageImpl#getTypeOperation()
	 * @generated
	 */
	int TYPE_OPERATION = 8;


	/**
	 * Returns the meta object for class '{@link bank.Compte <em>Compte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compte</em>'.
	 * @see bank.Compte
	 * @generated
	 */
	EClass getCompte();

	/**
	 * Returns the meta object for the attribute '{@link bank.Compte#getNumero <em>Numero</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Numero</em>'.
	 * @see bank.Compte#getNumero()
	 * @see #getCompte()
	 * @generated
	 */
	EAttribute getCompte_Numero();

	/**
	 * Returns the meta object for the attribute '{@link bank.Compte#getSolde <em>Solde</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Solde</em>'.
	 * @see bank.Compte#getSolde()
	 * @see #getCompte()
	 * @generated
	 */
	EAttribute getCompte_Solde();

	/**
	 * Returns the meta object for the containment reference list '{@link bank.Compte#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operations</em>'.
	 * @see bank.Compte#getOperations()
	 * @see #getCompte()
	 * @generated
	 */
	EReference getCompte_Operations();

	/**
	 * Returns the meta object for the reference '{@link bank.Compte#getClient <em>Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Client</em>'.
	 * @see bank.Compte#getClient()
	 * @see #getCompte()
	 * @generated
	 */
	EReference getCompte_Client();

	/**
	 * Returns the meta object for class '{@link bank.CompteCourant <em>Compte Courant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compte Courant</em>'.
	 * @see bank.CompteCourant
	 * @generated
	 */
	EClass getCompteCourant();

	/**
	 * Returns the meta object for the attribute '{@link bank.CompteCourant#getDecouvert <em>Decouvert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Decouvert</em>'.
	 * @see bank.CompteCourant#getDecouvert()
	 * @see #getCompteCourant()
	 * @generated
	 */
	EAttribute getCompteCourant_Decouvert();

	/**
	 * Returns the meta object for class '{@link bank.CompteEpargne <em>Compte Epargne</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compte Epargne</em>'.
	 * @see bank.CompteEpargne
	 * @generated
	 */
	EClass getCompteEpargne();

	/**
	 * Returns the meta object for the attribute '{@link bank.CompteEpargne#getTauxInteret <em>Taux Interet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Taux Interet</em>'.
	 * @see bank.CompteEpargne#getTauxInteret()
	 * @see #getCompteEpargne()
	 * @generated
	 */
	EAttribute getCompteEpargne_TauxInteret();

	/**
	 * Returns the meta object for class '{@link bank.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see bank.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for the attribute '{@link bank.Operation#getNumero <em>Numero</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Numero</em>'.
	 * @see bank.Operation#getNumero()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_Numero();

	/**
	 * Returns the meta object for the attribute '{@link bank.Operation#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see bank.Operation#getDate()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_Date();

	/**
	 * Returns the meta object for the attribute '{@link bank.Operation#getMontant <em>Montant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Montant</em>'.
	 * @see bank.Operation#getMontant()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_Montant();

	/**
	 * Returns the meta object for the attribute '{@link bank.Operation#getTypeOperation <em>Type Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Operation</em>'.
	 * @see bank.Operation#getTypeOperation()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_TypeOperation();

	/**
	 * Returns the meta object for the container reference '{@link bank.Operation#getCompte <em>Compte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Compte</em>'.
	 * @see bank.Operation#getCompte()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Compte();

	/**
	 * Returns the meta object for class '{@link bank.Employe <em>Employe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Employe</em>'.
	 * @see bank.Employe
	 * @generated
	 */
	EClass getEmploye();

	/**
	 * Returns the meta object for class '{@link bank.Personne <em>Personne</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Personne</em>'.
	 * @see bank.Personne
	 * @generated
	 */
	EClass getPersonne();

	/**
	 * Returns the meta object for the attribute '{@link bank.Personne#getNumero <em>Numero</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Numero</em>'.
	 * @see bank.Personne#getNumero()
	 * @see #getPersonne()
	 * @generated
	 */
	EAttribute getPersonne_Numero();

	/**
	 * Returns the meta object for the attribute '{@link bank.Personne#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see bank.Personne#getNom()
	 * @see #getPersonne()
	 * @generated
	 */
	EAttribute getPersonne_Nom();

	/**
	 * Returns the meta object for class '{@link bank.Client <em>Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Client</em>'.
	 * @see bank.Client
	 * @generated
	 */
	EClass getClient();

	/**
	 * Returns the meta object for the reference list '{@link bank.Client#getComptes <em>Comptes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Comptes</em>'.
	 * @see bank.Client#getComptes()
	 * @see #getClient()
	 * @generated
	 */
	EReference getClient_Comptes();

	/**
	 * Returns the meta object for the attribute '{@link bank.Client#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see bank.Client#getIdentifier()
	 * @see #getClient()
	 * @generated
	 */
	EAttribute getClient_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link bank.Client#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see bank.Client#getCode()
	 * @see #getClient()
	 * @generated
	 */
	EAttribute getClient_Code();

	/**
	 * Returns the meta object for the '{@link bank.Client#display() <em>Display</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Display</em>' operation.
	 * @see bank.Client#display()
	 * @generated
	 */
	EOperation getClient__Display();

	/**
	 * Returns the meta object for class '{@link bank.Groupe <em>Groupe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Groupe</em>'.
	 * @see bank.Groupe
	 * @generated
	 */
	EClass getGroupe();

	/**
	 * Returns the meta object for enum '{@link bank.TypeOperation <em>Type Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Operation</em>'.
	 * @see bank.TypeOperation
	 * @generated
	 */
	EEnum getTypeOperation();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BankFactory getBankFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link bank.impl.CompteImpl <em>Compte</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bank.impl.CompteImpl
		 * @see bank.impl.BankPackageImpl#getCompte()
		 * @generated
		 */
		EClass COMPTE = eINSTANCE.getCompte();

		/**
		 * The meta object literal for the '<em><b>Numero</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPTE__NUMERO = eINSTANCE.getCompte_Numero();

		/**
		 * The meta object literal for the '<em><b>Solde</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPTE__SOLDE = eINSTANCE.getCompte_Solde();

		/**
		 * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPTE__OPERATIONS = eINSTANCE.getCompte_Operations();

		/**
		 * The meta object literal for the '<em><b>Client</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPTE__CLIENT = eINSTANCE.getCompte_Client();

		/**
		 * The meta object literal for the '{@link bank.impl.CompteCourantImpl <em>Compte Courant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bank.impl.CompteCourantImpl
		 * @see bank.impl.BankPackageImpl#getCompteCourant()
		 * @generated
		 */
		EClass COMPTE_COURANT = eINSTANCE.getCompteCourant();

		/**
		 * The meta object literal for the '<em><b>Decouvert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPTE_COURANT__DECOUVERT = eINSTANCE.getCompteCourant_Decouvert();

		/**
		 * The meta object literal for the '{@link bank.impl.CompteEpargneImpl <em>Compte Epargne</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bank.impl.CompteEpargneImpl
		 * @see bank.impl.BankPackageImpl#getCompteEpargne()
		 * @generated
		 */
		EClass COMPTE_EPARGNE = eINSTANCE.getCompteEpargne();

		/**
		 * The meta object literal for the '<em><b>Taux Interet</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPTE_EPARGNE__TAUX_INTERET = eINSTANCE.getCompteEpargne_TauxInteret();

		/**
		 * The meta object literal for the '{@link bank.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bank.impl.OperationImpl
		 * @see bank.impl.BankPackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '<em><b>Numero</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__NUMERO = eINSTANCE.getOperation_Numero();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__DATE = eINSTANCE.getOperation_Date();

		/**
		 * The meta object literal for the '<em><b>Montant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__MONTANT = eINSTANCE.getOperation_Montant();

		/**
		 * The meta object literal for the '<em><b>Type Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__TYPE_OPERATION = eINSTANCE.getOperation_TypeOperation();

		/**
		 * The meta object literal for the '<em><b>Compte</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__COMPTE = eINSTANCE.getOperation_Compte();

		/**
		 * The meta object literal for the '{@link bank.impl.EmployeImpl <em>Employe</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bank.impl.EmployeImpl
		 * @see bank.impl.BankPackageImpl#getEmploye()
		 * @generated
		 */
		EClass EMPLOYE = eINSTANCE.getEmploye();

		/**
		 * The meta object literal for the '{@link bank.impl.PersonneImpl <em>Personne</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bank.impl.PersonneImpl
		 * @see bank.impl.BankPackageImpl#getPersonne()
		 * @generated
		 */
		EClass PERSONNE = eINSTANCE.getPersonne();

		/**
		 * The meta object literal for the '<em><b>Numero</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONNE__NUMERO = eINSTANCE.getPersonne_Numero();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONNE__NOM = eINSTANCE.getPersonne_Nom();

		/**
		 * The meta object literal for the '{@link bank.impl.ClientImpl <em>Client</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bank.impl.ClientImpl
		 * @see bank.impl.BankPackageImpl#getClient()
		 * @generated
		 */
		EClass CLIENT = eINSTANCE.getClient();

		/**
		 * The meta object literal for the '<em><b>Comptes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLIENT__COMPTES = eINSTANCE.getClient_Comptes();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLIENT__IDENTIFIER = eINSTANCE.getClient_Identifier();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLIENT__CODE = eINSTANCE.getClient_Code();

		/**
		 * The meta object literal for the '<em><b>Display</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLIENT___DISPLAY = eINSTANCE.getClient__Display();

		/**
		 * The meta object literal for the '{@link bank.impl.GroupeImpl <em>Groupe</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bank.impl.GroupeImpl
		 * @see bank.impl.BankPackageImpl#getGroupe()
		 * @generated
		 */
		EClass GROUPE = eINSTANCE.getGroupe();

		/**
		 * The meta object literal for the '{@link bank.TypeOperation <em>Type Operation</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bank.TypeOperation
		 * @see bank.impl.BankPackageImpl#getTypeOperation()
		 * @generated
		 */
		EEnum TYPE_OPERATION = eINSTANCE.getTypeOperation();

	}

} //BankPackage
