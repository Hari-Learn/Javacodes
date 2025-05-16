import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsOpsEx {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,3,4,4,4,5,5,6,7,5,4,7,8,9,11,23,44,11,12);
        System.out.println("Using noneMatch");
        boolean hasNoNegative = list.stream().noneMatch(n->n<0);
        System.out.println(hasNoNegative);
        List<String> al = Arrays.asList("Ambi","Ambal","Ammu","Anbu","Arivu","Balu");

        boolean test = al.stream().filter(s->s.startsWith("A"))
                                  .filter(s->s.length()<=4)
                                  .peek(s -> System.out.println(s))
                                  .noneMatch(s->s.equals("Anbu"));
        System.out.println(test);

        System.out.println("Using findFirst");
        List<String> as = Arrays.asList("Ambi","Ajju","Cathe","Diana","Eille","Fathima","Balu");
        Optional<String> findingFirstA = as.stream()
                .filter(s -> s.startsWith("A"))
                 .findFirst();
        System.out.println(findingFirstA);
        System.out.println("Using contain with findFirst");
        Optional<String> findingAny = as.stream().filter(s -> s.contains("na")).findFirst();
        findingAny.ifPresent(s -> System.out.println("Gotcha :"+s));


    }
}
