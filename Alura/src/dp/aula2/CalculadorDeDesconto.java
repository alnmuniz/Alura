package dp.aula2;

public class CalculadorDeDesconto {
	
	DescontoMaisDeCincoItens d1 = new DescontoMaisDeCincoItens();
	DescontoMaisDeQuinhentosReais d2 = new DescontoMaisDeQuinhentosReais();
	DescontoVendaCasada d3 = new DescontoVendaCasada();
	DescontoZero d4 = new DescontoZero();
	
	public CalculadorDeDesconto(){
		d1.setProximo(d2);
		d2.setProximo(d3);
		d3.setProximo(d4);
	}
	
	public double calculaDesconto(Orcamento orcamento){
		return d1.desconta(orcamento);
	}

}
