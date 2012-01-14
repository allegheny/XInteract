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
public class ProblemTest {

    public ProblemTest() {
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
     * Test of getAuthor method, of class Problem.
     */
    @Test
    public void testGetAuthor() {
        System.out.println("getAuthor");
        Problem instance = new Problem();
        Professor expResult = null;
        Professor result = instance.getAuthor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCategory method, of class Problem.
     */
    @Test
    public void testGetCategory() {
        System.out.println("getCategory");
        Problem instance = new Problem();
        Category expResult = null;
        Category result = instance.getCategory();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescription method, of class Problem.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        Problem instance = new Problem();
        String expResult = "";
        String result = instance.getDescription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getInputData method, of class Problem.
     */
    @Test
    public void testGetInputData() {
        System.out.println("getInputData");
        Problem instance = new Problem();
        String expResult = "";
        String result = instance.getInputData();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLowerCode method, of class Problem.
     */
    @Test
    public void testGetLowerCode() {
        System.out.println("getLowerCode");
        Problem instance = new Problem();
        String expResult = "";
        String result = instance.getLowerCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Problem.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Problem instance = new Problem();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOutputData method, of class Problem.
     */
    @Test
    public void testGetOutputData() {
        System.out.println("getOutputData");
        Problem instance = new Problem();
        String expResult = "";
        String result = instance.getOutputData();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUpperCode method, of class Problem.
     */
    @Test
    public void testGetUpperCode() {
        System.out.println("getUpperCode");
        Problem instance = new Problem();
        String expResult = "";
        String result = instance.getUpperCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isSentinel method, of class Problem.
     */
    @Test
    public void testIsSentinel() {
        System.out.println("isSentinel");
        Problem instance = new Problem();
        boolean expResult = false;
        boolean result = instance.isSentinel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSentinel method, of class Problem.
     */
    @Test
    public void testSetSentinel() {
        System.out.println("setSentinel");
        Problem instance = new Problem();
        instance.setSentinel();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Problem.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Problem instance = new Problem();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of compareTo method, of class Problem.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        Problem someProblem = null;
        Problem instance = new Problem();
        int expResult = 0;
        int result = instance.compareTo(someProblem);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAtributes method, of class Problem.
     */
    @Test
    public void testSetAtributes() {
        System.out.println("setAtributes");
        String someName = "";
        Professor someProfessor = null;
        Category someCategory = null;
        String someDescription = "";
        String someUpperCode = "";
        String someLowerCode = "";
        String someInputData = "";
        String someOutputData = "";
        Problem instance = new Problem();
        instance.setAtributes(someName, someProfessor, someCategory, someDescription, someUpperCode, someLowerCode, someInputData, someOutputData);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}