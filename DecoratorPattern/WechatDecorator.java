package DecoratorPattern;

public class WechatDecorator extends BaseNotifierDecorator {
    public WechatDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("WeChat message has sent: " + message);
    }
}
