package DecoratorPattern;

public class DecoratorDriver {
    public static void main(String[] args){
        Notifier notifier = new SMSDecorator(new QQDecorator(new EmailNotifier()));
        notifier.send("You choose to send message in QQ and Email ad SMS");
    }
}
