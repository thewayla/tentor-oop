package b11;

public interface IEditCommand {
    void execute(StringBuilder sb);
    void undo(StringBuilder sb);
}
