package investimentos;

public class InvConservador implements Investimento {

	@Override
	public double calculaRetornoInvestimento(ContaBancaria c) {
		
		return 0.75 * 0.008 * c.getSaldo();
	}

}
