package cap5;

public final class Circle implements Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double surface() {
        return Math.PI * radius * radius;
    }
}
