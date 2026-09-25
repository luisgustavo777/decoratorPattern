package br.com.exemplo.cafeteria;

import java.util.Locale;

/**
 * Demonstração do padrão Decorator em uma cafeteria: o cliente monta o pedido
 * combinando bebidas base com adicionais, sem precisar de uma classe para
 * cada combinação possível (ex.: CappuccinoComLeiteEChantillyEExtraDose).
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Cafeteria Java Coffee - Pedido do Cliente 1 ===");
        Bebida pedido1 = new ExtraDoseDecorator(
                new ChantillyDecorator(
                        new LeiteVaporDecorator(
                                new Cappuccino())));
        imprimir(pedido1);

        System.out.println("\n=== Cafeteria Java Coffee - Pedido do Cliente 2 ===");
        Bebida pedido2 = new CaramelDecorator(
                new ChocolateDecorator(
                        new Espresso()));
        imprimir(pedido2);

        System.out.println("\n=== Cafeteria Java Coffee - Pedido do Cliente 3 (sem adicionais) ===");
        Bebida pedido3 = new CafeAmericano();
        imprimir(pedido3);
    }

    private static void imprimir(Bebida bebida) {
        System.out.println("Pedido: " + bebida.getDescricao());
        System.out.printf(Locale.of("pt", "BR"), "Total: R$ %.2f%n", bebida.getPreco());
    }
}
