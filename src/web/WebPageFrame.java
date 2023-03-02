package web;

import javax.swing.*;

public class WebPageFrame extends JFrame {
    private static final String TITLE = "My silly browser";

    public WebPageFrame(String contents) {
        super(TITLE);
    }

    public void show() {
        setVisible(true);
    }
}
