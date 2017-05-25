package dp.aula5;

import dp.aula2.Orcamento;

public class Reprovado implements EstadoOrcamento {

	@Override
	public void aplicaDescontoExtra(Orcamento o) {
		throw new RuntimeException("Orçamento reprovado não tem desconto extra.");
	}

	@Override
	public void aprova(Orcamento o) {
		throw new RuntimeException("Orçamento já reprovado.");

	}

	@Override
	public void reprova(Orcamento o) {
		throw new RuntimeException("Orçamento já reprovado.");
	}

	@Override
	public void finaliza(Orcamento o) {
		o.estadoAtual = new Finalizado();

	}

}
