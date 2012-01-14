/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package cayenne.DBobjects.auto;

import cayenne.DBobjects.Class;
import cayenne.DBobjects.Problem;
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
public class _ProfessorTest {

    public _ProfessorTest() {
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
     * Test of setFirstName method, of class _Professor.
     */
    @Test
    public void testSetFirstName() {
        System.out.println("setFirstName");
        String firstName = "";
        _Professor instance = new _Professor();
        instance.setFirstName(firstName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFirstName method, of class _Professor.
     */
    @Test
    public void testGetFirstName() {
        System.out.println("getFirstName");
        _Professor instance = new _Professor();
        String expResult = "";
        String result = instance.getFirstName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLastName method, of class _Professor.
     */
    @Test
    public void testSetLastName() {
        System.out.println("setLastName");
        String lastName = "";
        _Professor instance = new _Professor();
        instance.setLastName(lastName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLastName method, of class _Professor.
     */
    @Test
    public void testGetLastName() {
        System.out.println("getLastName");
        _Professor instance = new _Professor();
        String expResult = "";
        String result = instance.getLastName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addToClasses method, of class _Professor.
     */
    @Test
    public void testAddToClasses() {
        System.out.println("addToClasses");
        Class obj = null;
        _Professor instance = new _Professor();
        instance.addToClasses(obj);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeFromClasses method, of class _Professor.
     */
    @Test
    public void testRemoveFromClasses() {
        System.out.println("removeFromClasses");
        Class obj = null;
        _Professor instance = new _Professor();
        instance.removeFromClasses(obj);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getClasses method, of class _Professor.
     */
    @Test
    public void testGetClasses() {
        System.out.println("getClasses");
        _Professor instance = new _Professor();
        List expResult = null;
        List result = instance.getClasses();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addToProblems method, of class _Professor.
     */
    @Test
    public void testAddToProblems() {
        System.out.println("addToProblems");
        Problem obj = null;
        _Professor instance = new _Professor();
        instance.addToProblems(obj);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeFromProblems method, of class _Professor.
     */
    @Test
    public void testRemoveFromProblems() {
        System.out.println("removeFromProblems");
        Problem obj = null;
        _Professor instance = new _Professor();
        instance.removeFromProblems(obj);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProblems method, of class _Professor.
     */
    @Test
    public void testGetProblems() {
        System.out.println("getProblems");
        _Professor instance = new _Professor();
        List expResult = null;
        List result = instance.getProblems();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}