/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package xidb;

import java.awt.Image;
import java.beans.BeanDescriptor;
import java.beans.EventSetDescriptor;
import java.beans.MethodDescriptor;
import java.beans.PropertyDescriptor;
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
public class DBManagerBeanInfoTest {

    public DBManagerBeanInfoTest() {
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
     * Test of getBeanDescriptor method, of class DBManagerBeanInfo.
     */
    @Test
    public void testGetBeanDescriptor() {
        System.out.println("getBeanDescriptor");
        DBManagerBeanInfo instance = new DBManagerBeanInfo();
        BeanDescriptor expResult = null;
        BeanDescriptor result = instance.getBeanDescriptor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPropertyDescriptors method, of class DBManagerBeanInfo.
     */
    @Test
    public void testGetPropertyDescriptors() {
        System.out.println("getPropertyDescriptors");
        DBManagerBeanInfo instance = new DBManagerBeanInfo();
        PropertyDescriptor[] expResult = null;
        PropertyDescriptor[] result = instance.getPropertyDescriptors();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEventSetDescriptors method, of class DBManagerBeanInfo.
     */
    @Test
    public void testGetEventSetDescriptors() {
        System.out.println("getEventSetDescriptors");
        DBManagerBeanInfo instance = new DBManagerBeanInfo();
        EventSetDescriptor[] expResult = null;
        EventSetDescriptor[] result = instance.getEventSetDescriptors();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMethodDescriptors method, of class DBManagerBeanInfo.
     */
    @Test
    public void testGetMethodDescriptors() {
        System.out.println("getMethodDescriptors");
        DBManagerBeanInfo instance = new DBManagerBeanInfo();
        MethodDescriptor[] expResult = null;
        MethodDescriptor[] result = instance.getMethodDescriptors();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDefaultPropertyIndex method, of class DBManagerBeanInfo.
     */
    @Test
    public void testGetDefaultPropertyIndex() {
        System.out.println("getDefaultPropertyIndex");
        DBManagerBeanInfo instance = new DBManagerBeanInfo();
        int expResult = 0;
        int result = instance.getDefaultPropertyIndex();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDefaultEventIndex method, of class DBManagerBeanInfo.
     */
    @Test
    public void testGetDefaultEventIndex() {
        System.out.println("getDefaultEventIndex");
        DBManagerBeanInfo instance = new DBManagerBeanInfo();
        int expResult = 0;
        int result = instance.getDefaultEventIndex();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIcon method, of class DBManagerBeanInfo.
     */
    @Test
    public void testGetIcon() {
        System.out.println("getIcon");
        int iconKind = 0;
        DBManagerBeanInfo instance = new DBManagerBeanInfo();
        Image expResult = null;
        Image result = instance.getIcon(iconKind);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}