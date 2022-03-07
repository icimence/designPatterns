package DecoratorPattern;

public class BaseNotifierDecorator implements Notifier{
    private final Notifier notifier;

    public BaseNotifierDecorator(Notifier notifier){
        this.notifier=notifier;
    }
    @Override
    public void send(String message) {
        notifier.send(message);
    }
}
