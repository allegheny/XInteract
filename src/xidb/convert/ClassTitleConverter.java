package xidb.convert;

import cayenne.DBobjects.Problem;
import org.jdesktop.beansbinding.Converter;

/**
 *
 * @author Radu Creanga <rdcrng@gmail.com>
 */
public class ClassTitleConverter extends Converter {

    public String convertForward(Object someObject) {
        return ((cayenne.DBobjects.Class) someObject).getTitle();
    }

    public Problem convertReverse(Object arg) {
        return null;
    }
}
