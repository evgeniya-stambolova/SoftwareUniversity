import java.io.File;

public class ListFiles {
    public static void main(String[] args) {
        File file = new File ("C:\\Users\\Evgeniq.000\\Desktop\\04. Java-Advanced-Files-and-Streams-Lab-Resources");

        File[] files = file.listFiles ();
        for (File f : files) {
            if(!f.isDirectory ()){
                System.out.println (f.length ());
            }
        }
    }
}
