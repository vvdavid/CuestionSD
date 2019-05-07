package jdbc;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
}
