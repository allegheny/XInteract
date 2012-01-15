package xidb.convert;

import cayenne.DBobjects.Student;
import java.util.Collections;
import java.util.List;
import java.util.Vector;
import org.jdesktop.beansbinding.Converter;

/**
 *
 * @author Radu Creanga <rdcrng@gmail.com>
 */
public class StudentEnrollmentConverter extends Converter {

    @Override
    public List convertForward(Object someObject) {
        Vector<cayenne.DBobjects.Class> enrollment = new Vector<cayenne.DBobjects.Class>();
        Student someStudent = (Student) someObject;
        if (!someStudent.isUserSentinel()) {
            for (Object obj : someStudent.getEnrollment()) {
                enrollment.add((cayenne.DBobjects.Class) obj);
                Collections.sort(enrollment);
            }
        }
        return enrollment;
    }

    @Override
    public Object convertReverse(Object arg0) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
