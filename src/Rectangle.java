import java.io.Serializable;

public class Rectangle extends Shape implements Drawable,Colorable, Serializable {
    public void draw() {
        setShape("Rectangle");
        System.out.println(getShape()+" is drawn");
    }

    public void color(String color) {
        setColor(color);
        System.out.println("Color is "+getColor());
    }
}