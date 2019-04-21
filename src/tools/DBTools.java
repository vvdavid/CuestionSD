package tools;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBTools {

    public static String path = System.getenv("APPDATA") + File.separatorChar + "Cuestion" + File.separatorChar + "cuestion_data";

    // única instancia de Connection
    private static Connection con;

    public static Connection getConnection() {
        if (con == null) {
            try {
                con = DriverManager.getConnection("jdbc:sqlite:" + path);
            } catch (SQLException ex) {
                System.err.println(ex);
            }
        }
        return con;
    }
}
