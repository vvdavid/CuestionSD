package tools;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
//        DBTools.elimina("examen", "reactivo", "idExamen", "Los reactivos asociados con este examen también se eliminarán, ¿continuar?",
//                1);
        DBTools.elimina("usuario", "test", "idUsuario", "Los tests asociados con este usuario también se eliminarán, ¿continuar?",
                1);
    }

    public static void elimina(String table, String childTable, String fkName, String warning, int id) {
        try (
                //solo se elimina de usuario y examen
                PreparedStatement psCheck = DBTools.getConnection().prepareStatement("SELECT * FROM " + childTable + " WHERE " + fkName + "=" + id);
                PreparedStatement psDelete = DBTools.getConnection().prepareStatement("DELETE FROM " + table + " WHERE id=?");) {
            boolean hasChildren = psCheck.executeQuery().next();
            //eliminar si no tiene o si dice que si
            if (!hasChildren || JOptionPane.showConfirmDialog(null, warning, "Advertencia", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
                psDelete.setInt(1, id);
                int r = psDelete.executeUpdate();
                psDelete.close();
                if (r <= 0) {
                    JOptionPane.showMessageDialog(null, "Error eliminando " + table, "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (SQLException e) {
            System.err.println(e);
        }
    }

}
