package movie;
public class Streaming extends Movie{
    
    private String platform;

    public Streaming(Director director, Integer launchDt, String title, String platform) {
        super(director, launchDt, title);
        this.platform = platform;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    @Override
    public String showEm() {
        return super.showEm() + "\n Platform: " + platform;
    }
}