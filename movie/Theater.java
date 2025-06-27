package movie;
public class Theater extends Movie {

    private Integer durationMin;

    public Theater(Director director, Integer launchDt, String title, Integer durationMin) {
        super(director, launchDt, title);
        this.durationMin = durationMin;
    }

    public Integer getDurationMin() {
        return durationMin;
    }

    public void setDurationMin(Integer durationMin) {
        this.durationMin = durationMin;
    }
    @Override
    public String showEm() {
        return super.showEm() + "\nDuration: " + durationMin;
    }
}