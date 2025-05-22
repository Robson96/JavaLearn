package cap6;

public class Main {
    public static void main(String[] args) {
        Bicycle bicycle1 = new Bicycle();
        Bicycle bicycle2 = new Bicycle();

        bicycle1.changeCadence(50);
        bicycle1.speedUp(10);
        bicycle1.changeGear(2);
        bicycle1.printStates();

        bicycle2.changeCadence(50);
        bicycle2.speedUp(10);
        bicycle2.changeGear(2);
        bicycle2.changeCadence(40);
        bicycle2.speedUp(10);
        bicycle2.changeGear(3);
        bicycle2.printStates();

        MountainBike mountainBike = new MountainBike();
        mountainBike.speedUp(100);
        mountainBike.printStates();
    }
}
