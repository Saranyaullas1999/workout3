abstract class Car{
    int gear = 0;
    int noOfWheels = 4;
    abstract void ignition();
    void changeGear(){
        gear++;
        System.out.println("Gear Shifted to " +gear);

    }

}
class Sedan extends Car{
    void ignition(){
        System.out.println("Engine Started");
    }
    void getWheelNo(){
        System.out.println("Wheels = " +noOfWheels);
    }
}


public class DemoCar {
    public static void main(String[] args) {
        Sedan s1 = new Sedan();
        s1.ignition();
        s1.changeGear();
        s1.getWheelNo();
    }
}
