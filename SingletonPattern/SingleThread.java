package SingletonPattern;

import java.util.Arrays;

public class SingleThread {
    private static SingleThread instance;
    private final String value;

    public SingleThread(String value) {
        try {
            Thread.sleep(2000);//模拟真正使用单例模式时一般类生成很慢
        } catch (InterruptedException e) {
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
        this.value = value;
    }

    public static SingleThread getInstance(String value) {
        if (instance == null){
            instance = new SingleThread(value);
        }
        return instance;
    }

    public String getValue(){
        return value;
    }

}
