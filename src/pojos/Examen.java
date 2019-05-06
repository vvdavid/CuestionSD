package pojos;

public class Examen {

    private int id;
    private String titulo;
    private boolean activo;

    public Examen(int id, String titulo, boolean activo) {
        this.id = id;
        this.titulo = titulo;
        this.activo = activo;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean isActivo() {
        return activo;
    }

    @Override
    public String toString() {
        return titulo;
    }
    
}
