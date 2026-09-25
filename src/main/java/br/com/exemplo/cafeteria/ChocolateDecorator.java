package br.com.exemplo.cafeteria;

public class ChocolateDecorator extends BebidaDecorator {
    public ChocolateDecorator(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescricao() {
        return bebidaDecorada.getDescricao() + " + Raspas de Chocolate";
    }

    @Override
    public double getPreco() {
        return bebidaDecorada.getPreco() + 1.50;
    }
}
