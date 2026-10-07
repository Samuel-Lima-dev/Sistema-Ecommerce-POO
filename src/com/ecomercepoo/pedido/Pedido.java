package com.ecomercepoo.pedido;
import java.util.List;

import com.ecomercepoo.carrinho.Carrinho;
import com.ecomercepoo.carrinho.ItemCarrinho;
import com.ecomercepoo.exception.DadosInvalidosException;
import com.ecomercepoo.pagamento.Pagamento;
import com.ecomercepoo.pagamento.StatusPagamento;
import com.ecomercepoo.usuario.Usuario;
import com.ecomercepoo.produto.ProdutoFisico;

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
			carrinho.limparCarrinho();
			
			System.out.println("Pagamento: "+getStatus());
		}else {
			setStatus(StatusPagamento.RECUSADO);
			System.out.println("O pagamento foi RECUSADO. O carrinho permanece salvo.");
		}
	}
	
	// Dar baixa no estoque apos pagamento aprovado
	private void baixaEstoque(List<ItemCarrinho> itens) {
		for(ItemCarrinho item : itens) {
			
			if(item.getProduto() instanceof ProdutoFisico produtoFisico) {
				produtoFisico.baixarEstoque(item.getQuantidade());
			}
		}
		
	}
	
	public Carrinho getCarrinho() {
		return carrinho;
	}

	public void setCarrinho(Carrinho carrinho) {
		if(carrinho == null) {
			throw new DadosInvalidosException("Carrinho não pede ser nulo");
		}
		this.carrinho = carrinho;
	}


	public Usuario getUsuario() {
		return usuario;
	}


	public void setUsuario(Usuario usuario) {
		if(usuario == null) {
			throw new DadosInvalidosException("Usuario não pode ser nulo");
		}
		this.usuario = usuario;
	}


	public Pagamento getPagamento() {
		return pagamento;
	}


	public void setPagamento(Pagamento pagamento) {
		if(pagamento == null) {
			throw new DadosInvalidosException("Pagamento não pode ser nulo");
		}
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
