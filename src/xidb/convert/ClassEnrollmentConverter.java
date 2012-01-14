package xidb.convert;

import cayenne.DBobjects.Problem;
import cayenne.DBobjects.Student;
import java.util.Collections;
import java.util.List;
import java.util.Vector;
import org.jdesktop.beansbinding.Converter;

/**
 *
 * @author radu
 */
public class ClassEnrollmentConverter extends Converter {

    public List convertForward(Object someObject) {
        Vector<Student> enrollment = new Vector<Student>();
        cayenne.DBobjects.Class someClass = (cayenne.DBobjects.Class) someObject;
        if (!someClass.isSentinel()) {
            for (Object obj : someClass.getStudents()) {
                enrollment.add((Student) obj);
            }
        }
        Collections.sort(enrollment);
        return enrollment;
    }

    public Problem convertReverse(Object arg) {
        return null;
    }
}
