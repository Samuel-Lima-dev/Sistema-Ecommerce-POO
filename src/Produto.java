
public class Produto {
	
	private String descricao;
	private double preco;
	private int quantidadeEstoque;
	
	public Produto(String descricao, double preco, int quantidadeEstoque) {
		setDescricao(descricao);
		setPreco(preco);
		setQuantidadeEstoque(quantidadeEstoque);
	}
	
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		if(preco > 0) {
			this.preco = preco;
		}
		
	}
	public int getQuantidadeEstoque() {
		return quantidadeEstoque;
	}
	public void setQuantidadeEstoque(int quantidadeEstoque) {
		if(quantidadeEstoque >= 0) {
			this.quantidadeEstoque = quantidadeEstoque;
		}
		
	}
	
	
}
