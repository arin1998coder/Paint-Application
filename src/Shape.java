import java.io.Serializable;

public class Shape implements Serializable {

    private String shape;
    private String color="uncolored";
    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
