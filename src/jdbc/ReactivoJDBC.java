package jdbc;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import pojos.Tipo;
import tools.DBTools;

public class ReactivoJDBC {

    public static void cargaTablaTipoCompleto(JTable tabla, int idExamen) {
        try (
                PreparedStatement ps = DBTools.getConnection().prepareStatement(
                        "SELECT reactivo.id, reactivo.descripcion, reactivo.idTipo, tipo.nombre\n"
                        + "FROM reactivo, tipo\n"
                        + "WHERE reactivo.idTipo=tipo.id AND reactivo.idExamen=" + idExamen);
                ResultSet rs = ps.executeQuery();) {

            DefaultTableModel model = (DefaultTableModel) tabla.getModel();
            model.setRowCount(0);
            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getInt(1),
                    rs.getString(2),
                    new Tipo(rs.getInt(3), rs.getString(4))
                });
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public static void cargaContadores(int idExamen, JLabel totalJL, JLabel... tipoLabels) {
        try (
                PreparedStatement ps = DBTools.getConnection().prepareStatement(
                        "SELECT idTipo, count(*)\n"
                        + "FROM Reactivo\n"
                        + "WHERE idExamen=" + idExamen + "\n"
                        + "GROUP BY idTipo");
                ResultSet rs = ps.executeQuery();) {
            for (JLabel label : tipoLabels) {
                label.setText("0");
            }

            int total = 0;
            while (rs.next()) {
                int actualCount = rs.getInt(2);
                total += actualCount;
                tipoLabels[rs.getInt(1) - 1].setText("" + actualCount);
            }
            totalJL.setText("" + total);

        } catch (SQLException e) {
            System.err.println(e);
        }
    }

    public static int agrega(int idExamen, int idTipo, String descripcion) {
        try (
                PreparedStatement ps = DBTools.getConnection().prepareStatement(
                        "INSERT INTO Reactivo (idExamen, idTipo, descripcion) VALUES (?,?,?)",
                        Statement.RETURN_GENERATED_KEYS);) {

            ps.setInt(1, idExamen);
            ps.setInt(2, idTipo);
            ps.setString(3, descripcion);
            ps.executeUpdate();

            ResultSet keys = ps.getGeneratedKeys();
            keys.next();
            return keys.getInt(1);

        } catch (SQLException e) {
            System.err.println(e);
        }
        return 0;
    }

    public static void actualiza(int idReactivo, int idTipo, String descripcion) {
        try (
                PreparedStatement ps = DBTools.getConnection().prepareStatement(
                        "UPDATE reactivo SET descripcion=?, idTipo=? WHERE id=?");) {
            ps.setString(1, descripcion);
            ps.setInt(2, idTipo);
            ps.setInt(3, idReactivo);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e);
        }
    }

}
