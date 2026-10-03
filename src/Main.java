import exceptions.DadosInvalidosException;
import pagamento.PagamentoPix;
import pagamento.PagamentoCartao;

public class Main {
	public static void main(String[] args) {
		
		
		try {
			Usuario usuario = new Usuario("joao", "joão@.com", "12345678912");
			System.out.println(usuario.getNome());
			
		}catch(DadosInvalidosException e){
			System.out.println("Erro: " + e.getMessage());
		}
		
		PagamentoPix pix = new PagamentoPix("81995695865");
		pix.processarPagamento(500);
		
		System.out.println("===========");
		
		try {
			PagamentoCartao cartao = new PagamentoCartao("123456", "joão", "123", 4);
			cartao.processarPagamento(570);
		}catch(DadosInvalidosException e){
			System.out.println(e.getMessage());
		}
		
	}

}
 