package xidb.convert;

import cayenne.DBobjects.Problem;
import dynamic.CodeRunner;
import org.jdesktop.beansbinding.Converter;

/**
 *
 * @author Radu Creanga <rdcrng@gmail.com>
 */
public class ProblemUpperCodeConverter extends Converter {

    public String convertForward(Object someObject) {
        Problem someProblem = (Problem) someObject;
        String code = someProblem.getCode();
        return (someProblem.isSentinel()) ? someProblem.getUpperCode() :
            code.substring(0, code.indexOf(CodeRunner.PLACEHOLDER));
    }

    public Problem convertReverse(Object arg) {
        return null;
    }
}
