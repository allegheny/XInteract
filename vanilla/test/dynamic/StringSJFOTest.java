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
public class StringSJFOTest {

    public StringSJFOTest() {
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
     * Test of getCharContent method, of class StringSJFO.
     */
    @Test
    public void testGetCharContent() {
        System.out.println("getCharContent");
        boolean ignoreEncodingErrors = false;
        StringSJFO instance = null;
        CharSequence expResult = null;
        CharSequence result = instance.getCharContent(ignoreEncodingErrors);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}