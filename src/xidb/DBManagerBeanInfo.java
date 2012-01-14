package xidb;

import java.beans.*;

/**
 *
 * @author radu
 */
public class DBManagerBeanInfo extends SimpleBeanInfo {

    // Bean descriptor//GEN-FIRST:BeanDescriptor
    /*lazy BeanDescriptor*/
    private static BeanDescriptor getBdescriptor(){
        BeanDescriptor beanDescriptor = new BeanDescriptor  ( xidb.DBManager.class , null ); // NOI18N//GEN-HEADEREND:BeanDescriptor

    // Here you can add code for customizing the BeanDescriptor.

        return beanDescriptor;     }//GEN-LAST:BeanDescriptor


    // Property identifiers//GEN-FIRST:Properties
    private static final int PROPERTY_categories = 0;
    private static final int PROPERTY_classes = 1;
    private static final int PROPERTY_initializedAttempts = 2;
    private static final int PROPERTY_initializedClasses = 3;
    private static final int PROPERTY_initializedConfig = 4;
    private static final int PROPERTY_initializedProblems = 5;
    private static final int PROPERTY_initializedSPC = 6;
    private static final int PROPERTY_problems = 7;
    private static final int PROPERTY_professors = 8;
    private static final int PROPERTY_professorUser = 9;
    private static final int PROPERTY_students = 10;
    private static final int PROPERTY_studentUser = 11;

    // Property array 
    /*lazy PropertyDescriptor*/
    private static PropertyDescriptor[] getPdescriptor(){
        PropertyDescriptor[] properties = new PropertyDescriptor[12];
    
        try {
            properties[PROPERTY_categories] = new PropertyDescriptor ( "categories", xidb.DBManager.class, "getCategories", "setCategories" ); // NOI18N
            properties[PROPERTY_classes] = new PropertyDescriptor ( "classes", xidb.DBManager.class, "getClasses", "setClasses" ); // NOI18N
            properties[PROPERTY_initializedAttempts] = new PropertyDescriptor ( "initializedAttempts", xidb.DBManager.class, "isInitializedAttempts", "setInitializedAttempts" ); // NOI18N
            properties[PROPERTY_initializedClasses] = new PropertyDescriptor ( "initializedClasses", xidb.DBManager.class, "isInitializedClasses", "setInitializedClasses" ); // NOI18N
            properties[PROPERTY_initializedConfig] = new PropertyDescriptor ( "initializedConfig", xidb.DBManager.class, "isInitializedConfig", "setInitializedConfig" ); // NOI18N
            properties[PROPERTY_initializedProblems] = new PropertyDescriptor ( "initializedProblems", xidb.DBManager.class, "isInitializedProblems", "setInitializedProblems" ); // NOI18N
            properties[PROPERTY_initializedSPC] = new PropertyDescriptor ( "initializedSPC", xidb.DBManager.class, "isInitializedSPC", "setInitializedSPC" ); // NOI18N
            properties[PROPERTY_problems] = new PropertyDescriptor ( "problems", xidb.DBManager.class, "getProblems", "setProblems" ); // NOI18N
            properties[PROPERTY_professors] = new PropertyDescriptor ( "professors", xidb.DBManager.class, "getProfessors", "setProfessors" ); // NOI18N
            properties[PROPERTY_professorUser] = new PropertyDescriptor ( "professorUser", xidb.DBManager.class, "getProfessorUser", "setProfessorUser" ); // NOI18N
            properties[PROPERTY_students] = new PropertyDescriptor ( "students", xidb.DBManager.class, "getStudents", "setStudents" ); // NOI18N
            properties[PROPERTY_studentUser] = new PropertyDescriptor ( "studentUser", xidb.DBManager.class, "getStudentUser", "setStudentUser" ); // NOI18N
        }
        catch(IntrospectionException e) {
            e.printStackTrace();
        }//GEN-HEADEREND:Properties

    // Here you can add code for customizing the properties array.

        return properties;     }//GEN-LAST:Properties

    // EventSet identifiers//GEN-FIRST:Events
    private static final int EVENT_propertyChangeListener = 0;

    // EventSet array
    /*lazy EventSetDescriptor*/
    private static EventSetDescriptor[] getEdescriptor(){
        EventSetDescriptor[] eventSets = new EventSetDescriptor[1];
    
        try {
            eventSets[EVENT_propertyChangeListener] = new EventSetDescriptor ( xidb.DBManager.class, "propertyChangeListener", java.beans.PropertyChangeListener.class, new String[] {"propertyChange"}, "addPropertyChangeListener", "removePropertyChangeListener" ); // NOI18N
        }
        catch(IntrospectionException e) {
            e.printStackTrace();
        }//GEN-HEADEREND:Events

    // Here you can add code for customizing the event sets array.

        return eventSets;     }//GEN-LAST:Events

    // Method identifiers//GEN-FIRST:Methods
    private static final int METHOD_addCategorySentinel0 = 0;
    private static final int METHOD_addClassProfessorSentinel1 = 1;
    private static final int METHOD_addClassSentinel2 = 2;
    private static final int METHOD_addProblemCategorySentinel3 = 3;
    private static final int METHOD_addProblemProfessorSentinel4 = 4;
    private static final int METHOD_addProblemSentinel5 = 5;
    private static final int METHOD_addProfessorSentinel6 = 6;
    private static final int METHOD_addStudentSentinel7 = 7;
    private static final int METHOD_assignProblems8 = 8;
    private static final int METHOD_changeProfessorPassword9 = 9;
    private static final int METHOD_changeStudentPassword10 = 10;
    private static final int METHOD_createAttempt11 = 11;
    private static final int METHOD_createCategory12 = 12;
    private static final int METHOD_createClass13 = 13;
    private static final int METHOD_createProblem14 = 14;
    private static final int METHOD_createProfessor15 = 15;
    private static final int METHOD_createStudent16 = 16;
    private static final int METHOD_deleteCategory17 = 17;
    private static final int METHOD_deleteClass18 = 18;
    private static final int METHOD_deleteProblem19 = 19;
    private static final int METHOD_deleteProfessor20 = 20;
    private static final int METHOD_deleteStudent21 = 21;
    private static final int METHOD_editCategory22 = 22;
    private static final int METHOD_editClass23 = 23;
    private static final int METHOD_editProblem24 = 24;
    private static final int METHOD_editProfessor25 = 25;
    private static final int METHOD_editStudent26 = 26;
    private static final int METHOD_enrollStudents27 = 27;
    private static final int METHOD_initializeAttempts28 = 28;
    private static final int METHOD_initializeClasses29 = 29;
    private static final int METHOD_initializeConfig30 = 30;
    private static final int METHOD_initializeProblems31 = 31;
    private static final int METHOD_initializeSPC32 = 32;
    private static final int METHOD_logInProfessor33 = 33;
    private static final int METHOD_logInStudent34 = 34;
    private static final int METHOD_removeCategorySentinel35 = 35;
    private static final int METHOD_removeClassProfessorSentinel36 = 36;
    private static final int METHOD_removeClassSentinel37 = 37;
    private static final int METHOD_removeProblemCategorySentinel38 = 38;
    private static final int METHOD_removeProblemProfessorSentinel39 = 39;
    private static final int METHOD_removeProblems40 = 40;
    private static final int METHOD_removeProblemSentinel41 = 41;
    private static final int METHOD_removeProfessorSentinel42 = 42;
    private static final int METHOD_removeStudents43 = 43;
    private static final int METHOD_removeStudentSentinel44 = 44;
    private static final int METHOD_resetStudentPassword45 = 45;

    // Method array 
    /*lazy MethodDescriptor*/
    private static MethodDescriptor[] getMdescriptor(){
        MethodDescriptor[] methods = new MethodDescriptor[46];
    
        try {
            methods[METHOD_addCategorySentinel0] = new MethodDescriptor(xidb.DBManager.class.getMethod("addCategorySentinel", new Class[] {})); // NOI18N
            methods[METHOD_addCategorySentinel0].setDisplayName ( "" );
            methods[METHOD_addClassProfessorSentinel1] = new MethodDescriptor(xidb.DBManager.class.getMethod("addClassProfessorSentinel", new Class[] {})); // NOI18N
            methods[METHOD_addClassProfessorSentinel1].setDisplayName ( "" );
            methods[METHOD_addClassSentinel2] = new MethodDescriptor(xidb.DBManager.class.getMethod("addClassSentinel", new Class[] {})); // NOI18N
            methods[METHOD_addClassSentinel2].setDisplayName ( "" );
            methods[METHOD_addProblemCategorySentinel3] = new MethodDescriptor(xidb.DBManager.class.getMethod("addProblemCategorySentinel", new Class[] {})); // NOI18N
            methods[METHOD_addProblemCategorySentinel3].setDisplayName ( "" );
            methods[METHOD_addProblemProfessorSentinel4] = new MethodDescriptor(xidb.DBManager.class.getMethod("addProblemProfessorSentinel", new Class[] {})); // NOI18N
            methods[METHOD_addProblemProfessorSentinel4].setDisplayName ( "" );
            methods[METHOD_addProblemSentinel5] = new MethodDescriptor(xidb.DBManager.class.getMethod("addProblemSentinel", new Class[] {})); // NOI18N
            methods[METHOD_addProblemSentinel5].setDisplayName ( "" );
            methods[METHOD_addProfessorSentinel6] = new MethodDescriptor(xidb.DBManager.class.getMethod("addProfessorSentinel", new Class[] {})); // NOI18N
            methods[METHOD_addProfessorSentinel6].setDisplayName ( "" );
            methods[METHOD_addStudentSentinel7] = new MethodDescriptor(xidb.DBManager.class.getMethod("addStudentSentinel", new Class[] {})); // NOI18N
            methods[METHOD_addStudentSentinel7].setDisplayName ( "" );
            methods[METHOD_assignProblems8] = new MethodDescriptor(xidb.DBManager.class.getMethod("assignProblems", new Class[] {cayenne.DBobjects.Class.class, java.util.List.class})); // NOI18N
            methods[METHOD_assignProblems8].setDisplayName ( "" );
            methods[METHOD_changeProfessorPassword9] = new MethodDescriptor(xidb.DBManager.class.getMethod("changeProfessorPassword", new Class[] {char[].class, char[].class})); // NOI18N
            methods[METHOD_changeProfessorPassword9].setDisplayName ( "" );
            methods[METHOD_changeStudentPassword10] = new MethodDescriptor(xidb.DBManager.class.getMethod("changeStudentPassword", new Class[] {char[].class, char[].class})); // NOI18N
            methods[METHOD_changeStudentPassword10].setDisplayName ( "" );
            methods[METHOD_createAttempt11] = new MethodDescriptor(xidb.DBManager.class.getMethod("createAttempt", new Class[] {java.util.Date.class, java.lang.String.class, java.lang.String.class, cayenne.DBobjects.Student.class, cayenne.DBobjects.Problem.class})); // NOI18N
            methods[METHOD_createAttempt11].setDisplayName ( "" );
            methods[METHOD_createCategory12] = new MethodDescriptor(xidb.DBManager.class.getMethod("createCategory", new Class[] {java.lang.String.class, java.lang.String.class})); // NOI18N
            methods[METHOD_createCategory12].setDisplayName ( "" );
            methods[METHOD_createClass13] = new MethodDescriptor(xidb.DBManager.class.getMethod("createClass", new Class[] {java.lang.String.class, java.lang.String.class, java.lang.Integer.class, cayenne.DBobjects.Professor.class})); // NOI18N
            methods[METHOD_createClass13].setDisplayName ( "" );
            methods[METHOD_createProblem14] = new MethodDescriptor(xidb.DBManager.class.getMethod("createProblem", new Class[] {java.lang.String.class, cayenne.DBobjects.Professor.class, cayenne.DBobjects.Category.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class})); // NOI18N
            methods[METHOD_createProblem14].setDisplayName ( "" );
            methods[METHOD_createProfessor15] = new MethodDescriptor(xidb.DBManager.class.getMethod("createProfessor", new Class[] {java.lang.String.class, java.lang.String.class, java.lang.String.class})); // NOI18N
            methods[METHOD_createProfessor15].setDisplayName ( "" );
            methods[METHOD_createStudent16] = new MethodDescriptor(xidb.DBManager.class.getMethod("createStudent", new Class[] {java.lang.String.class, java.lang.String.class, java.lang.String.class})); // NOI18N
            methods[METHOD_createStudent16].setDisplayName ( "" );
            methods[METHOD_deleteCategory17] = new MethodDescriptor(xidb.DBManager.class.getMethod("deleteCategory", new Class[] {cayenne.DBobjects.Category.class})); // NOI18N
            methods[METHOD_deleteCategory17].setDisplayName ( "" );
            methods[METHOD_deleteClass18] = new MethodDescriptor(xidb.DBManager.class.getMethod("deleteClass", new Class[] {cayenne.DBobjects.Class.class})); // NOI18N
            methods[METHOD_deleteClass18].setDisplayName ( "" );
            methods[METHOD_deleteProblem19] = new MethodDescriptor(xidb.DBManager.class.getMethod("deleteProblem", new Class[] {cayenne.DBobjects.Problem.class})); // NOI18N
            methods[METHOD_deleteProblem19].setDisplayName ( "" );
            methods[METHOD_deleteProfessor20] = new MethodDescriptor(xidb.DBManager.class.getMethod("deleteProfessor", new Class[] {cayenne.DBobjects.Professor.class})); // NOI18N
            methods[METHOD_deleteProfessor20].setDisplayName ( "" );
            methods[METHOD_deleteStudent21] = new MethodDescriptor(xidb.DBManager.class.getMethod("deleteStudent", new Class[] {cayenne.DBobjects.Student.class})); // NOI18N
            methods[METHOD_deleteStudent21].setDisplayName ( "" );
            methods[METHOD_editCategory22] = new MethodDescriptor(xidb.DBManager.class.getMethod("editCategory", new Class[] {cayenne.DBobjects.Category.class, java.lang.String.class, java.lang.String.class})); // NOI18N
            methods[METHOD_editCategory22].setDisplayName ( "" );
            methods[METHOD_editClass23] = new MethodDescriptor(xidb.DBManager.class.getMethod("editClass", new Class[] {cayenne.DBobjects.Class.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, cayenne.DBobjects.Professor.class})); // NOI18N
            methods[METHOD_editClass23].setDisplayName ( "" );
            methods[METHOD_editProblem24] = new MethodDescriptor(xidb.DBManager.class.getMethod("editProblem", new Class[] {cayenne.DBobjects.Problem.class, java.lang.String.class, cayenne.DBobjects.Professor.class, cayenne.DBobjects.Category.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class})); // NOI18N
            methods[METHOD_editProblem24].setDisplayName ( "" );
            methods[METHOD_editProfessor25] = new MethodDescriptor(xidb.DBManager.class.getMethod("editProfessor", new Class[] {cayenne.DBobjects.Professor.class, java.lang.String.class, java.lang.String.class, java.lang.String.class})); // NOI18N
            methods[METHOD_editProfessor25].setDisplayName ( "" );
            methods[METHOD_editStudent26] = new MethodDescriptor(xidb.DBManager.class.getMethod("editStudent", new Class[] {cayenne.DBobjects.Student.class, java.lang.String.class, java.lang.String.class, java.lang.String.class})); // NOI18N
            methods[METHOD_editStudent26].setDisplayName ( "" );
            methods[METHOD_enrollStudents27] = new MethodDescriptor(xidb.DBManager.class.getMethod("enrollStudents", new Class[] {cayenne.DBobjects.Class.class, java.util.List.class})); // NOI18N
            methods[METHOD_enrollStudents27].setDisplayName ( "" );
            methods[METHOD_initializeAttempts28] = new MethodDescriptor(xidb.DBManager.class.getMethod("initializeAttempts", new Class[] {})); // NOI18N
            methods[METHOD_initializeAttempts28].setDisplayName ( "" );
            methods[METHOD_initializeClasses29] = new MethodDescriptor(xidb.DBManager.class.getMethod("initializeClasses", new Class[] {})); // NOI18N
            methods[METHOD_initializeClasses29].setDisplayName ( "" );
            methods[METHOD_initializeConfig30] = new MethodDescriptor(xidb.DBManager.class.getMethod("initializeConfig", new Class[] {})); // NOI18N
            methods[METHOD_initializeConfig30].setDisplayName ( "" );
            methods[METHOD_initializeProblems31] = new MethodDescriptor(xidb.DBManager.class.getMethod("initializeProblems", new Class[] {})); // NOI18N
            methods[METHOD_initializeProblems31].setDisplayName ( "" );
            methods[METHOD_initializeSPC32] = new MethodDescriptor(xidb.DBManager.class.getMethod("initializeSPC", new Class[] {})); // NOI18N
            methods[METHOD_initializeSPC32].setDisplayName ( "" );
            methods[METHOD_logInProfessor33] = new MethodDescriptor(xidb.DBManager.class.getMethod("logInProfessor", new Class[] {java.lang.String.class, java.lang.String.class})); // NOI18N
            methods[METHOD_logInProfessor33].setDisplayName ( "" );
            methods[METHOD_logInStudent34] = new MethodDescriptor(xidb.DBManager.class.getMethod("logInStudent", new Class[] {java.lang.String.class, java.lang.String.class})); // NOI18N
            methods[METHOD_logInStudent34].setDisplayName ( "" );
            methods[METHOD_removeCategorySentinel35] = new MethodDescriptor(xidb.DBManager.class.getMethod("removeCategorySentinel", new Class[] {})); // NOI18N
            methods[METHOD_removeCategorySentinel35].setDisplayName ( "" );
            methods[METHOD_removeClassProfessorSentinel36] = new MethodDescriptor(xidb.DBManager.class.getMethod("removeClassProfessorSentinel", new Class[] {})); // NOI18N
            methods[METHOD_removeClassProfessorSentinel36].setDisplayName ( "" );
            methods[METHOD_removeClassSentinel37] = new MethodDescriptor(xidb.DBManager.class.getMethod("removeClassSentinel", new Class[] {})); // NOI18N
            methods[METHOD_removeClassSentinel37].setDisplayName ( "" );
            methods[METHOD_removeProblemCategorySentinel38] = new MethodDescriptor(xidb.DBManager.class.getMethod("removeProblemCategorySentinel", new Class[] {})); // NOI18N
            methods[METHOD_removeProblemCategorySentinel38].setDisplayName ( "" );
            methods[METHOD_removeProblemProfessorSentinel39] = new MethodDescriptor(xidb.DBManager.class.getMethod("removeProblemProfessorSentinel", new Class[] {})); // NOI18N
            methods[METHOD_removeProblemProfessorSentinel39].setDisplayName ( "" );
            methods[METHOD_removeProblems40] = new MethodDescriptor(xidb.DBManager.class.getMethod("removeProblems", new Class[] {cayenne.DBobjects.Class.class, java.util.List.class})); // NOI18N
            methods[METHOD_removeProblems40].setDisplayName ( "" );
            methods[METHOD_removeProblemSentinel41] = new MethodDescriptor(xidb.DBManager.class.getMethod("removeProblemSentinel", new Class[] {})); // NOI18N
            methods[METHOD_removeProblemSentinel41].setDisplayName ( "" );
            methods[METHOD_removeProfessorSentinel42] = new MethodDescriptor(xidb.DBManager.class.getMethod("removeProfessorSentinel", new Class[] {})); // NOI18N
            methods[METHOD_removeProfessorSentinel42].setDisplayName ( "" );
            methods[METHOD_removeStudents43] = new MethodDescriptor(xidb.DBManager.class.getMethod("removeStudents", new Class[] {cayenne.DBobjects.Class.class, java.util.List.class})); // NOI18N
            methods[METHOD_removeStudents43].setDisplayName ( "" );
            methods[METHOD_removeStudentSentinel44] = new MethodDescriptor(xidb.DBManager.class.getMethod("removeStudentSentinel", new Class[] {})); // NOI18N
            methods[METHOD_removeStudentSentinel44].setDisplayName ( "" );
            methods[METHOD_resetStudentPassword45] = new MethodDescriptor(xidb.DBManager.class.getMethod("resetStudentPassword", new Class[] {cayenne.DBobjects.Student.class})); // NOI18N
            methods[METHOD_resetStudentPassword45].setDisplayName ( "" );
        }
        catch( Exception e) {}//GEN-HEADEREND:Methods

    // Here you can add code for customizing the methods array.
    
        return methods;     }//GEN-LAST:Methods

    private static java.awt.Image iconColor16 = null;//GEN-BEGIN:IconsDef
    private static java.awt.Image iconColor32 = null;
    private static java.awt.Image iconMono16 = null;
    private static java.awt.Image iconMono32 = null;//GEN-END:IconsDef
    private static String iconNameC16 = null;//GEN-BEGIN:Icons
    private static String iconNameC32 = null;
    private static String iconNameM16 = null;
    private static String iconNameM32 = null;//GEN-END:Icons

    private static final int defaultPropertyIndex = -1;//GEN-BEGIN:Idx
    private static final int defaultEventIndex = -1;//GEN-END:Idx

    
//GEN-FIRST:Superclass

    // Here you can add code for customizing the Superclass BeanInfo.

//GEN-LAST:Superclass
	
    /**
     * Gets the bean's <code>BeanDescriptor</code>s.
     * 
     * @return BeanDescriptor describing the editable
     * properties of this bean.  May return null if the
     * information should be obtained by automatic analysis.
     */
    public BeanDescriptor getBeanDescriptor() {
	return getBdescriptor();
    }

    /**
     * Gets the bean's <code>PropertyDescriptor</code>s.
     * 
     * @return An array of PropertyDescriptors describing the editable
     * properties supported by this bean.  May return null if the
     * information should be obtained by automatic analysis.
     * <p>
     * If a property is indexed, then its entry in the result array will
     * belong to the IndexedPropertyDescriptor subclass of PropertyDescriptor.
     * A client of getPropertyDescriptors can use "instanceof" to check
     * if a given PropertyDescriptor is an IndexedPropertyDescriptor.
     */
    public PropertyDescriptor[] getPropertyDescriptors() {
	return getPdescriptor();
    }

    /**
     * Gets the bean's <code>EventSetDescriptor</code>s.
     * 
     * @return  An array of EventSetDescriptors describing the kinds of 
     * events fired by this bean.  May return null if the information
     * should be obtained by automatic analysis.
     */
    public EventSetDescriptor[] getEventSetDescriptors() {
	return getEdescriptor();
    }

    /**
     * Gets the bean's <code>MethodDescriptor</code>s.
     * 
     * @return  An array of MethodDescriptors describing the methods 
     * implemented by this bean.  May return null if the information
     * should be obtained by automatic analysis.
     */
    public MethodDescriptor[] getMethodDescriptors() {
	return getMdescriptor();
    }

    /**
     * A bean may have a "default" property that is the property that will
     * mostly commonly be initially chosen for update by human's who are 
     * customizing the bean.
     * @return  Index of default property in the PropertyDescriptor array
     * 		returned by getPropertyDescriptors.
     * <P>	Returns -1 if there is no default property.
     */
    public int getDefaultPropertyIndex() {
        return defaultPropertyIndex;
    }

    /**
     * A bean may have a "default" event that is the event that will
     * mostly commonly be used by human's when using the bean. 
     * @return Index of default event in the EventSetDescriptor array
     *		returned by getEventSetDescriptors.
     * <P>	Returns -1 if there is no default event.
     */
    public int getDefaultEventIndex() {
        return defaultEventIndex;
    }

    /**
     * This method returns an image object that can be used to
     * represent the bean in toolboxes, toolbars, etc.   Icon images
     * will typically be GIFs, but may in future include other formats.
     * <p>
     * Beans aren't required to provide icons and may return null from
     * this method.
     * <p>
     * There are four possible flavors of icons (16x16 color,
     * 32x32 color, 16x16 mono, 32x32 mono).  If a bean choses to only
     * support a single icon we recommend supporting 16x16 color.
     * <p>
     * We recommend that icons have a "transparent" background
     * so they can be rendered onto an existing background.
     *
     * @param  iconKind  The kind of icon requested.  This should be
     *    one of the constant values ICON_COLOR_16x16, ICON_COLOR_32x32, 
     *    ICON_MONO_16x16, or ICON_MONO_32x32.
     * @return  An image object representing the requested icon.  May
     *    return null if no suitable icon is available.
     */
    public java.awt.Image getIcon(int iconKind) {
        switch ( iconKind ) {
        case ICON_COLOR_16x16:
            if ( iconNameC16 == null )
                return null;
            else {
                if( iconColor16 == null )
                    iconColor16 = loadImage( iconNameC16 );
                return iconColor16;
            }
        case ICON_COLOR_32x32:
            if ( iconNameC32 == null )
                return null;
            else {
                if( iconColor32 == null )
                    iconColor32 = loadImage( iconNameC32 );
                return iconColor32;
            }
        case ICON_MONO_16x16:
            if ( iconNameM16 == null )
                return null;
            else {
                if( iconMono16 == null )
                    iconMono16 = loadImage( iconNameM16 );
                return iconMono16;
            }
        case ICON_MONO_32x32:
            if ( iconNameM32 == null )
                return null;
            else {
                if( iconMono32 == null )
                    iconMono32 = loadImage( iconNameM32 );
                return iconMono32;
            }
	default: return null;
        }
    }

}

