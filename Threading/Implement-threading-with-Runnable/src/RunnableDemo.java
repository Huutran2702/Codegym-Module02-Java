public final class RunnableDemo implements Runnable {
    public  RunnableDemo() {
    }

    @Override
    public void run() {
        for (int i = 4; i > 0; i--) {
            System.out.println(i);
        }
    }


}
