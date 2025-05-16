import java.util.*;

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
        List<String> as = Arrays.asList("Ambi","Ajju","Cathe","Diana","Eille","Fathima","Balu","bob");
        Optional<String> findingFirstA = as.stream()
                .filter(s -> s.startsWith("A"))
                 .findFirst();
        System.out.println(findingFirstA);
        System.out.println("Using contain with findFirst");
        Optional<String> findingAny = as.stream().filter(s -> s.contains("na")).findFirst();
        findingAny.ifPresent(s -> System.out.println("Gotcha :"+s));
        System.out.println("using min and max terminal operator");
        Optional<Integer> minOps = list.stream().min(Integer::compareTo);
        Optional<Integer> maxOps = list.stream().max(Integer::compareTo);
        minOps.ifPresent(integer -> System.out.println("Minimum : "+integer));
        maxOps.ifPresent(integer -> System.out.println("Maximum :"+integer));

        Optional<String> compareStringLength = as.stream().max((s1,s2)->Integer.compare(s1.length(),s2.length()));
        Optional<String> compareStringLengths = as.stream().min((s1,s2)->Integer.compare(s1.length(),s2.length()));
        compareStringLength.ifPresent(s -> System.out.println("Longest String : "+s));
        compareStringLengths.ifPresent(s -> System.out.println("Shortest string : "+s));
        System.out.println("\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25 ");
        Map<String,Double> movies = new HashMap<>();
        movies.put("The Dark Knight Rises",8.5);
        movies.put("Inception",9.0);
        movies.put("The Adventure of Tintin",8.0);
        movies.put("The Gangs of NewYork",7.5);
        movies.put("Skyfall",8.3);
        movies.put("The Hateful Eight",7.4);
        movies.forEach((k,v)-> System.out.println("Movie :"+k +"  Rating :"+v));
        Map.Entry<String,Double> worstMovie = movies.entrySet().stream().min(Map.Entry.comparingByValue()).orElseThrow();
        Map.Entry<String,Double> bestMovie = movies.entrySet().stream().max(Map.Entry.comparingByValue()).orElseThrow();
        System.out.println("🎥 "+worstMovie.getKey() + "--> "+worstMovie.getValue());
        System.out.println("🎥 "+bestMovie.getKey() + "--> "+bestMovie.getValue());

    }
}
