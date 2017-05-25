package dp.aula3;

public class Negativa implements EstadoConta {

	@Override
	public void deposita(Conta c, double valor) {
		c.saldo += valor * 0.95;
		System.out.println(c.saldo);
		if (c.saldo>=0)
			c.estadoAtual.positivar(c);
	}

	@Override
	public void debita(Conta c, double valor) {
		throw new RuntimeException("Conta est� negativa, n�o aceita saques!");

	}

	@Override
	public void positivar(Conta c) {
		c.estadoAtual = new Positiva();

	}

	@Override
	public void negativar(Conta c) {
		throw new RuntimeException("Conta j� est� negativa.");
	}

}
