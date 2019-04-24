package tools;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

public class DBTools {

    public static String path = System.getenv("APPDATA") + File.separatorChar + "Cuestion" + File.separatorChar + "cuestion_data";

    // única instancia de Connection
    private static Connection con;

    public static Connection getConnection() {
        if (con == null) {
            try {
                con = DriverManager.getConnection("jdbc:sqlite:" + path);
                PreparedStatement ps = con.prepareStatement("PRAGMA foreign_keys = ON");
                ps.execute();
                ps.close();
            } catch (SQLException ex) {
                System.err.println(ex);
            }
        }
        return con;
    }

    public static void main(String[] args) {
        try (
                PreparedStatement ps = DBTools.getConnection().prepareStatement("DELETE FROM examen WHERE id=1");) {
            int r = ps.executeUpdate();
            System.out.println("r = " + r);
        } catch (SQLException e) {
            System.err.println(e);
        }
    }

}
