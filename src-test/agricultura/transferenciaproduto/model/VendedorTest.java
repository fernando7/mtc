package agricultura.transferenciaproduto.model;

import org.junit.Assert;
import org.junit.Test;

import br.com.fasam.mtc.model.Venda;
import br.com.fasam.mtc.model.Vendedor;

public class VendedorTest {

	@Test
	public void calculaValorComissaoComDezPorCento() {
		Venda venda = new Venda(1500.00);
		Venda venda2 = new Venda(100.00);
		Venda venda3 = new Venda(400.00);

		String nome = "Vendedor1";
		double percentualComissao = 10;
		double salarioFixo = 500.00;
		
		Vendedor vendedor = new Vendedor(nome, percentualComissao, salarioFixo);
		vendedor.adicionarVenda(venda);
		vendedor.adicionarVenda(venda2);
		vendedor.adicionarVenda(venda3);
		
		Assert.assertEquals(200, vendedor.calcularComissao(), 0.0);
	}
	
	@Test
	public void calcularSalarioComDezPorCento() {
		Venda venda = new Venda(1500.00);
		Venda venda2 = new Venda(100.00);
		Venda venda3 = new Venda(400.00);
		//Total das vendas 2000.00

		String nome = "Vendedor1";
		double percentualComissao = 10;
		double salarioFixo = 500.00;
		
		Vendedor vendedor = new Vendedor(nome, percentualComissao, salarioFixo);
		vendedor.adicionarVenda(venda);
		vendedor.adicionarVenda(venda2);
		vendedor.adicionarVenda(venda3);
		
		Assert.assertEquals(700.00, vendedor.calcularSalario(), 0.0);		
	}	
	
	@Test
	public void calculaValorComissaoComCincoPorCento() {
		Venda venda = new Venda(1300.00);
		Venda venda2 = new Venda(700.00);
		Venda venda3 = new Venda(1500.00);

		//Total das vendas 3500.00
		String nome = "Vendedor2";
		double percentualComissao = 5;
		double salarioFixo = 500.00;
		
		Vendedor vendedor2 = new Vendedor(nome, percentualComissao, salarioFixo);
		vendedor2.adicionarVenda(venda);
		vendedor2.adicionarVenda(venda2);
		vendedor2.adicionarVenda(venda3);
		
		Assert.assertEquals(175.0, vendedor2.calcularComissao(), 0.0);
	}
	
	@Test
	public void calcularSalarioComCincoPorCento() {
		Venda venda = new Venda(1300.00);
		Venda venda2 = new Venda(700.00);
		Venda venda3 = new Venda(1500.00);

		//Total das vendas 3500.00
		String nome = "Vendedor2";
		double percentualComissao = 5;
		double salarioFixo = 500.00;
		
		Vendedor vendedor2 = new Vendedor(nome, percentualComissao, salarioFixo);
		vendedor2.adicionarVenda(venda);
		vendedor2.adicionarVenda(venda2);
		vendedor2.adicionarVenda(venda3);
		
		Assert.assertEquals(674.0, vendedor2.calcularSalario(), 0.0);	
	}		
}





















