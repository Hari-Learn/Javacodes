import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkList {
    public static void main(String[] args) {
        List<String> ls = new LinkedList<>();
        String str = "Security group in aws is called as virtual firewall. Its a ec2 instance specific firewall. We can define inbound and outbound traffic rules we can set. NACL is for subnet level control access. NACL is stateless and SG is stateful.";
        for(String st:str.split(" ")){
            //System.out.println(st);
            ls.add(st);
        }
        System.out.println("Modifying elements inside loop using listIterator");
        ListIterator<String> itr = ls.listIterator();
        while(itr.hasNext()){
            if(itr.next().equals("firewall.")){
                itr.set("firewall.".toUpperCase());
                itr.add("<---Gotcha--->");
            }
        }
        System.out.println("using for each");
        ls.forEach(s-> System.out.println("===> "+s));



    }
}

