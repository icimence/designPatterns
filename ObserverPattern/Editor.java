package ObserverPattern;

public class Editor {
    private final EventManager eventManager;

    public Editor() {
        String[] events = {"create", "modify", "delete"};
        this.eventManager = new EventManager(events);
    }

    public void createFile(String fileName) {
        //创建文件
        eventManager.notify("create", fileName + " is created!");
    }

    public void modifyFile(String fileName) {
        //创建文件
        eventManager.notify("modify", fileName + " is modified!");
    }

    public void deleteFile(String fileName) {
        //创建文件
        eventManager.notify("delete", fileName + " is deleted!");
    }

    public void addListener(String event, EventListeners listener) {
        eventManager.subscribe(event, listener);
    }

    public void removeLister(String event, EventListeners listener) {
        eventManager.unsubscribe(event, listener);
    }


}
