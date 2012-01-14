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
public class ClassTest {

    public ClassTest() {
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
     * Test of getProfessor method, of class Class.
     */
    @Test
    public void testGetProfessor() {
        System.out.println("getProfessor");
        Class instance = new Class();
        Professor expResult = null;
        Professor result = instance.getProfessor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSemester method, of class Class.
     */
    @Test
    public void testGetSemester() {
        System.out.println("getSemester");
        Class instance = new Class();
        String expResult = "";
        String result = instance.getSemester();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTitle method, of class Class.
     */
    @Test
    public void testGetTitle() {
        System.out.println("getTitle");
        Class instance = new Class();
        String expResult = "";
        String result = instance.getTitle();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getYearTaught method, of class Class.
     */
    @Test
    public void testGetYearTaught() {
        System.out.println("getYearTaught");
        Class instance = new Class();
        Integer expResult = null;
        Integer result = instance.getYearTaught();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getYearString method, of class Class.
     */
    @Test
    public void testGetYearString() {
        System.out.println("getYearString");
        Class instance = new Class();
        String expResult = "";
        String result = instance.getYearString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isSentinel method, of class Class.
     */
    @Test
    public void testIsSentinel() {
        System.out.println("isSentinel");
        Class instance = new Class();
        boolean expResult = false;
        boolean result = instance.isSentinel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSentinel method, of class Class.
     */
    @Test
    public void testSetSentinel() {
        System.out.println("setSentinel");
        Class instance = new Class();
        instance.setSentinel();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Class.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Class instance = new Class();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of compareTo method, of class Class.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        Class c = null;
        Class instance = new Class();
        int expResult = 0;
        int result = instance.compareTo(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}