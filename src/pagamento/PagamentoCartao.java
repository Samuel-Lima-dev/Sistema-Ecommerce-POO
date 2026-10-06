package pagamento;

import exceptions.DadosInvalidosException;

public class PagamentoCartao implements Pagamento {
	
	private String numCartao;
	private String nomeTitular;
	private String codSeguranca;
	private int parcela;
	private StatusPagamento status;
	
	
	public PagamentoCartao(String numCartao, String nomeTitular, String codSeguranca, int parcela) {
		setNumCartao(numCartao);
	    setNomeTitular(nomeTitular);
	    setCodSeguranca(codSeguranca);
	    setParcela(parcela);
	    this.status = StatusPagamento.PENDENTE;
	}
	
	@Override
	public boolean processarPagamento(double valor) {
		final double TAXAJUROS = 0.02;
		
		if(this.parcela > 3) {
			System.out.println("Pagamento sendo efetuado...");
			
			double valorTotal = valor + ( valor * (this.parcela * TAXAJUROS));
			double parcelaMensal = valorTotal / this.parcela;
			this.status = StatusPagamento.APROVADO;
			
			
			System.out.println("Valor Total parcelado R$"+valorTotal);
			System.out.println("Parcelas: "+this.parcela+"x R$"+parcelaMensal);
			
		}else{
			double parcelaMensal = valor / this.parcela;
			this.status = StatusPagamento.APROVADO;
			System.out.println("Valor Total parcelado R$"+valor);
			System.out.println("Parcelas: "+this.parcela+"x R$"+parcelaMensal);
		}
		
		return true;
	}
	
	
	public String getNumCartao() {
		return numCartao;
	}

	public void setNumCartao(String numCartao) {
		if(numCartao == null || numCartao.isEmpty()) {
			throw new DadosInvalidosException("Numero do cartão incorreto");
		}
		this.numCartao = numCartao;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		if(nomeTitular == null || nomeTitular.isEmpty()) {
			throw new DadosInvalidosException("Nome do titular Obrigatorio");
		}
		this.nomeTitular = nomeTitular;
	}

	public String getCodSeguranca() {
		return codSeguranca;
	}

	public void setCodSeguranca(String codSeguranca) {
		if(codSeguranca == null || codSeguranca.isEmpty()) {
			throw new DadosInvalidosException("Código de segurança obrigatorio");
		}
		this.codSeguranca = codSeguranca;
	}

	public StatusPagamento getStatus() {
		return status;
	}

	public int getParcela() {
		return this.parcela;
	}
	
	public void setParcela(int parcela) {
		if(parcela < 1) {
			throw new DadosInvalidosException("A parcela não pode ser menor que 1");
		}
		this.parcela = parcela;
	}
	

}
