package xidb.convert;

import cayenne.DBobjects.Problem;
import org.jdesktop.beansbinding.Converter;

/**
 *
 * @author Radu Creanga <rdcrng@gmail.com>
 */
public class ProblemInputConverter extends Converter {

    public String convertForward(Object someObject) {
        Problem someProblem = (Problem) someObject;
        return someProblem.getInputData();
    }

    public Problem convertReverse(Object arg) {
        return null;
    }
}
