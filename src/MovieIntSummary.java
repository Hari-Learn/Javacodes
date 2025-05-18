import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class MovieIntSummary {
    public static void main(String[] args) {
        List<Movie> movie = Arrays.asList(
                new Movie("Pani",180),
                new Movie("ThugLife",280),
                new Movie("PS1",190),
                new Movie("PS2",240),
                new Movie("GBU",300),
                new Movie("Final Desitination",90));
        movie.forEach(movie1 -> System.out.println(movie1.getTitle()));
        IntSummaryStatistics its = movie.stream().collect(Collectors.summarizingInt(Movie::getDurationTimes));
        System.out.println("Total Movie :"+its.getCount());
        System.out.println("Total Duration :"+its.getSum());
        System.out.println("Average duration of all movie :"+its.getAverage());
        System.out.println("Mini duration :"+its.getMin());
        System.out.println("Max duration :"+its.getMax());

    }
}
