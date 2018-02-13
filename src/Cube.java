public class Cube extends Shape3D {

    private double side;
    private final int apexes = 8;

    public Cube(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public String toString() {
        return "Bok sześcianu: " + side;
    }
}
