public class Main {
    public static final Point test= new Point(2, 3);
    public static void main(String[] args) {
        Point point=new Point(2, 3);
        System.out.println( point.x );

        String s=String.format("%f", point.x);
        System.out.println(s);
    };
    int array[]=new int[4]{ 0, 1, 2, 3, 4};

}