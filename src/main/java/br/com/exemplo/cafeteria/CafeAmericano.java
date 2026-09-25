package br.com.exemplo.cafeteria;

/** Componente concreto. */
public class CafeAmericano implements Bebida {
    @Override
    public String getDescricao() {
        return "Café Americano";
    }

    @Override
    public double getPreco() {
        return 5.50;
    }
}
