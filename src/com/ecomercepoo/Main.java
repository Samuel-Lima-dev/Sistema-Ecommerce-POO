package com.ecomercepoo;
import com.ecomercepoo.carrinho.Carrinho;
import com.ecomercepoo.carrinho.ItemCarrinho;
import com.ecomercepoo.pagamento.Pagamento;
import com.ecomercepoo.pagamento.PagamentoPix;
import com.ecomercepoo.pedido.Pedido;
import com.ecomercepoo.produto.Produto;
import com.ecomercepoo.usuario.Usuario;

public class Main {
	public static void main(String[] args) {
		
		// TESTES
		
		Produto produto1 = new Produto("Notebook", 3000.00, 10);
		Produto produto2 = new Produto("Smartphone", 2500.00, 10);
		Produto produto3 = new Produto("Mesa", 2889.00, 10);
		Produto produto4 = new Produto("Sofá", 2500.00, 10);
		
		
		Usuario usuario = new Usuario("joao", "joão@.com", "12345678912");
		Pagamento pix = new PagamentoPix("456235251455");
		Carrinho carrinho = new Carrinho();
		
		ItemCarrinho item1 = new ItemCarrinho(produto1, 1);
		ItemCarrinho item2 = new ItemCarrinho(produto2, 1);
		ItemCarrinho item3 = new ItemCarrinho(produto2, 1);
		
		carrinho.adicionarItem(item1);
		carrinho.adicionarItem(item2);
		carrinho.adicionarItem(item3);
		carrinho.detalhesItemCarrinho();
		System.out.println();
		
		Pedido pedido = new Pedido(carrinho, usuario, pix);
		pedido.finalizarPedido();
		
		//System.out.println(pedido.getStatus());
		//;
		//carrinho.removerItem(item1);
		//carrinho.detalhesItemCarrinho();
		
		System.out.println();
		//produto1.detalheProduto();
		carrinho.detalhesItemCarrinho();

	}

}
 