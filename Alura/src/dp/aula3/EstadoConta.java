package dp.aula3;

public interface EstadoConta {
	void deposita(Conta c, double valor );
	void debita(Conta c, double valor );
	
	void positivar(Conta c);
	void negativar(Conta c);
}
