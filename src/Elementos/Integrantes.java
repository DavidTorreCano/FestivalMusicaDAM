package Elementos;

public class Integrantes {
    String nombre;
    String instrumento;
    int anyoNacimiento;

    public Integrantes(String nombre, String instrumento, int anyoNacimiento) {
        this.nombre = nombre;
        this.instrumento = instrumento;
        this.anyoNacimiento = anyoNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getInstrumento() {
        return instrumento;
    }

    public void setInstrumento(String instrumento) {
        this.instrumento = instrumento;
    }

    public int getAnyoNacimiento() {
        return anyoNacimiento;
    }

    public void setAnyoNacimiento(int anyoNacimiento) {
        this.anyoNacimiento = anyoNacimiento;
    }
}
