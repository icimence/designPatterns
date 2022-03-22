package CommandPattern;

public class UndoCommand extends Command{

    public UndoCommand(Application app, Editor editor) {
        super(app, editor);
    }

    @Override
    public boolean execute() {
       app.undo();
        return true;
    }
}
