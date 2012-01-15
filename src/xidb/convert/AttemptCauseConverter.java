package xidb.convert;

import cayenne.DBobjects.Attempt;
import cayenne.DBobjects.Problem;
import org.jdesktop.beansbinding.Converter;

/**
 *
 * @author Radu Creanga <rdcrng@gmail.com>
 */
public class AttemptCauseConverter extends Converter {

    public String convertForward(Object someObject) {
        Attempt someAttempt = (Attempt) someObject;
        return someAttempt.getCause();
    }

    public Problem convertReverse(Object arg) {
        return null;
    }
}
