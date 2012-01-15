package xidb.convert;

import cayenne.DBobjects.Category;
import cayenne.DBobjects.Problem;
import org.jdesktop.beansbinding.Converter;

/**
 *
 * @author Radu Creanga <rdcrng@gmail.com>
 */
public class CategoryNameConverter extends Converter {

    public String convertForward(Object someObject) {
        return ((Category) someObject).getName();
    }

    public Problem convertReverse(Object arg) {
        return null;
    }
}
