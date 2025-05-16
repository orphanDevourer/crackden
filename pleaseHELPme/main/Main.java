
public class Main {
    public static void main(String[] args) {
        
       Motor mm = new Motor("nitrous", 999);
       Conduct nn = new Conduct("69420", "yo");
       Car c= new Car("ERR-404", "THingamajig", "thingamabob", mm, nn);

       c.showEm();
    }
}
