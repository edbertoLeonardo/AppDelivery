package com.example.leonardo.appdelivery.abc.Domain;

import java.io.Serializable;

public class ComidaDomain implements Serializable {
    private String titulo;
    private String foto;
    private String descricao;
    private Double preco;
    private int numeroDoCartao;

    public ComidaDomain(String titulo, String foto, String descricao, Double preco) {
        this.titulo = titulo;
        this.foto = foto;
        this.descricao = descricao;
        this.preco = preco;
    }

    public ComidaDomain(String titulo, String foto, String descricao, Double preco, int numeroDoCartao) {
        this.titulo = titulo;
        this.foto = foto;
        this.descricao = descricao;
        this.preco = preco;
        this.numeroDoCartao = numeroDoCartao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public int getNumeroDoCartao() {
        return numeroDoCartao;
    }

    public void setNumeroDoCartao(int numeroDoCartao) {
        this.numeroDoCartao = numeroDoCartao;
    }
}
