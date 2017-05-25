package dp.aula2;

public class DescontoZero implements Desconto {

	@Override
	public double desconta(Orcamento orcamento) {
		// não tem desconto
		return 0;
	}

	@Override
	public void setProximo(Desconto proximo) {
		//fim da linha

	}

}
