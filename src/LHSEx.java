import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class LHSEx {
    public static void main(String[] args) {
        Set<String> lhs = new LinkedHashSet<>();
        String str   = "AWS linux server and vpc learned with EBS mount in linux machine learned. Mainly have to focus on firewall of security group and IAM.";
        for(String st : str.split(" ")){
            lhs.add(st);
        }
        System.out.println("Using lambda ");
        lhs.forEach(strs -> System.out.println("--->"+strs));
        System.out.println(lhs.size());
        System.out.println("Using Streams");
        Set<String> lhashSet = Arrays.stream(str.split(" ")).collect(Collectors.toCollection(LinkedHashSet::new));
        lhashSet.forEach(strs -> System.out.println("->>>" + strs));

        System.out.println("Using peek in streams");
        Set<String> lset = Arrays.stream(str.split(" "))
                .peek(word -> System.out.println("Inside streams :"+word))
                .collect(Collectors.toCollection(LinkedHashSet::new));

        System.out.println("Using map and filter");
        Set<String> lhss = Arrays.stream(str.split( " "))
                .map(String::toUpperCase)
                .peek(word-> {
                    System.out.print(" "+word);
                })
                .filter(ws -> !ws.equals("AND"))

                .collect(Collectors.toCollection(LinkedHashSet::new));

    }
}
