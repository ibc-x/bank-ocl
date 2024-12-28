/**
 */
package bank.impl;

import bank.BankPackage;
import bank.Compte;
import bank.Operation;
import bank.TypeOperation;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bank.impl.OperationImpl#getNumero <em>Numero</em>}</li>
 *   <li>{@link bank.impl.OperationImpl#getDate <em>Date</em>}</li>
 *   <li>{@link bank.impl.OperationImpl#getMontant <em>Montant</em>}</li>
 *   <li>{@link bank.impl.OperationImpl#getTypeOperation <em>Type Operation</em>}</li>
 *   <li>{@link bank.impl.OperationImpl#getCompte <em>Compte</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationImpl extends MinimalEObjectImpl.Container implements Operation {
	/**
	 * The default value of the '{@link #getNumero() <em>Numero</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumero()
	 * @generated
	 * @ordered
	 */
	protected static final Integer NUMERO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumero() <em>Numero</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumero()
	 * @generated
	 * @ordered
	 */
	protected Integer numero = NUMERO_EDEFAULT;

	/**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected Date date = DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMontant() <em>Montant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMontant()
	 * @generated
	 * @ordered
	 */
	protected static final Double MONTANT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMontant() <em>Montant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMontant()
	 * @generated
	 * @ordered
	 */
	protected Double montant = MONTANT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTypeOperation() <em>Type Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeOperation()
	 * @generated
	 * @ordered
	 */
	protected static final TypeOperation TYPE_OPERATION_EDEFAULT = TypeOperation.DEBIT;

	/**
	 * The cached value of the '{@link #getTypeOperation() <em>Type Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeOperation()
	 * @generated
	 * @ordered
	 */
	protected TypeOperation typeOperation = TYPE_OPERATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BankPackage.Literals.OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getNumero() {
		return numero;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumero(Integer newNumero) {
		Integer oldNumero = numero;
		numero = newNumero;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BankPackage.OPERATION__NUMERO, oldNumero, numero));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDate(Date newDate) {
		Date oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BankPackage.OPERATION__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Double getMontant() {
		return montant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMontant(Double newMontant) {
		Double oldMontant = montant;
		montant = newMontant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BankPackage.OPERATION__MONTANT, oldMontant, montant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeOperation getTypeOperation() {
		return typeOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTypeOperation(TypeOperation newTypeOperation) {
		TypeOperation oldTypeOperation = typeOperation;
		typeOperation = newTypeOperation == null ? TYPE_OPERATION_EDEFAULT : newTypeOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BankPackage.OPERATION__TYPE_OPERATION, oldTypeOperation, typeOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Compte getCompte() {
		if (eContainerFeatureID() != BankPackage.OPERATION__COMPTE) return null;
		return (Compte)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompte(Compte newCompte, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newCompte, BankPackage.OPERATION__COMPTE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCompte(Compte newCompte) {
		if (newCompte != eInternalContainer() || (eContainerFeatureID() != BankPackage.OPERATION__COMPTE && newCompte != null)) {
			if (EcoreUtil.isAncestor(this, newCompte))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newCompte != null)
				msgs = ((InternalEObject)newCompte).eInverseAdd(this, BankPackage.COMPTE__OPERATIONS, Compte.class, msgs);
			msgs = basicSetCompte(newCompte, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BankPackage.OPERATION__COMPTE, newCompte, newCompte));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BankPackage.OPERATION__COMPTE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetCompte((Compte)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BankPackage.OPERATION__COMPTE:
				return basicSetCompte(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case BankPackage.OPERATION__COMPTE:
				return eInternalContainer().eInverseRemove(this, BankPackage.COMPTE__OPERATIONS, Compte.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BankPackage.OPERATION__NUMERO:
				return getNumero();
			case BankPackage.OPERATION__DATE:
				return getDate();
			case BankPackage.OPERATION__MONTANT:
				return getMontant();
			case BankPackage.OPERATION__TYPE_OPERATION:
				return getTypeOperation();
			case BankPackage.OPERATION__COMPTE:
				return getCompte();
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
			case BankPackage.OPERATION__NUMERO:
				setNumero((Integer)newValue);
				return;
			case BankPackage.OPERATION__DATE:
				setDate((Date)newValue);
				return;
			case BankPackage.OPERATION__MONTANT:
				setMontant((Double)newValue);
				return;
			case BankPackage.OPERATION__TYPE_OPERATION:
				setTypeOperation((TypeOperation)newValue);
				return;
			case BankPackage.OPERATION__COMPTE:
				setCompte((Compte)newValue);
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
			case BankPackage.OPERATION__NUMERO:
				setNumero(NUMERO_EDEFAULT);
				return;
			case BankPackage.OPERATION__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case BankPackage.OPERATION__MONTANT:
				setMontant(MONTANT_EDEFAULT);
				return;
			case BankPackage.OPERATION__TYPE_OPERATION:
				setTypeOperation(TYPE_OPERATION_EDEFAULT);
				return;
			case BankPackage.OPERATION__COMPTE:
				setCompte((Compte)null);
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
			case BankPackage.OPERATION__NUMERO:
				return NUMERO_EDEFAULT == null ? numero != null : !NUMERO_EDEFAULT.equals(numero);
			case BankPackage.OPERATION__DATE:
				return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
			case BankPackage.OPERATION__MONTANT:
				return MONTANT_EDEFAULT == null ? montant != null : !MONTANT_EDEFAULT.equals(montant);
			case BankPackage.OPERATION__TYPE_OPERATION:
				return typeOperation != TYPE_OPERATION_EDEFAULT;
			case BankPackage.OPERATION__COMPTE:
				return getCompte() != null;
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
		result.append(" (numero: ");
		result.append(numero);
		result.append(", date: ");
		result.append(date);
		result.append(", montant: ");
		result.append(montant);
		result.append(", typeOperation: ");
		result.append(typeOperation);
		result.append(')');
		return result.toString();
	}

	public Operation getByNumero(Integer numero) {
		for (Operation operation : this.getCompte().getOperations()) {
			if(operation.getNumero().equals(numero)) {
				return operation;
			}
		}
		return null;
	}
	
	public List<Operation> getByDate(Date date) {
		List<Operation> listOperations = new ArrayList<Operation>();
		for (Operation operation : this.getCompte().getOperations()) {
			if(operation.getDate().equals(date)) {
				listOperations.add(operation);
			}
		}
		return listOperations;
	}

	public List<Operation> getByBetweenDate(Date dateDebut, Date DateFin) {
		List<Operation> listOperations = new ArrayList<Operation>();
		for (Operation operation : this.getCompte().getOperations()) {
			if(operation.getDate().before(dateDebut)&&operation.getDate().after(DateFin)) {
				listOperations.add(operation);
			}
		}
		return listOperations;
	}
} //OperationImpl
