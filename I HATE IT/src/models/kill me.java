package models;

public class car {
    
    private String plate;
    private String model;
    private String company;
    private conductor conductor;
    private motor motor;

    public car(String plate,String model,String company,conductor conductor, motor motor){
        this.plate = plate;
        this.model = model;
        this.company = company;
        this.motor = motor;
        this.conductor = conductor;
    }

    public car(String plate,String model,String company){
        this.plate = plate;
        this.model = model;
        this.company = company;
    }
    public String getPlate() {
        return plate;
    }
    public void setPlate(String plate) {
        this.plate = plate;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getCompany() {
        return company;
    }
    public void setCompany(String company) {
        this.company = company;
    }
    public conductor getConductor() {
        return conductor;
    }
    public void setConductor(conductor conductor) {
        this.conductor = conductor;
    }
    public motor getMotor() {
        return motor;
    }
    public void setMotor(motor motor) {
        this.motor = motor;
    }
    

}
