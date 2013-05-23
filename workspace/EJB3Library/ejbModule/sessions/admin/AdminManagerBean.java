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
package sessions.admin;

import java.util.Date;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import entities.Author;
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
public class AdminManagerBean implements AdminManagerLocal {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to EJB 3.0 (com.ibm.xtools.transform.uml2.ejb3.java.internal.UML2EJB3Transform)"
	 */
	@PersistenceContext
	private EntityManager entityManager;

	/** 
	 * (non-Javadoc)
	 * @see AdminManagerLocal#getAuthors()
	 * @!generated "UML to EJB 3.0 (com.ibm.xtools.transform.uml2.ejb3.java.internal.UML2EJB3Transform)"
	 */
	public List getAuthors() {
		// begin-user-code
        return entityManager.createQuery("select object(o) from Author as o").getResultList();
		// end-user-code
	}

	/** 
	 * (non-Javadoc)
	 * @see AdminManagerLocal#isBookAvailable(String ISBN)
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
	 * @see AdminManagerLocal#getAuthor(int AuthorID)
	 * @generated "UML to EJB 3.0 (com.ibm.xtools.transform.uml2.ejb3.java.internal.UML2EJB3Transform)"
	 */
	public Author getAuthor(int AuthorID) {
		// begin-user-code
        return entityManager.find(Author.class,AuthorID);
		// end-user-code
	}

	/** 
	 * (non-Javadoc)
	 * @see AdminManagerLocal#getBooks()
	 * @generated "UML to EJB 3.0 (com.ibm.xtools.transform.uml2.ejb3.java.internal.UML2EJB3Transform)"
	 */
	public List getBooks() {
		// begin-user-code
        return entityManager.createQuery("select object(o) from Book as o").getResultList();
		// end-user-code
	}

	/** 
	 * (non-Javadoc)
	 * @see AdminManagerLocal#getCustomers()
	 * @generated "UML to EJB 3.0 (com.ibm.xtools.transform.uml2.ejb3.java.internal.UML2EJB3Transform)"
	 */
	public List getCustomers() {
		// begin-user-code
        return entityManager.createQuery("select object(o) from Customer as o").getResultList();
		// end-user-code
	}

	/** 
	 * (non-Javadoc)
	 * @see AdminManagerLocal#getBooksOnLoan()
	 * @generated "UML to EJB 3.0 (com.ibm.xtools.transform.uml2.ejb3.java.internal.UML2EJB3Transform)"
	 */
	public List getBooksOnLoan() {
		// begin-user-code
        List ret = null;
        
        try {
            ret = entityManager.createQuery("select object(o) from BookLoan as o").getResultList();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ret;
		// end-user-code
	}

	/** 
	 * (non-Javadoc)
	 * @see AdminManagerLocal#getBook(String ISBN)
	 * @generated "UML to EJB 3.0 (com.ibm.xtools.transform.uml2.ejb3.java.internal.UML2EJB3Transform)"
	 */
	public Book getBook(String ISBN) {
		// begin-user-code
        return entityManager.find(Book.class,ISBN);
		// end-user-code
	}

	/** 
	 * (non-Javadoc)
	 * @see AdminManagerLocal#getCustomer(int customerID)
	 * @generated "UML to EJB 3.0 (com.ibm.xtools.transform.uml2.ejb3.java.internal.UML2EJB3Transform)"
	 */
	public Customer getCustomer(int customerID) {
		// begin-user-code
        return entityManager.find(Customer.class,Integer.valueOf(customerID));
		// end-user-code
	}

	/** 
	 * (non-Javadoc)
	 * @see AdminManagerLocal#createNewAuthor(int authorID, String authorFirstName, String authorLastName)
	 * @generated "UML to EJB 3.0 (com.ibm.xtools.transform.uml2.ejb3.java.internal.UML2EJB3Transform)"
	 */
	public boolean createNewAuthor(int authorID, String authorFirstName,
			String authorLastName) {
		// begin-user-code
        try {
            Author author = new Author();
            author.setAutherId(authorID);
            author.setAuthorFirstName(authorFirstName);
            author.setAuthorLastName(authorLastName);
            entityManager.persist(author);
        } catch (Exception e) {
            return false;
        }
        
        return true;
		// end-user-code
	}

	/** 
	 * (non-Javadoc)
	 * @see AdminManagerLocal#createNewBook(String ISBN, String title, Date publishingDate, int authorID)
	 * @generated "UML to EJB 3.0 (com.ibm.xtools.transform.uml2.ejb3.java.internal.UML2EJB3Transform)"
	 */
	public boolean createNewBook(String ISBN, String title,
			Date publishingDate, int authorID) {
		// begin-user-code
	       try {
	            Book book = new Book();
	            book.setIsbn(ISBN);
	            book.setTitle(title);
	            book.setPublishingDate(publishingDate);
	            Author author = entityManager.find(Author.class,authorID);
	            book.setAhthorId(author);
	            entityManager.persist(book);
	        } catch (Exception e) {
	            return false;
	        }
	        return true;
		// end-user-code
	}

	/** 
	 * (non-Javadoc)
	 * @see AdminManagerLocal#createNewUser(int userID, String userFName, String userLName, String address, String email, String phone)
	 * @generated "UML to EJB 3.0 (com.ibm.xtools.transform.uml2.ejb3.java.internal.UML2EJB3Transform)"
	 */
	public boolean createNewUser(int userID, String userFName,
			String userLName, String address, String email, String phone) {
		// begin-user-code
        try {
            Customer customer = new Customer();
            customer.setCustomerId(userID);
            customer.setCustomerFirstName(userFName);
            customer.setCustomerLastName(userLName);
            customer.setCustomerAddress(address);
            customer.setCustomerEmail(email);
            customer.setCustomerPhoneNumber(phone);
            entityManager.persist(customer);
        } catch (Exception e) {
            return false;
        }
        return true;
		// end-user-code
	}
}