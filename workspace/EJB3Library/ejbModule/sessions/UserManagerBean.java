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

import java.util.Date;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import entities.Book;
import entities.BookLoan;
import entities.Customer;

/** 
 * <!-- begin-UML-doc -->
 * 
 * @author mbadr
 * <!-- end-UML-doc -->
 * @author mbadr
 * @!generated "UML to EJB 3.0 (com.ibm.xtools.transform.uml2.ejb3.java.internal.UML2EJB3Transform)"
 */
@Stateless
public class UserManagerBean implements UserManagerRemote {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to EJB 3.0 (com.ibm.xtools.transform.uml2.ejb3.java.internal.UML2EJB3Transform)"
	 */
	@PersistenceContext
	private EntityManager entityManager;

	/** 
	 * (non-Javadoc)
	 * @see UserManagerRemote#getCustomer(int customerID)
	 * @!generated "UML to EJB 3.0 (com.ibm.xtools.transform.uml2.ejb3.java.internal.UML2EJB3Transform)"
	 */
	public Customer getCustomer(int customerID) {
		// begin-user-code
        return entityManager.find(Customer.class,Integer.valueOf(customerID));
		// end-user-code
	}

	/** 
	 * (non-Javadoc)
	 * @see UserManagerRemote#getBooks()
	 * @!generated "UML to EJB 3.0 (com.ibm.xtools.transform.uml2.ejb3.java.internal.UML2EJB3Transform)"
	 */
	public List getBooks() {
		// begin-user-code
        return entityManager.createQuery("select object(o) from Book as o").getResultList();
		// end-user-code
	}

	/** 
	 * (non-Javadoc)
	 * @see UserManagerRemote#isBookAvailable(String ISBN)
	 * @!generated "UML to EJB 3.0 (com.ibm.xtools.transform.uml2.ejb3.java.internal.UML2EJB3Transform)"
	 */
	public boolean isBookAvailable(String ISBN) {
		// begin-user-code
	       List<BookLoan> borrowingList = entityManager.createQuery("select object(o) from BookLoan as o").getResultList();
	        for (BookLoan item:borrowingList) {
	            if (ISBN.equals(item.getPk().getIsbn()) ) {
	                if (item.getReturnDate()==null) {
	                    return false;
	                }
	            }
	        }
	        return true;
		// end-user-code
	}

	
	/** 
	 * (non-Javadoc)
	 * @see UserManagerRemote#getBook(String ISBN)
	 * @!generated "UML to EJB 3.0 (com.ibm.xtools.transform.uml2.ejb3.java.internal.UML2EJB3Transform)"
	 */
	public Book getBook(String ISBN) {
		// begin-user-code
        return entityManager.find(Book.class,ISBN);
		// end-user-code
	}

	/** 
	 * (non-Javadoc)
	 * @see UserManagerRemote#getBooksOnLoan()
	 * @!generated "UML to EJB 3.0 (com.ibm.xtools.transform.uml2.ejb3.java.internal.UML2EJB3Transform)"
	 */
	public List getBooksOnLoan() {
		// begin-user-code
        return entityManager.createQuery("select object(o) from BookLoan as o").getResultList();
		// end-user-code
	}

	/** 
	 * (non-Javadoc)
	 * @see UserManagerRemote#borrowBook(int userID, String LSBN)
	 * @!generated "UML to EJB 3.0 (com.ibm.xtools.transform.uml2.ejb3.java.internal.UML2EJB3Transform)"
	 */
	public boolean borrowBook(int userID, String ISBN) {
		// begin-user-code
        int id = getBooksOnLoan().size() + 1;
        BookLoan bookLoan = new BookLoan(userID,ISBN,id);
        bookLoan.setBorrowingDate( new Date());
        bookLoan.setBorrowingPeriod(5);
        entityManager.persist(bookLoan);
        return true;
		// end-user-code
	}

	/** 
	 * (non-Javadoc)
	 * @see UserManagerRemote#getBookLoan(Object pk)
	 * @!generated "UML to EJB 3.0 (com.ibm.xtools.transform.uml2.ejb3.java.internal.UML2EJB3Transform)"
	 */
	public BookLoan getBookLoan(Object pk) {
		// begin-user-code
        return entityManager.find(BookLoan.class,pk);
		// end-user-code
	}

	/** 
	 * (non-Javadoc)
	 * @see UserManagerRemote#returnBook(Object id)
	 * @generated "UML to EJB 3.0 (com.ibm.xtools.transform.uml2.ejb3.java.internal.UML2EJB3Transform)"
	 */
	public boolean returnBook(Object id) {
		// begin-user-code
        BookLoan bookLoan = getBookLoan(id);
        bookLoan.setReturnDate(new Date());
        entityManager.persist(bookLoan);
        return true;
		// end-user-code
	}
}