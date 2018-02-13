import static java.lang.Math.*;

public class LineCalc {

    public double lineLength(Line2D line){
        return sqrt(pow((line.getX2() - line.getX1()), 2)+pow((line.getX2() - line.getX1()), 2));
    }
}
