package CommandPattern;

public class PasteCommand extends Command {

    public PasteCommand(Application app, Editor editor) {
        super(app, editor);
    }

    @Override
    public boolean execute() {
        try {
            super.setBackUp();
            editor.replaceSelection(app.getClipBoard());
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
