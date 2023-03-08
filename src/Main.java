import java.util.ArrayList;
import java.util.Locale;

public class Main {
    public static final Point test = new Point(2,3);
    public static void main(String[] args) {
        Point point= new Point(2,3);
        point=null;
        Double test=2.3;
        test=null;
        System.out.println(point.test);
        Point point2= new Point(1, 2);
        point2.test=3;
        System.out.println(point2.test);
    }


}