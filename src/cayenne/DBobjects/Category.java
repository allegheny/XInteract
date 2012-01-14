package cayenne.DBobjects;

import cayenne.DBobjects.auto._Category;

public class Category extends _Category implements Comparable<Category> {

    private boolean sentinel = false;
    private boolean problemSentinel = false;
    private static final String problemToString = "[CHOOSE CATEGORY]";
    private static final String toString = "[CREATE NEW CATEGORY]";
    private static final String name = "[CATEGORY NAME]";
    private static final String description = "[CATEGORY DESCRIPTION]";

    @Override
    public String getName() {
        return (sentinel) ? name : super.getName();
    }

    @Override
    public String getDescription() {
        return (sentinel) ? description : super.getDescription();
    }

    public boolean isSentinel() {
        return sentinel;
    }

    public void setSentinel() {
        sentinel = true;
    }
    
    public boolean isProblemSentinel() {
        return problemSentinel;
    }

    public void setProblemSentinel() {
        problemSentinel = true;
    }

    @Override
    public String toString() {
        if (problemSentinel) return problemToString;
        return (sentinel) ? toString : getName();
    }

    public int compareTo(Category someCategory) {
        if (sentinel || problemSentinel) return Integer.MIN_VALUE;
        int i = getName().compareTo(someCategory.getName());
        if (i == 0) {
            return getDescription().compareTo(someCategory.getDescription());
        }
        return i;
    }
}



