public class ThreadingDemo extends Thread {
    private String threadName;

    public ThreadingDemo(String name) {
        this.threadName = name;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(threadName + ": " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }

    public static void main(String[] args) {
        ThreadingDemo t1 = new ThreadingDemo("Thread-1");
        ThreadingDemo t2 = new ThreadingDemo("Thread-2");
        
        t1.start();
        t2.start();
    }
}
