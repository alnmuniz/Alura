package dp.aula3;

public class RelatorioComplexo extends TemplateRelatorio {

	@Override
	protected void imprimeRodape(Conta conta) {
		System.out.println("R " + conta.email + " " + conta.dataAutal);

	}

	@Override
	protected void imprimeCorpo(Conta conta) {
		System.out.println("CP " + conta.titular + " " +conta.agencia + " " +conta.numeroConta + " " +conta.saldo);

	}

	@Override
	protected void imprimeCabecalho(Conta conta) {
		System.out.println("CB " + conta.nomeBanco + " " +conta.endereço + " " +conta.telefone);

	}

}
