package pojos;

public class Usuario {
    private int id;
    private String nombre;
    private String pass;

    public Usuario(int id, String nombre, String pass) {
        this.id = id;
        this.nombre = nombre;
        this.pass = pass;
    }

    public int getId() {
        return id;
    }

}
