import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to the Paint Application");
        char response='i';
        while(true) {
            System.out.println("Create a New File?\n\nPress Q - Quit\nPress Y - Yes\nPress N - No or anyother key except Q\n");
            try {
                response = sc.next().charAt(0);
                if (response == 'q' || response == 'Q') break; //to quit application
                if (response == 'y' || response == 'Y') {
                    New newFile = new New();
                    newFile.draw();
                    newFile.delete();
                    newFile.save();
                }

                System.out.println("Open a Existing File?\n\nPress Q - Quit\nPress Y - Yes\nPress N or Anyother key except Q - No");

                response = sc.next().charAt(0);

                if (response == 'q' || response == 'Q') break; //to quit application

                if (response == 'y' || response == 'Y') {
                    Open file = new Open();
                    System.out.println("Please specify the id of the file you want to open\n");
                    int id = sc.nextInt();
                    Paint fileObj = file.openFile(id);
                    if(fileObj!=null) {
                        fileObj.displayCanvas();
                        System.out.println("Do you want to draw in the current file?\n\nPress Q - Quit\nPress Y-Yes\nPress N or Anyother key except Q - No");
                        response = sc.next().charAt(0);

                        if (response == 'q' || response == 'Q') break; //to quit application

                        if (response == 'y' || response == 'Y') {
                            DrawInExistingFile drawInCurrFile = new DrawInExistingFile(fileObj, id);
                            drawInCurrFile.draw();
                            drawInCurrFile.delete();
                            drawInCurrFile.save();
                        }
                    }
                }
            }
            catch (InputMismatchException ex){
                System.out.println("Please provide valid responses to use the features");
            }
        }
        System.out.println("Thank you ! Open the application again to Enjoy Painting");

    }
    //MS Paint
    //File Menu 1.New operation 2.Save 3.Open
    //Support for 3 shapes 1.Rectangel Line and Circle
    //Color the shapes


}