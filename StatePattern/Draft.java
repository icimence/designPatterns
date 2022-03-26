package StatePattern;

public class Draft extends State{

    public Draft(Document document) {
        super(document);
    }

    @Override
    public void render() {
        System.out.println("This is a Draft Document!");
        document.printContent();
    }

    @Override
    public void publish() {
        document.setState(new Moderation(document));
    }


}
