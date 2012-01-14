package xidb.convert;

import cayenne.DBobjects.Category;
import cayenne.DBobjects.Problem;
import java.util.List;
import org.jdesktop.beansbinding.Converter;

/**
 *
 * @author radu
 */
public class CategoryProblemConverter extends Converter {

    public List convertForward(Object someObject) {
        return ((Category) someObject).getProblems();
    }

    public Problem convertReverse(Object arg) {
        return null;
    }
}