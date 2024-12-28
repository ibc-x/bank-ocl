/**
 */
package bank.impl;

import bank.BankPackage;
import bank.CompteEpargne;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compte Epargne</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bank.impl.CompteEpargneImpl#getTauxInteret <em>Taux Interet</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompteEpargneImpl extends CompteImpl implements CompteEpargne {
	/**
	 * The default value of the '{@link #getTauxInteret() <em>Taux Interet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTauxInteret()
	 * @generated
	 * @ordered
	 */
	protected static final Double TAUX_INTERET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTauxInteret() <em>Taux Interet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTauxInteret()
	 * @generated
	 * @ordered
	 */
	protected Double tauxInteret = TAUX_INTERET_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompteEpargneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BankPackage.Literals.COMPTE_EPARGNE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Double getTauxInteret() {
		return tauxInteret;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTauxInteret(Double newTauxInteret) {
		Double oldTauxInteret = tauxInteret;
		tauxInteret = newTauxInteret;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BankPackage.COMPTE_EPARGNE__TAUX_INTERET, oldTauxInteret, tauxInteret));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BankPackage.COMPTE_EPARGNE__TAUX_INTERET:
				return getTauxInteret();
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
			case BankPackage.COMPTE_EPARGNE__TAUX_INTERET:
				setTauxInteret((Double)newValue);
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
			case BankPackage.COMPTE_EPARGNE__TAUX_INTERET:
				setTauxInteret(TAUX_INTERET_EDEFAULT);
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
			case BankPackage.COMPTE_EPARGNE__TAUX_INTERET:
				return TAUX_INTERET_EDEFAULT == null ? tauxInteret != null : !TAUX_INTERET_EDEFAULT.equals(tauxInteret);
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
		result.append(" (tauxInteret: ");
		result.append(tauxInteret);
		result.append(')');
		return result.toString();
	}

} //CompteEpargneImpl
