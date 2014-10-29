package agricultura.transferenciaproduto.model;

import java.util.ArrayList;
import java.util.List;

public class Vendedor {

	private double percentualComissao;
	private List<Venda> vendas;
	private double salarioFixo;
	private String nome;
	
	public Vendedor(String nome, double percentualComissao, double salarioFixo) {
		this.nome = nome;
		this.percentualComissao = percentualComissao;
		this.salarioFixo = salarioFixo;
		this.vendas = new ArrayList<>();
	}
	
	public void adicionarVenda(Venda venda) {
		vendas.add(venda);
	}
	
	public double calcularComissao() {
		double valorComissao = 0;
		for (Venda venda : vendas) {
			valorComissao += venda.getValor() * percentualComissao / 100;
		}
		
		return valorComissao;
	}
	
	public double calcularSalario() {
		return salarioFixo + calcularComissao();
	}
	
	public String getNome() {
		return nome;
	}
}
