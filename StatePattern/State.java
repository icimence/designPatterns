package StatePattern;

public abstract class State {
    protected Document document;

    public State(Document document) {
        if (document != null)
            this.document = document;
    }

    public void setDocument(Document document){
        this.document = document;
    }

    public abstract void render();

    public abstract void publish();
}
