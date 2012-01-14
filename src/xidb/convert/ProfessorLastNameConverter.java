package xidb.convert;

import cayenne.DBobjects.Problem;
import cayenne.DBobjects.Professor;
import org.jdesktop.beansbinding.Converter;

/**
 *
 * @author radu
 */
public class ProfessorLastNameConverter extends Converter {

    public String convertForward(Object someObject) {
        return ((Professor) someObject).getLastName();
    }

    public Problem convertReverse(Object arg) {
        return null;
    }
}
