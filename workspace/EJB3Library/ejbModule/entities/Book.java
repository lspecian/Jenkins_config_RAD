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
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author mbadr
 * @generated "UML to EJB 3.0 (com.ibm.xtools.transform.uml2.ejb3.java.internal.UML2EJB3Transform)"
 */
@Entity
@NamedQueries( {
		@NamedQuery(name = "Book.findByisbn", query = "select obj from Book where obj.isbn = :isbn"),
		@NamedQuery(name = "Book.findBytitle", query = "select obj from Book where obj.title = :title"),
		@NamedQuery(name = "Book.findBypublishingDate", query = "select obj from Book where obj.publishingDate = :publishingDate"),
		@NamedQuery(name = "Book.findByahthorId", query = "select obj from Book where obj.ahthorId = :ahthorId") })
public class Book implements Serializable {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to EJB 3.0 (com.ibm.xtools.transform.uml2.ejb3.java.internal.UML2EJB3Transform)"
	 */
	@Id
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
	private String title;

	/** 
	 * @return the title
	 * @generated "UML to EJB 3.0 (com.ibm.xtools.transform.uml2.ejb3.java.internal.UML2EJB3Transform)"
	 */
	public String getTitle() {
		// begin-user-code
		return title;
		// end-user-code
	}

	/** 
	 * @param title the title to set
	 * @generated "UML to EJB 3.0 (com.ibm.xtools.transform.uml2.ejb3.java.internal.UML2EJB3Transform)"
	 */
	public void setTitle(String title) {
		// begin-user-code
		this.title = title;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to EJB 3.0 (com.ibm.xtools.transform.uml2.ejb3.java.internal.UML2EJB3Transform)"
	 */
	@Temporal(value = TemporalType.DATE)
	private Date publishingDate;

	/** 
	 * @return the publishingDate
	 * @generated "UML to EJB 3.0 (com.ibm.xtools.transform.uml2.ejb3.java.internal.UML2EJB3Transform)"
	 */
	public Date getPublishingDate() {
		// begin-user-code
		return publishingDate;
		// end-user-code
	}

	/** 
	 * @param publishingDate the publishingDate to set
	 * @generated "UML to EJB 3.0 (com.ibm.xtools.transform.uml2.ejb3.java.internal.UML2EJB3Transform)"
	 */
	public void setPublishingDate(Date publishingDate) {
		// begin-user-code
		this.publishingDate = publishingDate;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to EJB 3.0 (com.ibm.xtools.transform.uml2.ejb3.java.internal.UML2EJB3Transform)"
	 */
	@ManyToOne
	private Author ahthorId;

	/** 
	 * @return the ahthorId
	 * @generated "UML to EJB 3.0 (com.ibm.xtools.transform.uml2.ejb3.java.internal.UML2EJB3Transform)"
	 */
	public Author getAhthorId() {
		// begin-user-code
		return ahthorId;
		// end-user-code
	}

	/** 
	 * @param ahthorId the ahthorId to set
	 * @generated "UML to EJB 3.0 (com.ibm.xtools.transform.uml2.ejb3.java.internal.UML2EJB3Transform)"
	 */
	public void setAhthorId(Author ahthorId) {
		// begin-user-code
		this.ahthorId = ahthorId;
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
	public Book() {
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to EJB 3.0 (com.ibm.xtools.transform.uml2.ejb3.java.internal.UML2EJB3Transform)"
	 */
	public int hashCode() {
		return isbn.hashCode();
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to EJB 3.0 (com.ibm.xtools.transform.uml2.ejb3.java.internal.UML2EJB3Transform)"
	 */
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof Book))
			return false;
		Book pk = (Book) obj;
		if (!(isbn.equals(pk.isbn)))
			return false;
		return true;
	}
}