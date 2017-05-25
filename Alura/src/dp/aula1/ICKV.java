package dp.aula1;

import java.util.List;
import java.util.stream.Collectors;

public class ICKV extends TemplateImpostoCondicional{

	public ICKV(Imposto outroImposto) {
		super(outroImposto);
	}

	public ICKV() {
		// TODO Auto-generated constructor stub
	}

	@Override
	protected double aplicarMinimaTaxacao(Orcamento o) {
		return o.getValor() * 0.06;
	}

	@Override
	protected double aplicarMaximaTaxacao(Orcamento o) {
		return o.getValor() * 0.10;
	}

	@Override
	protected boolean deveAplicarMaximaTaxacao(Orcamento o) {
		
		List<Item> collect = o.getItens().stream()
				.filter(i -> i.getValor() > 100)
				.collect(Collectors.toList())
				;
		
		return o.getValor() > 500.0 && collect.size()>0;
	}
	
}