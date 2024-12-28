/**
 */
package bank;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compte Epargne</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bank.CompteEpargne#getTauxInteret <em>Taux Interet</em>}</li>
 * </ul>
 *
 * @see bank.BankPackage#getCompteEpargne()
 * @model
 * @generated
 */
public interface CompteEpargne extends Compte {
	/**
	 * Returns the value of the '<em><b>Taux Interet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Taux Interet</em>' attribute.
	 * @see #setTauxInteret(Double)
	 * @see bank.BankPackage#getCompteEpargne_TauxInteret()
	 * @model
	 * @generated
	 */
	Double getTauxInteret();

	/**
	 * Sets the value of the '{@link bank.CompteEpargne#getTauxInteret <em>Taux Interet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Taux Interet</em>' attribute.
	 * @see #getTauxInteret()
	 * @generated
	 */
	void setTauxInteret(Double value);

} // CompteEpargne
