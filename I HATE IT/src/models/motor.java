package models;

public class motor {
    private String type;
    private Integer potential;

    public motor(String type,Integer potential) {
        this.type = type;
        this.potential = potential;
    }

    public motor(String type2, int potential2) {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getPotential() {
        return potential;
    }

    public void setPotential(Integer potential) {
        this.potential = potential;
    }

}

