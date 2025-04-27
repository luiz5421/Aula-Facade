
package com.aula;

import java.util.ArrayList;
import java.util.List;

public class Combo {
    private ItemCombo burguer;
    private ItemCombo bebida;
    private ItemCombo sobremesa;

    public Combo(ItemCombo burguer, ItemCombo bebida, ItemCombo sobremesa) {
        this.burguer = burguer;
        this.bebida = bebida;
        this.sobremesa = sobremesa;
    }

    public List<ItemCombo> getItens() {
        List<ItemCombo> itens = new ArrayList<>();
        itens.add(burguer);
        itens.add(bebida);
        itens.add(sobremesa);
        return itens;
    }

    public double getPrecoTotal() {
        return burguer.getPreco() + bebida.getPreco() + sobremesa.getPreco();
    }
}
