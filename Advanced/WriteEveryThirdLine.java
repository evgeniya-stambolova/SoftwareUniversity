import java.io.*;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WriteEveryThirdLine {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader ( new FileReader ( "C:\\Users\\000\\Desktop\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt" ) );

        Stream<String> lines = reader.lines ();

        List<String> stringLine = lines.collect( Collectors.toList ());

        BufferedWriter writer = new BufferedWriter ( new FileWriter ( "C:\\Users\\000\\Desktop\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\05.WriteEveryThirdLineOutput.txt" ) );

        for (int i = 0; i <stringLine.size () ; i++) {
            if((i+1)%3==0){
                writer.write ( stringLine.get ( i ) );
                writer.newLine ();
            }
        }
        writer.close ();
    }
}
