package CommandPattern;

public class CommandDriver {
    public static void main(String[] args) throws Exception {
        Application application = new Application();
        System.out.println("Application initialize complete!");
        application.createEditor();
        application.createEditor();
        application.switchEditor(0);
        Editor tempEditor = application.activeEditor;
        tempEditor.setText("Have a nice day with coding!");
        tempEditor.setSelection(7, 11);
        Command copyCommand = new CopyCommand(application, tempEditor);
        Command cutCommand = new CutCommand(application, tempEditor);
        Command pasteCommand = new PasteCommand(application, tempEditor);
        Command undoCommand = new UndoCommand(application, tempEditor);
        System.out.println("now the editor content is : " + tempEditor.getText());
        application.executeCommand(copyCommand);
        System.out.println("copy complete and now the editor content is : " + tempEditor.getText());
        System.out.println("clipBoard content is : " + application.getClipBoard());
        tempEditor.setSelection(7);
        application.executeCommand(pasteCommand);
        System.out.println("paste complete and now the editor content is : " + tempEditor.getText());
        application.executeCommand(undoCommand);
        System.out.println("undo the paste command and now the editor content is : " + tempEditor.getText());
        tempEditor.setSelection(13, 15);
        application.executeCommand(cutCommand);
        System.out.println("cut complete and now the editor content is : " + tempEditor.getText());
        System.out.println("clipBoard content is : " + application.getClipBoard());
        tempEditor.setSelection(13);
        application.executeCommand(pasteCommand);
        application.executeCommand(pasteCommand);
        System.out.println("two paste complete and now the editor content is : " + tempEditor.getText());
        application.executeCommand(undoCommand);
        System.out.println("undo complete and now the editor content is : " + tempEditor.getText());
        application.switchEditor(1);
        Command pasteCommand2 = new PasteCommand(application, application.activeEditor);
        application.executeCommand(pasteCommand2);
        System.out.println("now the first editor content is : " + tempEditor.getText());
        System.out.println("the second editor content is : " + application.activeEditor.getText());
    }
}
