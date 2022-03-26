package StatePattern;

public class Document {
    private String text;
    private State state;

    public Document(State state) {
        this.state = state;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void printContent(){
        System.out.println("\n--------------------CONTENT BEGIN------------------");
        System.out.println(text);
        System.out.println("--------------------CONTENT END--------------------\n");
    }

    public void render(){
        state.render();
    }

    public void publish(){
        state.publish();
    }
}
