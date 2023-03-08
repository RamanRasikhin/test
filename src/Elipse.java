import java.util.Locale;

public class Elipse extends Shape {
    private Point center;
    private double rx, ry;
    public Elipse(Point center, double rx,double ry, Style style){
        super(style);
        this.center=center;
        this.ry=ry;
        this.rx=rx;
    }
    public String toSvg(){
        return String.format(Locale.ENGLISH, "<ellipse cx=\"%f\" cy=\"%f\" rx=\"%f\" ry=\"%f\"\n" + "  style=\"%s\" />", center.x, center.y, rx, ry, style.toSVG());
    }
}
