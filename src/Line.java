import java.io.Serializable;

public class Line extends Shape implements Drawable,Colorable, Serializable {
    public void draw() {
        setShape("Line");
        System.out.println(getShape()+" is drawn");
    }

    public void color(String color) {
        setColor(color);
        System.out.println("Color is "+getColor());
    }
}
