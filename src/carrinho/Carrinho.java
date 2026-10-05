package carrinho;

import java.util.List;
import java.util.ArrayList;

public class Carrinho {
	
	private List<ItemCarrinho> itens;
	
	public Carrinho() {
		itens = new ArrayList<ItemCarrinho>();
	}
	
	//Metodo para listar todos os itens do carrinho
	public void itemCarrinho() {
		
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
	
	public double calcularTotal() {
		double total = 0;
		
		for(ItemCarrinho item: itens) {
			total += item.getSubTotal();
		}
		return total;
	}

}
