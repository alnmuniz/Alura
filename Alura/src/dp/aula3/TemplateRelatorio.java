package dp.aula3;

import java.util.List;

public abstract class TemplateRelatorio {
	
	public void imprimeRelatorio(List<Conta> listaContas){
		for (Conta conta : listaContas) {
			imprimeCabecalho(conta);
			imprimeCorpo(conta);
			imprimeRodape(conta);
		}
	}

	protected abstract void imprimeRodape(Conta conta);

	protected abstract void imprimeCorpo(Conta conta);

	protected abstract void imprimeCabecalho(Conta conta);

}
