package cap6;

import cap6.interfaces.Bicycle;

public class MountainBike implements Bicycle {

    int cadence = 0;
    int speed = 0;
    int gear = 1;

    @Override
    public void changeCadence(int newValue) {
        cadence = newValue;
    }

    @Override
    public void changeGear(int newValue) {
        gear = newValue;
    }

    @Override
    public void speedUp(int increment) {
        speed += increment;
    }

    @Override
    public void applyBrakes(int decrement) {
        speed -= decrement;
    }

    void printStates() {
        System.out.println("cadence: " + cadence);
        System.out.println("speed: " + speed);
        System.out.println("gear: " + gear);
    }
}
