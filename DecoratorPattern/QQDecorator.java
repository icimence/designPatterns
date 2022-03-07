package DecoratorPattern;

public class QQDecorator extends BaseNotifierDecorator{
    public QQDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("QQ message has sent: " + message);
    }
}
