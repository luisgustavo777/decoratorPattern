package br.com.exemplo.cafeteria;

/** Componente concreto. */
public class Cappuccino implements Bebida {
    @Override
    public String getDescricao() {
        return "Cappuccino";
    }

    @Override
    public double getPreco() {
        return 8.00;
    }
}
