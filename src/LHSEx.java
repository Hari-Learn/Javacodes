import java.util.LinkedHashSet;
import java.util.Set;

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


    }
}
