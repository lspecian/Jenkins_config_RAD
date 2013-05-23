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
package sessions;

import java.util.List;

import javax.ejb.Remote;

import entities.Book;
import entities.BookLoan;
import entities.Customer;

/** 
 * <!-- begin-UML-doc -->
 * This is the business interface for UserManager enterprise bean.
 * <!-- end-UML-doc -->
 * @author mbadr
 * @generated "UML to EJB 3.0 (com.ibm.xtools.transform.uml2.ejb3.java.internal.UML2EJB3Transform)"
 */
@Remote
public interface UserManagerRemote {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param customerID
	 * @return
	 * @generated "UML to EJB 3.0 (com.ibm.xtools.transform.uml2.ejb3.java.internal.UML2EJB3Transform)"
	 */
	public Customer getCustomer(int customerID);

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @return
	 * @generated "UML to EJB 3.0 (com.ibm.xtools.transform.uml2.ejb3.java.internal.UML2EJB3Transform)"
	 */
	public List getBooks();

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param ISBN
	 * @return
	 * @generated "UML to EJB 3.0 (com.ibm.xtools.transform.uml2.ejb3.java.internal.UML2EJB3Transform)"
	 */
	public boolean isBookAvailable(String ISBN);

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param ISBN
	 * @return
	 * @generated "UML to EJB 3.0 (com.ibm.xtools.transform.uml2.ejb3.java.internal.UML2EJB3Transform)"
	 */
	public Book getBook(String ISBN);

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @return
	 * @generated "UML to EJB 3.0 (com.ibm.xtools.transform.uml2.ejb3.java.internal.UML2EJB3Transform)"
	 */
	public List getBooksOnLoan();

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param userID
	 * @param LSBN
	 * @return
	 * @generated "UML to EJB 3.0 (com.ibm.xtools.transform.uml2.ejb3.java.internal.UML2EJB3Transform)"
	 */
	public boolean borrowBook(int userID, String LSBN);

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param pk
	 * @return
	 * @generated "UML to EJB 3.0 (com.ibm.xtools.transform.uml2.ejb3.java.internal.UML2EJB3Transform)"
	 */
	public BookLoan getBookLoan(Object pk);

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param id
	 * @return
	 * @generated "UML to EJB 3.0 (com.ibm.xtools.transform.uml2.ejb3.java.internal.UML2EJB3Transform)"
	 */
	public boolean returnBook(Object id);
}