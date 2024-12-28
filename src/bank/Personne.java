/**
 */
package bank;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Personne</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bank.Personne#getNumero <em>Numero</em>}</li>
 *   <li>{@link bank.Personne#getNom <em>Nom</em>}</li>
 * </ul>
 *
 * @see bank.BankPackage#getPersonne()
 * @model
 * @generated
 */
public interface Personne extends EObject {
	/**
	 * Returns the value of the '<em><b>Numero</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numero</em>' attribute.
	 * @see #setNumero(Integer)
	 * @see bank.BankPackage#getPersonne_Numero()
	 * @model id="true"
	 * @generated
	 */
	Integer getNumero();

	/**
	 * Sets the value of the '{@link bank.Personne#getNumero <em>Numero</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numero</em>' attribute.
	 * @see #getNumero()
	 * @generated
	 */
	void setNumero(Integer value);

	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see bank.BankPackage#getPersonne_Nom()
	 * @model
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link bank.Personne#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

} // Personne
