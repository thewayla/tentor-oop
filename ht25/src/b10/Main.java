package b10;

public class Main {
    public static void main(String[] args) {
        MedicalAssessment pat1 = new MedicalAssessment("Fever", MedicalAssessment.Priority.LOW);
        MedicalAssessment pat2 = new MedicalAssessment("Broken bone", MedicalAssessment.Priority.HIGH);
        MedicalAssessment pat3 = new MedicalAssessment("Migraine", MedicalAssessment.Priority.LOW);
        MedicalAssessment pat4 = new MedicalAssessment("Stab wound", MedicalAssessment.Priority.HIGH);

        ErQueue q1 = new ErQueue();

        System.out.println("Is empty? " + q1.isEmpty());

        System.out.println("\nEnqueueing pat1 (LOW) and pat2 (HIGH)...");
        q1.enqueue(pat1);
        q1.enqueue(pat2);

        System.out.println(q1.toString());
        System.out.println("Peek: " + q1.peek());

        System.out.println("\nEnqueueing pat3 (LOW) and pat4 (HIGH)...");
        q1.enqueue(pat3);
        q1.enqueue(pat4);

        // This should show order: HIGH, HIGH, LOW, LOW
        // specifically: pat2, pat4, pat1, pat3
        System.out.println(q1.toString());

        System.out.println("\nDequeued: " + q1.dequeue());
        System.out.println("Peek: " + q1.peek());
        System.out.println("Is empty? " + q1.isEmpty());
        System.out.println(q1.toString());

        System.out.println("\nDequeued: " + q1.dequeue());
        System.out.println("Peek: " + q1.peek());
        System.out.println("Is empty? " + q1.isEmpty());
        System.out.println(q1.toString());

        System.out.println("\nRe-adding pat1 and pat2...");
        q1.enqueue(pat1);
        q1.enqueue(pat2);
        System.out.println(q1.toString());

        System.out.println("\nClearing queue...");
        System.out.println("Dequeued: " + q1.dequeue());
        System.out.println("Dequeued: " + q1.dequeue());
        System.out.println("Dequeued: " + q1.dequeue());
        System.out.println("Dequeued: " + q1.dequeue());

        System.out.println("Is empty? " + q1.isEmpty());
    }
}
