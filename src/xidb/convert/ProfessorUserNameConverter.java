package xidb.convert;

import cayenne.DBobjects.Professor;
import org.jdesktop.beansbinding.Converter;

/**
 *
 * @author erik
 */
public class ProfessorUserNameConverter extends Converter {

    @Override
    public Object convertForward(Object arg0) {
        return ((Professor)arg0).getUserName();
    }

    @Override
    public Object convertReverse(Object arg0) {
        throw new UnsupportedOperationException("Not supported yet.");
    }


}
