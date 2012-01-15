package xidb.convert;

import cayenne.DBobjects.Problem;
import java.util.Collections;
import java.util.List;
import java.util.Vector;
import org.jdesktop.beansbinding.Converter;

/**
 *
 * @author Radu Creanga <rdcrng@gmail.com>
 */
public class ClassAssignmentsConverter extends Converter {

    public List convertForward(Object someObject) {
        Vector<Problem> assignments = new Vector<Problem>();
        cayenne.DBobjects.Class someClass = (cayenne.DBobjects.Class) someObject;
        if (!someClass.isSentinel()) {
            for (Object obj : someClass.getProblems()) {
                assignments.add((Problem) obj);
            }
        }
        Collections.sort(assignments);
        return assignments;
    }

    public Problem convertReverse(Object arg) {
        return null;
    }
}
