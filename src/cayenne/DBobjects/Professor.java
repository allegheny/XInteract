package cayenne.DBobjects;

import cayenne.DBobjects.auto._Professor;

public class Professor extends _Professor implements Comparable<Professor> {

    private boolean sentinel = false;
    private boolean authorSentinel = false;
    private static final String problemToString = "[CHOOSE PROFESSOR]";
    private static final String toString = "[ADD NEW PROFESSOR]";
    private static final String firstName = "[ENTER PROFESSOR FIRST NAME]";
    private static final String lastName = "[ENTER PROFESSOR LAST NAME]";
    private static final String userName = "[CLICK TO GENERATE]";

    @Override
    public String getFirstName() {
        return (sentinel) ? firstName : super.getFirstName();
    }

    @Override
    public String getLastName() {
        return (sentinel) ? lastName : super.getLastName();
    }

    @Override
    public String getUserName() {
        return (sentinel) ? userName : super.getUserName();
    }

    public boolean isSentinel() {
        return sentinel;
    }

    public void setSentinel() {
        sentinel = true;
    }

    public boolean isAuthorSentinel() {
        return authorSentinel;
    }

    public void setAuthorSentinel() {
        authorSentinel = true;
    }

    @Override
    public String toString() {
        if (authorSentinel) return problemToString;
        return (sentinel) ? toString : getFirstName() + " " + getLastName();
    }

    public int compareTo(Professor someProfessor) {
        if (sentinel || authorSentinel || someProfessor.isSentinel() || someProfessor.isAuthorSentinel()) return Integer.MIN_VALUE;
        int i = getLastName().compareTo(someProfessor.getLastName());
        if (i == 0) {
            return getFirstName().compareTo(someProfessor.getFirstName());
        }
        return i;
    }
}



