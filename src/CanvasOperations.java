import java.util.InputMismatchException;
import java.util.Scanner;

public class CanvasOperations {

    Scanner sc=new Scanner(System.in);
    public void drawShapes(Paint file){
        file.addRectangle();
        file.addCircle("green");
        file.addLine("black");
    }

    //if user wants to delete an allready drawn shape
    public void deleteShape(Paint file){

        int shapeInd=-1;     //to record the shape index user wants to delete
        System.out.println("\nDo you want to erase a shape?\n\nPress Y - Yes\nPress N or Anyother key for No - \n");
        try {
            char response=sc.next().charAt(0);
            if(response=='Y' || response=='y'){
                file.displayCanvas();
                System.out.println("Specify the shape index that you want to erase");
                shapeInd=sc.nextInt();
                System.out.println(file.eraseShape(shapeInd));
            }
        }
        catch (InputMismatchException ex){
            System.out.println("Provided response is wrong ");
            ex.printStackTrace();
        }
    }

    public void saveFile(Paint file){
        char response = 'i';
        boolean isFileSaved=false;
        //user response -yes and file exists =false : stop the loop
        //user respinse -no : stop the loop
        while(true)
            try {
                System.out.println("\nDo you want to Save Your File\nIf Yes - Press Y\nIf No - Press N or anyother key");
                response=sc.next().charAt(0);
                if (response == 'Y' || response == 'y') {
                    System.out.println("Enter file id with which u want to save ur file");
                    try {
                        int id = sc.nextInt();
                        Save s = new Save();
                        isFileSaved=s.addFile(file, id);
                        if(isFileSaved) {
                            System.out.println("File Saved Successfully");
                            break;
                        }
                        else{
                            System.out.println("File with provided name allready exists");
                        }
                    }
                    catch (InputMismatchException ex){
                        System.out.println("Please provide id in int format");
                        ex.printStackTrace();
                    }
                } else {
                    System.out.println("You have not saved ur file");
                    break;
                }
            } catch (InputMismatchException ex) {
                System.out.println("Please provide the response in the char format");
                ex.printStackTrace();
            }

    }


}
