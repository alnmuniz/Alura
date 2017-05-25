package dp.aula5;

import dp.aula2.Orcamento;

public class Finalizado implements EstadoOrcamento {

	@Override
	public void aplicaDescontoExtra(Orcamento o) {
		throw new RuntimeException("Or�amento finalizado n�o tem desconto extra.");
	}

	@Override
	public void aprova(Orcamento o) {
		throw new RuntimeException("Or�amento j� finalizado.");

	}

	@Override
	public void reprova(Orcamento o) {
		throw new RuntimeException("Or�amento j� finalizado.");
	}

	@Override
	public void finaliza(Orcamento o) {
		throw new RuntimeException("Or�amento j� finalizado.");

	}

}
