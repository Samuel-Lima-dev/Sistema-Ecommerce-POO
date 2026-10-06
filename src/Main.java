import pagamento.Pagamento;
import pagamento.PagamentoPix;
import pedido.Pedido;
import usuario.Usuario;
import produto.Produto;
import carrinho.ItemCarrinho;
import carrinho.Carrinho;

public class Main {
	public static void main(String[] args) {
		
		// TESTES
		
		Produto produto = new Produto("Notebook", 3000.00, 10);
		Produto produto2 = new Produto("Smartphone", 2500.00, 10);
		
		Usuario usuario = new Usuario("joao", "joão@.com", "12345678912");
		Carrinho carrinho = new Carrinho();
		
		ItemCarrinho item1 = new ItemCarrinho(produto, 1);
		ItemCarrinho item2 = new ItemCarrinho(produto2, 1);
		
		carrinho.adicionarItem(item1);
		carrinho.adicionarItem(item2);
		
		//carrinho.detalhesItemCarrinho();
		
		Pagamento pix = new PagamentoPix("456235251455");
		Pedido pedido = new Pedido(carrinho, usuario, pix);
		pedido.finalizarPedido();
		
		//System.out.println(pedido.getStatus());
		//System.out.println("Estoque atual: "+produto.getQuantidadeEstoque());
		carrinho.removerItem(item1);
		carrinho.detalhesItemCarrinho();
	}

}
 