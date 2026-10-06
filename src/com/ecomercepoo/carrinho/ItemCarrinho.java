package com.ecomercepoo.carrinho;

import com.ecomercepoo.exception.DadosInvalidosException;
import com.ecomercepoo.produto.Produto;

public class ItemCarrinho {
	
	private Produto produto;
	private int quantidade;
	
	public ItemCarrinho(Produto produto, int quantidade) {
		setProduto(produto);
		setQuantidade(quantidade);
	} 
	
	public double getSubTotal() { 
		
		return produto.getPreco() * quantidade;
	}
	
	public Produto getProduto() {
		return this.produto;
	}
	
	public void setProduto(Produto produto) {
		if(produto == null) {
			throw new DadosInvalidosException("Produto é obrigatorio!");
		}
		this.produto = produto;
	}
	
	public int getQuantidade() {
		return this.quantidade;
	}
	
	public void setQuantidade(int quantidade) {
		
		if(quantidade < 1) {
			throw new DadosInvalidosException("Quantidade Incorreta.");
		}
		
		if(this.produto != null && quantidade > this.produto.getQuantidadeEstoque()) {
			throw new DadosInvalidosException("Estoque Insuficiente");
		}
		this.quantidade = quantidade;
	}
}
