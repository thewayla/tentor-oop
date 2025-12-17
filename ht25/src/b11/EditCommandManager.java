package b11;

import java.util.Stack;

public class EditCommandManager {
    private Stack<IEditCommand> undoStack;
    private Stack<IEditCommand> redoStack;
    private StringBuilder doc;

    public EditCommandManager(StringBuilder doc) {
        this.doc = doc;
        this.redoStack = new Stack<>();
        this.undoStack = new Stack<>();
    }

    public void execute(IEditCommand cmd) {
        cmd.execute(this.doc);

        undoStack.push(cmd);

        redoStack.clear();
    }

    public void undo() {
        if (undoStack.isEmpty()) return;

        IEditCommand cmd = undoStack.pop();

        cmd.undo(this.doc);

        redoStack.push(cmd);
    }

    public void redo() {
        if (redoStack.isEmpty()) return;

        IEditCommand cmd = redoStack.pop();

        cmd.execute(this.doc);

        undoStack.push(cmd);
    }

    public int doneSize() {
        return undoStack.size();
    }

}
