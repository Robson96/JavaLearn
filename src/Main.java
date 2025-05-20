import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
//        map.put(4, "four");
//        map.put(5, "five");

        List<String> values = new ArrayList<>();
        for (int key = 0; key < 5; key++) {
            values.add(map.getOrDefault(key, "UNDEFINED"));
        }

        System.out.println(values);
    }
}