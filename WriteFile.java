
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteFile {

    public static void main(String[] args) {
        FileWriter fw = null;
        PrintWriter pw = null;
        try {
            fw = new FileWriter("./output.txt");
            pw = new PrintWriter(fw);
            String s1 = "Java is robust";
            String s2 = "Java is influenced by C++";
            pw.println(s1);
            pw.println(s2);
            pw.flush();
            pw.close();
            fw.close();
        } catch (IOException e) {
            System.out.println("File not exists");
        }
    }
}
