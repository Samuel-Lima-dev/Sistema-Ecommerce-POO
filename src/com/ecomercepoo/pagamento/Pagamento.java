package com.ecomercepoo.pagamento;

@FunctionalInterface
public interface Pagamento {
	
	boolean processarPagamento(double valor);
}
