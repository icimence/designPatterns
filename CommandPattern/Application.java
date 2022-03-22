package CommandPattern;

import java.util.ArrayList;
import java.util.List;

public class Application {
    private final List<Editor> editors = new ArrayList<>();
    public Editor activeEditor;
    private String clipBoard;

    public void createEditor(){
        Editor newEditor = new Editor();
        editors.add(newEditor);
        activeEditor = newEditor;
    }

    public void switchEditor(int num){
        activeEditor = editors.get(num);
    }

    public void executeCommand(Command command) throws Exception {
        boolean flag = command.execute();
        if (flag){
            CommandHistory.push(command);
        }
    }

    protected void setClipBoard(String s){
        clipBoard = s;
    }

    protected String getClipBoard(){
        return clipBoard;
    }

    public void undo(){
        Command command = CommandHistory.pop();
        if (command != null)
            command.undo();
    }
}
