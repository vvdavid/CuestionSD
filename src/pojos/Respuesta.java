package pojos;

public class Respuesta {

    private int id;
    private int idReactivo;
    private String descripcion;
    private boolean correcta;

    public Respuesta(int id, int idReactivo, String descripcion, boolean correcta) {
        this.id = id;
        this.idReactivo = idReactivo;
        this.descripcion = descripcion;
        this.correcta = correcta;
    }

    public Respuesta(int idReactivo, String descripcion, boolean correcta) {
        this.idReactivo = idReactivo;
        this.descripcion = descripcion;
        this.correcta = correcta;
    }

    public int getId() {
        return id;
    }

    public int getIdReactivo() {
        return idReactivo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public boolean isCorrecta() {
        return correcta;
    }

    public void setIdReactivo(int idReactivo) {
        this.idReactivo = idReactivo;
    }
}
