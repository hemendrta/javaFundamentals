import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPool {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(4);

        for(int i=0;i<7;i++){

            Thread thread =new Thread(()->{

                System.out.println(Thread.currentThread().getName());

            });

            thread.start();

        }

        for(int i=0;i<10;i++){

            Thread thread=new Thread(()->{

                System.out.println(Thread.currentThread().getName());

            });

            executorService.execute(thread);


        }


    }

}
