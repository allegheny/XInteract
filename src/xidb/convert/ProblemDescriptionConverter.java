package xidb.convert;

import cayenne.DBobjects.Problem;
import org.jdesktop.beansbinding.Converter;

/**
 *
 * @author radu
 */
public class ProblemDescriptionConverter extends Converter {

    public String convertForward(Object someObject) {
        Problem someProblem = (Problem) someObject;
        return someProblem.getDescription();
    }

    public Problem convertReverse(Object arg) {
        return null;
    }
}
