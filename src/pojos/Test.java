package pojos;

import java.time.LocalDate;

public class Test {
    
    private int id;
    private int idUsuario;
    private double calificacion;
    private int buenas;
    private int malas;
    private int total;
    private LocalDate fecha;
    private int duracion;

    public Test(int id, int idUsuario, double calificacion, int buenas, int malas, int total, LocalDate fecha, int duracion) {
        this.id = id;
        this.idUsuario = idUsuario;
        this.calificacion = calificacion;
        this.buenas = buenas;
        this.malas = malas;
        this.total = total;
        this.fecha = fecha;
        this.duracion = duracion;
    }

    public int getId() {
        return id;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public int getBuenas() {
        return buenas;
    }

    public int getMalas() {
        return malas;
    }

    public int getTotal() {
        return total;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public int getDuracion() {
        return duracion;
    }
    
}
