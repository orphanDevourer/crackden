import models.*;
public class App {
    public static void main(String[] args) throws Exception {
        conductor conductor = new conductor("nigga","6969");
        conductor conductor2 = new conductor("Meganigga","9999");

        motor motor = new motor("electric",2000);
        motor motor2 = new motor("gas",1000);

        car car = new car("xxx-420","quid","shitfuck");
        car car2 = new car("yyy-123","fatfuck","ratfucker",conductor2, motor2);

        car2.setConductor(conductor);
        car.setConductor(conductor2);
    }
}
