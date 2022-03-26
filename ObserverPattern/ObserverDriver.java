package ObserverPattern;

public class ObserverDriver {
    public static void main(String[] args) {
        Editor editor = new Editor();
        EmailListener emailListener = new EmailListener();
        SMSListener smsListener = new SMSListener();
        editor.addListener("create", emailListener);
        editor.addListener("modify", emailListener);
        editor.addListener("delete", smsListener);
        editor.addListener("delete", emailListener);
        editor.createFile("test");
        editor.modifyFile("test");
        editor.deleteFile("test");
        editor.removeLister("delete", emailListener);
        editor.deleteFile("test");
    }
}
