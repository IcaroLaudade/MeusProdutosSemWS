package com.exercicio.icaro.meusprodutos;

/**
 * Created by Icaro on 01/05/2017.
 */

public class Produto {
    private String nome;
    private int imagem;
    private Double preco;
    private int quantidade;

    public Produto(String nome, int imagem, Double preco) {
        this.nome = nome;
        this.imagem = imagem;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPrecoTotal() {
        return preco * quantidade;
    }
}
