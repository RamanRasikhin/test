import java.util.Locale;

public class Style {
    public final String fillColor, strokeColor;
    public final Double strokeWidth;
    public Style(String fillColor, String strokeColor, double strokeWidth){
        this.fillColor = fillColor;
        this.strokeColor = strokeColor;
        this.strokeWidth = strokeWidth;
    }
    public String toSVG(){
        String fill = this.fillColor == null? "transparent" : this.fillColor;
        String stroke = this.strokeColor == null? "black" : this.strokeColor;
        Double width = this.strokeWidth == null? 1 : this.strokeWidth;
        return String.format(Locale.ENGLISH, "stroke: %s; stroke-width:%f; fill:%s", stroke, width, fill);
    }
}
