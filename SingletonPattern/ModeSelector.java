package SingletonPattern;

public class ModeSelector {
    private Mode mode;

    public void setMode(Mode mode) {
        this.mode = mode;
    }

    public void run() {
        switch (mode) {
            case Single : {
                System.out.println(">>>>>>>SingletonPattern<<<<<<<<");
                SingleThread singleThread1 = SingleThread.getInstance("connector1");
                SingleThread singleThread2 = SingleThread.getInstance("connector2");
                System.out.println("You should see only connector1 blow:");
                System.out.println(singleThread1.getValue());
                System.out.println(singleThread2.getValue());
                break;
            }
            case MultiWrong : {
                System.out.println("-------MultiThread begin--------");
                Thread thread1 = new Thread(new ThreadWrong1());
                Thread thread2 = new Thread(new ThreadWrong2());
                thread1.start();
                thread2.start();
                break;
            }
            case Multi : {
                System.out.println("-------MultiThread begin--------");
                Thread thread1 = new Thread(new Thread1());
                Thread thread2 = new Thread(new Thread2());
                thread1.start();
                thread2.start();
                break;
            }
            default:
                System.err.println("boom!");
        }
    }

    static class ThreadWrong1 implements Runnable {

        @Override
        public void run() {
            SingleThread singleThread = SingleThread.getInstance("connector1");
            System.out.println("Thread1 use " + singleThread.getValue());
        }
    }

    static class ThreadWrong2 implements Runnable {

        @Override
        public void run() {
            SingleThread singleThread = SingleThread.getInstance("connector2");
            System.out.println("Thread2 use " + singleThread.getValue());
        }
    }

    static class Thread1 implements Runnable {

        @Override
        public void run() {
            MultiThread multiThread = MultiThread.getInstance("connector1");
            System.out.println("Thread1 use " + multiThread.getValue());
        }
    }

    static class Thread2 implements Runnable {

        @Override
        public void run() {
            MultiThread multiThread = MultiThread.getInstance("connector2");
            System.out.println("Thread2 use " + multiThread.getValue());
        }
    }
}
