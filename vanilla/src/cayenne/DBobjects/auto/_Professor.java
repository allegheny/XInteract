package cayenne.DBobjects.auto;

import java.util.List;

/** Class _Professor was generated by Cayenne.
  * It is probably a good idea to avoid changing this class manually, 
  * since it may be overwritten next time code is regenerated. 
  * If you need to make any customizations, please use subclass. 
  */
public class _Professor extends org.apache.cayenne.CayenneDataObject {

    public static final String FIRST_NAME_PROPERTY = "firstName";
    public static final String LAST_NAME_PROPERTY = "lastName";
    public static final String PASSWORD_PROPERTY = "password";
    public static final String USER_NAME_PROPERTY = "userName";
    public static final String CLASSES_PROPERTY = "classes";
    public static final String PROBLEMS_PROPERTY = "problems";

    public static final String ID_PK_COLUMN = "ID";

    public void setFirstName(String firstName) {
        writeProperty("firstName", firstName);
    }
    public String getFirstName() {
        return (String)readProperty("firstName");
    }
    
    
    public void setLastName(String lastName) {
        writeProperty("lastName", lastName);
    }
    public String getLastName() {
        return (String)readProperty("lastName");
    }
    
    
    public void setPassword(String password) {
        writeProperty("password", password);
    }
    public String getPassword() {
        return (String)readProperty("password");
    }
    
    
    public void setUserName(String userName) {
        writeProperty("userName", userName);
    }
    public String getUserName() {
        return (String)readProperty("userName");
    }
    
    
    public void addToClasses(cayenne.DBobjects.Class obj) {
        addToManyTarget("classes", obj, true);
    }
    public void removeFromClasses(cayenne.DBobjects.Class obj) {
        removeToManyTarget("classes", obj, true);
    }
    public List getClasses() {
        return (List)readProperty("classes");
    }
    
    
    public void addToProblems(cayenne.DBobjects.Problem obj) {
        addToManyTarget("problems", obj, true);
    }
    public void removeFromProblems(cayenne.DBobjects.Problem obj) {
        removeToManyTarget("problems", obj, true);
    }
    public List getProblems() {
        return (List)readProperty("problems");
    }
    
    
}