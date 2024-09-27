public class Task {
    private String name;
    private int priority;
    private String category;

    public Task(String name, int priority, String category) {
        this.name = name;
        this.priority = priority;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return String.format("[%d] %s (%s)", priority, name, category);
    }
}