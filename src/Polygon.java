import java.util.Locale;

public class Polygon {
    private Point[] arr;
    private Style styleSettings;
    public Polygon(int count, Style styleSettings)
    {
        arr = new Point[count];
        this.styleSettings = styleSettings;
    }
    public Polygon(int count) {
        arr = new Point[count];
    }

    public void setPoint(int index, Point point) {
        arr[index] = point;
    }

    public void setPoints(Point[] points){
        arr = points;
    }

    public String toSvg() {
        String pointsString = "";
        for(Point point : arr)
            pointsString += point.x + "," + point.y + " ";

        return String.format(Locale.ENGLISH,"<polygon points=\"%s\" style = \"%s\" />", pointsString, styleSettings.toSVG());
    }
    public Point getMaxCords(){
        Point results =new Point(0,0);
        for (Point point : arr){
            if (point.x > results.x)
            {
                results.x = point.x;
            }
            if (point.y > results.y)
            {
                results.y = point.y;
            }
        }
        return results;
    }

}