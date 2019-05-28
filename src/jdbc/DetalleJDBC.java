package jdbc;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import tools.DBTools;

public class DetalleJDBC {

    public static void agrega(int idTest, int idReactivo, boolean correcto) {
        try (
                PreparedStatement ps = DBTools.getConnection().prepareStatement(
                        "INSERT INTO Detalle VALUES (?,?,?)");) {
            ps.setInt(1, idTest);
            ps.setInt(2, idReactivo);
            ps.setBoolean(3, correcto);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e);
        }
    }
}
