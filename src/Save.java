import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

//helps the user to Save the paint object to a File
//so that the user can anytime open it and start reusing it from the last state
public class Save {

    public void updateAndSave(Paint canvas,int id){
        String fileName="file"+id+".ser";
        try {
            SerializationUtil.serialize(canvas, fileName);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public boolean addFile(Paint canvas,int id) {
        boolean isFileExists=false;
        String fileName="file"+id+".ser";
        isFileExists=checkFileNameExists(fileName);
        if(isFileExists) return false;
        //serialize to file
        try {
            SerializationUtil.serialize(canvas, fileName);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return true;
    }
    //checks if the file with the provided name allready exists
    public boolean checkFileNameExists(String filename){

        File f =new File(filename);
        if(f.exists()) return true;
        else return false;
    }
}