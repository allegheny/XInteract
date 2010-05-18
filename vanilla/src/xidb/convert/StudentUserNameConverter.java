package xidb.convert;

import cayenne.DBobjects.Problem;
import cayenne.DBobjects.Student;
import org.jdesktop.beansbinding.Converter;

/**
 *
 * @author radu
 */
public class StudentUserNameConverter extends Converter {

    public String convertForward(Object someObject) {
        return ((Student) someObject).getUserName();
    }

    public Problem convertReverse(Object arg) {
        return null;
    }
}