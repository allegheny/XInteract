/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package xidb.convert;

import cayenne.DBobjects.Problem;
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
public class ProblemUpperCodeConverterTest {

    public ProblemUpperCodeConverterTest() {
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
     * Test of convertForward method, of class ProblemUpperCodeConverter.
     */
    @Test
    public void testConvertForward() {
        System.out.println("convertForward");
        Object someObject = null;
        ProblemUpperCodeConverter instance = new ProblemUpperCodeConverter();
        String expResult = "";
        String result = instance.convertForward(someObject);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of convertReverse method, of class ProblemUpperCodeConverter.
     */
    @Test
    public void testConvertReverse() {
        System.out.println("convertReverse");
        Object arg = null;
        ProblemUpperCodeConverter instance = new ProblemUpperCodeConverter();
        Problem expResult = null;
        Problem result = instance.convertReverse(arg);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}