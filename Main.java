// keyword 'abstract' used to define an abstract class
abstract class Vehicule {
    // attributs
    protected String mark;

    // constructor
    public Vehicule(String mark) {
        this.mark = mark;
    }

    // concrete method (implemented method)
    public void start() {
        System.out.println(mark + " is starting.");
    }

    // abstract method (unimplemented method)
    public abstract void ToRoll();
}

class Car extends Vehicule {
    public Car(String mark) {
        super(mark);
    }

    @Override
    public void ToRoll() {
        System.out.println(mark + " the car is rolling.");
    }
}

class Boat extends Vehicule {
    public Boat(String mark) {
        super(mark);
    }

    @Override
    public void ToRoll() {
        System.out.println(mark + " the boat is sailing.");3
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicule myCar = new Car("Toyota");
        myCar.start();
        myCar.ToRoll();

        Vehicule myBoat = new Boat("Yamaha");
        myBoat.start();
        myBoat.ToRoll();
    }
}