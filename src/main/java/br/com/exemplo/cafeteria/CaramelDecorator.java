package br.com.exemplo.cafeteria;

public class CaramelDecorator extends BebidaDecorator {
    public CaramelDecorator(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescricao() {
        return bebidaDecorada.getDescricao() + " + Calda de Caramelo";
    }

    @Override
    public double getPreco() {
        return bebidaDecorada.getPreco() + 1.80;
    }
}
