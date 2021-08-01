public class ThreadDemo {

    public static void main(String[] args) {

        //Implementation of a thread.

        Thread thread=new Thread(()->{

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName());

        });
        thread.start();
        System.out.println(Thread.currentThread().getName());

    }

}
