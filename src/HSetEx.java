import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HSetEx {
    public static void main(String[] args) {
        Set<String> hs = new HashSet<>();
        hs.add("a");
        hs.add("b");
        hs.add("x");
        hs.add("a");
        System.out.println(hs);
        System.out.println("Iteration using old way");
        Iterator<String> itr = hs.iterator();
        while(itr.hasNext()){
            System.out.println("Hashset elements : "+itr.next());
        }
        System.out.println("Using Foreach  loop");
        hs.forEach(str-> System.out.println("--> "+str));

        System.out.println("Using For loop");
        for(String str : hs){
            System.out.println("-*-*-*-> "+str);
        }
    }
}
