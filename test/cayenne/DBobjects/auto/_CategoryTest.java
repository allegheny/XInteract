/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package cayenne.DBobjects.auto;

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
public class _CategoryTest {

    public _CategoryTest() {
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
     * Test of setDescription method, of class _Category.
     */
    @Test
    public void testSetDescription() {
        System.out.println("setDescription");
        String description = "";
        _Category instance = new _Category();
        instance.setDescription(description);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescription method, of class _Category.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        _Category instance = new _Category();
        String expResult = "";
        String result = instance.getDescription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class _Category.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        _Category instance = new _Category();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class _Category.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        _Category instance = new _Category();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addToProblems method, of class _Category.
     */
    @Test
    public void testAddToProblems() {
        System.out.println("addToProblems");
        Problem obj = null;
        _Category instance = new _Category();
        instance.addToProblems(obj);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeFromProblems method, of class _Category.
     */
    @Test
    public void testRemoveFromProblems() {
        System.out.println("removeFromProblems");
        Problem obj = null;
        _Category instance = new _Category();
        instance.removeFromProblems(obj);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProblems method, of class _Category.
     */
    @Test
    public void testGetProblems() {
        System.out.println("getProblems");
        _Category instance = new _Category();
        List expResult = null;
        List result = instance.getProblems();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}