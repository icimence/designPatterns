package CommandPattern;

public abstract class Command {
    protected final Application app;
    protected final Editor editor;
    private String text;

    public Command(Application app, Editor editor) {
        this.app = app;
        this.editor = editor;
    }

    public void setBackUp(){
        text = editor.getText();
    }

    public void undo(){
        editor.setText(text);
    }

    public abstract boolean execute() throws Exception;
}
