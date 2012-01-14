package xidb.convert;

import cayenne.DBobjects.Problem;
import cayenne.DBobjects.Student;
import org.jdesktop.beansbinding.Converter;

/**
 *
 * @author radu
 */
public class StudentLastNameConverter extends Converter {

    public String convertForward(Object someObject) {
        return ((Student) someObject).getLastName();
    }

    public Problem convertReverse(Object arg) {
        return null;
    }
}
