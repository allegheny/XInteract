/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package cayenne.DBobjects.auto;

import cayenne.DBobjects.Attempt;
import cayenne.DBobjects.Class;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author radu
 */
public class _StudentTest {

    public _StudentTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of setFirstName method, of class _Student.
     */
    @Test
    public void testSetFirstName() {
        System.out.println("setFirstName");
        String firstName = "";
        _Student instance = new _Student();
        instance.setFirstName(firstName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFirstName method, of class _Student.
     */
    @Test
    public void testGetFirstName() {
        System.out.println("getFirstName");
        _Student instance = new _Student();
        String expResult = "";
        String result = instance.getFirstName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLastName method, of class _Student.
     */
    @Test
    public void testSetLastName() {
        System.out.println("setLastName");
        String lastName = "";
        _Student instance = new _Student();
        instance.setLastName(lastName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLastName method, of class _Student.
     */
    @Test
    public void testGetLastName() {
        System.out.println("getLastName");
        _Student instance = new _Student();
        String expResult = "";
        String result = instance.getLastName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUserName method, of class _Student.
     */
    @Test
    public void testSetUserName() {
        System.out.println("setUserName");
        String userName = "";
        _Student instance = new _Student();
        instance.setUserName(userName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUserName method, of class _Student.
     */
    @Test
    public void testGetUserName() {
        System.out.println("getUserName");
        _Student instance = new _Student();
        String expResult = "";
        String result = instance.getUserName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addToEnrollment method, of class _Student.
     */
    @Test
    public void testAddToEnrollment() {
        System.out.println("addToEnrollment");
        Class obj = null;
        _Student instance = new _Student();
        instance.addToEnrollment(obj);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeFromEnrollment method, of class _Student.
     */
    @Test
    public void testRemoveFromEnrollment() {
        System.out.println("removeFromEnrollment");
        Class obj = null;
        _Student instance = new _Student();
        instance.removeFromEnrollment(obj);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEnrollment method, of class _Student.
     */
    @Test
    public void testGetEnrollment() {
        System.out.println("getEnrollment");
        _Student instance = new _Student();
        List expResult = null;
        List result = instance.getEnrollment();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addToHistory method, of class _Student.
     */
    @Test
    public void testAddToHistory() {
        System.out.println("addToHistory");
        Attempt obj = null;
        _Student instance = new _Student();
        instance.addToHistory(obj);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeFromHistory method, of class _Student.
     */
    @Test
    public void testRemoveFromHistory() {
        System.out.println("removeFromHistory");
        Attempt obj = null;
        _Student instance = new _Student();
        instance.removeFromHistory(obj);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHistory method, of class _Student.
     */
    @Test
    public void testGetHistory() {
        System.out.println("getHistory");
        _Student instance = new _Student();
        List expResult = null;
        List result = instance.getHistory();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}