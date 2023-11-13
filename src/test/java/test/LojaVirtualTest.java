package test;

import loja.LojaVirtual;
import loja.Produto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LojaVirtualTest {

    private LojaVirtual lojaVirtual;

    @BeforeEach
    public void init() {
        lojaVirtual = new LojaVirtual();
    }

    @Test
    public void quandoCriarProduto_entaoValido(){
        Produto produto = lojaVirtual.criarProduto();
        Assertions.assertNotNull(produto);
        assertEquals(1,produto.getCod());
    }

}