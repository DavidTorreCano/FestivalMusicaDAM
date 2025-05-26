package Elementos;

public class GrupoMusical {
    String nombreGrupo;
    String genero;
    String pais;
    Integrantes integrantes;

    public GrupoMusical(String nombreGrupo, String genero, String pais, Integrantes integrantes) {
        this.nombreGrupo = nombreGrupo;
        this.genero = genero;
        this.pais = pais;
        this.integrantes = integrantes;
    }

    public String getNombreGrupo() {
        return nombreGrupo;
    }

    public void setNombreGrupo(String nombreGrupo) {
        this.nombreGrupo = nombreGrupo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Integrantes getIntegrantes() {
        return integrantes;
    }

    public void setIntegrantes(Integrantes integrantes) {
        this.integrantes = integrantes;
    }
}
