package CommandPattern;

public class CopyCommand extends Command {
    public CopyCommand(Application app, Editor editor) {
        super(app, editor);
    }

    @Override
    public boolean execute() {
        try {
            app.setClipBoard(editor.getSelection());

        } catch (Exception ignored) {

        }
        return false;
    }
}
