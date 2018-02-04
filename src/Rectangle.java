public class Rectangle extends GeometricShape {
    private double dimensionY;

    public Rectangle(double dimensionX, double dimensionY) {
        super(dimensionX);
        this.dimensionY = dimensionY;
    }

    public Rectangle(double dimensionX, double area, double circumference, double dimensionY) {
        super(dimensionX, area, circumference);
        this.dimensionY = dimensionY;
    }

    public double getDimensionY() {
        return dimensionY;
    }

    public void setDimensionY(double dimensionY) {
        this.dimensionY = dimensionY;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "dimensionY=" + dimensionY +
                '}' + super.toString();
    }
}
