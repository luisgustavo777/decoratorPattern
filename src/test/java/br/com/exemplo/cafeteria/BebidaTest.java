package br.com.exemplo.cafeteria;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class BebidaTest {

    @Test
    void decoratorsEmpilhamDescricaoEPreco() {
        Bebida pedido = new ChantillyDecorator(new LeiteVaporDecorator(new Cappuccino()));

        assertEquals("Cappuccino + Leite Vaporizado + Chantilly", pedido.getDescricao());
        assertEquals(8.00 + 2.00 + 2.50, pedido.getPreco(), 0.001);
    }

    @Test
    void bebidaSemDecoratorMantemPrecoBase() {
        Bebida espresso = new Espresso();

        assertEquals("Espresso", espresso.getDescricao());
        assertEquals(6.50, espresso.getPreco(), 0.001);
    }
}
