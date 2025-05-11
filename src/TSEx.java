import java.util.Set;
import java.util.TreeSet;

public class TSEx {
    public static void main(String[] args) {
        Set<String> tset = new TreeSet<>();
        String str = "I am learning devops so i started first linux aws docker then kubernetes. In near future i will learn monitor tools and helm too";
        for(String s : str.split(" ")){
            //System.out.println(s);
            tset.add(s);
        }
        System.out.println("Iterating treeset");
        for(String st : tset){
            System.out.println(st);
        }
        System.out.println("Using Lambda");
        tset.forEach(s-> System.out.println("--> "+s));

    }
}
