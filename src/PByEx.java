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

        List<String> lst = Arrays.asList("Anju","Atlee","Andal","Bilal","Cathe","Daniel","Ellai");
        Map<Boolean,List<String>> mp = lst.stream().collect(Collectors.partitioningBy(n->n.length()>=5));
        System.out.println(mp.get(true));
        System.out.println(mp.get(false));
        Map<Boolean,List<String>> map = lst.stream().collect(Collectors.partitioningBy(s -> s.startsWith("A")));
        System.out.println(map.get(true));
        System.out.println(map.get(false));
    }
}
