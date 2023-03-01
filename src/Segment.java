public class Segment {
    Point first;
    Point second;
    public Segment(Point a, Point b){
        this.first=a;
        this.second=b;

    }
    public void setFirst(Point first) {
        this.first = first;
    }

    public void setSecond(Point second) {
        this.second = second;
    }

    public Point getFirst() {
        return first;
    }

    public Point getSecond() {
        return second;
    }

}
