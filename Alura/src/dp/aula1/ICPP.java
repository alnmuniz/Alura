package dp.aula1;

public class ICPP extends TemplateImpostoCondicional{
	

	public ICPP(Imposto outroImposto) {
		super(outroImposto);		
	}
	
	public ICPP() {
		// TODO Auto-generated constructor stub
	}

	@Override
	protected double aplicarMinimaTaxacao(Orcamento o) {
		return o.getValor() * 0.05;
	}

	@Override
	protected double aplicarMaximaTaxacao(Orcamento o) {
		return o.getValor() * 0.07;
	}

	@Override
	protected boolean deveAplicarMaximaTaxacao(Orcamento o) {
		return o.getValor() >= 500.0;
	}
	
}