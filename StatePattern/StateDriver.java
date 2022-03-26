package StatePattern;

public class StateDriver {
    public static void main(String[] args) {
        Document document = new Document(new Draft(null));
        document.getState().setDocument(document);
        document.setText("hello world!");
        document.render();
        document.publish();
        document.setText("Hello world!");
        document.render();
        document.publish();
        document.setText("Hello World!");
        document.render();
        document.publish();
    }
}
