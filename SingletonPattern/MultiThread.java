package SingletonPattern;

public class MultiThread {
    private static MultiThread instance;
    private final String value;

    public MultiThread(String value){
        this.value = value;
    }

    public String getValue(){
        return value;
    }

    public static MultiThread getInstance(String value){
        if (instance != null)
            return instance;
        synchronized (MultiThread.class){
            if (instance == null){
                instance = new MultiThread(value);
            }
            return instance;
        }
    }
}
