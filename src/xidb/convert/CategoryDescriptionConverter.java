package xidb.convert;

import cayenne.DBobjects.Category;
import cayenne.DBobjects.Problem;
import org.jdesktop.beansbinding.Converter;

/**
 *
 * @author Radu Creanga <rdcrng@gmail.com>
 */
public class CategoryDescriptionConverter extends Converter {

    public String convertForward(Object someObject) {
        return ((Category) someObject).getDescription();
    }

    public Problem convertReverse(Object arg) {
        return null;
    }
}
