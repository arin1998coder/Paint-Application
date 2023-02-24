import java.util.InputMismatchException;
import java.util.Scanner;

//user can open the paint file with the id provided and existing drawings will be present whatever he last drew and he can then draw more on this
public class DrawInExistingFile extends CanvasOperations {
    Paint file;
    int id;
    Scanner sc;
    public DrawInExistingFile(Paint p,int id){
        file=p;
        this.id=id;
        sc = new Scanner(System.in);
        System.out.println("welcone to Paint House\nFileName : file"+id);
    }
    public void draw(){
        drawShapes(file);
    }
    public void delete(){
        deleteShape(file);
    }
    public void save(){
        Save s= new Save();
        System.out.println("Press 1 to save current file\nPress 2 to save this file as a new File\nPress Anyother Key if you dont want to save");
        int response;
        try{
            response=sc.nextInt();
            if(response==1){
                s.updateAndSave(file,id);
                System.out.println("File Saved successfully");
            }
            else if(response==2){
                saveFile(file);
            }
        }
        catch (InputMismatchException ex){
            System.out.println("You Decided not to Save the File");
        }
    }
}
