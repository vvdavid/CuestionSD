package pojos;

public class Reactivo {

    private int id;
    private int idExamen;
    private int idTipo;
    private String descripcion;

    public Reactivo(int id, int idExamen, int idTipo, String descripcion) {
        this.id = id;
        this.idExamen = idExamen;
        this.idTipo = idTipo;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public int getIdExamen() {
        return idExamen;
    }

    public int getIdTipo() {
        return idTipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public String toString() {
        return descripcion;
    }

}
