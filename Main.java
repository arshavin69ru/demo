import java.io.FileOutputStream;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {
        byte[] bytes = "apples are cool".getBytes();

        FileOutputStream fout = null;
        try {
            fout = new FileOutputStream("C:\\Users\\Vladimir\\Desktop\\testtext.txt");
            fout.write(bytes);

        } catch (Exception e) {

        } finally {

            try {
                if (fout != null)
                    fout.close();

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
