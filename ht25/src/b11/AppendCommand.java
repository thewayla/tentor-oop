package b11;

public class AppendCommand implements IEditCommand {
    private String text;

    public AppendCommand(String text) {
        this.text = text;
    }

    @Override
    public void execute(StringBuilder sb) {
        sb.append(text);
    }

    @Override
    public void undo(StringBuilder sb) {
        sb.delete(sb.length() - text.length(), sb.length());
    }
}
