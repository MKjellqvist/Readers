package web;

import javax.swing.*;

public class WebPageFrame extends JFrame {
    private static final String TITLE = "My silly browser";
    private final JTextPane textPane = new JTextPane();
    public WebPageFrame(String contents) {
        super(TITLE);
        textPane.setContentType("text/html");
        textPane.setText(contents);
        add(textPane);
        setSize(600, 500);
    }

    public void showFrame() {
        setVisible(true);
    }
}
