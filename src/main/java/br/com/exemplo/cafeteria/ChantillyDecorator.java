package br.com.exemplo.cafeteria;

public class ChantillyDecorator extends BebidaDecorator {
    public ChantillyDecorator(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescricao() {
        return bebidaDecorada.getDescricao() + " + Chantilly";
    }

    @Override
    public double getPreco() {
        return bebidaDecorada.getPreco() + 2.50;
    }
}
