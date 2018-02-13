public class Rectangle extends GeometricShape {
    private double sideA;
    private double sideB;
    private final int apexes = 4;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    @Override
    public String toString() {
        return "Prostokąt o wymiarach: " + sideA + " x " + sideB;
    }
}
