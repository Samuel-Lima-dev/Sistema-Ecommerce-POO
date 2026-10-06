package com.ecomercepoo.produto;
import com.ecomercepoo.exception.DadosInvalidosException;

public class Produto {
	
	private String descricao;
	private double preco;
	private int quantidadeEstoque;
	
	public Produto(String descricao, double preco, int quantidadeEstoque) {
		setDescricao(descricao);
		setPreco(preco);
		setQuantidadeEstoque(quantidadeEstoque);
	}
	
	public void detalheProduto() {
		System.out.println("Descrição: "+this.getDescricao());
		System.out.println("Preço: "+this.getPreco());
		System.out.println("Estoque: "+this.getQuantidadeEstoque());
	}
	
	public void baixaEstoque(int quantidade) {
		
		if(quantidade <= 0) {
			throw new DadosInvalidosException("Quantidade inválida");
		}
		if(quantidade > getQuantidadeEstoque()) {
			throw new DadosInvalidosException("Estoque insuficiente");
		}
		this.quantidadeEstoque-=quantidade;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		if(descricao == null || descricao.isEmpty()) {
			throw new DadosInvalidosException("Produto precisa ter uma descrição");
		}
		this.descricao = descricao;
	}
	 
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		if(preco <= 0) {
			throw new DadosInvalidosException("Preço Invalido, preco não pode ser negativo");
		}
		this.preco = preco;	
	}
	
	public int getQuantidadeEstoque() {
		return quantidadeEstoque;
	}
	
	public void setQuantidadeEstoque(int quantidadeEstoque) {
		if(quantidadeEstoque < 0) {
			throw new DadosInvalidosException("Estoque não pode ser menor que zero");
		}
		this.quantidadeEstoque = quantidadeEstoque;	
	}
	
	
}
