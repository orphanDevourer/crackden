

public class Car{

    private String plate;
    private String company;
    private String model;
    private Motor engine;
    private Conduct cndctr;

    public Car(String plate, String company, String model, Motor engine, Conduct cndctr  ){
        this.plate = model;
        this.company = company;
        this.model = model;
        this.engine = engine;
        this.cndctr = cndctr;
    }
    
    public String getplate() {
        return plate;
    }
    public void setplate(String plate) {
        this.plate = plate;
    }
    public String getcompany() {
        return model;
    }
    public void setcompany(String company) {
        this.company = model;
    }
    public String getmodel() {
        return model;
    }
    public void setmodel(String model) {
        this.model = model;
    }
    public Motor getEng() {
        return engine;
    }
    public void setEng(Motor engine) {
        this.engine = engine;
    }
    public Conduct getCond() {
        return cndctr;
    }
    public void setCond(Conduct cndctr) {
        this.cndctr = cndctr;
    }
    public void showEm(){
        System.out.println("the whip:");
        System.out.println("company:" + company);
        System.out.println("model:" + model);
        System.out.println("plate:" + plate);
        System.out.println("conductor:" + cndctr);
        System.out.println("engine:" + engine);
    }

}