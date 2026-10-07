package com.ecomercepoo.produto;

import com.ecomercepoo.exception.DadosInvalidosException;

public class ProdutoDigital extends Produto{
	
	private double tamanhoMb;
	private String linkDownload;
	
	public ProdutoDigital(String descricao, double preco, double tamanhoMb, String linkDownload) {
		super(descricao, preco);
		setTamanhoMb(tamanhoMb);
		setLinkDownload(linkDownload);
	}
	
	@Override
	public void detalheProduto() {
		
	}

	public double getTamanhoMb() {
		return tamanhoMb;
	}

	public void setTamanhoMb(double tamanhoMb) {
		if(tamanhoMb <= 0 ) {
			throw new DadosInvalidosException("Tamanho do arquivo inválido");
		}
		this.tamanhoMb = tamanhoMb;
	}

	public String getLinkDownload() {
		return linkDownload;
	}

	public void setLinkDownload(String linkDownload) {
		if(linkDownload == null || linkDownload.isEmpty()) {
			throw new DadosInvalidosException("Link de download não pode ser vazio");
		}
		this.linkDownload = linkDownload;
	}
	
	
}
