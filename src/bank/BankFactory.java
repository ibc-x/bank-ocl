/**
 */
package bank;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see bank.BankPackage
 * @generated
 */
public interface BankFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BankFactory eINSTANCE = bank.impl.BankFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Compte</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Compte</em>'.
	 * @generated
	 */
	Compte createCompte();

	/**
	 * Returns a new object of class '<em>Compte Courant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Compte Courant</em>'.
	 * @generated
	 */
	CompteCourant createCompteCourant();

	/**
	 * Returns a new object of class '<em>Compte Epargne</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Compte Epargne</em>'.
	 * @generated
	 */
	CompteEpargne createCompteEpargne();

	/**
	 * Returns a new object of class '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operation</em>'.
	 * @generated
	 */
	Operation createOperation();

	/**
	 * Returns a new object of class '<em>Employe</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Employe</em>'.
	 * @generated
	 */
	Employe createEmploye();

	/**
	 * Returns a new object of class '<em>Personne</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Personne</em>'.
	 * @generated
	 */
	Personne createPersonne();

	/**
	 * Returns a new object of class '<em>Client</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Client</em>'.
	 * @generated
	 */
	Client createClient();

	/**
	 * Returns a new object of class '<em>Groupe</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Groupe</em>'.
	 * @generated
	 */
	Groupe createGroupe();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BankPackage getBankPackage();

} //BankFactory
