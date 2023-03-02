import java.io.*;
import java.net.URL;
import java.util.Scanner;

public class Main {
    public static final String FILENAME = "hitch1.txt";
    public static final int PAGESIZE = 25;
    public static void main(String[] args) throws IOException {
        URL w3 = new URL("https://w3.miun.se/");
        final InputStream w3InputStream = w3.openStream();
        InputStreamReader reader = new InputStreamReader(w3InputStream);
        BufferedReader buffferedReader = new BufferedReader(reader);
        String line = null;
        int lineCount = 0;
        while((line = buffferedReader.readLine()) != null){
            lineCount++;
            writeFormatted(line, lineCount);

            if(lineCount % PAGESIZE == 0){
                Scanner sc = new Scanner(System.in);
                sc.next();
            }
        }
        reader.close();
    }

    private static void writeFormatted(String line, int lineNumber) {
        System.out.println(String.format("%4d: %s", lineNumber, line));

    }
}