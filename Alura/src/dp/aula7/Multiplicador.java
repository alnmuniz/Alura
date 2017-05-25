package dp.aula7;

import dp.aula6.NotaFiscal;

public class Multiplicador implements AcaoAposGerarNota {
	private double fator;

	public Multiplicador(double fator) {
		this.fator = fator;
	}

	@Override
	public void executa(NotaFiscal nf) {
		System.out.println("valor com fator "+(nf.getValorBruto() * fator));
	}

}
