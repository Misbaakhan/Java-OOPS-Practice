abstract class Abstraction {
    abstract void engine();
}
class Car extends Abstraction {
    public void engine() {
        System.out.println("every car needs engine");
    }
    public void Drive() {
        System.out.println("she knows to drive");
    }
}
class Bike extends Abstraction {
    public void engine() {
        System.out.println("every bike has an engine");
    }
}
public class AbstractDemo {
    public static void main(String[] args) {
        Car car = new Car();
        car.engine();
        Bike bike = new Bike();
        bike.engine();

    }

}
