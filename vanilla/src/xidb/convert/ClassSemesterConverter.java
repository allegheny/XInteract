package xidb.convert;

import cayenne.DBobjects.Problem;
import org.jdesktop.beansbinding.Converter;

/**
 *
 * @author radu
 */
public class ClassSemesterConverter extends Converter {

    public String convertForward(Object someObject) {
        return ((cayenne.DBobjects.Class) someObject).getSemester();
    }

    public Problem convertReverse(Object arg) {
        return null;
    }
}