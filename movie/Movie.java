package movie;
public class Movie {

    private Director director;
    private Integer launchDt;
    private String title;

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public Integer getLaunchDt() {
        return launchDt;
    }

    public void setLaunchDt(Integer launchDt) {
        this.launchDt = launchDt;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Movie (Director director, Integer launchDt, String title) {
        this.director = director;
        this.launchDt = launchDt;
        this.title = title;
    }

    public String showEm() {
        return "\nDirected by: " + director + "\nLaunch date: " + launchDt + "\nTitle: " + title;
    }
}