/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dynamic;

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
public class CodeRunnerTest {

    public CodeRunnerTest() {
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
     * Test of test method, of class CodeRunner.
     */
    @Test
    public void testTest() throws Exception {
        System.out.println("test");
        String[] args = null;
        String[] outTokens = null;
        CodeRunner instance = null;
        String expResult = "";
        String result = instance.test(args, outTokens);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}