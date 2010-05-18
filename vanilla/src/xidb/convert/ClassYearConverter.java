package xidb.convert;

import cayenne.DBobjects.Problem;
import org.jdesktop.beansbinding.Converter;

/**
 *
 * @author radu
 */
public class ClassYearConverter extends Converter {

    public String convertForward(Object someObject) {
        cayenne.DBobjects.Class someClass = (cayenne.DBobjects.Class) someObject;
        if (someClass.isSentinel()) {
            return someClass.getYearString();
        }
        Integer year = someClass.getYearTaught();
        return (year == null) ? "" : year.toString();
    }

    public Problem convertReverse(Object arg) {
        return null;
    }
}
