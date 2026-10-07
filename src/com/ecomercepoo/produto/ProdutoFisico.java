package com.ecomercepoo.produto;

import com.ecomercepoo.exception.DadosInvalidosException;

public class ProdutoFisico extends Produto{
	
	private int quantidadeEstoque;
	private double kg;
	private double tamanhoPolegada;

	public ProdutoFisico(String descricao, double preco, int quantidadeEstoque) {
		super(descricao, preco);
		setQuantidadeEstoque(quantidadeEstoque);
	}
	
	public ProdutoFisico(String descricao, double preco, int quantidadeEstoque, double kg, double tamanho) {
		super(descricao, preco);
		setQuantidadeEstoque(quantidadeEstoque);
		setKg(kg);
		setTamanhoPolegada(tamanho);
		
	}
	
	@Override
	public void detalheProduto() {
		
	}
	
	public void baixarEstoque(int quantidade) {
		
		if(quantidade <= 0) {
			throw new DadosInvalidosException("Quantidade inválida");
		}
		
		if(quantidade > getQuantidadeEstoque()) {
			throw new DadosInvalidosException("Estoque insuficiente");
		}
		this.quantidadeEstoque-=quantidade;
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
	
	public double getKg() {
		return this.kg;
	}
	
	public void setKg(double kg) {
		if(kg <= 0) {
			throw new DadosInvalidosException("Peso deve ser maior que zero");
		}
		this.kg = kg;
	}
	
	public double getTamanhoPolegada() {
		return this.tamanhoPolegada;
	}
	
	public void setTamanhoPolegada(double tamanho) {
		if(tamanho <= 0) {
			throw new DadosInvalidosException("Polegada deve ser maior que zero");
		}
		this.tamanhoPolegada = tamanho;
	}
}
