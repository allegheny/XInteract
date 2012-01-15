package xidb.convert;

import cayenne.DBobjects.Problem;
import java.util.List;
import org.jdesktop.beansbinding.Converter;

/**
 *
 * @author Radu Creanga <rdcrng@gmail.com>
 */
public class ProblemAttemptConverter extends Converter {

    public List convertForward(Object someObject) {
        Problem someProblem = (Problem) someObject;
        return someProblem.getAttempt();
    }

    public Problem convertReverse(Object arg) {
        return null;
    }
}
