package dp.aula5;

import dp.aula2.Orcamento;

public class Reprovado implements EstadoOrcamento {

	@Override
	public void aplicaDescontoExtra(Orcamento o) {
		throw new RuntimeException("Or�amento reprovado n�o tem desconto extra.");
	}

	@Override
	public void aprova(Orcamento o) {
		throw new RuntimeException("Or�amento j� reprovado.");

	}

	@Override
	public void reprova(Orcamento o) {
		throw new RuntimeException("Or�amento j� reprovado.");
	}

	@Override
	public void finaliza(Orcamento o) {
		o.estadoAtual = new Finalizado();

	}

}
