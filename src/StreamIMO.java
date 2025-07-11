import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamIMO {
    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>();
        al.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 14, 22, 13, 14, 54));
        System.out.println("1.Using filter operation");
        System.out.println();
        System.out.println(al.stream().filter(n -> n > 10).collect(Collectors.toList()));
        System.out.println(al.stream().filter(i -> i <= 9).collect(Collectors.toList()));
        System.out.println("2.Using map operation");
        System.out.println();
        List<String> ls = Arrays.asList("aws", "bashscript", "code", "docker", "ec2", "fargate", "git", "hashcorp", "iam", "jfrog", "kuber", "linux");
        System.out.println(ls.stream().map(s -> s.toUpperCase()).collect(Collectors.toList()));
        System.out.println(ls.stream().map(s -> s.toUpperCase()).filter(s -> s.length() <= 3).collect(Collectors.toList()));
        System.out.println("3.flatmap operation");

        List<List<String>> lss = Arrays.asList(
                Arrays.asList("a,b,c"),
                Arrays.asList("aa,bb,cc")
        );

        List<String> oneLs = lss.stream().flatMap(List::stream).collect(Collectors.toList());
        //System.out.println(oneLs.forEach(s->s.toUpperCase()));
        oneLs.forEach(s -> System.out.println(s.toUpperCase()));
        System.out.println("4.Distinct ops");
        System.out.println("Distinct items : " + al.stream().distinct().collect(Collectors.toList()));
        System.out.println("5.sorted example");
        System.out.println("Sorted items :" + ls.stream().sorted().collect(Collectors.toList()));
        System.out.println("Sorted in reverse order :" + ls.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));
        System.out.println("Peek for debugging purpose ");
        System.out.println("Peeking : " + ls.stream()
                .peek(s -> System.out.println("original b4 mapping :" + s))
                .map(String::toUpperCase).collect(Collectors.toList()));
        System.out.println("Limit operation in streams");
        System.out.println("First 3 items only :" + ls.stream().limit(3).collect(Collectors.toList()));
        System.out.println("Skip operation in streams");
        System.out.println("B4 skipping :" + ls.stream().sorted().collect(Collectors.toList()));
        System.out.println("Skipped the first 4 elements " + ls.stream().skip(4).collect(Collectors.toSet()));
        System.out.println("All match operation");
        List<Integer> ai = Arrays.asList(2 ,4 ,6,8);
        String sg = ai.stream().allMatch(n->n%2==0) ? "All are Even" : "Streams contains Odd too";
        System.out.println(sg);
        System.out.println(al.stream().allMatch(n->n%2==0));
        //System.out.println(ls.stream().map(s -> s.substring(0,1).toUpperCase()+s.substring(1)));
        //System.out.println(ls.stream().allMatch(s  -> Character.isAlphabetic(s)));
        System.out.println();
    }
}
