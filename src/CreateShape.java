import java.util.Locale;
import java.util.Scanner;

public class CreateShape implements ShapeCreator{

    private static Scanner sc = new Scanner(System.in);

    public Line2D createLine(){
        sc.useLocale(Locale.US);
        System.out.println("Podaj współrzędne końców odcinka.");
        System.out.println("x1:");
        double x1 = sc.nextDouble();
        System.out.println("y1:");
        double y1 = sc.nextDouble();
        System.out.println("x2:");
        double x2 = sc.nextDouble();
        System.out.println("y2:");
        double y2 = sc.nextDouble();
        return new Line2D(x1, y1, x2, y2);
    }

    public Circle createCircle(){
        sc.useLocale(Locale.US);
        System.out.println("Podaj promień koła:");
        double radius = sc.nextDouble();
        return new Circle(radius);
    }

    public Rectangle createRectangle(){
        sc.useLocale(Locale.US);
        System.out.println("Podaj boki prostokąta.");
        System.out.println("Bok A:");
        double sideA = sc.nextDouble();
        System.out.println("Bok B:");
        double sideB = sc.nextDouble();
        return new Rectangle(sideA, sideB);
    }

    public Ball createBall(){
        sc.useLocale(Locale.US);
        System.out.println("Podaj promień kuli:");
        double radius = sc.nextDouble();
        return new Ball(radius);
    }

    public Cube createCube(){
        sc.useLocale(Locale.US);
        System.out.println("Podaj bok sześcianu:");
        double side = sc.nextDouble();
        return new Cube(side);
    }
}
