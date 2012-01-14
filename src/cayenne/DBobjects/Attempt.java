package cayenne.DBobjects;

import cayenne.DBobjects.auto._Attempt;

public class Attempt extends _Attempt implements Comparable<cayenne.DBobjects.Attempt> {

    @Override
    public String toString() {
        return getDate().toString() + "    " +
                getStudent().toString() + "    " +
                getProblem().toString();
    }

    public int compareTo(Attempt someAttempt) {
        int i = getProblem().compareTo(someAttempt.getProblem());
        if (i == 0) {
            return getDate().compareTo(someAttempt.getDate());
        } else {
            return i;
        }

    }
}



