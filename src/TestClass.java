public class TestClass {
    public static void main(String[] args) {

        CreateShape createShape = new CreateShape();

        Line2D line = createShape.createLine();
        Circle circle = createShape.createCircle();
        Rectangle rectangle = createShape.createRectangle();
        Ball ball = createShape.createBall();
        Cube cube = createShape.createCube();

        ShapeCalculator sCalc = new ShapeCalculator();

        System.out.printf("Długość odcinka wynosi: %.2f \n", sCalc.lineLength(line));
        System.out.printf("Pole koła wynosi: %.2f \n", sCalc.circleArea(circle));
        System.out.printf("Obwód koła wynosi: %.2f \n", sCalc.circleCircumference(circle));
        System.out.printf("Pole prostokąta wynosi: %.2f \n", sCalc.rectangleArea(rectangle));
        System.out.printf("Obwód prostokąta wynosi: %.2f \n", sCalc.rectangleCircumference(rectangle));
        System.out.printf("Objętość kuli wynosi: %.2f \n", sCalc.ballVolume(ball));
        System.out.printf("Powierzchnia kuli wynosi: %.2f \n", sCalc.ballSurfaceArea(ball));
        System.out.printf("Objętość sześcianu wynosi: %.2f \n", sCalc.cubeVolume(cube));
        System.out.printf("Powierzchnia sześcianu wynosi: %.2f \n", sCalc.cubeSurfaceArea(cube));

    }
}
