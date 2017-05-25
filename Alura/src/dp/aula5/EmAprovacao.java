package dp.aula5;

import dp.aula2.Orcamento;

public class EmAprovacao implements EstadoOrcamento {

	private boolean descontoAplicado=false;

	@Override
	public void aplicaDescontoExtra(Orcamento o) {
		if (!descontoAplicado)
			o.valor -= o.valor * 0.05;
		descontoAplicado=true;
	}

	@Override
	public void aprova(Orcamento o) {
		o.estadoAtual = new Aprovado();

	}

	@Override
	public void reprova(Orcamento o) {
		o.estadoAtual = new Reprovado();
	}

	@Override
	public void finaliza(Orcamento o) {
		throw new RuntimeException("Orçamento em aprovação não pode ser finalizado.");

	}

}
