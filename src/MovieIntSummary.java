import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
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
        List<Movie> movies = Arrays.asList(
                new Movie("Coolie",180,8.6),
                new Movie("ThugLife",280,9.0),
                new Movie("PS1",190,7.9),
                new Movie("Amaran",240,7.0),
                new Movie("Nobody",300,8.7),
                new Movie("Jailer",90,7.4));

        movie.forEach(movie1 -> System.out.println(movie1.getTitle()));
        IntSummaryStatistics its = movie.stream().collect(Collectors.summarizingInt(Movie::getDurationTimes));
        System.out.println("Total Movie :"+its.getCount());
        System.out.println("Total Duration :"+its.getSum());
        System.out.println("Average duration of all movie :"+its.getAverage());
        System.out.println("Mini duration :"+its.getMin());
        System.out.println("Max duration :"+its.getMax());

        Map<Boolean,IntSummaryStatistics> movieStats = movies.stream()
                                                .collect(Collectors.partitioningBy(n->n.getRating()>8.0,
                                                        Collectors.summarizingInt(Movie::getDurationTimes)));

        IntSummaryStatistics greaterThanEight = movieStats.get(true);
        IntSummaryStatistics lesserThanEight = movieStats.get(false);
        System.out.println("Total count of rating greaterThanEight :"+greaterThanEight.getCount());
        System.out.println("Total sum of rating greaterThanEight :"+greaterThanEight.getSum());
        System.out.println("Max of rating greaterThanEight :"+greaterThanEight.getMax());
        System.out.println("Min of rating greaterThanEight :"+greaterThanEight.getMin());
        System.out.println("=====================================");
        System.out.println("Total count of rating lesserThanEight :"+lesserThanEight.getCount());
        System.out.println("Total sum of rating lesserThanEight :"+lesserThanEight.getSum());
        System.out.println("Max of rating lesserThanEight :"+lesserThanEight.getMax());
        System.out.println("Min of rating lesserThanEight :"+lesserThanEight.getMin());

    }
}
