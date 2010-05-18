package cayenne.DBobjects;

import cayenne.DBobjects.auto._Problem;

public class Problem extends _Problem implements Comparable<Problem> {

    private boolean sentinel = false;
    private static final String toString = "[CREATE NEW PROBLEM]";
    private static final String name = "[ENTER PROBLEM NAME]";
    private static final Category category = new Category();
    private static final Professor author = new Professor();
    private static final String description = "[ENTER PROBLEM DESCRIPTION]";
    private static final String upperCode = "[ENTER PROBLEM UPPER CODE]";
    private static final String lowerCode = "[ENTER PROBLEM LOWER CODE]";
    private static final String inputs = "[ENTER PROBLEM INPUTS (OPTIONAL)]";
    private static final String outputs = "[ENTER PROBLEM OUTPUTS (OPTIONAL)]";

    @Override
    public Professor getAuthor() {
        return (sentinel) ? author : super.getAuthor();
    }

    @Override
    public Category getCategory() {
        return (sentinel) ? category : super.getCategory();
    }

    @Override
    public String getDescription() {
        return (sentinel) ? description : super.getDescription();
    }

    @Override
    public String getInputData() {
        return (sentinel) ? inputs : super.getInputData();
    }

    @Override
    public String getCode() {
        return super.getCode();
    }

    @Override
    public String getName() {
        return (sentinel) ? name : super.getName();
    }

    @Override
    public String getOutputData() {
        return (sentinel) ? outputs : super.getOutputData();
    }

    public String getLowerCode() {
        return lowerCode;
    }

    public String getUpperCode() {
        return upperCode;
    }

    public boolean isSentinel() {
        return sentinel;
    }

    public void setSentinel() {
        sentinel = true;
        category.setProblemSentinel();
        author.setAuthorSentinel();
    }

    @Override
    public String toString() {
        return (sentinel) ? toString : getName();
    }

    public int compareTo(Problem someProblem) {
        if (sentinel) {
            return Integer.MIN_VALUE;
        }
        int i = getName().compareTo(someProblem.getName());
        if (i == 0) {
            return getCategory().compareTo(someProblem.getCategory());
        }
        return i;
    }

    public void setAtributes(
            String someName,
            Professor someProfessor,
            Category someCategory,
            String someDescription,
            String someCode,
            String someInputData,
            String someOutputData) {
        setName(someName);
        setAuthor(someProfessor);
        setCategory(someCategory);
        setDescription(someDescription);
        setCode(someCode);
        setInputData(someInputData);
        setOutputData(someOutputData);
    }
}



