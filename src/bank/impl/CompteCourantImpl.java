/**
 */
package bank.impl;

import bank.BankPackage;
import bank.CompteCourant;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compte Courant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bank.impl.CompteCourantImpl#getDecouvert <em>Decouvert</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompteCourantImpl extends CompteImpl implements CompteCourant {
	/**
	 * The default value of the '{@link #getDecouvert() <em>Decouvert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecouvert()
	 * @generated
	 * @ordered
	 */
	protected static final Double DECOUVERT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDecouvert() <em>Decouvert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecouvert()
	 * @generated
	 * @ordered
	 */
	protected Double decouvert = DECOUVERT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompteCourantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BankPackage.Literals.COMPTE_COURANT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Double getDecouvert() {
		return decouvert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDecouvert(Double newDecouvert) {
		Double oldDecouvert = decouvert;
		decouvert = newDecouvert;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BankPackage.COMPTE_COURANT__DECOUVERT, oldDecouvert, decouvert));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BankPackage.COMPTE_COURANT__DECOUVERT:
				return getDecouvert();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BankPackage.COMPTE_COURANT__DECOUVERT:
				setDecouvert((Double)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case BankPackage.COMPTE_COURANT__DECOUVERT:
				setDecouvert(DECOUVERT_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case BankPackage.COMPTE_COURANT__DECOUVERT:
				return DECOUVERT_EDEFAULT == null ? decouvert != null : !DECOUVERT_EDEFAULT.equals(decouvert);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (decouvert: ");
		result.append(decouvert);
		result.append(')');
		return result.toString();
	}

} //CompteCourantImpl
