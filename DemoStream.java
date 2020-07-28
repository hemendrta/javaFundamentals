import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

//Difference between Stream and Parallel Stream

public class DemoStream {

    public static void main(String[] args) {
        List<Integer> integers=new ArrayList<>();

        for(int i=0;i<1000;i++){

            integers.add(i);

        }

        integers.stream().forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer.toString());
            }
        });

        integers.parallelStream().forEach(i-> System.out.println(i));
    }
}
