package CommandPattern;

import java.util.ArrayDeque;
import java.util.Deque;

public class CommandHistory {
    private static final Deque<Command> history = new ArrayDeque<>();

    public static void push(Command command){
        history.push(command);
    }

    public static Command pop(){
        return history.pop();
    }
}
