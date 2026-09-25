package br.com.exemplo.cafeteria;

public class ExtraDoseDecorator extends BebidaDecorator {
    public ExtraDoseDecorator(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescricao() {
        return bebidaDecorada.getDescricao() + " + Dose Extra de Café";
    }

    @Override
    public double getPreco() {
        return bebidaDecorada.getPreco() + 3.00;
    }
}
