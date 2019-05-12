package jdbc;

import gui.adminPanels.tipoPaneles.SetRespuestas;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import tools.DBTools;

public class RespuestaJDBC {

    public static void cargaRespuestas(SetRespuestas panel, int idReactivo) {
        try (
                PreparedStatement ps = DBTools.getConnection().prepareStatement(
                        "SELECT * FROM respuesta WHERE idReactivo =" + idReactivo);
                ResultSet rs = ps.executeQuery();) {
            panel.limpia();
            while (rs.next()) {
                String currentDescripcion = rs.getString(3);
                if (rs.getBoolean(4)) {
                    panel.addCorrecta(currentDescripcion);
                } else {
                    panel.addIncorrecta(currentDescripcion);
                }
            }
        } catch (SQLException e) {
            System.err.println(e);
        }
    }
}
