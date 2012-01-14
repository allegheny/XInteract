package xidb;

import cayenne.DBobjects.Student;
import cayenne.DBobjects.Problem;
import cayenne.DBobjects.Attempt;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.List;
import java.util.Vector;

/**
 *
 * @author radu
 */
public class AttemptController implements Serializable {

    private PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);
    public static final String PROP_PROBLEM = "problem";
    public static final String PROP_STUDENT = "student";
    public static final String PROP_ATTEMPTS = "attempts";
    private Problem problem;
    private Student student;
    protected Vector<Attempt> attempts;

    public AttemptController() {
        problem = null;
        student = null;
        attempts = null;
    }

    public Problem getProblem() {
        return problem;
    }

    public void setProblem(Problem problem) {
        Problem oldProblem = this.problem;
        this.problem = problem;
        if (this.problem != null && this.student != null) {
            Vector<Attempt> problemAttempts = new Vector<Attempt>();
            Vector<Attempt> studentAttempts = new Vector<Attempt>();
            Vector<Attempt> neededAttempts = new Vector<Attempt>();
            problemAttempts.addAll(this.problem.getAttempt());
            studentAttempts.addAll(this.student.getHistory());
            for (Attempt someAttempt : problemAttempts) {
                if (studentAttempts.contains(someAttempt)) {
                    neededAttempts.add(someAttempt);
                }
            }
            setAttempts(neededAttempts);
        }
        propertyChangeSupport.firePropertyChange(PROP_PROBLEM, oldProblem, problem);
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        Student oldStudent = this.student;
        this.student = student;
        if (this.problem != null && this.student != null) {
            Vector<Attempt> problemAttempts = new Vector<Attempt>();
            Vector<Attempt> studentAttempts = new Vector<Attempt>();
            Vector<Attempt> neededAttempts = new Vector<Attempt>();
            problemAttempts.addAll(this.problem.getAttempt());
            studentAttempts.addAll(this.student.getHistory());
            for (Attempt someAttempt : problemAttempts) {
                if (studentAttempts.contains(someAttempt)) {
                    neededAttempts.add(someAttempt);
                }
            }
            setAttempts(neededAttempts);
        }
        propertyChangeSupport.firePropertyChange(PROP_STUDENT, oldStudent, student);
    }

    public List getAttempts() {
        return attempts;
    }

    public void setAttempts(List attempts) {
        List oldAttempts = this.attempts;
        this.attempts = new Vector<Attempt>();
        this.attempts.addAll(attempts);
        propertyChangeSupport.firePropertyChange(PROP_ATTEMPTS, oldAttempts, attempts);
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.removePropertyChangeListener(listener);
    }
}
