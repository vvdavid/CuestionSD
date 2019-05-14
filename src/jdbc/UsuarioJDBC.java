package jdbc;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import pojos.Usuario;
import tools.DBTools;

public class UsuarioJDBC {

    /**
     * Consulta el usuario con el nombre y hash solicitados y de existir,
     * devuelte un pojo con su respectiva información.
     *
     * @param nombre
     * @param encodedPass
     * @return un nuevo usuario si existe, de lo contrario, null
     */
    public static Usuario ingresa(String nombre, String encodedPass) {
        Usuario usuario = null;
        try {
            PreparedStatement ps = DBTools.getConnection().prepareStatement(
                    "SELECT * FROM usuario where nombre=? AND pass=?");
            ps.setString(1, nombre);
            ps.setString(2, encodedPass);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                usuario = new Usuario(rs.getInt(1), rs.getString(2), rs.getString(3));
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }
        return usuario;
    }

    public static void cargaTabla(JTable tablaExamenJT) {
        try (
                PreparedStatement ps = DBTools.getConnection().prepareStatement(
                        "SELECT * FROM usuario");
                ResultSet rs = ps.executeQuery();) {
            DefaultTableModel model = (DefaultTableModel) tablaExamenJT.getModel();
            model.setRowCount(0);
            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getString(3)
                });
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public static void agrega(String nombre, String password) {
        try (PreparedStatement ps = DBTools.getConnection().prepareStatement(
                "INSERT INTO usuario (nombre, pass) VALUES (?, ?)");) {
            ps.setString(1, nombre);
            ps.setString(2, password);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e);
        }
    }

    public static void actualiza(int id, String nombre, String pass) {
        try (PreparedStatement ps = DBTools.getConnection().prepareStatement(
                "UPDATE usuario SET nombre=?, pass=? WHERE id=?");) {
            ps.setString(1, nombre);
            ps.setString(2, pass);
            ps.setInt(3, id);

            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e);
        }
    }

    public static void elimina(String id) {
        try (PreparedStatement ps = DBTools.getConnection().prepareStatement(
                "DELETE FROM usuario WHERE id=?");) {
            ps.setString(1, id);

            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e);
        }
    }
}
