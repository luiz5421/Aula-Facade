
package com.aula;

public class ComboFacade {
    private Combo combo;

    public void criarCombo(int tipoCombo) {
        if (tipoCombo == 1) {
            combo = new Combo(new Burguer("Cheeseburger", 10.0), new Bebida("Coca-Cola",5.0), new Sobremesa("Sorvete", 7.0));
        } else if (tipoCombo == 2) {
            combo = new Combo(new Burguer("Chickenburger", 12.0), new Bebida("Suco",6.0), new Sobremesa("Torta", 8.0));
        }
    }

    public void exibirItens() {
        for (ItemCombo item : combo.getItens()) {
            System.out.println("Item: " + item.getNome() + " - Preço: R$ " + item.getPreco());
        }
    }

    public double getPrecoTotal() {
        return combo.getPrecoTotal();
    }
}
