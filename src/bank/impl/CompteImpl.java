/**
 */
package bank.impl;

import bank.BankPackage;
import bank.Client;
import bank.Compte;
import bank.Operation;

import java.math.BigInteger;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compte</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bank.impl.CompteImpl#getNumero <em>Numero</em>}</li>
 *   <li>{@link bank.impl.CompteImpl#getSolde <em>Solde</em>}</li>
 *   <li>{@link bank.impl.CompteImpl#getOperations <em>Operations</em>}</li>
 *   <li>{@link bank.impl.CompteImpl#getClient <em>Client</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompteImpl extends MinimalEObjectImpl.Container implements Compte {
	/**
	 * The default value of the '{@link #getNumero() <em>Numero</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumero()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger NUMERO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumero() <em>Numero</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumero()
	 * @generated
	 * @ordered
	 */
	protected BigInteger numero = NUMERO_EDEFAULT;

	/**
	 * The default value of the '{@link #getSolde() <em>Solde</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolde()
	 * @generated
	 * @ordered
	 */
	protected static final Double SOLDE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSolde() <em>Solde</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolde()
	 * @generated
	 * @ordered
	 */
	protected Double solde = SOLDE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOperations() <em>Operations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperations()
	 * @generated
	 * @ordered
	 */
	protected EList<Operation> operations;

	/**
	 * The cached value of the '{@link #getClient() <em>Client</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClient()
	 * @generated
	 * @ordered
	 */
	protected Client client;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BankPackage.Literals.COMPTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getNumero() {
		return numero;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumero(BigInteger newNumero) {
		BigInteger oldNumero = numero;
		numero = newNumero;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BankPackage.COMPTE__NUMERO, oldNumero, numero));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Double getSolde() {
		return solde;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSolde(Double newSolde) {
		Double oldSolde = solde;
		solde = newSolde;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BankPackage.COMPTE__SOLDE, oldSolde, solde));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Operation> getOperations() {
		if (operations == null) {
			operations = new EObjectContainmentWithInverseEList<Operation>(Operation.class, this, BankPackage.COMPTE__OPERATIONS, BankPackage.OPERATION__COMPTE);
		}
		return operations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Client getClient() {
		if (client != null && client.eIsProxy()) {
			InternalEObject oldClient = (InternalEObject)client;
			client = (Client)eResolveProxy(oldClient);
			if (client != oldClient) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BankPackage.COMPTE__CLIENT, oldClient, client));
			}
		}
		return client;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Client basicGetClient() {
		return client;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClient(Client newClient, NotificationChain msgs) {
		Client oldClient = client;
		client = newClient;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BankPackage.COMPTE__CLIENT, oldClient, newClient);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClient(Client newClient) {
		if (newClient != client) {
			NotificationChain msgs = null;
			if (client != null)
				msgs = ((InternalEObject)client).eInverseRemove(this, BankPackage.CLIENT__COMPTES, Client.class, msgs);
			if (newClient != null)
				msgs = ((InternalEObject)newClient).eInverseAdd(this, BankPackage.CLIENT__COMPTES, Client.class, msgs);
			msgs = basicSetClient(newClient, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BankPackage.COMPTE__CLIENT, newClient, newClient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BankPackage.COMPTE__OPERATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOperations()).basicAdd(otherEnd, msgs);
			case BankPackage.COMPTE__CLIENT:
				if (client != null)
					msgs = ((InternalEObject)client).eInverseRemove(this, BankPackage.CLIENT__COMPTES, Client.class, msgs);
				return basicSetClient((Client)otherEnd, msgs);
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
			case BankPackage.COMPTE__OPERATIONS:
				return ((InternalEList<?>)getOperations()).basicRemove(otherEnd, msgs);
			case BankPackage.COMPTE__CLIENT:
				return basicSetClient(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BankPackage.COMPTE__NUMERO:
				return getNumero();
			case BankPackage.COMPTE__SOLDE:
				return getSolde();
			case BankPackage.COMPTE__OPERATIONS:
				return getOperations();
			case BankPackage.COMPTE__CLIENT:
				if (resolve) return getClient();
				return basicGetClient();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BankPackage.COMPTE__NUMERO:
				setNumero((BigInteger)newValue);
				return;
			case BankPackage.COMPTE__SOLDE:
				setSolde((Double)newValue);
				return;
			case BankPackage.COMPTE__OPERATIONS:
				getOperations().clear();
				getOperations().addAll((Collection<? extends Operation>)newValue);
				return;
			case BankPackage.COMPTE__CLIENT:
				setClient((Client)newValue);
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
			case BankPackage.COMPTE__NUMERO:
				setNumero(NUMERO_EDEFAULT);
				return;
			case BankPackage.COMPTE__SOLDE:
				setSolde(SOLDE_EDEFAULT);
				return;
			case BankPackage.COMPTE__OPERATIONS:
				getOperations().clear();
				return;
			case BankPackage.COMPTE__CLIENT:
				setClient((Client)null);
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
			case BankPackage.COMPTE__NUMERO:
				return NUMERO_EDEFAULT == null ? numero != null : !NUMERO_EDEFAULT.equals(numero);
			case BankPackage.COMPTE__SOLDE:
				return SOLDE_EDEFAULT == null ? solde != null : !SOLDE_EDEFAULT.equals(solde);
			case BankPackage.COMPTE__OPERATIONS:
				return operations != null && !operations.isEmpty();
			case BankPackage.COMPTE__CLIENT:
				return client != null;
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
		result.append(", solde: ");
		result.append(solde);
		result.append(')');
		return result.toString();
	}

} //CompteImpl
