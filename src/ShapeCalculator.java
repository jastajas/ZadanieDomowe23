import static java.lang.Math.*;

public class ShapeCalculator extends LineCalc implements Calc2D, Calc3D{

    public void circleArea(Circle circle){
        System.out.printf("Powierzchnia kołą wynosi [cm2]: %.2f",PI*pow(circle.getDimensionX(),2));
        System.out.println();
    }

    public void rectangleArea (Rectangle rectangle){
        System.out.printf("Powierzchnia prostokąta wynosi [cm2]: %.2f",rectangle.getDimensionX()*rectangle.getDimensionY());
        System.out.println();
    }

    public void ballVolume(Ball ball){
        System.out.printf("Objętość kuli wynosi [cm3]: %.2f",(4/3)*PI*pow(ball.getDimensionX(),3));
        System.out.println();
    }

    public void cubeVolume(Cube cube){
        System.out.printf("Objętość sześcianu wynosi [cm3]: %.2f",pow(cube.getDimensionX(),3));
        System.out.println();
    }

}
