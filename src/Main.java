import web.WebPageFrame;

import javax.swing.*;
import java.io.*;
import java.net.URL;
import java.util.Scanner;

public class Main {
    public static final String FILENAME = "hitch1.txt";
    public static final int PAGESIZE = 24;
    public static void main(String[] args) throws IOException {
        URL w3 = new URL("https://w3.miun.se/");
        final InputStream w3InputStream = w3.openStream();
        InputStreamReader reader = new InputStreamReader(w3InputStream);
        BufferedReader buffferedReader = new BufferedReader(reader);
        String line = null;
        int lineCount = 0;
        StringBuilder pageContents = new StringBuilder();
        while((line = buffferedReader.readLine()) != null){
            lineCount++;
            pageContents.append(line + "\n");
        }
        reader.close();
        showContents(pageContents.toString());
        System.out.println(pageContents);
    }

    private static void showContents(String toString) {
        WebPageFrame webPageFrame = new WebPageFrame(toString);
        webPageFrame.showFrame();
    }

    private static void writeFormatted(String line, int lineNumber) {
        System.out.println(String.format("%4d: %s", lineNumber, line));

    }
}