import java.util.Calendar;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

import static java.util.concurrent.TimeUnit.SECONDS;

public class ScheduledThreadPool {

    public static void main(String[] args) {

        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(2);

        executorService.schedule(()->{
            System.out.println(Calendar.getInstance().getTime());
        }, 3, SECONDS);

        executorService.scheduleAtFixedRate(()->{

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName());

        },1,1,SECONDS);

        executorService.scheduleWithFixedDelay(()->{

            System.out.println(Calendar.getInstance().getTime());

        },4,1, SECONDS);

    }

}
