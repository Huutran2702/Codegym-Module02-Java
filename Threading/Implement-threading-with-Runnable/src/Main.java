public class Main {
    public static void main(String args[]) {
//        RunnableDemo runnableDemo1 = new RunnableDemo();
//        Thread thread1 = new Thread(runnableDemo1);
//        Thread thread2 = new Thread(runnableDemo1);
//        thread1.start();
//        thread2.start();
        AB.Huu hu=new AB.Huu();
        hu.a=1;
        AB.Huu.Tien tien=new AB.Huu.Tien() {
            @Override
            public void diBoCamDu() {
                System.out.println("Bua nay quen du");
            }

            @Override
            public void chayXeCamDu() {
                System.out.println("Bua nay co du");
            }
        };
        try {
            tien.diBoCamDu();
        } catch (Exception e) {
            e.printStackTrace();
        }
        tien.chayXeCamDu();

    }
}
