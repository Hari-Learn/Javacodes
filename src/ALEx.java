import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class ALEx {
    public static void main(String[] args) {
        List<String> al = new ArrayList<>();
        al.add("AWS");
        al.add("GCP");
        al.add("Azure");
        al.add("Git");
        al.add("Docker");
        System.out.println("Using for loop");
        for(int i =0; i<al.size();i++){
            System.out.println(al.get(i));
        }
        System.out.println("using While loop");
        int val = 0;
        while(al.size() > val){
            System.out.println(al.get(val));
            val++;
        }
        System.out.println("Using for each loop");
        for(String i : al){
            System.out.println(i + " <-->");
        }
        System.out.println("Using iterator");
        Iterator it = al.iterator();
        while (it.hasNext()){
            System.out.println("--> "+it.next());
        }

        System.out.println("Using Lambdas");
        al.forEach(str -> System.out.println("-*-*-*->"+str));
    }
}
