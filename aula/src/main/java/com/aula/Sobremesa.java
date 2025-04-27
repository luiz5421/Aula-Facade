
package com.aula;

public class Sobremesa implements ItemCombo {
    private String nome;
    private double preco;

    public Sobremesa(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome()  { return nome; }
    public double getPreco() { return preco; }
    @Override public String toString() { return nome + " R$" + preco; }
}
