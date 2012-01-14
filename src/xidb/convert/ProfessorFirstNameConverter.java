package xidb.convert;

import cayenne.DBobjects.Problem;
import cayenne.DBobjects.Professor;
import org.jdesktop.beansbinding.Converter;

/**
 *
 * @author radu
 */
public class ProfessorFirstNameConverter extends Converter {

    public String convertForward(Object someObject) {
        return ((Professor) someObject).getFirstName();
    }

    public Problem convertReverse(Object arg) {
        return null;
    }
}
