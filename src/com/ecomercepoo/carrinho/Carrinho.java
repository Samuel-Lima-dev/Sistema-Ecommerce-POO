package com.ecomercepoo.carrinho;

import java.util.List;

import com.ecomercepoo.exception.DadosInvalidosException;

import java.util.ArrayList;

public class Carrinho {
	
	private List<ItemCarrinho> itens;
	
	public Carrinho() {
		itens = new ArrayList<ItemCarrinho>();
	}
	
	public void detalhesItemCarrinho() {
		
		if(!itens.isEmpty()) {
			for(ItemCarrinho item: itens) {
				System.out.println(""
						+ "Produto: "+item.getProduto().getDescricao()+
						"\nQuantidade: "+item.getQuantidade()+
						"\nPreço Total: "+ item.getSubTotal()
						);
				System.out.println("=======================================================");
			}
			System.out.println("Total da compra: "+this.calcularTotal());
		}else {
			System.out.println("Carrinho está vazio, adicione algum produto");
		}
	}
	
	public void adicionarItem(ItemCarrinho item) {
		itens.add(item);
	}
	
	public void removerItem(ItemCarrinho item) {
		
		if(!itens.contains(item)) {
			throw new DadosInvalidosException("O item informado não está no carrinho!");
		}
		itens.remove(item);
	}
	
	public void limparCarrinho() {
		itens.clear();
	}
	
	public void alterarQuantidadeItem(ItemCarrinho item, int novaQuantidade) {
		
		if (item == null || !itens.contains(item)) {
	        throw new DadosInvalidosException("Item não encontrado no carrinho para alterar quantidade!");
	    }
	    item.setQuantidade(novaQuantidade);
	}
	
	public double calcularTotal() {
		double total = 0;
		
		for(ItemCarrinho item: itens) {
			total += item.getSubTotal();
		}
		return total;
	}
	
	public List<ItemCarrinho> getItens(){
		return itens;
	}

}
