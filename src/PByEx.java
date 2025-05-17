import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PByEx {
    public static void main(String[] args) {
        List<Integer> ns = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,20,22,23,25);
        Map<Boolean,List<Integer>> ls = ns.stream().collect(Collectors.partitioningBy( n -> n%2 ==0));
        System.out.println("test");
        System.out.println("Even :"+ls.get(true));
        System.out.println("Odd :"+ls.get(false));
    }
}
