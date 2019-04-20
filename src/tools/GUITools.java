package tools;

import javax.swing.JFrame;

public class GUITools {

    public static void openJFrame(JFrame old, JFrame newOne) {
        old.setVisible(false);
        newOne.setVisible(true);
    }
}
