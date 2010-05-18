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
public class StudentTest {

    public StudentTest() {
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
     * Test of getFirstName method, of class Student.
     */
    @Test
    public void testGetFirstName() {
        System.out.println("getFirstName");
        Student instance = new Student();
        String expResult = "";
        String result = instance.getFirstName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLastName method, of class Student.
     */
    @Test
    public void testGetLastName() {
        System.out.println("getLastName");
        Student instance = new Student();
        String expResult = "";
        String result = instance.getLastName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUserName method, of class Student.
     */
    @Test
    public void testGetUserName() {
        System.out.println("getUserName");
        Student instance = new Student();
        String expResult = "";
        String result = instance.getUserName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isUserSentinel method, of class Student.
     */
    @Test
    public void testIsUserSentinel() {
        System.out.println("isUserSentinel");
        Student instance = new Student();
        boolean expResult = false;
        boolean result = instance.isUserSentinel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUserSentinel method, of class Student.
     */
    @Test
    public void testSetUserSentinel() {
        System.out.println("setUserSentinel");
        Student instance = new Student();
        instance.setUserSentinel();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isSentinel method, of class Student.
     */
    @Test
    public void testIsSentinel() {
        System.out.println("isSentinel");
        Student instance = new Student();
        boolean expResult = false;
        boolean result = instance.isSentinel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSentinel method, of class Student.
     */
    @Test
    public void testSetSentinel() {
        System.out.println("setSentinel");
        Student instance = new Student();
        instance.setSentinel();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Student.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Student instance = new Student();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of compareTo method, of class Student.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        Student someStudent = null;
        Student instance = new Student();
        int expResult = 0;
        int result = instance.compareTo(someStudent);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}