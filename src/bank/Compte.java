/**
 */
package bank;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compte</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bank.Compte#getNumero <em>Numero</em>}</li>
 *   <li>{@link bank.Compte#getSolde <em>Solde</em>}</li>
 *   <li>{@link bank.Compte#getOperations <em>Operations</em>}</li>
 *   <li>{@link bank.Compte#getClient <em>Client</em>}</li>
 * </ul>
 *
 * @see bank.BankPackage#getCompte()
 * @model
 * @generated
 */
public interface Compte extends EObject {
	/**
	 * Returns the value of the '<em><b>Numero</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numero</em>' attribute.
	 * @see #setNumero(BigInteger)
	 * @see bank.BankPackage#getCompte_Numero()
	 * @model
	 * @generated
	 */
	BigInteger getNumero();

	/**
	 * Sets the value of the '{@link bank.Compte#getNumero <em>Numero</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numero</em>' attribute.
	 * @see #getNumero()
	 * @generated
	 */
	void setNumero(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Solde</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solde</em>' attribute.
	 * @see #setSolde(Double)
	 * @see bank.BankPackage#getCompte_Solde()
	 * @model
	 * @generated
	 */
	Double getSolde();

	/**
	 * Sets the value of the '{@link bank.Compte#getSolde <em>Solde</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Solde</em>' attribute.
	 * @see #getSolde()
	 * @generated
	 */
	void setSolde(Double value);

	/**
	 * Returns the value of the '<em><b>Operations</b></em>' containment reference list.
	 * The list contents are of type {@link bank.Operation}.
	 * It is bidirectional and its opposite is '{@link bank.Operation#getCompte <em>Compte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operations</em>' containment reference list.
	 * @see bank.BankPackage#getCompte_Operations()
	 * @see bank.Operation#getCompte
	 * @model opposite="compte" containment="true"
	 * @generated
	 */
	EList<Operation> getOperations();

	/**
	 * Returns the value of the '<em><b>Client</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link bank.Client#getComptes <em>Comptes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client</em>' reference.
	 * @see #setClient(Client)
	 * @see bank.BankPackage#getCompte_Client()
	 * @see bank.Client#getComptes
	 * @model opposite="comptes"
	 * @generated
	 */
	Client getClient();

	/**
	 * Sets the value of the '{@link bank.Compte#getClient <em>Client</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client</em>' reference.
	 * @see #getClient()
	 * @generated
	 */
	void setClient(Client value);

} // Compte
