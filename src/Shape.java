public abstract class Shape {
    private double dimensionX;

    public Shape(double dimensionX) {
        this.dimensionX = dimensionX;
    }

    public double getDimensionX() {
        return dimensionX;
    }

    public void setDimensionX(double dimensionX) {
        this.dimensionX = dimensionX;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "dimensionX=" + dimensionX +
                '}';
    }
}
