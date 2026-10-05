import exceptions.DadosInvalidosException;
import pagamento.Pagamento;
import pagamento.PagamentoPix;
import usuario.Usuario;
import pagamento.PagamentoCartao;
import produto.Produto;
import carrinho.ItemCarrinho;
import carrinho.Carrinho;

public class Main {
	public static void main(String[] args) {
		
		
		try {
			Usuario usuario = new Usuario("joao", "joão@.com", "12345678912");
			System.out.println(usuario.getNome());
			
		}catch(DadosInvalidosException e){
			System.out.println("Erro: " + e.getMessage());
		}
		
		Pagamento pix = new PagamentoPix("81995695865");
		pix.processarPagamento(500);
		
		System.out.println("===============================");
		
		try {
			Pagamento cartao = new PagamentoCartao("123456", "joão", "123", 3);
			cartao.processarPagamento(570);
		}catch(DadosInvalidosException e){
			System.out.println(e.getMessage());
		}
		
		System.out.println("================================");
		
		// TESTE
		Produto produto = new Produto("Notebook", 3000.00, 10);
		Produto produto2 = new Produto("Smartphone", 2500.00, 10);
		
		ItemCarrinho item = new ItemCarrinho(produto, 1);
		ItemCarrinho item2 = new ItemCarrinho(produto2, 1);
		
		Carrinho carrinho = new Carrinho();
		
		carrinho.adicionarItem(item);
		carrinho.adicionarItem(item2);
		
		carrinho.itemCarrinho();
	}

}
 