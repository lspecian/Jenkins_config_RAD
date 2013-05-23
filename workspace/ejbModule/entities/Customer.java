/*
 *+------------------------------------------------------------------------+
 *| Licensed Materials - Property of IBM                                   |
 *|                                                                        |
 *| EJB 3.0 Online Library                                                 |
 *|                                                                        |
 *| Copyright IBM Corp. 2008.  All Rights Reserved.                  	   |
 *|                                                                        |
 *| US Government Users Restricted Rights - Use, duplication or disclosure |
 *| restricted by GSA ADP Schedule Contract with IBM Corp.                 |
 *|                                                                        |
 *| Use restricted, please refer to the "Restricted Materials" terms and   |
 *| conditions in the IBM International Program License Agreement.         |
 *+------------------------------------------------------------------------+
 */
package entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author mbadr
 * @generated "UML to EJB 3.0 (com.ibm.xtools.transform.uml2.ejb3.java.internal.UML2EJB3Transform)"
 */
@Entity
@NamedQueries( {
		@NamedQuery(name = "Customer.findBycustomerId", query = "select obj from Customer where obj.customerId = :customerId"),
		@NamedQuery(name = "Customer.findBycustomerFirstName", query = "select obj from Customer where obj.customerFirstName = :customerFirstName"),
		@NamedQuery(name = "Customer.findBycustomerLastName", query = "select obj from Customer where obj.customerLastName = :customerLastName"),
		@NamedQuery(name = "Customer.findBycustomerAddress", query = "select obj from Customer where obj.customerAddress = :customerAddress"),
		@NamedQuery(name = "Customer.findBycustomerPhoneNumber", query = "select obj from Customer where obj.customerPhoneNumber = :customerPhoneNumber"),
		@NamedQuery(name = "Customer.findBycustomerEmail", query = "select obj from Customer where obj.customerEmail = :customerEmail") })
public class Customer implements Serializable {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to EJB 3.0 (com.ibm.xtools.transform.uml2.ejb3.java.internal.UML2EJB3Transform)"
	 */
	@Id
	private Integer customerId;

	/** 
	 * @return the customerId
	 * @generated "UML to EJB 3.0 (com.ibm.xtools.transform.uml2.ejb3.java.internal.UML2EJB3Transform)"
	 */
	public Integer getCustomerId() {
		// begin-user-code
		return customerId;
		// end-user-code
	}

	/** 
	 * @param customerId the customerId to set
	 * @generated "UML to EJB 3.0 (com.ibm.xtools.transform.uml2.ejb3.java.internal.UML2EJB3Transform)"
	 */
	public void setCustomerId(Integer customerId) {
		// begin-user-code
		this.customerId = customerId;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to EJB 3.0 (com.ibm.xtools.transform.uml2.ejb3.java.internal.UML2EJB3Transform)"
	 */
	private String customerFirstName;

	/** 
	 * @return the customerFirstName
	 * @generated "UML to EJB 3.0 (com.ibm.xtools.transform.uml2.ejb3.java.internal.UML2EJB3Transform)"
	 */
	public String getCustomerFirstName() {
		// begin-user-code
		return customerFirstName;
		// end-user-code
	}

	/** 
	 * @param customerFirstName the customerFirstName to set
	 * @generated "UML to EJB 3.0 (com.ibm.xtools.transform.uml2.ejb3.java.internal.UML2EJB3Transform)"
	 */
	public void setCustomerFirstName(String customerFirstName) {
		// begin-user-code
		this.customerFirstName = customerFirstName;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to EJB 3.0 (com.ibm.xtools.transform.uml2.ejb3.java.internal.UML2EJB3Transform)"
	 */
	private String customerLastName;

	/** 
	 * @return the customerLastName
	 * @generated "UML to EJB 3.0 (com.ibm.xtools.transform.uml2.ejb3.java.internal.UML2EJB3Transform)"
	 */
	public String getCustomerLastName() {
		// begin-user-code
		return customerLastName;
		// end-user-code
	}

	/** 
	 * @param customerLastName the customerLastName to set
	 * @generated "UML to EJB 3.0 (com.ibm.xtools.transform.uml2.ejb3.java.internal.UML2EJB3Transform)"
	 */
	public void setCustomerLastName(String customerLastName) {
		// begin-user-code
		this.customerLastName = customerLastName;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to EJB 3.0 (com.ibm.xtools.transform.uml2.ejb3.java.internal.UML2EJB3Transform)"
	 */
	private String customerAddress;

	/** 
	 * @return the customerAddress
	 * @generated "UML to EJB 3.0 (com.ibm.xtools.transform.uml2.ejb3.java.internal.UML2EJB3Transform)"
	 */
	public String getCustomerAddress() {
		// begin-user-code
		return customerAddress;
		// end-user-code
	}

	/** 
	 * @param customerAddress the customerAddress to set
	 * @generated "UML to EJB 3.0 (com.ibm.xtools.transform.uml2.ejb3.java.internal.UML2EJB3Transform)"
	 */
	public void setCustomerAddress(String customerAddress) {
		// begin-user-code
		this.customerAddress = customerAddress;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to EJB 3.0 (com.ibm.xtools.transform.uml2.ejb3.java.internal.UML2EJB3Transform)"
	 */
	private String customerPhoneNumber;

	/** 
	 * @return the customerPhoneNumber
	 * @generated "UML to EJB 3.0 (com.ibm.xtools.transform.uml2.ejb3.java.internal.UML2EJB3Transform)"
	 */
	public String getCustomerPhoneNumber() {
		// begin-user-code
		return customerPhoneNumber;
		// end-user-code
	}

	/** 
	 * @param customerPhoneNumber the customerPhoneNumber to set
	 * @generated "UML to EJB 3.0 (com.ibm.xtools.transform.uml2.ejb3.java.internal.UML2EJB3Transform)"
	 */
	public void setCustomerPhoneNumber(String customerPhoneNumber) {
		// begin-user-code
		this.customerPhoneNumber = customerPhoneNumber;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to EJB 3.0 (com.ibm.xtools.transform.uml2.ejb3.java.internal.UML2EJB3Transform)"
	 */
	private String customerEmail;

	/** 
	 * @return the customerEmail
	 * @generated "UML to EJB 3.0 (com.ibm.xtools.transform.uml2.ejb3.java.internal.UML2EJB3Transform)"
	 */
	public String getCustomerEmail() {
		// begin-user-code
		return customerEmail;
		// end-user-code
	}

	/** 
	 * @param customerEmail the customerEmail to set
	 * @generated "UML to EJB 3.0 (com.ibm.xtools.transform.uml2.ejb3.java.internal.UML2EJB3Transform)"
	 */
	public void setCustomerEmail(String customerEmail) {
		// begin-user-code
		this.customerEmail = customerEmail;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to EJB 3.0 (com.ibm.xtools.transform.uml2.ejb3.java.internal.UML2EJB3Transform)"
	 */
	private static final long serialVersionUID = 0;

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to EJB 3.0 (com.ibm.xtools.transform.uml2.ejb3.java.internal.UML2EJB3Transform)"
	 */
	public Customer() {
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to EJB 3.0 (com.ibm.xtools.transform.uml2.ejb3.java.internal.UML2EJB3Transform)"
	 */
	public int hashCode() {
		return customerId.hashCode();
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to EJB 3.0 (com.ibm.xtools.transform.uml2.ejb3.java.internal.UML2EJB3Transform)"
	 */
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof Customer))
			return false;
		Customer pk = (Customer) obj;
		if (!(customerId.equals(pk.customerId)))
			return false;
		return true;
	}
}