package movie;
public class Director {

    private String name;
    private String nationality;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public Director(String name, String nationality) {
        this.name = name;
        this.nationality = nationality;
    }

    @Override
    public String showEm() {
        return name + " (" + nationality + ")";
    }
}