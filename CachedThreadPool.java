import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedThreadPool {

    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName());

        //In the cached thread pool it will check if the current threads are busy or not if they are busy only in that
        //condition it will create a new thread.

        ExecutorService executorService = Executors.newCachedThreadPool();

        for(int i=0;i<100;i++){

            Thread thread=new Thread(()->{

                System.out.println(Thread.currentThread().getName());

            });

            executorService.execute(thread);

        }

    }
}
