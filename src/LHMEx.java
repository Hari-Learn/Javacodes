import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.BiConsumer;

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
        System.out.println("Using lambda");
        lhm.forEach((Integer i, String str) -> System.out.println(i+"<->"+str));

        System.out.println("Using text array to assign elements");
        Map<Integer,String> lhms = new LinkedHashMap<>();
        String str = "I have started learning devops by understanding linux first and then move to aws docker kubernetes ansible";
        String[] strArr = str.split(" ");
        for(int i = 0; i<strArr.length;i++){
            System.out.println("------>>>"+strArr[i]);
            lhms.put(i+1,strArr[i]);
        }
        lhms.forEach((Integer i,String strs)->System.out.println(i +"<<<-->>>"+strs));
    }
}
