package investimentos;

import java.util.Random;

public class InvArrojado implements Investimento {

	@Override
	public double calculaRetornoInvestimento(ContaBancaria c) {
		double chance = new Random().nextDouble();
		
		if (chance<=0.2)
			return 0.75 * 0.05 * c.getSaldo();
		else if(chance <= 0.3)
			return 0.75 * 0.03 * c.getSaldo();
		else
			return 0.75 * 0.006 * c.getSaldo();
	}

}
