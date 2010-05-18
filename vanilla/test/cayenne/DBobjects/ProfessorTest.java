/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package cayenne.DBobjects;

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
public class ProfessorTest {

    public ProfessorTest() {
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
     * Test of getFirstName method, of class Professor.
     */
    @Test
    public void testGetFirstName() {
        System.out.println("getFirstName");
        Professor instance = new Professor();
        String expResult = "";
        String result = instance.getFirstName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLastName method, of class Professor.
     */
    @Test
    public void testGetLastName() {
        System.out.println("getLastName");
        Professor instance = new Professor();
        String expResult = "";
        String result = instance.getLastName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isSentinel method, of class Professor.
     */
    @Test
    public void testIsSentinel() {
        System.out.println("isSentinel");
        Professor instance = new Professor();
        boolean expResult = false;
        boolean result = instance.isSentinel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSentinel method, of class Professor.
     */
    @Test
    public void testSetSentinel() {
        System.out.println("setSentinel");
        Professor instance = new Professor();
        instance.setSentinel();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isAuthorSentinel method, of class Professor.
     */
    @Test
    public void testIsAuthorSentinel() {
        System.out.println("isAuthorSentinel");
        Professor instance = new Professor();
        boolean expResult = false;
        boolean result = instance.isAuthorSentinel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAuthorSentinel method, of class Professor.
     */
    @Test
    public void testSetAuthorSentinel() {
        System.out.println("setAuthorSentinel");
        Professor instance = new Professor();
        instance.setAuthorSentinel();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Professor.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Professor instance = new Professor();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of compareTo method, of class Professor.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        Professor someProfessor = null;
        Professor instance = new Professor();
        int expResult = 0;
        int result = instance.compareTo(someProfessor);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}