package investimentos;

public class InvModerado implements Investimento {

	@Override
	public double calculaRetornoInvestimento(ContaBancaria c) {
		boolean chanceMaior = new java.util.Random().nextDouble() > 0.50;
		if (chanceMaior)
			return 0.75 * 0.025 * c.getSaldo();
		else
			return 0.75 * 0.007 * c.getSaldo();
	}

}
