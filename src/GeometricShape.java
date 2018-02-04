public abstract class GeometricShape extends Shape2D {

    private double area;
    private double circumference;

    public GeometricShape(double dimensionX) {
        super(dimensionX);
    }

    public GeometricShape(double dimensionX, double area, double circumference) {
        super(dimensionX);
        this.area = area;
        this.circumference = circumference;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getCircumference() {
        return circumference;
    }

    public void setCircumference(double circumference) {
        this.circumference = circumference;
    }

    @Override
    public String toString() {
        return "GeometricShape{" +
                "area=" + area +
                ", circumference=" + circumference +
                '}' + super.toString();
    }
}
