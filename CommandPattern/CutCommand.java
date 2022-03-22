package CommandPattern;

public class CutCommand extends Command {

    public CutCommand(Application app, Editor editor) {
        super(app, editor);
    }

    @Override
    public boolean execute() {
        try {
            super.setBackUp();
            app.setClipBoard(editor.getSelection());
            editor.deleteSelection();
            return true;
        } catch (Exception e) {
            return false;
        }

    }
}
