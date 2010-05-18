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
public class CategoryTest {

    public CategoryTest() {
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
     * Test of getName method, of class Category.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Category instance = new Category();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescription method, of class Category.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        Category instance = new Category();
        String expResult = "";
        String result = instance.getDescription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isSentinel method, of class Category.
     */
    @Test
    public void testIsSentinel() {
        System.out.println("isSentinel");
        Category instance = new Category();
        boolean expResult = false;
        boolean result = instance.isSentinel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSentinel method, of class Category.
     */
    @Test
    public void testSetSentinel() {
        System.out.println("setSentinel");
        Category instance = new Category();
        instance.setSentinel();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isProblemSentinel method, of class Category.
     */
    @Test
    public void testIsProblemSentinel() {
        System.out.println("isProblemSentinel");
        Category instance = new Category();
        boolean expResult = false;
        boolean result = instance.isProblemSentinel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setProblemSentinel method, of class Category.
     */
    @Test
    public void testSetProblemSentinel() {
        System.out.println("setProblemSentinel");
        Category instance = new Category();
        instance.setProblemSentinel();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Category.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Category instance = new Category();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of compareTo method, of class Category.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        Category someCategory = null;
        Category instance = new Category();
        int expResult = 0;
        int result = instance.compareTo(someCategory);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}