import java.util.HashSet;
import java.util.Set;

public class HSetEx {
    public static void main(String[] args) {
        Set<String> hs = new HashSet<>();
        hs.add("a");
        hs.add("b");
        hs.add("x");
        hs.add("a");
        System.out.println(hs);
    }
}
