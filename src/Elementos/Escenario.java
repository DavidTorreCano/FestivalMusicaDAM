package Elementos;

public class Escenario {
    String codigo;
    String nombre;
    int capacidadMaxima;

    public Escenario(String codigo, String nombre, int capacidadMaxima) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.capacidadMaxima = capacidadMaxima;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }
}
