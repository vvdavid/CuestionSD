package jdbc;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.jfree.data.category.DefaultCategoryDataset;
import tools.DBTools;

public class TestJDBC {

    public static int agrega(int idUsuario, double calificacion, int buenas, int malas, int total, int duracion) {
        try (
                PreparedStatement ps = DBTools.getConnection().prepareStatement(
                        "INSERT INTO Test (idUsuario, calificacion, buenas, malas, total, fecha, duracion)"
                        + "VALUES (?,?,?,?,?,datetime('now', 'localtime'),?)",
                        Statement.RETURN_GENERATED_KEYS);) {
            ps.setInt(1, idUsuario);
            ps.setDouble(2, calificacion);
            ps.setInt(3, buenas);
            ps.setInt(4, malas);
            ps.setInt(5, total);
            ps.setInt(6, duracion);
            ps.executeUpdate();

            ResultSet keys = ps.getGeneratedKeys();
            keys.next();
            return keys.getInt(1);
        } catch (SQLException e) {
            System.err.println(e);
        }
        return 0;
    }

    public static void cargaTests(int idUsuario, JTable tabla) {
        try (
                PreparedStatement ps
                = DBTools.getConnection().prepareStatement("SELECT id, fecha, calificacion, duracion, buenas, malas, total\n"
                        + "FROM test WHERE idUsuario=" + idUsuario);
                ResultSet rs = ps.executeQuery();) {
            DefaultTableModel model = (DefaultTableModel) tabla.getModel();
            model.setRowCount(0);
            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getDouble(3),
                    rs.getInt(4) / 1000,
                    rs.getInt(5),
                    rs.getInt(6),
                    rs.getInt(7),});
            }
        } catch (SQLException e) {
            System.err.println(e);
        }

    }

    public static void actualiza(int idTest, double calificacion, int correctos, int incorrectos, int time) {
        try (PreparedStatement ps = DBTools.getConnection().prepareStatement("UPDATE Test set calificacion=?, buenas=?, malas=?, duracion=? WHERE id=?")) {
            ps.setDouble(1, calificacion * 100);
            ps.setInt(2, correctos);
            ps.setInt(3, incorrectos);
            ps.setInt(4, time);
            ps.setInt(5, idTest);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e);
        }
    }

    public static DefaultCategoryDataset cargaBarras(int idUsuario) {
        try (
                PreparedStatement ps = DBTools.getConnection().prepareStatement(
                        "SELECT strftime('%d-%m-%Y',fecha) soloFecha, COUNT(*) FROM test WHERE idUsuario = 1 GROUP BY soloFecha");
                ResultSet rs = ps.executeQuery();) {
            DefaultCategoryDataset barDataset = new DefaultCategoryDataset();
            while (rs.next()) {
                barDataset.addValue(rs.getInt(2), "Resueltos", rs.getString(1));
            }
            return barDataset;
        } catch (SQLException ex) {
            System.err.println(ex);
            return null;
        }
    }
}
