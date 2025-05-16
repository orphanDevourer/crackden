
public class Conduct {
    
    private  String CNH;
    private String name;

    public  Conduct(String CNH, String name ){
        this.CNH = CNH;
        this.name = name;
    }

    public String getCNH() {
        return CNH;
    }
    public void setCNH(String CNH) {
        this.CNH = CNH;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
    return "Name: " + name + ", CNH: " + CNH;
    }


}
