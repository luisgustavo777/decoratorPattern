package br.com.exemplo.cafeteria;

public class LeiteVaporDecorator extends BebidaDecorator {
    public LeiteVaporDecorator(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescricao() {
        return bebidaDecorada.getDescricao() + " + Leite Vaporizado";
    }

    @Override
    public double getPreco() {
        return bebidaDecorada.getPreco() + 2.00;
    }
}
