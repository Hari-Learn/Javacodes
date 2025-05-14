import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamIMO {
    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>();
        al.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,14,22,13,14,54));
        System.out.println("1.Using filter operation");
        System.out.println();
        System.out.println(al.stream().filter(n->n>10).collect(Collectors.toList()));
        System.out.println(al.stream().filter(i->i<=9).collect(Collectors.toList()));
        System.out.println("2.Using map operation");
        System.out.println();
        List<String> ls = Arrays.asList("aws","bashscript","code","docker","ec2","fargate","git","hashcorp","iam","jfrog","kuber","linux");
        System.out.println(ls.stream().map(s->s.toUpperCase()).collect(Collectors.toList()));
        System.out.println(ls.stream().map(s->s.toUpperCase()).filter(s -> s.length()<=3 ).collect(Collectors.toList()));



    }
}
