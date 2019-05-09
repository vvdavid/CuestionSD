package jdbc;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;
import pojos.Tipo;
import tools.DBTools;

public class TipoJDBC {

    public static void cargaCombo(JComboBox<Tipo> combo) {
        try (
                PreparedStatement ps = DBTools.getConnection().prepareStatement(
                        "SELECT * FROM tipo");
                ResultSet rs = ps.executeQuery();) {
            combo.removeAllItems();
            while (rs.next()) {
                combo.addItem(new Tipo(rs.getInt(1), rs.getString(2)));
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

}
