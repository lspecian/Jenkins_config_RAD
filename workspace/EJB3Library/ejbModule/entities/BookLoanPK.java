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

import javax.persistence.Embeddable;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @!generated "UML to EJB 3.0 (com.ibm.xtools.transform.uml2.ejb3.java.internal.UML2EJB3Transform)"
 */
@Embeddable
public class BookLoanPK implements Serializable {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to EJB 3.0 (com.ibm.xtools.transform.uml2.ejb3.java.internal.UML2EJB3Transform)"
	 */
	private static final long serialVersionUID = 0;

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @!generated "UML to EJB 3.0 (com.ibm.xtools.transform.uml2.ejb3.java.internal.UML2EJB3Transform)"
	 */
	public BookLoanPK() {
	}

    /**
     * Creates a new instance of BookLoanPK with the specified values.
     * @param customerId the customerId of the BookLoanPK
     * @param isbn the isbn of the BookLoanPK
     * @param bookLoanId the bookLoanId of the BookLoanPK
     */
    public BookLoanPK(int customerId, String isbn, int bookLoanId) {
        this.customerId = customerId;
        this.isbn = isbn;
        this.bookLoanId = bookLoanId;
    }
	
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to EJB 3.0 (com.ibm.xtools.transform.uml2.ejb3.java.internal.UML2EJB3Transform)"
	 */
	private Integer bookLoanId;

	/** 
	 * @return the bookLoanId
	 * @generated "UML to EJB 3.0 (com.ibm.xtools.transform.uml2.ejb3.java.internal.UML2EJB3Transform)"
	 */
	public Integer getBookLoanId() {
		// begin-user-code
		return bookLoanId;
		// end-user-code
	}

	/** 
	 * @param bookLoanId the bookLoanId to set
	 * @generated "UML to EJB 3.0 (com.ibm.xtools.transform.uml2.ejb3.java.internal.UML2EJB3Transform)"
	 */
	public void setBookLoanId(Integer bookLoanId) {
		// begin-user-code
		this.bookLoanId = bookLoanId;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to EJB 3.0 (com.ibm.xtools.transform.uml2.ejb3.java.internal.UML2EJB3Transform)"
	 */
	private String isbn;

	/** 
	 * @return the isbn
	 * @generated "UML to EJB 3.0 (com.ibm.xtools.transform.uml2.ejb3.java.internal.UML2EJB3Transform)"
	 */
	public String getIsbn() {
		// begin-user-code
		return isbn;
		// end-user-code
	}

	/** 
	 * @param isbn the isbn to set
	 * @generated "UML to EJB 3.0 (com.ibm.xtools.transform.uml2.ejb3.java.internal.UML2EJB3Transform)"
	 */
	public void setIsbn(String isbn) {
		// begin-user-code
		this.isbn = isbn;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to EJB 3.0 (com.ibm.xtools.transform.uml2.ejb3.java.internal.UML2EJB3Transform)"
	 */
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
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof BookLoanPK))
			return false;
		BookLoanPK pk = (BookLoanPK) obj;
		if (!(bookLoanId.equals(pk.bookLoanId)))
			return false;
		if (!(isbn.equals(pk.isbn)))
			return false;
		if (!(customerId.equals(pk.customerId)))
			return false;
		return true;
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to EJB 3.0 (com.ibm.xtools.transform.uml2.ejb3.java.internal.UML2EJB3Transform)"
	 */
	public int hashCode() {
		return bookLoanId.hashCode() + isbn.hashCode()
				+ customerId.hashCode();
	}
}
