package StatePattern;

public class Moderation extends State{

    public Moderation(Document document) {
        super(document);
    }

    @Override
    public void render() {
        System.out.println("This is a Moderation Document!");
        document.printContent();
    }

    @Override
    public void publish() {
        document.setState(new Published(document));
    }
}
