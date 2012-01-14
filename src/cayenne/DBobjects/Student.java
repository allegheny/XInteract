package cayenne.DBobjects;

import cayenne.DBobjects.auto._Student;

public class Student extends _Student implements Comparable<Student> {

    private boolean sentinel = false;
    private boolean userSentinel = false;
    private static final String toString = "[ADD NEW STUDENT]";
    private static final String firstName = "[ENTER STUDENT FIRST NAME]";
    private static final String lastName = "[ENTER STUDENT LAST NAME]";
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

    public boolean isUserSentinel() {
        return userSentinel;
    }

    public void setUserSentinel(boolean userSentinel) {
        this.userSentinel = userSentinel;
    }

    @Override
    public String toString() {
        return (sentinel) ? toString : getFirstName() + " " + getLastName();
    }

    public int compareTo(Student someStudent) {
        if (sentinel) {
            return Integer.MIN_VALUE;
        }
        int i = getLastName().compareTo(someStudent.getLastName());
        if (i == 0) {
            return getFirstName().compareTo(someStudent.getFirstName());
        }
        return i;
    }
}



