package SingletonPattern;

/*
    在单例模式中单线程和多线程的实现是不同的，请详细看代码中的注释
    单线程和多线程的代码不可以一起运行，会导致没有效果
 */
public class SingletonDriver {
    public static void main(String[] args) {
        // 下面是三种模式的代码，一次只能运行一种，因为是单例模式，所以如果三种一起运行会导致结果异常
        ModeSelector modeSelector = new ModeSelector();
        modeSelector.setMode(Mode.Single);
        modeSelector.run();
        System.out.println("-------------------------------------");
        System.out.println("DO NOT RUN THE CODE AT THE SAME TIME!");
        System.out.println("-------------------------------------");
        modeSelector.setMode(Mode.MultiWrong);
        modeSelector.run();
        System.out.println("-------------------------------------");
        System.out.println("DO NOT RUN THE CODE AT THE SAME TIME!");
        System.out.println("-------------------------------------");
        modeSelector.setMode(Mode.Multi);
        modeSelector.run();
    }



}
