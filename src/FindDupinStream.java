import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDupinStream {
    public static void main(String[] args) {
        List<Integer> al = Arrays.asList(1, 2, 3, 1, 2, 4, 5, 4, 2, 1, 4, 7, 33, 5, 7, 88, 99, 33, 22, 11);
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();
        System.out.println("Using for loop to find duplicates");
        for (Integer i : al) {
            System.out.println(i);
            if (seen.contains(i)) {
                duplicates.add(i);
            } else {
                seen.add(i);
            }
        }
        Set<Integer> s1 = new HashSet<>();
        System.out.println("Using Streams operator");
        Set<Integer> d1 = al.stream().filter(n -> !(s1.add(n))).collect(Collectors.toSet());
        System.out.println("Without dup list--> :" + s1);
        System.out.println("Duplicate list--> :" + d1);
        System.out.println("Without dup list :" + seen);
        System.out.println("Duplicate list :" + duplicates);

    }
}
