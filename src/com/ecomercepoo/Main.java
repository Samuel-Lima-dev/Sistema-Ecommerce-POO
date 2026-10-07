package com.ecomercepoo;
import com.ecomercepoo.carrinho.Carrinho;
import com.ecomercepoo.carrinho.ItemCarrinho;
import com.ecomercepoo.pagamento.Pagamento;
import com.ecomercepoo.pagamento.PagamentoPix;
import com.ecomercepoo.pedido.Pedido;
import com.ecomercepoo.produto.Produto;
import com.ecomercepoo.produto.ProdutoDigital;
import com.ecomercepoo.produto.ProdutoFisico;
import com.ecomercepoo.usuario.Usuario;

public class Main {
	public static void main(String[] args) {
		
		// TESTES
		
		Produto produto1 = new ProdutoFisico("Notebook", 3000.00, 10, 50, 18);
		Produto produto2 = new ProdutoFisico("Smartphone", 2500.00, 10);
		Produto produto3 = new ProdutoDigital("PDF", 50.00, 25.0, "www.baixarPDF.com");
		Produto produto4 = new ProdutoDigital("E-book", 85.00, 25.0, "www.baixarEbook.com");
		
		
		Usuario usuario = new Usuario("joao", "joão@.com", "12345678912");
		Pagamento pix = new PagamentoPix("456235251455");
		Carrinho carrinho = new Carrinho();
		
		ItemCarrinho item1 = new ItemCarrinho(produto1, 1);
		ItemCarrinho item2 = new ItemCarrinho(produto2, 1);
		ItemCarrinho item3 = new ItemCarrinho(produto3, 1);
		
		carrinho.adicionarItem(item1);
		carrinho.adicionarItem(item2);
		carrinho.adicionarItem(item3);
		//carrinho.detalhesItemCarrinho();
		//System.out.println();
		
		Pedido pedido = new Pedido(carrinho, usuario, pix);
		//pedido.finalizarPedido();
		
		//System.out.println(pedido.getStatus());
		//carrinho.removerItem(item1);
		//carrinho.detalhesItemCarrinho();
		
		//System.out.println();
		produto1.detalheProduto();
		//carrinho.detalhesItemCarrinho();

	}

}
 