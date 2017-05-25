package dp.aula1;

public abstract class TemplateImpostoCondicional extends Imposto{

	public TemplateImpostoCondicional(Imposto outroImposto) {
		super(outroImposto);
	}
	
	public TemplateImpostoCondicional() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double calculaImposto(Orcamento o) {
		if (deveAplicarMaximaTaxacao(o)){
			return aplicarMaximaTaxacao(o) + calculaOutroImposto(o);
		} else {
			return aplicarMinimaTaxacao(o) + calculaOutroImposto(o);
		}
	}

	protected abstract double aplicarMinimaTaxacao(Orcamento o);
	protected abstract double aplicarMaximaTaxacao(Orcamento o);
	protected abstract boolean deveAplicarMaximaTaxacao(Orcamento o);
}