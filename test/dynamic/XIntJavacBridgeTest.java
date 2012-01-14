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
public class XIntJavacBridgeTest {

    public XIntJavacBridgeTest() {
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
     * Test of call method, of class XIntJavacBridge.
     */
    @Test
    public void testCall() throws Exception {
        System.out.println("call");
        String name = "";
        String source = "";
        Class expResult = null;
        Class result = XIntJavacBridge.call(name, source);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}