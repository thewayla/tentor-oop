package b10;

public class ErQueue {
    private final int initialSize = 1;
    private MedicalAssessment[] queue;
    private int size;

    public ErQueue() {
        this.queue = new MedicalAssessment[initialSize];
        this.size = 0;
    }

    private void resize() {
        MedicalAssessment[] tempQueue = new MedicalAssessment[queue.length*2];

        for (int i = 0; i < queue.length; i++) {
            tempQueue[i] = queue[i];
        }

        queue = tempQueue;
    }

    public void enqueue(MedicalAssessment patient) {
        if (size == queue.length) resize();

        int i = size - 1;

        if (patient.getPriority() == MedicalAssessment.Priority.HIGH) {
            while (i >= 0 && queue[i].getPriority() == MedicalAssessment.Priority.LOW) {
                queue[i + 1] = queue[i];
                i--;
            }
        }

        queue[i + 1] = patient;
        size++;
    }

    public MedicalAssessment dequeue() {
        if (size == 0) throw new IllegalStateException();

        MedicalAssessment tmp = queue[0];
        for (int i = 1; i < size; i++) {
            queue[i - 1] = queue[i];
        }

        size--;
        return tmp;
    }

    public boolean isEmpty() {
        return (size == 0);
    }

    public int size() {
        return size;
    }

    public MedicalAssessment peek() {
        if (size == 0) throw new IllegalStateException();

        return queue[0];
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder("Queue\n");
        output.append("{\n");
        for (int i = 0; i < size; i++) {
            output.append(queue[i].toString());
        }
        output.append("}\n");
        return output.toString();
    }
}



