package com.example.leonardo.appdelivery.abc.Domain;

public class CategoriaDomain {
    private String titulo;
    private String foto;

    public CategoriaDomain(String titulo, String foto) {
        this.titulo = titulo;
        this.foto = foto;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
