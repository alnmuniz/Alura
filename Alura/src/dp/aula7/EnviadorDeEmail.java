package dp.aula7;

import dp.aula6.NotaFiscal;

public class EnviadorDeEmail implements AcaoAposGerarNota {

	@Override
	public void executa(NotaFiscal nf) {
		System.out.println("enviei por email.");

	}

}
