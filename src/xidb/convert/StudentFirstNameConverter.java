package xidb.convert;

import cayenne.DBobjects.Problem;
import cayenne.DBobjects.Student;
import org.jdesktop.beansbinding.Converter;

/**
 *
 * @author Radu Creanga <rdcrng@gmail.com>
 */
public class StudentFirstNameConverter extends Converter {

    public String convertForward(Object someObject) {
        return ((Student) someObject).getFirstName();
    }

    public Problem convertReverse(Object arg) {
        return null;
    }
}











