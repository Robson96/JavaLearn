package cap4;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Concatenate {
    public static void main(String[] args) {
        List<Integer> lista1 = List.of(1, 2, 3, 4);
        List<Integer> lista2 = List.of(1, 2, 5, 6, 7);

        List<Integer> result = extractCommonElements(lista1, lista2);
        System.out.println(result);
    }

    public static List<Integer> extractCommonElements(List<Integer> lista1, List<Integer> lista2) {
        Set<Integer> intersection = new HashSet<>(lista1);

        intersection.retainAll(lista2);
        if (lista1.get(0).equals(lista2.get(0))) {
            intersection.add(lista1.get(0));
        }
        if (lista1.get(lista1.size() - 1).equals(lista2.get(lista2.size() - 1))) {
            intersection.add(lista1.get(lista1.size() - 1));
        }

        return intersection.stream().toList();
    }
}
