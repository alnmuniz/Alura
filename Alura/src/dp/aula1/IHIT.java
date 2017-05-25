package dp.aula1;

import java.util.List;
import java.util.stream.Collectors;

public class IHIT extends TemplateImpostoCondicional{

	public IHIT(Imposto outroImposto) {
		super(outroImposto);
	}

	public IHIT() {
		// TODO Auto-generated constructor stub
	}

	@Override
	protected double aplicarMinimaTaxacao(Orcamento o) {
		return o.getValor() * 0.01 * o.getItens().size();
	}

	@Override
	protected double aplicarMaximaTaxacao(Orcamento o) {
		return o.getValor() * 0.13 + 100.0;
	}

	@Override
	protected boolean deveAplicarMaximaTaxacao(Orcamento o) {
		
		List<String> collect = o.getItens().stream()
				.map(i -> i.getNome())
				.distinct()
				.collect(Collectors.toList())
				;
		
		return collect.size()<o.getItens().size();
	}
	
}