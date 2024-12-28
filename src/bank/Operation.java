/**
 */
package bank;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bank.Operation#getNumero <em>Numero</em>}</li>
 *   <li>{@link bank.Operation#getDate <em>Date</em>}</li>
 *   <li>{@link bank.Operation#getMontant <em>Montant</em>}</li>
 *   <li>{@link bank.Operation#getTypeOperation <em>Type Operation</em>}</li>
 *   <li>{@link bank.Operation#getCompte <em>Compte</em>}</li>
 * </ul>
 *
 * @see bank.BankPackage#getOperation()
 * @model
 * @generated
 */
public interface Operation extends EObject {
	/**
	 * Returns the value of the '<em><b>Numero</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numero</em>' attribute.
	 * @see #setNumero(Integer)
	 * @see bank.BankPackage#getOperation_Numero()
	 * @model id="true"
	 * @generated
	 */
	Integer getNumero();

	/**
	 * Sets the value of the '{@link bank.Operation#getNumero <em>Numero</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numero</em>' attribute.
	 * @see #getNumero()
	 * @generated
	 */
	void setNumero(Integer value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(Date)
	 * @see bank.BankPackage#getOperation_Date()
	 * @model
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link bank.Operation#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

	/**
	 * Returns the value of the '<em><b>Montant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Montant</em>' attribute.
	 * @see #setMontant(Double)
	 * @see bank.BankPackage#getOperation_Montant()
	 * @model
	 * @generated
	 */
	Double getMontant();

	/**
	 * Sets the value of the '{@link bank.Operation#getMontant <em>Montant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Montant</em>' attribute.
	 * @see #getMontant()
	 * @generated
	 */
	void setMontant(Double value);

	/**
	 * Returns the value of the '<em><b>Type Operation</b></em>' attribute.
	 * The literals are from the enumeration {@link bank.TypeOperation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Operation</em>' attribute.
	 * @see bank.TypeOperation
	 * @see #setTypeOperation(TypeOperation)
	 * @see bank.BankPackage#getOperation_TypeOperation()
	 * @model
	 * @generated
	 */
	TypeOperation getTypeOperation();

	/**
	 * Sets the value of the '{@link bank.Operation#getTypeOperation <em>Type Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Operation</em>' attribute.
	 * @see bank.TypeOperation
	 * @see #getTypeOperation()
	 * @generated
	 */
	void setTypeOperation(TypeOperation value);

	/**
	 * Returns the value of the '<em><b>Compte</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link bank.Compte#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compte</em>' container reference.
	 * @see #setCompte(Compte)
	 * @see bank.BankPackage#getOperation_Compte()
	 * @see bank.Compte#getOperations
	 * @model opposite="operations" transient="false" ordered="false"
	 * @generated
	 */
	Compte getCompte();

	/**
	 * Sets the value of the '{@link bank.Operation#getCompte <em>Compte</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compte</em>' container reference.
	 * @see #getCompte()
	 * @generated
	 */
	void setCompte(Compte value);

} // Operation
