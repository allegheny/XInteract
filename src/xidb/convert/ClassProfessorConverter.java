package xidb.convert;

import cayenne.DBobjects.Problem;
import cayenne.DBobjects.Professor;
import org.jdesktop.beansbinding.Converter;

/**
 *
 * @author Radu Creanga <rdcrng@gmail.com>
 */
public class ClassProfessorConverter extends Converter {

    public Professor convertForward(Object someObject) {
        return ((cayenne.DBobjects.Class) someObject).getProfessor();
    }

    public Problem convertReverse(Object arg) {
        return null;
    }
}
