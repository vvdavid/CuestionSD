package gui.adminPanels.tipoPaneles;

import java.util.ArrayList;
import pojos.Respuesta;

public interface SetRespuestas {

    void limpia();

    void addCorrecta(String valor);

    void addIncorrecta(String valor);

    ArrayList<Respuesta> getRespuestas(int idReactivo);
}
