
import java.io.BufferedReader;
import java.io.FileReader;

public class ReadFile {

    public static void main(String[] args) {
        FileReader fr = null; // channel establish
        BufferedReader br = null; // filtered streams
        try {
            fr = new FileReader("input.txt");
            br = new BufferedReader(fr);
        } catch (Exception e) {
        }
    }
