import java.io.FileOutputStream;

public class Main {
    public static void main(final String[] args) {

        final byte[] bytes = "apples are cool".getBytes();

        FileOutputStream fout = null;
        try {
            fout = new FileOutputStream("C:\\Users\\Vladimir\\Desktop\\testtext.txt");
            fout.write(bytes);
            System.out.println("bytes written to the file!");

        } catch (final Exception e) {
            System.out.println("Failed to write bytes to the file :(");

        } finally {

            try {
                if (fout != null)
                    fout.close();

            } catch (final Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
