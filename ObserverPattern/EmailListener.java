package ObserverPattern;

public class EmailListener implements EventListeners{
    @Override
    public void update(String data) {
        //send an email
        System.out.println("Email sent: " + data);
    }
}
