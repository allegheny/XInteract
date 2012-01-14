/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package xidb;

import cayenne.DBobjects.Category;
import cayenne.DBobjects.Class;
import cayenne.DBobjects.Problem;
import cayenne.DBobjects.Professor;
import cayenne.DBobjects.Student;
import java.beans.PropertyChangeListener;
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
public class DBManagerTest {

    public DBManagerTest() {
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
     * Test of initialize method, of class DBManager.
     */
    @Test
    public void testInitialize() {
        System.out.println("initialize");
        DBManager instance = new DBManager();
        instance.initialize();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStudentUser method, of class DBManager.
     */
    @Test
    public void testGetStudentUser() {
        System.out.println("getStudentUser");
        DBManager instance = new DBManager();
        Student expResult = null;
        Student result = instance.getStudentUser();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStudentUser method, of class DBManager.
     */
    @Test
    public void testSetStudentUser() {
        System.out.println("setStudentUser");
        Student newStudent = null;
        DBManager instance = new DBManager();
        instance.setStudentUser(newStudent);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProblems method, of class DBManager.
     */
    @Test
    public void testGetProblems() {
        System.out.println("getProblems");
        DBManager instance = new DBManager();
        List expResult = null;
        List result = instance.getProblems();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setProblems method, of class DBManager.
     */
    @Test
    public void testSetProblems() {
        System.out.println("setProblems");
        List newList = null;
        DBManager instance = new DBManager();
        instance.setProblems(newList);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCategories method, of class DBManager.
     */
    @Test
    public void testGetCategories() {
        System.out.println("getCategories");
        DBManager instance = new DBManager();
        List expResult = null;
        List result = instance.getCategories();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCategories method, of class DBManager.
     */
    @Test
    public void testSetCategories() {
        System.out.println("setCategories");
        List newList = null;
        DBManager instance = new DBManager();
        instance.setCategories(newList);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProfessors method, of class DBManager.
     */
    @Test
    public void testGetProfessors() {
        System.out.println("getProfessors");
        DBManager instance = new DBManager();
        List expResult = null;
        List result = instance.getProfessors();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setProfessors method, of class DBManager.
     */
    @Test
    public void testSetProfessors() {
        System.out.println("setProfessors");
        List newList = null;
        DBManager instance = new DBManager();
        instance.setProfessors(newList);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStudents method, of class DBManager.
     */
    @Test
    public void testGetStudents() {
        System.out.println("getStudents");
        DBManager instance = new DBManager();
        List expResult = null;
        List result = instance.getStudents();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStudents method, of class DBManager.
     */
    @Test
    public void testSetStudents() {
        System.out.println("setStudents");
        List newList = null;
        DBManager instance = new DBManager();
        instance.setStudents(newList);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getClasses method, of class DBManager.
     */
    @Test
    public void testGetClasses() {
        System.out.println("getClasses");
        DBManager instance = new DBManager();
        List expResult = null;
        List result = instance.getClasses();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setClasses method, of class DBManager.
     */
    @Test
    public void testSetClasses() {
        System.out.println("setClasses");
        List newList = null;
        DBManager instance = new DBManager();
        instance.setClasses(newList);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addPropertyChangeListener method, of class DBManager.
     */
    @Test
    public void testAddPropertyChangeListener() {
        System.out.println("addPropertyChangeListener");
        PropertyChangeListener listener = null;
        DBManager instance = new DBManager();
        instance.addPropertyChangeListener(listener);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removePropertyChangeListener method, of class DBManager.
     */
    @Test
    public void testRemovePropertyChangeListener() {
        System.out.println("removePropertyChangeListener");
        PropertyChangeListener listener = null;
        DBManager instance = new DBManager();
        instance.removePropertyChangeListener(listener);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createCategory method, of class DBManager.
     */
    @Test
    public void testCreateCategory() {
        System.out.println("createCategory");
        String name = "";
        String description = "";
        DBManager instance = new DBManager();
        Category expResult = null;
        Category result = instance.createCategory(name, description);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createProblem method, of class DBManager.
     */
    @Test
    public void testCreateProblem() {
        System.out.println("createProblem");
        String name = "";
        Professor author = null;
        Category category = null;
        String description = "";
        String upperCode = "";
        String lowerCode = "";
        String inputData = "";
        String outputData = "";
        DBManager instance = new DBManager();
        Problem expResult = null;
        Problem result = instance.createProblem(name, author, category, description, upperCode, lowerCode, inputData, outputData);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createProfessor method, of class DBManager.
     */
    @Test
    public void testCreateProfessor() {
        System.out.println("createProfessor");
        String firstName = "";
        String lastName = "";
        String userName = "";
        DBManager instance = new DBManager();
        Professor expResult = null;
        Professor result = instance.createProfessor(firstName, lastName, userName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createStudent method, of class DBManager.
     */
    @Test
    public void testCreateStudent() {
        System.out.println("createStudent");
        String firstName = "";
        String lastName = "";
        String userName = "";
        DBManager instance = new DBManager();
        Student expResult = null;
        Student result = instance.createStudent(firstName, lastName, userName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createClass method, of class DBManager.
     */
    @Test
    public void testCreateClass() {
        System.out.println("createClass");
        String title = "";
        String semester = "";
        Integer year = null;
        Professor professor = null;
        DBManager instance = new DBManager();
        Class expResult = null;
        Class result = instance.createClass(title, semester, year, professor);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of editCategory method, of class DBManager.
     */
    @Test
    public void testEditCategory() {
        System.out.println("editCategory");
        Category someCategory = null;
        String name = "";
        String description = "";
        DBManager instance = new DBManager();
        Category expResult = null;
        Category result = instance.editCategory(someCategory, name, description);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of editProblem method, of class DBManager.
     */
    @Test
    public void testEditProblem() {
        System.out.println("editProblem");
        Problem someProblem = null;
        String name = "";
        Professor author = null;
        Category category = null;
        String description = "";
        String upperCode = "";
        String lowerCode = "";
        String input = "";
        String output = "";
        DBManager instance = new DBManager();
        Problem expResult = null;
        Problem result = instance.editProblem(someProblem, name, author, category, description, upperCode, lowerCode, input, output);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of editProfessor method, of class DBManager.
     */
    @Test
    public void testEditProfessor() {
        System.out.println("editProfessor");
        Professor someProfessor = null;
        String firstName = "";
        String lastName = "";
        String userName = "";
        DBManager instance = new DBManager();
        Professor expResult = null;
        Professor result = instance.editProfessor(someProfessor, firstName, lastName, userName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of editStudent method, of class DBManager.
     */
    @Test
    public void testEditStudent() {
        System.out.println("editStudent");
        Student someStudent = null;
        String firstName = "";
        String lastName = "";
        String userName = "";
        DBManager instance = new DBManager();
        Student expResult = null;
        Student result = instance.editStudent(someStudent, firstName, lastName, userName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of editClass method, of class DBManager.
     */
    @Test
    public void testEditClass() {
        System.out.println("editClass");
        Class someClass = null;
        String title = "";
        String semester = "";
        Integer year = null;
        Professor professor = null;
        DBManager instance = new DBManager();
        Class expResult = null;
        Class result = instance.editClass(someClass, title, semester, year, professor);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteCategory method, of class DBManager.
     */
    @Test
    public void testDeleteCategory() {
        System.out.println("deleteCategory");
        Category someCategory = null;
        DBManager instance = new DBManager();
        instance.deleteCategory(someCategory);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteProblem method, of class DBManager.
     */
    @Test
    public void testDeleteProblem() {
        System.out.println("deleteProblem");
        Problem someProblem = null;
        DBManager instance = new DBManager();
        instance.deleteProblem(someProblem);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteProfessor method, of class DBManager.
     */
    @Test
    public void testDeleteProfessor() {
        System.out.println("deleteProfessor");
        Professor someProfessor = null;
        DBManager instance = new DBManager();
        instance.deleteProfessor(someProfessor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteStudent method, of class DBManager.
     */
    @Test
    public void testDeleteStudent() {
        System.out.println("deleteStudent");
        Student someStudent = null;
        DBManager instance = new DBManager();
        instance.deleteStudent(someStudent);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteClass method, of class DBManager.
     */
    @Test
    public void testDeleteClass() {
        System.out.println("deleteClass");
        Class someClass = null;
        DBManager instance = new DBManager();
        instance.deleteClass(someClass);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addCategorySentinel method, of class DBManager.
     */
    @Test
    public void testAddCategorySentinel() {
        System.out.println("addCategorySentinel");
        DBManager instance = new DBManager();
        instance.addCategorySentinel();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeCategorySentinel method, of class DBManager.
     */
    @Test
    public void testRemoveCategorySentinel() {
        System.out.println("removeCategorySentinel");
        DBManager instance = new DBManager();
        instance.removeCategorySentinel();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addStudentSentinel method, of class DBManager.
     */
    @Test
    public void testAddStudentSentinel() {
        System.out.println("addStudentSentinel");
        DBManager instance = new DBManager();
        instance.addStudentSentinel();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeStudentSentinel method, of class DBManager.
     */
    @Test
    public void testRemoveStudentSentinel() {
        System.out.println("removeStudentSentinel");
        DBManager instance = new DBManager();
        instance.removeStudentSentinel();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addProfessorSentinel method, of class DBManager.
     */
    @Test
    public void testAddProfessorSentinel() {
        System.out.println("addProfessorSentinel");
        DBManager instance = new DBManager();
        instance.addProfessorSentinel();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeProfessorSentinel method, of class DBManager.
     */
    @Test
    public void testRemoveProfessorSentinel() {
        System.out.println("removeProfessorSentinel");
        DBManager instance = new DBManager();
        instance.removeProfessorSentinel();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addProblemSentinel method, of class DBManager.
     */
    @Test
    public void testAddProblemSentinel() {
        System.out.println("addProblemSentinel");
        DBManager instance = new DBManager();
        instance.addProblemSentinel();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeProblemSentinel method, of class DBManager.
     */
    @Test
    public void testRemoveProblemSentinel() {
        System.out.println("removeProblemSentinel");
        DBManager instance = new DBManager();
        instance.removeProblemSentinel();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addProblemCategorySentinel method, of class DBManager.
     */
    @Test
    public void testAddProblemCategorySentinel() {
        System.out.println("addProblemCategorySentinel");
        DBManager instance = new DBManager();
        instance.addProblemCategorySentinel();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeProblemCategorySentinel method, of class DBManager.
     */
    @Test
    public void testRemoveProblemCategorySentinel() {
        System.out.println("removeProblemCategorySentinel");
        DBManager instance = new DBManager();
        instance.removeProblemCategorySentinel();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addProblemProfessorSentinel method, of class DBManager.
     */
    @Test
    public void testAddProblemProfessorSentinel() {
        System.out.println("addProblemProfessorSentinel");
        DBManager instance = new DBManager();
        instance.addProblemProfessorSentinel();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeProblemProfessorSentinel method, of class DBManager.
     */
    @Test
    public void testRemoveProblemProfessorSentinel() {
        System.out.println("removeProblemProfessorSentinel");
        DBManager instance = new DBManager();
        instance.removeProblemProfessorSentinel();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addClassSentinel method, of class DBManager.
     */
    @Test
    public void testAddClassSentinel() {
        System.out.println("addClassSentinel");
        DBManager instance = new DBManager();
        instance.addClassSentinel();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeClassSentinel method, of class DBManager.
     */
    @Test
    public void testRemoveClassSentinel() {
        System.out.println("removeClassSentinel");
        DBManager instance = new DBManager();
        instance.removeClassSentinel();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addClassProfessorSentinel method, of class DBManager.
     */
    @Test
    public void testAddClassProfessorSentinel() {
        System.out.println("addClassProfessorSentinel");
        DBManager instance = new DBManager();
        instance.addClassProfessorSentinel();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeClassProfessorSentinel method, of class DBManager.
     */
    @Test
    public void testRemoveClassProfessorSentinel() {
        System.out.println("removeClassProfessorSentinel");
        DBManager instance = new DBManager();
        instance.removeClassProfessorSentinel();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of assignProblems method, of class DBManager.
     */
    @Test
    public void testAssignProblems() {
        System.out.println("assignProblems");
        Class someClass = null;
        List someList = null;
        DBManager instance = new DBManager();
        Class expResult = null;
        Class result = instance.assignProblems(someClass, someList);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeProblems method, of class DBManager.
     */
    @Test
    public void testRemoveProblems() {
        System.out.println("removeProblems");
        Class someClass = null;
        List someList = null;
        DBManager instance = new DBManager();
        Class expResult = null;
        Class result = instance.removeProblems(someClass, someList);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of enrollStudents method, of class DBManager.
     */
    @Test
    public void testEnrollStudents() {
        System.out.println("enrollStudents");
        Class someClass = null;
        List someList = null;
        DBManager instance = new DBManager();
        Class expResult = null;
        Class result = instance.enrollStudents(someClass, someList);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeStudents method, of class DBManager.
     */
    @Test
    public void testRemoveStudents() {
        System.out.println("removeStudents");
        Class someClass = null;
        List someList = null;
        DBManager instance = new DBManager();
        Class expResult = null;
        Class result = instance.removeStudents(someClass, someList);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}