package dp.aula3;

public class Positiva implements EstadoConta {

	@Override
	public void deposita(Conta c, double valor) {
		c.saldo += valor * 0.98;
		System.out.println(c.saldo);

	}

	@Override
	public void debita(Conta c, double valor) {
		c.saldo -= valor;
		System.out.println(c.saldo);
		if (c.saldo<0)
			c.estadoAtual.negativar(c);

	}

	@Override
	public void positivar(Conta c) {
		throw new RuntimeException("Conta já está positiva.");
	}

	@Override
	public void negativar(Conta c) {
		c.estadoAtual = new Negativa();
	}

}
