package dp.aula7;

import dp.aula6.NotaFiscal;

public class SalvadorNoBancoDeDados implements AcaoAposGerarNota {

	@Override
	public void executa(NotaFiscal nf) {
		System.out.println("salvei no banco de dados");

	}

}
