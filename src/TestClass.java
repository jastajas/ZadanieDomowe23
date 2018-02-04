public class TestClass {
    public static void main(String[] args) {

        Circle circle = new Circle(12);
        Rectangle rectangle = new Rectangle(12,17);

        Ball ball = new Ball(23);
        Cube cube = new Cube(14);

        ShapeCalculator sc = new ShapeCalculator();

        sc.circleArea(circle);

        sc.rectangleArea(rectangle);

        sc.ballVolume(ball);

        sc.cubeVolume(cube);

    }
}
