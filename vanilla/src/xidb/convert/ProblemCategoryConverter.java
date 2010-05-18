package xidb.convert;

import cayenne.DBobjects.Category;
import cayenne.DBobjects.Problem;
import org.jdesktop.beansbinding.Converter;

/**
 *
 * @author radu
 */
public class ProblemCategoryConverter extends Converter {

    public Category convertForward(Object someObject) {
        Problem someProblem = (Problem) someObject;
        return someProblem.getCategory();
    }

    public Object convertReverse(Object arg) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
