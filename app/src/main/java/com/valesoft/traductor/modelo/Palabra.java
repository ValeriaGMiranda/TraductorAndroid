package com.valesoft.traductor.modelo;

public class Palabra {
    private String palabra;
    private String palabraTrad;

    private int foto;

    public Palabra(String palabra, String palabraTrad, int foto) {
        this.palabra = palabra;
        this.palabraTrad = palabraTrad;
        this.foto = foto;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public String getPalabraTrad() {
        return palabraTrad;
    }

    public void setPalabraTrad(String palabraTrad) {
        this.palabraTrad = palabraTrad;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}
