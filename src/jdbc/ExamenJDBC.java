package jdbc;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import tools.DBTools;

public class ExamenJDBC {

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

}
