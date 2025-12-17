package b10;

public class MedicalAssessment {
    private final String description;
    private final Priority priority;

    public enum Priority {
        LOW, HIGH
    }

    public MedicalAssessment(String description, Priority priority) {
        this.description = description;
        this.priority = priority;
    }

    public String getDescription() {
        return description;
    }

    public Priority getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return "    {\n" +
                "       Description: " + this.description + "\n"
                + "     Priority: " + this.priority + "\n" +
                "   }\n";
    }
}
