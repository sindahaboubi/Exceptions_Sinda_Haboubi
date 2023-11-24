import java.io.*;

public class TestExceptions {
    public static void main(String[] args) {
        // Open the Input file
        File inputFile = new File("Sample.jpg");
        // Open the Output file
        File outputFile1 = new File("Output1.jpg");

        FileInputStream in1 = null;
        FileOutputStream out1 = null;

        try {
            in1 = new FileInputStream(inputFile);
            out1 = new FileOutputStream(outputFile1);

            int c1;

            while ((c1 = in1.read()) != -1) {   // Until end of file
                out1.write(c1);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (in1 != null) {
                    in1.close();
                }
                if (out1 != null) {
                    out1.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}



