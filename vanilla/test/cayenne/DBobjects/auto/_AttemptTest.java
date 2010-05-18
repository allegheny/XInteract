/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package cayenne.DBobjects.auto;

import cayenne.DBobjects.Problem;
import cayenne.DBobjects.Student;
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
public class _AttemptTest {

    public _AttemptTest() {
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
     * Test of setCompleted method, of class _Attempt.
     */
    @Test
    public void testSetCompleted() {
        System.out.println("setCompleted");
        Boolean completed = null;
        _Attempt instance = new _Attempt();
        instance.setCompleted(completed);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCompleted method, of class _Attempt.
     */
    @Test
    public void testGetCompleted() {
        System.out.println("getCompleted");
        _Attempt instance = new _Attempt();
        Boolean expResult = null;
        Boolean result = instance.getCompleted();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStudentCode method, of class _Attempt.
     */
    @Test
    public void testSetStudentCode() {
        System.out.println("setStudentCode");
        String studentCode = "";
        _Attempt instance = new _Attempt();
        instance.setStudentCode(studentCode);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStudentCode method, of class _Attempt.
     */
    @Test
    public void testGetStudentCode() {
        System.out.println("getStudentCode");
        _Attempt instance = new _Attempt();
        String expResult = "";
        String result = instance.getStudentCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTryCount method, of class _Attempt.
     */
    @Test
    public void testSetTryCount() {
        System.out.println("setTryCount");
        Integer tryCount = null;
        _Attempt instance = new _Attempt();
        instance.setTryCount(tryCount);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTryCount method, of class _Attempt.
     */
    @Test
    public void testGetTryCount() {
        System.out.println("getTryCount");
        _Attempt instance = new _Attempt();
        Integer expResult = null;
        Integer result = instance.getTryCount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setProblem method, of class _Attempt.
     */
    @Test
    public void testSetProblem() {
        System.out.println("setProblem");
        Problem problem = null;
        _Attempt instance = new _Attempt();
        instance.setProblem(problem);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProblem method, of class _Attempt.
     */
    @Test
    public void testGetProblem() {
        System.out.println("getProblem");
        _Attempt instance = new _Attempt();
        Problem expResult = null;
        Problem result = instance.getProblem();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStudent method, of class _Attempt.
     */
    @Test
    public void testSetStudent() {
        System.out.println("setStudent");
        Student student = null;
        _Attempt instance = new _Attempt();
        instance.setStudent(student);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStudent method, of class _Attempt.
     */
    @Test
    public void testGetStudent() {
        System.out.println("getStudent");
        _Attempt instance = new _Attempt();
        Student expResult = null;
        Student result = instance.getStudent();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}