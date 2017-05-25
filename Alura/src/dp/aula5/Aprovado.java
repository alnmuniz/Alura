package dp.aula5;

import dp.aula2.Orcamento;

public class Aprovado implements EstadoOrcamento {
	
	private boolean descontoAplicado = false;

	@Override
	public void aplicaDescontoExtra(Orcamento o) {
		if (!descontoAplicado)
			o.valor -= o.valor * 0.02;
		descontoAplicado=true;
	}

	@Override
	public void aprova(Orcamento o) {
		throw new RuntimeException("Orçamento já aprovado.");
	}

	@Override
	public void reprova(Orcamento o) {
		throw new RuntimeException("Orçamento ja aprovado.");

	}

	@Override
	public void finaliza(Orcamento o) {
		o.estadoAtual = new Finalizado();

	}

}
