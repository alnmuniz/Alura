package dp.aula1;

public class ISS extends Imposto {
	
	public ISS() {
		// TODO Auto-generated constructor stub
	}
	
	public ISS(Imposto outroImposto) {
		// TODO Auto-generated constructor stub
		super(outroImposto);
	}

	@Override
	public double calculaImposto(Orcamento o) {
		return o.getValor() * 0.06 + calculaOutroImposto(o);
	}
	
}