package dp.aula1;

public class IMA extends Imposto {

	public IMA() {
		// TODO Auto-generated constructor stub
	}

	public IMA(Imposto outroImposto) {
		super(outroImposto);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculaImposto(Orcamento o) {
		// TODO Auto-generated method stub
		return o.getValor()*0.2 + calculaOutroImposto(o);
	}

}
