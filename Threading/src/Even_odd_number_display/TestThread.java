package Even_odd_number_display;

public class TestThread {
    public static void main(String[] args) throws InterruptedException {
        EvenThread evenThread = new EvenThread();
        OddThread oddThread = new OddThread();
        evenThread.join(5);
        evenThread.start();
        oddThread.join(10);
        oddThread.start();
Object o = new Object();


    }
}
