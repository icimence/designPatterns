package ObserverPattern;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class EventManager {
    private final HashMap<String, List<EventListeners>> listeners = new HashMap<>();

    public EventManager(String[] events){
        for (String event: events){
            listeners.put(event,new ArrayList<>());
        }
    }

    public void subscribe(String event, EventListeners eventListener){
        List<EventListeners> temp = listeners.get(event);
        temp.add(eventListener);
    }

    public void unsubscribe(String event, EventListeners eventListener){
        List<EventListeners> temp = listeners.get(event);
        temp.remove(eventListener);
    }

    public void notify(String event, String data){
        List<EventListeners> temp = listeners.get(event);
        for (EventListeners e: temp) {
            e.update(data);
        }
    }
}
