package test;

import loja.Carrinho;
import loja.Produto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarrinhoTest {

    private Carrinho carrinho;
    private Produto produto;

    @BeforeEach
    public void init() {
        carrinho = new Carrinho();
        produto = new Produto(0,"0",0);
    }

    @Test
    public void quandoCarrinhoVazio_retornaValido() {
        assertTrue(carrinho.isVazio());
    }

    @Test
    public void quandoUmProduto_retornaValido(){
        carrinho.adicionar(produto);
        assertEquals(1, carrinho.getQtde());
    }

    @Test
    public void quandoAdicionaProduto_entaoEncontraProduto(){
        carrinho.adicionar(produto);
        assertTrue(carrinho.contem(produto));
    }



}