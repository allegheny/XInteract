package cayenne.DBobjects;

import cayenne.DBobjects.auto._Class;

/**
 *
 * @author Radu Creanga <rdcrng@gmail.com>
 */
public class Class extends _Class implements Comparable<cayenne.DBobjects.Class> {

    private boolean sentinel = false;
    private static final String toString = "[CREATE NEW CLASS]";
    private static final String title = "[ENTER CLASS TITLE]";
    private static final String semester = "[ENTER CLASS SEMESTER]";
    private static final String year = "[ENTER CLASS YEAR]";
    private static final Professor professor = new Professor();

    @Override
    public Professor getProfessor() {
        return (sentinel) ? professor : super.getProfessor();
    }

    @Override
    public String getSemester() {
        return (sentinel) ? semester : super.getSemester();
    }

    @Override
    public String getTitle() {
        return (sentinel) ? title : super.getTitle();
    }

    @Override
    public Integer getYearTaught() {
        return super.getYearTaught();
    }

    public String getYearString() {
        return year;
    }

    public boolean isSentinel() {
        return sentinel;
    }

    public void setSentinel() {
        sentinel = true;
        professor.setAuthorSentinel();
    }

    @Override
    public String toString() {
        return (sentinel) ? toString : getTitle() + " " + getSemester() + " " + getYearTaught();
    }

    public int compareTo(cayenne.DBobjects.Class c) {
        if (sentinel) {
            return Integer.MIN_VALUE;
        }
        int i = getYearTaught().compareTo(c.getYearTaught());
        if (i == 0) {
            return getTitle().compareTo(c.getTitle());
        }
        return i;
    }
}



