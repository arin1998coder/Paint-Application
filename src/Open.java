import java.io.IOException;

public class Open {

//opens a new file as an object of Paint
    public Paint openFile(int id) {
        String fileName="file"+id+".ser";
        Paint myCanvas = null;
        try {
            myCanvas = (Paint) SerializationUtil.deserialize(fileName);

        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }

        return myCanvas;
    }
}
