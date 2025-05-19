import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
<<<<<<< HEAD
import java.util.Map;
=======
>>>>>>> 0eb2c996b4fe61fb78c8f0fca5cae0c3be4cd35c
import java.util.stream.Collectors;

public class StreamTest {
    public static void main(String[] args) {
        List<Movies> movies = Arrays.asList(
                new Movies("Pani", 132, 8.5, "Thriller", 2024),
                new Movies("Mass Hero", 118, 7.1, "Action", 2023),
                new Movies("Silent Killer", 143, 6.8, "Crime", 2022),
                new Movies("Joju Thriller", 151, 9.0, "Thriller", 2025),
                new Movies("Mini Drama", 95, 7.5, "Drama", 2021),
                new Movies("Arthouse", 110, 8.3, "Drama", 2020)
        );
        List<String> ls = movies.stream()
                .filter(movies1 -> movies1.getReleasedyear() > 2022)
                .sorted(Comparator.comparingDouble(Movies::getRating).reversed())
                .map(movies1 -> movies1.getTitle().toUpperCase())
                .collect(Collectors.toList());
        ls.forEach(s -> System.out.println(s));
        System.out.println("Group movies by genre, and for each genre, count how many movies are in it.");

        Map<String,Long> mp = movies.stream().collect(Collectors.groupingBy(Movies::getGenre,Collectors.counting()));
        mp.forEach((k,v) -> System.out.println(k+"--"+v));



    }
}
