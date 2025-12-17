package b11;

public class InsertCommand implements IEditCommand {
    private String text;
    private int position;

    public InsertCommand(String text, int position) {
        this.text = text;
        this.position = position;
    }

    @Override
    public void execute(StringBuilder sb) {
        sb.insert(position, text);
    }

    @Override
    public void undo(StringBuilder sb) {
        sb.delete(position, position + text.length());
    }
}
