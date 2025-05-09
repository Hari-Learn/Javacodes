import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class LHMEx {
    public static void main(String[] args) {
        Map<Integer,String> lhm = new LinkedHashMap<>();
        lhm.put(1,"AWS");
        lhm.put(2,"Bash Script");
        lhm.put(3,"Docker");
        lhm.put(4,"Terraform");
        lhm.put(5,"Gitlab");
        System.out.println("Using Iterator");
        Iterator itr = lhm.entrySet().iterator();
        while (itr.hasNext()){
            System.out.println("-->" + itr.next());
        }
        System.out.println("Using for loop");
        for(String str : lhm.values()){
            System.out.println("--->>"+str);
        }

    }
}
