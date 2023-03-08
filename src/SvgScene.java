import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Locale;

public class SvgScene {
     private ArrayList<Shape> shapes=new ArrayList<>();
     private int height=0, width=0;
     public void addPolygon(Shape shape) {
          shapes.add(shape);
          Point maxPoint = shape.getMaxCords();
          if (width < maxPoint.x)
          {
               width=(int) maxPoint.x + 1;
          }
          if (height < maxPoint.y)
          {
               height=(int) maxPoint.y + 1;
          }
     }
     public void save(String filename){
          String svg=String.format(Locale.ENGLISH, "<svg width =\"%d\" height=\"%d\">", width, height);
          for (Shape shape : shapes){
               svg+=shape.toSvg();
          }
          svg+="</svg>";
          try {
               FileWriter fw
                       = new FileWriter(filename);
               fw.write(svg);
               fw.close();
          }
          catch (Exception e) {
               e.getStackTrace();
          }
     }

}
