/*
 *+----------------import java.io.Serializable;
import java.util.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
           |
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
import java.util.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author mbadr
 * @!generated "UML to EJB 3.0 (com.ibm.xtools.transform.uml2.ejb3.java.internal.UML2EJB3Transform)"
 */
@Entity
@NamedQueries( {
		@NamedQuery(name = "BookLoan.findByborrowingDate", query = "select obj from BookLoan where obj.borrowingDate = :borrowingDate"),
		@NamedQuery(name = "BookLoan.findByborrowingPeriod", query = "select obj from BookLoan where obj.borrowingPeriod = :borrowingPeriod"),
		@NamedQuery(name = "BookLoan.findByreturnDate", query = "select obj from BookLoan where obj.returnDate = :returnDate"),
		@NamedQuery(name = "BookLoan.findBybook", query = "select obj from BookLoan where obj.book = :book"),
		@NamedQuery(name = "BookLoan.findBycustomer", query = "select obj from BookLoan where obj.customer = :customer"),
		@NamedQuery(name = "BookLoan.findBybookLoanId", query = "select obj from BookLoan where obj.bookLoanId = :bookLoanId"),
		@NamedQuery(name = "BookLoan.findByisbn", query = "select obj from BookLoan where obj.isbn = :isbn"),
		@NamedQuery(name = "BookLoan.findBycustomerId", query = "select obj from BookLoan where obj.customerId = :customerId") })
public class BookLoan implements Serializable {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to EJB 3.0 (com.ibm.xtools.transform.uml2.ejb3.java.internal.UML2EJB3Transform)"
	 */
	@Temporal(value = TemporalType.DATE)
	private Date borrowingDate;

	/** 
	 * @return the borrowingDate
	 * @generated "UML to EJB 3.0 (com.ibm.xtools.transform.uml2.ejb3.java.internal.UML2EJB3Transform)"
	 */
	public Date getBorrowingDate() {
		// begin-user-code
		return borrowingDate;
		// end-user-code
	}

	/** 
	 * @param borrowingDate the borrowingDate to set
	 * @generated "UML to EJB 3.0 (com.ibm.xtools.transform.uml2.ejb3.java.internal.UML2EJB3Transform)"
	 */
	public void setBorrowingDate(Date borrowingDate) {
		// begin-user-code
		this.borrowingDate = borrowingDate;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to EJB 3.0 (com.ibm.xtools.transform.uml2.ejb3.java.internal.UML2EJB3Transform)"
	 */
	private Integer borrowingPeriod;

	/** 
	 * @return the borrowingPeriod
	 * @generated "UML to EJB 3.0 (com.ibm.xtools.transform.uml2.ejb3.java.internal.UML2EJB3Transform)"
	 */
	public Integer getBorrowingPeriod() {
		// begin-user-code
		return borrowingPeriod;
		// end-user-code
	}

	/** 
	 * @param borrowingPeriod the borrowingPeriod to set
	 * @generated "UML to EJB 3.0 (com.ibm.xtools.transform.uml2.ejb3.java.internal.UML2EJB3Transform)"
	 */
	public void setBorrowingPeriod(Integer borrowingPeriod) {
		// begin-user-code
		this.borrowingPeriod = borrowingPeriod;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to EJB 3.0 (com.ibm.xtools.transform.uml2.ejb3.java.internal.UML2EJB3Transform)"
	 */
	@Temporal(value = TemporalType.DATE)
	private Date returnDate;

	/** 
	 * @return the returnDate
	 * @generated "UML to EJB 3.0 (com.ibm.xtools.transform.uml2.ejb3.java.internal.UML2EJB3Transform)"
	 */
	public Date getReturnDate() {
		// begin-user-code
		return returnDate;
		// end-user-code
	}

	/** 
	 * @param returnDate the returnDate to set
	 * @generated "UML to EJB 3.0 (com.ibm.xtools.transform.uml2.ejb3.java.internal.UML2EJB3Transform)"
	 */
	public void setReturnDate(Date returnDate) {
		// begin-user-code
		this.returnDate = returnDate;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to EJB 3.0 (com.ibm.xtools.transform.uml2.ejb3.java.internal.UML2EJB3Transform)"
	 */
	@JoinColumn(name = "isbn", referencedColumnName = "isbn")
	@ManyToOne
	private Book book;

	/** 
	 * @return the book
	 * @generated "UML to EJB 3.0 (com.ibm.xtools.transform.uml2.ejb3.java.internal.UML2EJB3Transform)"
	 */
	public Book getBook() {
		// begin-user-code
		return book;
		// end-user-code
	}

    /**
     * Creates a new instance of BookLoanPK with the specified values.
     * @param customerId the customerId of the BookLoanPK
     * @param isbn the isbn of the BookLoanPK
     * @param bookLoanId the bookLoanId of the BookLoanPK
     */
    public BookLoan(int customerId, String isbn, int bookLoanId) {
        pk = new BookLoanPK(customerId, isbn, bookLoanId);
    }
	
	/** 
	 * @param book the book to set
	 * @generated "UML to EJB 3.0 (com.ibm.xtools.transform.uml2.ejb3.java.internal.UML2EJB3Transform)"
	 */
	public void setBook(Book book) {
		// begin-user-code
		this.book = book;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to EJB 3.0 (com.ibm.xtools.transform.uml2.ejb3.java.internal.UML2EJB3Transform)"
	 */
	@JoinColumn(name = "customerId", referencedColumnName = "customerId")
	@ManyToOne
	private Customer customer;

	/** 
	 * @return the customer
	 * @generated "UML to EJB 3.0 (com.ibm.xtools.transform.uml2.ejb3.java.internal.UML2EJB3Transform)"
	 */
	public Customer getCustomer() {
		// begin-user-code
		return customer;
		// end-user-code
	}

	/** 
	 * @param customer the customer to set
	 * @generated "UML to EJB 3.0 (com.ibm.xtools.transform.uml2.ejb3.java.internal.UML2EJB3Transform)"
	 */
	public void setCustomer(Customer customer) {
		// begin-user-code
		this.customer = customer;
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
	 * @!generated "UML to EJB 3.0 (com.ibm.xtools.transform.uml2.ejb3.java.internal.UML2EJB3Transform)"
	 */
	public BookLoan() {
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @!generated "UML to EJB 3.0 (com.ibm.xtools.transform.uml2.ejb3.java.internal.UML2EJB3Transform)"
	 */
	@EmbeddedId
	private BookLoanPK pk;

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @!generated "UML to EJB 3.0 (com.ibm.xtools.transform.uml2.ejb3.java.internal.UML2EJB3Transform)"
	 */
	public void setPk(BookLoanPK pk) {
		this.pk = pk;
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @!generated "UML to EJB 3.0 (com.ibm.xtools.transform.uml2.ejb3.java.internal.UML2EJB3Transform)"
	 */
	public BookLoanPK getPk() {
		return pk;
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to EJB 3.0 (com.ibm.xtools.transform.uml2.ejb3.java.internal.UML2EJB3Transform)"
	 */
	public int hashCode() {
		return pk.hashCode();
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to EJB 3.0 (com.ibm.xtools.transform.uml2.ejb3.java.internal.UML2EJB3Transform)"
	 */
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof BookLoan))
			return false;
		BookLoan pk = (BookLoan) obj;
		return getPk().equals(pk.getPk());
	}
}