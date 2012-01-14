package xidb.convert;

import cayenne.DBobjects.Problem;
import dynamic.CodeRunner;
import org.jdesktop.beansbinding.Converter;

/**
 *
 * @author radu
 */
public class ProblemLowerCodeConverter extends Converter {

    public String convertForward(Object someObject) {
        Problem someProblem = (Problem) someObject;
        String code = someProblem.getCode();
        return (someProblem.isSentinel()) ? someProblem.getLowerCode() :
            code.substring(code.indexOf(CodeRunner.PLACEHOLDER) + CodeRunner.PLACEHOLDER.length());
    }

    public Problem convertReverse(Object arg) {
        return null;
    }
}
