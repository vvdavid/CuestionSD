package jdbc;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import pojos.Examen;
import tools.DBTools;

public class ExamenJDBC {

    public static void cargaCombo(JComboBox<Examen> combo) {
        try (
                PreparedStatement ps = DBTools.getConnection().prepareStatement(
                        "SELECT * FROM examen");
                ResultSet rs = ps.executeQuery();) {
            combo.removeAllItems();
            while (rs.next()) {
                combo.addItem(new Examen(rs.getInt(1), rs.getString(2), rs.getBoolean(3)));
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public static void cargaComboActivos(JComboBox<Examen> combo) {
        try (
                PreparedStatement ps = DBTools.getConnection().prepareStatement(
                        "SELECT * FROM examen WHERE activo=1");
                ResultSet rs = ps.executeQuery();) {
            combo.removeAllItems();
            while (rs.next()) {
                combo.addItem(new Examen(rs.getInt(1), rs.getString(2), rs.getBoolean(3)));
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public static void cargaTabla(JTable tablaExamenJT) {
        try (
                PreparedStatement ps = DBTools.getConnection().prepareStatement(
                        "SELECT * FROM examen");
                ResultSet rs = ps.executeQuery();) {
            DefaultTableModel model = (DefaultTableModel) tablaExamenJT.getModel();
            model.setRowCount(0);
            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getBoolean(3)
                });
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public static int agrega(String titulo, boolean activo) {
        try (PreparedStatement ps = DBTools.getConnection().prepareStatement(
                "INSERT INTO examen (titulo, activo) VALUES (?, ?)");) {
            ps.setString(1, titulo);
            ps.setBoolean(2, activo);
            return ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e);
        }
        return 0;
    }

    public static int modifica(int id, String titulo, boolean activo) {
        try (
                PreparedStatement ps = DBTools.getConnection().prepareStatement("UPDATE examen set titulo=?, activo=? WHERE id=?");) {

            ps.setString(1, titulo);
            ps.setBoolean(2, activo);
            ps.setInt(3, id);
            return ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e);
        }
        return 0;
    }
}
