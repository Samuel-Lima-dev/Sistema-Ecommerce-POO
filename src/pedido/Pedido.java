package pedido;
import java.util.List;

import carrinho.Carrinho;
import carrinho.ItemCarrinho;
import exceptions.DadosInvalidosException;
import pagamento.Pagamento;
import pagamento.StatusPagamento;
import produto.Produto;
import usuario.Usuario;

public class Pedido {
	private static int contadorPedido = 1;
	private int id;
	private Carrinho carrinho;
	private Usuario usuario;
	private Pagamento pagamento;
	private StatusPagamento status;
	
	
	public Pedido(Carrinho carrinho, Usuario usuario, Pagamento tipoPagamento) {
		setCarrinho(carrinho);
		setUsuario(usuario);
		setPagamento(tipoPagamento);
		setStatus(StatusPagamento.PENDENTE);
		this.id = contadorPedido++;
	}
	
	public void finalizarPedido() {
		
		// Verificação se o carrinho contém algum item
		if(carrinho.getItens().isEmpty()) {
			throw new DadosInvalidosException("Não é possivel finalizar um pedido com o carrinho vazio");
		}
		
		double valorTotal = carrinho.calcularTotal();
		
		if(pagamento.processarPagamento(valorTotal)) {
			setStatus(StatusPagamento.APROVADO);
			this.baixaEstoque(carrinho.getItens());
		}else {
			setStatus(StatusPagamento.RECUSADO);
		}
	}
	
	public void baixaEstoque(List<ItemCarrinho> itens) {
		for(ItemCarrinho item : itens) {
			 item.getProduto().setQuantidadeEstoque(item.getProduto().getQuantidadeEstoque()-item.getQuantidade());
		}
	}
	
	public Carrinho getCarrinho() {
		return carrinho;
	}


	public void setCarrinho(Carrinho carrinho) {
		this.carrinho = carrinho;
	}


	public Usuario getUsuario() {
		return usuario;
	}


	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}


	public Pagamento getPagamento() {
		return pagamento;
	}


	public void setPagamento(Pagamento pagamento) {
		this.pagamento = pagamento;
	}


	public StatusPagamento getStatus() {
		return status;
	}


	public void setStatus(StatusPagamento status) {
		this.status = status;
	}

	public int getId() {
		return id;
	}

	
	
	
	
}
