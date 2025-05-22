import java.util.List;

public class Demo {
    public static void main(String[] args) {
        int[] factor = new int[] {2};

        List<Integer> numbers = List.of(1, 2, 3);

        var streams = numbers.stream()
                .map( n -> n * factor[0]);

        factor[0] = 0;

        streams.forEach(System.out::print);
    }
}
