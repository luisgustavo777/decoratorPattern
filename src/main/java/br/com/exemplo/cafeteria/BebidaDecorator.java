package br.com.exemplo.cafeteria;

/**
 * Decorator abstrato: envolve uma Bebida e implementa a mesma interface,
 * permitindo empilhar adicionais (leite vaporizado, chantilly, caramelo, etc.)
 * sem alterar as classes concretas de bebida.
 */
public abstract class BebidaDecorator implements Bebida {

    protected final Bebida bebidaDecorada;

    protected BebidaDecorator(Bebida bebidaDecorada) {
        this.bebidaDecorada = bebidaDecorada;
    }

    @Override
    public String getDescricao() {
        return bebidaDecorada.getDescricao();
    }

    @Override
    public double getPreco() {
        return bebidaDecorada.getPreco();
    }
}
