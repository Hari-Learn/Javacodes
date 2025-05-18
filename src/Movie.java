public class Movie {

    String title;
    int durationTimes;


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
    @Override
    public String toString() {
        return "Movie{" +
                "durationTimes=" + durationTimes +
                ", title='" + title + '\'' +
                '}';
    }



}
