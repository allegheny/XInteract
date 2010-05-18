/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package xidb;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author radu
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({xidb.convert.ConvertSuite.class,xidb.DBManagerTest.class,xidb.DBManagerBeanInfoTest.class})
public class XidbSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

}