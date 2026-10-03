package pagamento;

import exceptions.DadosInvalidosException;

public class PagamentoPix implements Pagamento{
	
	private String chavePix;
	private StatusPagamento status;
	
	public PagamentoPix(String chavePix) {
		if(chavePix == null || chavePix.isEmpty()) {
			throw new DadosInvalidosException("Chave pix inválida");
		}
		this.chavePix = chavePix;
		this.status = StatusPagamento.PENDENTE;
	}
	
	@Override
	public boolean processarPagamento(double valor) {
		double valorDesconto = valor * 0.90;
		
		System.out.println("Processando pagamento via pix...");
		System.out.println("Valor Original R$"+ valor +" \nValor pago com 10% de desconto R$" + valorDesconto);
		
		this.status = StatusPagamento.APROVADO;
		return true;
	}
}
