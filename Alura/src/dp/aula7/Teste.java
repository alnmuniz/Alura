package dp.aula7;

import java.util.Arrays;

import dp.aula6.ItemDaNota;
import dp.aula6.NotaFiscal;
import dp.aula6.NotaFiscalBuilder;

public class Teste {

	public static void main(String[] args) {
		NotaFiscalBuilder nfb = new NotaFiscalBuilder();
		nfb.paraEmpresa("x")
			.paraCnpj("y")
			.naDataAtual()
			.comObservacoes("z")
			.comItem(new ItemDaNota("a", 2.0))
			.comAcoes(Arrays.asList(
					new EnviadorDeEmail(),
					new SalvadorNoBancoDeDados(),
					new Multiplicador(0.2)));
		
		NotaFiscal nf = nfb.constroi();
		
		System.out.println("nota concluída "+nf.getRazaoSocial());

	}

}
