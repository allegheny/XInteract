/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package cayenne.DBobjects.auto;

import cayenne.DBobjects.Problem;
import cayenne.DBobjects.Professor;
import cayenne.DBobjects.Student;
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
public class _ClassTest {

    public _ClassTest() {
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
     * Test of setSemester method, of class _Class.
     */
    @Test
    public void testSetSemester() {
        System.out.println("setSemester");
        String semester = "";
        _Class instance = new _Class();
        instance.setSemester(semester);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSemester method, of class _Class.
     */
    @Test
    public void testGetSemester() {
        System.out.println("getSemester");
        _Class instance = new _Class();
        String expResult = "";
        String result = instance.getSemester();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTitle method, of class _Class.
     */
    @Test
    public void testSetTitle() {
        System.out.println("setTitle");
        String title = "";
        _Class instance = new _Class();
        instance.setTitle(title);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTitle method, of class _Class.
     */
    @Test
    public void testGetTitle() {
        System.out.println("getTitle");
        _Class instance = new _Class();
        String expResult = "";
        String result = instance.getTitle();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setYearTaught method, of class _Class.
     */
    @Test
    public void testSetYearTaught() {
        System.out.println("setYearTaught");
        Integer yearTaught = null;
        _Class instance = new _Class();
        instance.setYearTaught(yearTaught);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getYearTaught method, of class _Class.
     */
    @Test
    public void testGetYearTaught() {
        System.out.println("getYearTaught");
        _Class instance = new _Class();
        Integer expResult = null;
        Integer result = instance.getYearTaught();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addToProblems method, of class _Class.
     */
    @Test
    public void testAddToProblems() {
        System.out.println("addToProblems");
        Problem obj = null;
        _Class instance = new _Class();
        instance.addToProblems(obj);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeFromProblems method, of class _Class.
     */
    @Test
    public void testRemoveFromProblems() {
        System.out.println("removeFromProblems");
        Problem obj = null;
        _Class instance = new _Class();
        instance.removeFromProblems(obj);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProblems method, of class _Class.
     */
    @Test
    public void testGetProblems() {
        System.out.println("getProblems");
        _Class instance = new _Class();
        List expResult = null;
        List result = instance.getProblems();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setProfessor method, of class _Class.
     */
    @Test
    public void testSetProfessor() {
        System.out.println("setProfessor");
        Professor professor = null;
        _Class instance = new _Class();
        instance.setProfessor(professor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProfessor method, of class _Class.
     */
    @Test
    public void testGetProfessor() {
        System.out.println("getProfessor");
        _Class instance = new _Class();
        Professor expResult = null;
        Professor result = instance.getProfessor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addToStudents method, of class _Class.
     */
    @Test
    public void testAddToStudents() {
        System.out.println("addToStudents");
        Student obj = null;
        _Class instance = new _Class();
        instance.addToStudents(obj);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeFromStudents method, of class _Class.
     */
    @Test
    public void testRemoveFromStudents() {
        System.out.println("removeFromStudents");
        Student obj = null;
        _Class instance = new _Class();
        instance.removeFromStudents(obj);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStudents method, of class _Class.
     */
    @Test
    public void testGetStudents() {
        System.out.println("getStudents");
        _Class instance = new _Class();
        List expResult = null;
        List result = instance.getStudents();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}