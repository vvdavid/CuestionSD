package jdbc;

import gui.adminPanels.tipoPaneles.SetRespuestas;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import pojos.Respuesta;
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

    public static void agrega(ArrayList<Respuesta> respuestas) {
        try {
            for (Respuesta respuesta : respuestas) {
                PreparedStatement ps = DBTools.getConnection().prepareStatement(
                        "INSERT INTO Respuesta (idReactivo, descripcion, correcta)"
                        + " VALUES (?, ?, ?)");
                ps.setInt(1, respuesta.getIdReactivo());
                ps.setString(2, respuesta.getDescripcion());
                ps.setBoolean(3, respuesta.isCorrecta());
                ps.executeUpdate();
                ps.close();
            }
        } catch (SQLException e) {
            System.err.println(e);
        }
    }

    public static void elimina(int idReactivo) {
        try (
                PreparedStatement ps = DBTools.getConnection().prepareStatement(
                        "DELETE FROM respuesta WHERE idReactivo=?");) {
            ps.setInt(1, idReactivo);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e);
        }
    }
}
