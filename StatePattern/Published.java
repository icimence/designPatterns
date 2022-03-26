package StatePattern;

public class Published extends State{

    public Published(Document document) {
        super(document);
    }

    @Override
    public void render() {
        System.out.println("This is a Render Document!");
        document.printContent();
    }

    @Override
    public void publish() {
        System.out.println("Already published!");
    }
}
