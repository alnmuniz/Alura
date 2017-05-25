package dp.aula5;

import dp.aula2.Orcamento;

public interface EstadoOrcamento {
	
	void aplicaDescontoExtra(Orcamento o);
	void aprova(Orcamento o);
	void reprova(Orcamento o);
	void finaliza(Orcamento o);
	
	
}
