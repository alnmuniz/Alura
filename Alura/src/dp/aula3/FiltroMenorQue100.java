package dp.aula3;

import java.util.List;
import java.util.stream.Collectors;

public class FiltroMenorQue100 extends Filtro {

	public FiltroMenorQue100() {
		// TODO Auto-generated constructor stub
	}

	public FiltroMenorQue100(Filtro outroFiltro) {
		super(outroFiltro);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Conta> filtrar(List<Conta> listaContas) {
		return aplicarOutroFiltro(listaContas.stream().filter(c -> c.getSaldo() < 100.0).collect(Collectors.toList()));
	}

}
