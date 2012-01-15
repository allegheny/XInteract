package xidb.convert;

import cayenne.DBobjects.Problem;
import cayenne.DBobjects.Professor;
import org.jdesktop.beansbinding.Converter;

/**
 *
 * @author Radu Creanga <rdcrng@gmail.com>
 */
public class ProblemAuthorConverter extends Converter {

    public Professor convertForward(Object someObject) {
        Problem someProblem = (Problem) someObject;
        return someProblem.getAuthor();
    }

    public Problem convertReverse(Object arg) {
        return null;
    }
}
