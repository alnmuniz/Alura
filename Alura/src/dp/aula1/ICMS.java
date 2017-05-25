package dp.aula1;

public class ICMS extends Imposto{

	
	public ICMS(Imposto outroImposto) {
		super(outroImposto);
	}

	public ICMS() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculaImposto(Orcamento o) {
		return (o.getValor() * 0.05) + 50 + calculaOutroImposto(o);
	}
	
}