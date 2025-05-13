import java.util.Hashtable;

public class HTEx {
    public static void main(String[] args) {
        Hashtable<Integer,String> student = new Hashtable();
        student.put(1,"Alan");
        student.put(2,"Barry");
        student.put(3,"Charlie");
        for(Integer i : student.keySet()){
            System.out.println(i +"<-K - V-> >"+student.get(i));
        }
        System.out.println("Using lambda");
        student.forEach((i,str)-> System.out.println("K-"+i+" V-"+str));


    }
}
