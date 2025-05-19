public class Movies {
    String title;
    int duration;
    double rating;
    String genre;
    int releasedyear;

    public Movies(String title, int duration, double rating, String genre, int releasedyear) {
        this.title = title;
        this.duration = duration;
        this.rating = rating;
        this.genre = genre;
        this.releasedyear = releasedyear;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getReleasedyear() {
        return releasedyear;
    }

    public void setReleasedyear(int releasedyear) {
        this.releasedyear = releasedyear;
    }
}
