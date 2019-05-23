package jdbc;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import tools.DBTools;

public class TestJDBC {

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
                    rs.getInt(4)/1000,
                    rs.getInt(5),
                    rs.getInt(6),
                    rs.getInt(7),
                });
            }
        } catch (SQLException e) {
            System.err.println(e);
        }

    }
}
