package DecoratorPattern;

public class SMSDecorator extends BaseNotifierDecorator {
    public SMSDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("SMS message has sent: " + message);
    }
}
