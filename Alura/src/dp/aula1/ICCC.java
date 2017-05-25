package dp.aula1;

public class ICCC extends Imposto {
	
	public ICCC() {
		// TODO Auto-generated constructor stub
	}
	
	public ICCC(Imposto outroImposto) {
		// TODO Auto-generated constructor stub
		super(outroImposto);
	}

	@Override
	public double calculaImposto(Orcamento o) {
		if (o.getValor()<1000)			
			return o.getValor() * 0.05 + calculaOutroImposto(o);
		if (o.getValor()>=1000 && o.getValor()<=3000)
			return o.getValor() * 0.07 + calculaOutroImposto(o);
		if (o.getValor()>3000)
			return o.getValor() * 0.08 + 30 + calculaOutroImposto(o);
		return 0 + calculaOutroImposto(o);
	}
	
}