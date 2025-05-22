package cap6;

public class Bicycle {
    int cadence = 0;
    int speed = 0;
    int gear = 1;

    void changeCadence(int newValue) {
        cadence = newValue;
    }

    void changeGear(int newValue) {
        gear = newValue;
    }

    void speedUp(int increment) {
        speed += increment;
    }

    void applyBrakes(int decrement) {
        speed -= decrement;
    }

    void printStates() {
        System.out.println("cadence: " + cadence);
        System.out.println("speed: " + speed);
        System.out.println("gear: " + gear);
    }
}
