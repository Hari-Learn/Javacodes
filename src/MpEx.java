import java.util.HashMap;
import java.util.Map;

public class MpEx {

    public static void main(String[] args) {
        Map<Integer,String> hm = new HashMap<>();
        hm.put(1,"AWS");
        hm.put(2,"GCP");
        hm.put(3,"Azure");
        System.out.println("Map Size :"+hm.size());
        System.out.println("Map iteration using for loop");
        for(Map.Entry<Integer,String> e : hm.entrySet()){
            System.out.println("Key :"+ e.getKey() +"<----> Value :"+ e.getValue());
        }
        System.out.println("Map iteration using lambda java 8");
        hm.forEach((key,val) -> {
            System.out.println("Key :"+ key +"<----> Value :"+ val);
        });
        System.out.println("Map iterate using keyset");
        for(Integer key : hm.keySet()){
            System.out.println("Key :"+ key +"<----> Value :"+ hm.get(key));
        }
        System.out.println("Map iterate using values");
        for(String val : hm.values()){
            System.out.println("Values :"+ val );
        }
        System.out.println("End of the program");

    }
}
