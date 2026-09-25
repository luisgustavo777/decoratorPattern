package br.com.exemplo.cafeteria;

/**
 * Componente base do padrão Decorator.
 * Toda bebida (concreta ou decorada) sabe descrever a si mesma e informar o preço.
 */
public interface Bebida {
    String getDescricao();
    double getPreco();
}
