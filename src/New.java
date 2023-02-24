import java.io.File;
import java.util.InputMismatchException;
import java.util.Scanner;

//creates a New file for the user to Paint and then has methods to delete shapes and save the file
public class New extends CanvasOperations {
    Paint p;
    char response='x';
    Scanner sc;
    public New() {
        p = new Paint();
        sc = new Scanner(System.in);
        System.out.println("Paint Home\n");

    }
    public void draw(){
        drawShapes(p);
    }
    public void delete(){
        deleteShape(p);
    }
    public void save(){
        saveFile(p);
    }
}
