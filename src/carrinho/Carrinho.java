package carrinho;

import java.util.List;
import exceptions.DadosInvalidosException;
import java.util.ArrayList;

public class Carrinho {
	
	private List<ItemCarrinho> itens;
	
	public Carrinho() {
		itens = new ArrayList<ItemCarrinho>();
	}
	
	
	public void detalhesItemCarrinho() {
		
		for(ItemCarrinho item: itens) {
			System.out.println(""
					+ "Produto: "+item.getProduto().getDescricao()+
					"\nQuantidade: "+item.getQuantidade()+
					"\nPreço Total: "+ item.getSubTotal()
					);
			System.out.println("=======================================================");
		}
		System.out.println("Total da compra: "+this.calcularTotal());
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
