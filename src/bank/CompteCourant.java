/**
 */
package bank;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compte Courant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bank.CompteCourant#getDecouvert <em>Decouvert</em>}</li>
 * </ul>
 *
 * @see bank.BankPackage#getCompteCourant()
 * @model
 * @generated
 */
public interface CompteCourant extends Compte {
	/**
	 * Returns the value of the '<em><b>Decouvert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decouvert</em>' attribute.
	 * @see #setDecouvert(Double)
	 * @see bank.BankPackage#getCompteCourant_Decouvert()
	 * @model
	 * @generated
	 */
	Double getDecouvert();

	/**
	 * Sets the value of the '{@link bank.CompteCourant#getDecouvert <em>Decouvert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decouvert</em>' attribute.
	 * @see #getDecouvert()
	 * @generated
	 */
	void setDecouvert(Double value);

} // CompteCourant
