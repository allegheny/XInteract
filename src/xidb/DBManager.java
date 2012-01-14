package xidb;

import java.io.Serializable;
import java.beans.*;
import java.util.List;
import java.util.Vector;
import cayenne.DBobjects.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import org.apache.cayenne.access.DataContext;
import org.apache.cayenne.exp.Expression;
import org.apache.cayenne.query.SelectQuery;
import professorGUI.LogInCondition;

/**
 *
 * @author radu
 */
public class DBManager implements Serializable {

    DataContext dataContext;
    //private CayenneContext dataContext;
    private boolean initializedSPC;
    private boolean initializedProblems;
    private boolean initializedClasses;
    private boolean initializedConfig;
    private boolean initializedAttempts;
    private boolean contextInitialized;
    transient private PropertyChangeSupport propertyChangeSupport;
    transient private List<Problem> problems;
    transient private List<Category> categories;
    transient private List<Professor> professors;
    transient private List<Student> students;
    transient private List<cayenne.DBobjects.Class> classes;
    transient private Student studentUser;
    transient private Professor professorUser;
    public static final String PROP_PROBLEMS = "problems";
    public static final String PROP_CATEGORIES = "categories";
    public static final String PROP_PROFESSORS = "professors";
    public static final String PROP_STUDENTS = "students";
    public static final String PROP_CLASSES = "classes";
    public static final String PROP_STUDENTUSER = "studentUser";
    public static final String PROP_PROFESSORUSER = "professorUser";
    private Category categorySentinel;
    private Student studentSentinel;
    private Professor professorSentinel;
    private Problem problemSentinel;
    private cayenne.DBobjects.Class classSentinel;

    public DBManager() {
        contextInitialized = initializedSPC = initializedProblems = initializedClasses = false;
        problems = new Vector<Problem>();
        categories = new Vector<Category>();
        professors = new Vector<Professor>();
        students = new Vector<Student>();
        classes = new Vector<cayenne.DBobjects.Class>();
        studentUser = null;
        professorUser = null;
        categorySentinel = new Category();
        categorySentinel.setSentinel();
        studentSentinel = new Student();
        studentSentinel.setSentinel();
        professorSentinel = new Professor();
        professorSentinel.setSentinel();
        problemSentinel = new Problem();
        problemSentinel.setSentinel();
        classSentinel = new cayenne.DBobjects.Class();
        classSentinel.setSentinel();
        propertyChangeSupport = new PropertyChangeSupport(this);
    }

    public LogInCondition logInProfessor(String username, String password) {
        if (!contextInitialized) {
            dataContext = DataContext.createDataContext();
        }
        if (username.compareTo("root") == 0 && password.compareTo("super") == 0) {
            return LogInCondition.JACKALOPE;
        }
        Expression exp = Expression.fromString("userName = '" + username + "'");
        SelectQuery select = new SelectQuery(Professor.class, exp);
        Vector<Professor> professorList = new Vector<Professor>(dataContext.performQuery(select));
        if (professorList.size() < 1) {
            return LogInCondition.INVALID_CREDENTIALS;
        } else if (professorList.size() > 1) {
            return LogInCondition.MORE_THAN_ONE;
        } else {
            professorUser = professorList.get(0);
            if (password.compareTo(professorUser.getPassword()) == 0) {
                return LogInCondition.PROFESSOR;
            } else {
                professorUser = null;
                return LogInCondition.INVALID_CREDENTIALS;
            }
        }
    }

    public LogInCondition logInStudent(String username, String password) {
        if (!contextInitialized) {
            dataContext = DataContext.createDataContext();
        }
        Expression exp = Expression.fromString("userName = '" + username + "'");
        SelectQuery select = new SelectQuery(Student.class, exp);
        Vector<Student> studentList = new Vector<Student>(dataContext.performQuery(select));
        if (studentList.size() < 1) {
            return LogInCondition.INVALID_CREDENTIALS;
        } else if (studentList.size() > 1) {
            return LogInCondition.MORE_THAN_ONE;
        } else {
            studentUser = studentList.get(0);
            if (password.compareTo(studentUser.getPassword()) == 0) {
                return LogInCondition.STUDENT;
            } else {
                studentUser = null;
                return LogInCondition.INVALID_CREDENTIALS;
            }
        }
    }

    public void initializeSPC() {
        SelectQuery select;
        select = new SelectQuery(Student.class);
        setStudents(new Vector<Student>(dataContext.performQuery(select)));
        select = new SelectQuery(Professor.class);
        setProfessors(new Vector<Professor>(dataContext.performQuery(select)));
        select = new SelectQuery(Category.class);
        setCategories(new Vector<Category>(dataContext.performQuery(select)));
    }

    public void initializeConfig() {
        SelectQuery select;
        select = new SelectQuery(Student.class);
        setStudents(new Vector<Student>(dataContext.performQuery(select)));
    //Will need to init DBOptions as well when they are implemented
    }

    public void initializeProblems() {
        SelectQuery select;
        select = new SelectQuery(Problem.class);
        setProblems(new Vector<Problem>(dataContext.performQuery(select)));
    }

    public void initializeAttempts() {
        SelectQuery select;
        select = new SelectQuery(cayenne.DBobjects.Class.class);
        setClasses(new Vector<cayenne.DBobjects.Class>(dataContext.performQuery(select)));
        select = new SelectQuery(Problem.class);
        setProblems(new Vector<Problem>(dataContext.performQuery(select)));
        select = new SelectQuery(Student.class);
        setStudents(new Vector<Student>(dataContext.performQuery(select)));
    }

    public void initializeClasses() {
        SelectQuery select;
        select = new SelectQuery(cayenne.DBobjects.Class.class);
        setClasses(new Vector<cayenne.DBobjects.Class>(dataContext.performQuery(select)));
    }

    public boolean isInitializedClasses() {
        return initializedClasses;
    }

    public void setInitializedClasses(boolean initializedClasses) {
        this.initializedClasses = initializedClasses;
    }

    public boolean isInitializedProblems() {
        return initializedProblems;
    }

    public void setInitializedProblems(boolean initializedProblems) {
        this.initializedProblems = initializedProblems;
    }

    public boolean isInitializedSPC() {
        return initializedSPC;
    }

    public void setInitializedSPC(boolean initializedSPC) {
        this.initializedSPC = initializedSPC;
    }

    public Professor getProfessorUser() {
        return professorUser;
    }

    public void setProfessorUser(Professor professorUser) {
        this.professorUser = professorUser;
    }

    public Student getStudentUser() {
        return studentUser;
    }

    public void setStudentUser(Student newStudent) {
        Student oldStudent = studentUser;
        studentUser = newStudent;
        propertyChangeSupport.firePropertyChange(PROP_STUDENTUSER, oldStudent, newStudent);
    }

    public List getProblems() {
        return problems;
    }

    public void setProblems(List newList) {
        List oldList = problems;
        Collections.sort(newList);
        problems = newList;
        propertyChangeSupport.firePropertyChange(PROP_PROBLEMS, oldList, newList);
    }

    public List getCategories() {
        return categories;
    }

    public void setCategories(List newList) {
        List oldList = categories;
        Collections.sort(newList);
        categories = newList;
        propertyChangeSupport.firePropertyChange(PROP_CATEGORIES, oldList, newList);
    }

    public List getProfessors() {
        return professors;
    }

    public void setProfessors(List newList) {
        List oldList = professors;
        Collections.sort(newList);
        professors = newList;
        propertyChangeSupport.firePropertyChange(PROP_PROFESSORS, oldList, newList);
    }

    public List getStudents() {
        return students;
    }

    public void setStudents(List newList) {
        List oldList = students;
        Collections.sort(newList);
        students = newList;
        propertyChangeSupport.firePropertyChange(PROP_STUDENTS, oldList, newList);
    }

    public List getClasses() {
        return classes;
    }

    public void setClasses(List newList) {
        List oldList = classes;
        Collections.sort(newList);
        classes = newList;
        propertyChangeSupport.firePropertyChange(PROP_CLASSES, oldList, newList);
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.removePropertyChangeListener(listener);
    }

    public Category createCategory(String name, String description) {
        Category newCategory = (Category) dataContext.newObject(Category.class);
        newCategory.setName(name);
        newCategory.setDescription(description);
        dataContext.commitChanges();
        List<Category> newList = new Vector<Category>(categories);
        newList.add(newCategory);
        setCategories(newList);
        return newCategory;
    }

    public Problem createProblem(
            String name,
            Professor author,
            Category category,
            String description,
            String code,
            String inputData,
            String outputData) {
        Problem newProblem = (Problem) dataContext.newObject(Problem.class);
        newProblem.setAtributes(name, author, category, description, code, inputData, outputData);
        dataContext.commitChanges();
        List<Problem> newList = new Vector<Problem>(problems);
        newList.add(newProblem);
        setProblems(newList);
        return newProblem;
    }

    public Professor createProfessor(String firstName, String lastName, String userName) {
        Professor newProfessor = (Professor) dataContext.newObject(Professor.class);
        newProfessor.setFirstName(firstName);
        newProfessor.setLastName(lastName);
        newProfessor.setUserName(userName);
        newProfessor.setPassword("");
        dataContext.commitChanges();
        List<Professor> newList = new Vector<Professor>(professors);
        newList.add(newProfessor);
        setProfessors(newList);
        return newProfessor;
    }

    public Student createStudent(String firstName, String lastName, String userName) {
        Student newStudent = (Student) dataContext.newObject(Student.class);
        newStudent.setFirstName(firstName);
        newStudent.setLastName(lastName);
        newStudent.setUserName(userName);
        newStudent.setPassword("");
        dataContext.commitChanges();
        List<Student> newList = new Vector<Student>(students);
        newList.add(newStudent);
        setStudents(newList);
        return newStudent;
    }

    public cayenne.DBobjects.Class createClass(String title, String semester, Integer year, Professor professor) {
        cayenne.DBobjects.Class newClass = (cayenne.DBobjects.Class) dataContext.newObject(cayenne.DBobjects.Class.class);
        newClass.setTitle(title);
        newClass.setSemester(semester);
        newClass.setYearTaught(year);
        newClass.setProfessor(professor);
        dataContext.commitChanges();
        List<cayenne.DBobjects.Class> newList = new Vector<cayenne.DBobjects.Class>(classes);
        newList.add(newClass);
        setClasses(newList);
        return newClass;
    }

    public Category editCategory(Category someCategory, String name, String description) {
        someCategory.setName(name);
        someCategory.setDescription(description);
        dataContext.commitChanges();
        setCategories(new Vector<Category>(categories));
        return someCategory;
    }

    public Problem editProblem(
            Problem someProblem,
            String name,
            Professor author,
            Category category,
            String description,
            String code,
            String input,
            String output) {
        someProblem.setAtributes(name, author, category, description, code, input, output);
        dataContext.commitChanges();
        setProblems(new Vector<Problem>(problems));
        return someProblem;
    }

    public Professor editProfessor(Professor someProfessor, String firstName, String lastName, String userName) {
        someProfessor.setFirstName(firstName);
        someProfessor.setLastName(lastName);
        someProfessor.setUserName(userName);
        dataContext.commitChanges();
        setProfessors(new Vector<Professor>(professors));
        return someProfessor;
    }

    public Student editStudent(Student someStudent, String firstName, String lastName, String userName) {
        someStudent.setFirstName(firstName);
        someStudent.setLastName(lastName);
        someStudent.setUserName(userName);
        dataContext.commitChanges();
        setStudents(new Vector<Student>(students));
        return someStudent;
    }

    public cayenne.DBobjects.Class editClass(cayenne.DBobjects.Class someClass, String title, String semester, Integer year, Professor professor) {
        someClass.setTitle(title);
        someClass.setSemester(semester);
        someClass.setYearTaught(year);
        someClass.setProfessor(professor);
        dataContext.commitChanges();
        setClasses(new Vector<cayenne.DBobjects.Class>(classes));
        return someClass;
    }

    public void deleteCategory(Category someCategory) {
        List<Category> newList = new Vector<Category>(categories);
        newList.remove(someCategory);
        dataContext.deleteObject(someCategory);
        dataContext.commitChanges();
        setCategories(newList);
    }

    public void deleteProblem(Problem someProblem) {
        List<Problem> newList = new Vector<Problem>(problems);
        newList.remove(someProblem);
        dataContext.deleteObject(someProblem);
        dataContext.commitChanges();
        setProblems(newList);
    }

    public void deleteProfessor(Professor someProfessor) {
        List<Professor> newList = new Vector<Professor>(professors);
        newList.remove(someProfessor);
        dataContext.deleteObject(someProfessor);
        dataContext.commitChanges();
        setProfessors(newList);
    }

    public void deleteStudent(Student someStudent) {
        List<Student> newList = new Vector<Student>(students);
        newList.remove(someStudent);
        dataContext.deleteObject(someStudent);
        dataContext.commitChanges();
        setStudents(newList);
    }

    public void deleteClass(cayenne.DBobjects.Class someClass) {
        List<cayenne.DBobjects.Class> newList = new Vector<cayenne.DBobjects.Class>(classes);
        newList.remove(someClass);
        dataContext.deleteObject(someClass);
        dataContext.commitChanges();
        setClasses(newList);
    }

    public void addCategorySentinel() {
        if (!categories.contains(categorySentinel)) {
            List<Category> newList = new Vector<Category>();
            newList.add(categorySentinel);
            newList.addAll(categories);
            setCategories(newList);
        }
    }

    public void removeCategorySentinel() {
        List<Category> newList = new Vector<Category>(categories);
        newList.remove(categorySentinel);
        setCategories(newList);
    }

    public void addStudentSentinel() {
        if (!students.contains(studentSentinel)) {
            List<Student> newList = new Vector<Student>();
            newList.add(studentSentinel);
            newList.addAll(students);
            setStudents(newList);
        }
    }

    public void removeStudentSentinel() {
        List<Student> newList = new Vector<Student>(students);
        newList.remove(studentSentinel);
        setStudents(newList);
    }

    public void addProfessorSentinel() {
        if (!professors.contains(professorSentinel)) {
            List<Professor> newList = new Vector<Professor>();
            newList.add(professorSentinel);
            newList.addAll(professors);
            setProfessors(newList);
        }
    }

    public void removeProfessorSentinel() {
        List<Professor> newList = new Vector<Professor>(professors);
        newList.remove(professorSentinel);
        setProfessors(newList);
    }

    public void addProblemSentinel() {
        if (!problems.contains(problemSentinel)) {
            List<Problem> newList = new Vector<Problem>();
            newList.add(problemSentinel);
            newList.addAll(problems);
            setProblems(newList);
        }
    }

    public void removeProblemSentinel() {
        List<Problem> newList = new Vector<Problem>(problems);
        newList.remove(problemSentinel);
        setProblems(newList);
    }

    public void addProblemCategorySentinel() {
        if (!categories.contains(problemSentinel.getCategory())) {
            List<Category> newList = new Vector<Category>();
            newList.add(problemSentinel.getCategory());
            newList.addAll(categories);
            setCategories(newList);
        }
    }

    public void removeProblemCategorySentinel() {
        List<Category> newList = new Vector<Category>(categories);
        newList.remove(problemSentinel.getCategory());
        setCategories(newList);
    }

    public void addProblemProfessorSentinel() {
        if (!professors.contains(problemSentinel.getAuthor())) {
            List<Professor> newList = new Vector<Professor>();
            newList.add(problemSentinel.getAuthor());
            newList.addAll(professors);
            setProfessors(newList);
        }
    }

    public void removeProblemProfessorSentinel() {
        List<Professor> newList = new Vector<Professor>(professors);
        newList.remove(problemSentinel.getAuthor());
        setProfessors(newList);
    }

    public void addClassSentinel() {
        if (!classes.contains(classSentinel)) {
            List<cayenne.DBobjects.Class> newList = new Vector<cayenne.DBobjects.Class>();
            newList.add(classSentinel);
            newList.addAll(classes);
            setClasses(newList);
        }
    }

    public void removeClassSentinel() {
        List<cayenne.DBobjects.Class> newList = new Vector<cayenne.DBobjects.Class>(classes);
        newList.remove(classSentinel);
        setClasses(newList);
    }

    public void addClassProfessorSentinel() {
        if (!professors.contains(classSentinel.getProfessor())) {
            List<Professor> newList = new Vector<Professor>();
            newList.add(classSentinel.getProfessor());
            newList.addAll(professors);
            setProfessors(newList);
        }
    }

    public void removeClassProfessorSentinel() {
        List<Professor> newList = new Vector<Professor>(professors);
        newList.remove(classSentinel.getProfessor());
        setProfessors(newList);
    }

    public cayenne.DBobjects.Class assignProblems(cayenne.DBobjects.Class someClass, List someList) {
        for (Object someObject : someList) {
            someClass.addToProblems((Problem) someObject);
        }
        dataContext.commitChanges();
        return someClass;
    }

    public cayenne.DBobjects.Class removeProblems(cayenne.DBobjects.Class someClass, List someList) {
        for (Object someObject : someList) {
            someClass.removeFromProblems((Problem) someObject);
        }
        dataContext.commitChanges();
        return someClass;
    }

    public cayenne.DBobjects.Class enrollStudents(cayenne.DBobjects.Class someClass, List someList) {
        for (Object someObject : someList) {
            someClass.addToStudents((Student) someObject);
        }
        dataContext.commitChanges();
        return someClass;
    }

    public cayenne.DBobjects.Class removeStudents(cayenne.DBobjects.Class someClass, List someList) {
        for (Object someObject : someList) {
            someClass.removeFromStudents((Student) someObject);
        }
        dataContext.commitChanges();
        return someClass;
    }

    public Attempt createAttempt(Date date, String studentCode, String cause, Student student, Problem problem) {
        Attempt newAttempt = (Attempt) dataContext.newObject(Attempt.class);
        newAttempt.setDate(date);
        newAttempt.setStudentCode(studentCode);
        newAttempt.setCause(cause);
        newAttempt.setStudent(student);
        newAttempt.setProblem(problem);
        dataContext.commitChanges();
        return newAttempt;
    }

    public boolean changeProfessorPassword(char[] current, char[] changed) {
        if (Arrays.equals(professorUser.getPassword().toCharArray(), current)) {
            professorUser.setPassword(new String(changed));
            dataContext.commitChanges();
            return true;
        } else {
            return false;
        }
    }

    public boolean changeStudentPassword(char[] current, char[] changed) {
        if (Arrays.equals(studentUser.getPassword().toCharArray(), current)) {
            studentUser.setPassword(new String(changed));
            dataContext.commitChanges();
            return true;
        } else {
            return false;
        }
    }

    public void resetStudentPassword(Student stud) {
        stud.setPassword("");
        dataContext.commitChanges();
    }

    public boolean isInitializedConfig() {
        return initializedConfig;
    }

    public void setInitializedConfig(boolean initializedConfig) {
        this.initializedConfig = initializedConfig;
    }

    /**
     * @return the initializedAttempts
     */
    public boolean isInitializedAttempts() {
        return initializedAttempts;
    }

    /**
     * @param initializedAttempts the initializedAttempts to set
     */
    public void setInitializedAttempts(boolean initializedAttempts) {
        this.initializedAttempts = initializedAttempts;
    }
}
