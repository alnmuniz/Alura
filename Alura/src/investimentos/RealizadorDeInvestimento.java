package investimentos;

public class RealizadorDeInvestimento {

	public ContaBancaria realizaInvestimento(ContaBancaria c, Investimento i){
		
		c.setSaldo(c.getSaldo() + i.calculaRetornoInvestimento(c));
		
		return c;
		
	}
	
}
