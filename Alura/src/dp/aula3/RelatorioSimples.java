package dp.aula3;

public class RelatorioSimples extends TemplateRelatorio {

	@Override
	protected void imprimeRodape(Conta conta) {
		System.out.println("R " + conta.telefone);

	}

	@Override
	protected void imprimeCorpo(Conta conta) {
		System.out.println("CP " + conta.titular + " saldo " +conta.saldo);

	}

	@Override
	protected void imprimeCabecalho(Conta conta) {
		System.out.println("CB " + conta.nomeBanco);

	}

}
