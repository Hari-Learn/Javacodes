public class Movie {

    String title;



    int durationTimes;
    double rating;

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getDurationTimes() {
        return durationTimes;
    }

    public void setDurationTimes(int durationTimes) {
        this.durationTimes = durationTimes;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Movie(String title,int durationTimes) {
        this.title = title;
        this.durationTimes = durationTimes;

    }

    public Movie(String title,int durationTimes,double rating) {
        this.title = title;
        this.durationTimes = durationTimes;
        this.rating=rating;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", durationTimes=" + durationTimes +
                ", rating=" + rating +
                '}';
    }


}
