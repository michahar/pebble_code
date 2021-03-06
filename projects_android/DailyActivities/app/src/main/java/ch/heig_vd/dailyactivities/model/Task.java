package ch.heig_vd.dailyactivities.model;

/**
 * A simple wrapper class for the String class.
 * The only change is to compare the string in a case insensitive manner.
 */
public class Task {
    private String name;
    private static final Task DEFAULT_TASK = new Task("No Activity");

    /**
     * Creates a new activity from a name.
     * @param name The activity name
     */
    public Task(String name) {
        this.name = name;
    }

    /**
     * Returns the string name of the activity.
     * @return The string name of the activity
     */
    public String getName() {
        return name;
    }

    /**
     * Compares two activity names in lowercase.
     * @param o an activity
     * @return true if the other activity name is the same (case insensitive) as the current one
     */
    @Override
    public boolean equals(Object o) {
        if(o == null) {
            return false;
        } else if(o.getClass() == Task.class) {
            return ((Task)o).name.toLowerCase().equals(name.toLowerCase());
        }
        return super.equals(o);
    }

    public static String getMinStartingTime() {
        return "00:00";
    }

    public static String getMaxStoppingTime() {
        return "23:59";
    }

    public static Task getDefaultTask() {
        return DEFAULT_TASK;
    }

    public boolean isDefaultTask() {
        return this.equals(DEFAULT_TASK);
    }

    /**
     * Returns the name of the activity.
     * @return the name of the activity
     */
    @Override
    public String toString() {
        return name;
    }
}