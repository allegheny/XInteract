/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package cayenne.DBobjects.auto;

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
@Suite.SuiteClasses({cayenne.DBobjects.auto._CategoryTest.class,cayenne.DBobjects.auto._StudentTest.class,cayenne.DBobjects.auto._ProfessorTest.class,cayenne.DBobjects.auto._ClassTest.class,cayenne.DBobjects.auto._AttemptTest.class,cayenne.DBobjects.auto._ProblemTest.class})
public class AutoSuite {

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