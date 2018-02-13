import static java.lang.Math.*;

public class ShapeCalculator extends LineCalc implements Calc2D, Calc3D{

    public double circleArea(Circle circle){
        return PI*pow(circle.getRadius(),2);
    }

    public double circleCircumference(Circle circle){
        return 2*PI*circle.getRadius();
    }

    public double rectangleArea (Rectangle rectangle){
        return rectangle.getSideA()*rectangle.getSideB();
    }

    public double rectangleCircumference (Rectangle rectangle){
        return (2 * rectangle.getSideA()) + (2 * rectangle.getSideB());
    }

    public double ballVolume(Ball ball){
        return (4/3)*PI*pow(ball.getRadius(),3);
    }

    public double ballSurfaceArea(Ball ball){
        return 4*PI*pow(ball.getRadius(),2);
    }

    public double cubeVolume(Cube cube){
        return pow(cube.getSide(),3);
    }

    public double cubeSurfaceArea(Cube cube){
        return 6*(pow(cube.getSide(),2));
    }

}
