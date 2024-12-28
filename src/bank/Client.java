/**
 */
package bank;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Client</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bank.Client#getComptes <em>Comptes</em>}</li>
 *   <li>{@link bank.Client#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link bank.Client#getCode <em>Code</em>}</li>
 * </ul>
 *
 * @see bank.BankPackage#getClient()
 * @model
 * @generated
 */
public interface Client extends Personne {
	/**
	 * Returns the value of the '<em><b>Comptes</b></em>' reference list.
	 * The list contents are of type {@link bank.Compte}.
	 * It is bidirectional and its opposite is '{@link bank.Compte#getClient <em>Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comptes</em>' reference list.
	 * @see bank.BankPackage#getClient_Comptes()
	 * @see bank.Compte#getClient
	 * @model opposite="client"
	 * @generated
	 */
	EList<Compte> getComptes();

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' attribute.
	 * @see #setIdentifier(String)
	 * @see bank.BankPackage#getClient_Identifier()
	 * @model transient="true" volatile="true" derived="true"
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link bank.Client#getIdentifier <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' attribute.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see bank.BankPackage#getClient_Code()
	 * @model
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link bank.Client#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String display();

} // Client
