import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MapWithStreams {

    public static void main(String[] args) {
        Map< Integer, String> map=new HashMap<Integer, String>();

        map.put(101, "Hemendra");
        map.put(99, "Andrew");
        map.put(103, "Anish");
        map.put(18, "Mohan");
        map.put(11, "Christine");
        map.put(109, "Rebeca");
        map.put(111, "David");
        map.put(19, "Rahim");
        map.put(10, "Krishna");

        System.out.println("------------------------------------------------------------");

//        Sorted on the basis of values in reverse (a-->z)

        System.out.println(map.entrySet().stream().sorted(new Comparator<Map.Entry<Integer, String>>() {
            @Override
            public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        }).collect(Collectors.toList()));

        System.out.println("------------------------------------------------------------");

//        Sorted on the basis of values in reverse (z-->a)

        System.out.println(map.entrySet().stream().sorted(new Comparator<Map.Entry<Integer, String>>() {
            @Override
            public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        }).collect(Collectors.toList()));
    }
}
