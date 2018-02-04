import java.util.Objects;

public class Shape3D extends Shape{

    private double area;
    private double volume;

    public Shape3D(double dimensionX, double area, double volume) {
        super(dimensionX);
        this.area = area;
        this.volume = volume;
    }


    public Shape3D(double dimensionX) {
        super(dimensionX);
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Shape3D{" +
                "area=" + area +
                ", volume=" + volume +
                '}' + super.toString();
    }
}


