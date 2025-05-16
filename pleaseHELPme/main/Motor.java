
public class Motor {
    
    private String type;
    private Integer pot;

    public Motor(String type, Integer pot){
        this.type = type;
        this.pot = pot;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public Integer getPot() {
        return pot;
    }
    public void setPot(Integer pot) {
        this.pot = pot;
    }

    public String toString() {
        return "TYPE: " + type + ", POTENC: " + pot + "cv";
    }
    
}
