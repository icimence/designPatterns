package ObserverPattern;

public class SMSListener implements EventListeners{
    @Override
    public void update(String data) {
        //send a phone message
        System.out.println("SMS sent: " + data);
    }
}
