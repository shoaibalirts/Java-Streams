
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

    public static void main(String[] args) {
        FileReader fr = null; // channel establish
        BufferedReader br = null; // filtered streams
        try {
            fr = new FileReader("input.txt");
            br = new BufferedReader(fr);
            String s = br.readLine();
            while (s != null) {
                System.out.println(s);
                s = br.readLine();
            }
            br.close();
            fr.close();
        } catch (IOException ex) {
            System.out.println(ex);
            System.out.println("File not found");
        }
    }
}
