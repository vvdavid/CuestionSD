package main;

import gui.Login;
import com.alee.laf.WebLookAndFeel;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import tools.GUITools;

public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                // Install WebLaF as application L&F
                WebLookAndFeel.install();

                //check if bd exists, if not, create it, 
                char s = File.separatorChar;
                File bd = new File(System.getenv("APPDATA") + s + "Cuestion" + s + "cuestion_data");
                if (!bd.exists()) {
                    bd.mkdirs();
                    copy(getClass().getResourceAsStream("/resources/cuestion_data"), bd.getAbsolutePath());
                    JOptionPane.showMessageDialog(null, "Inicializando base de datos", "Inicializando", JOptionPane.WARNING_MESSAGE);
                }
                //login
                GUITools.openJFrame(null, new Login());
            }
        });
    }
    
    public static boolean copy(InputStream source , String destination) {
        boolean succeess = true;
        try {
            Files.copy(source, Paths.get(destination), StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException ex) {
            System.err.println(ex);
            succeess = false;
        }
        return succeess;
    }
}
