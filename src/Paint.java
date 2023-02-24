import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Paint implements Serializable {
    private static final long serialVersionUID = 6529685098267757690L;
    private List<Shape> shapes; //contains all the shapes along with the color i have drawn
    public Paint(){
        shapes = new ArrayList<>();
    }

    //to draw a rectangle shape without color
    public void addRectangle(){
        Rectangle rectangle = new Rectangle();
        rectangle.draw();
        addShapes(rectangle);
    }
    //to draw a rectangle shape with a color
    public void addRectangle(String color){
        Rectangle rectangle = new Rectangle();
        rectangle.draw();
        rectangle.color(color);
        addShapes(rectangle);
    }

    //to draw a circle shape without color
    public void addCircle(){
        Circle circle = new Circle();
        circle.draw();
        addShapes(circle);
    }
    //to draw a circle shape with a color
    public void addCircle(String color){
        Circle circle = new Circle();
        circle.draw();
        circle.color(color);
        addShapes(circle);
    }

    //to draw a line shape without color
    public void addLine(){
        Line line = new Line();
        line.draw();
        addShapes(line);
    }
    //to draw a line shape with a color
    public void addLine(String color){
        Line line = new Line();
        line.draw();
        line.color(color);
        addShapes(line);
    }
    //add drawn shapes to the list
    private void addShapes(Shape shape){

        shapes.add(shape);
    }
    //to erase any existing shape from the file
    public String eraseShape(int shapeInd){
        int size=shapes.size();
        if(shapeInd>=0 && shapeInd<size){
            Shape deletedShape=shapes.get(shapeInd);
            shapes.remove(shapeInd);
            return deletedShape.getShape()+" with color "+deletedShape.getColor()+" is deleted ";
        }
        return "Shape you want to delete has not been drawn yet";
    }

    //display the drawing board of my current instance
    public void displayCanvas(){
        int count=0;
        for(Shape shape:shapes){
            System.out.println(count+" Shape: "+shape.getShape()+" Color: "+shape.getColor());
            count++;
        }
    }

}
