package professorGUI;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author erik
 */
public class ConfigurationWriter {

    /**
     * The parts of the XML file that we don't want to change
     */
    private static final String XMLBeginning = "<?xml version=\"1.0\" encoding=\"utf-8\"?>" +
            "\n<driver project-version=\"2.0\" class=\"";
    private static final String XMLMiddle1 = "\">\n\t<url value=\"";
    private static final String XMLMiddle2 = "\"/>\n\t<connectionPool min=\"";
    private static final String XMLMiddle3 = "\" max=\"";
    private static final String XMLEnd = "\" />\n</driver>";
    /**
     * JDBC Driver Options
     */
    private static final String embeddedDerby = "org.apache.derby.jdbc.EmbeddedDriver";
    private static final String mySQL = "com.mysql.jdbc.Driver";
    private static final String postgreSQL = "org.postgresql.Driver";
    /**
     * Database URL line
     * These will need to be changed once we are running from a server instead of embedded mode.
     */
    private static final String derbyURL = "jdbc:derby:XIDB;create=false";
    private static final String mySQLURL = "jdbc:mysql:/XIDB;";
    private static final String postgreSQLURL = "jdbc:postgresql:XIDB";
    /**
     * Path to XML file
     */
    private static String XMLLocation = "./src/XInteractNode.driver.xml";
    /**
     * Options as they are currently set:
     */
    private static int minConnections,  maxConnections;
    private static String JDBCDriver,  DBURL;

//    public static void main(String[] args) {
//        /**
//         * To test the class
//         */
//        minConnections = maxConnections = 1;
//        JDBCDriver = embeddedDerby;
//        DBURL = derbyURL;
//        storeXMLFile(XMLLocation);
//    }

    /**
     * To change a value in the XML file, call any one of these methods from XInteract.
     * All of these methods will read in the current options, change the desired options
     * and the write the XML file back to disk.
     */
    public static void setDBDriver(String newDriver) {
        readCurrentOptions();
        JDBCDriver = newDriver;
        storeXMLFile(XMLLocation);
    }

    public static void setDBUrl(String newURL) {
        readCurrentOptions();
        DBURL = newURL;
        storeXMLFile(XMLLocation);
    }

    public static void setMinConnections(int connections) {
        readCurrentOptions();
        minConnections = connections;
        storeXMLFile(XMLLocation);

    }

    public static void setMaxConnections(int connections) {
        readCurrentOptions();
        maxConnections = connections;
        storeXMLFile(XMLLocation);
    }

    public static void storeXMLFile(String location) {
        String str = (XMLBeginning + JDBCDriver + XMLMiddle1 + DBURL + XMLMiddle2 +
                minConnections + XMLMiddle3 + maxConnections + XMLEnd);
//        System.out.println(str); //debug
        try {
            FileWriter fileOut = new FileWriter(location);
            char[] a = new char[str.length()];
            str.getChars(0, str.length(), a, 0);
            for (int i = 0; i < a.length; i++) {
                fileOut.write(a[i]);
            }
            fileOut.close();
        } catch (IOException exc) {
            System.err.println("Exception caught when storing the xml file!");
            exc.printStackTrace();
            System.exit(1);
        }
    }

    public static void readCurrentOptions() {
        /**
         * This method will read in the options as they are currently set.
         * Radu has written a class to achive this.
         *
         * Things to do here:
         * 1. Read in XML file
         * 2. Set all of the options to the current settings
         */
//        JDBCDriver = ?;
//        DBURL = ?;
//        minConnections = ?;
//        maxConnections = ?;
    }
}
