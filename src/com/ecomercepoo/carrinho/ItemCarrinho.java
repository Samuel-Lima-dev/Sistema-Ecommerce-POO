package com.ecomercepoo.carrinho;

import com.ecomercepoo.exception.DadosInvalidosException;
import com.ecomercepoo.produto.Produto;
import com.ecomercepoo.produto.ProdutoFisico;

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
		
		//Válidar estoque apenas se o produto for um produto fisico
		if(this.produto instanceof ProdutoFisico produtoFisico) {
			if(quantidade > produtoFisico.getQuantidadeEstoque()) {
				throw new DadosInvalidosException("Estoque Insuficiente");
			}
		}
		
		this.quantidade = quantidade;
	}
	
	
}
