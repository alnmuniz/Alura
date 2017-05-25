package dp.aula5;

import dp.aula2.Orcamento;

public class Finalizado implements EstadoOrcamento {

	@Override
	public void aplicaDescontoExtra(Orcamento o) {
		throw new RuntimeException("Orçamento finalizado não tem desconto extra.");
	}

	@Override
	public void aprova(Orcamento o) {
		throw new RuntimeException("Orçamento já finalizado.");

	}

	@Override
	public void reprova(Orcamento o) {
		throw new RuntimeException("Orçamento já finalizado.");
	}

	@Override
	public void finaliza(Orcamento o) {
		throw new RuntimeException("Orçamento já finalizado.");

	}

}
