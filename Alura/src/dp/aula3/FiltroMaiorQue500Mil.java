package dp.aula3;

import java.util.List;
import java.util.stream.Collectors;

public class FiltroMaiorQue500Mil extends Filtro {

	public FiltroMaiorQue500Mil() {
		// TODO Auto-generated constructor stub
	}

	public FiltroMaiorQue500Mil(Filtro outroFiltro) {
		super(outroFiltro);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Conta> filtrar(List<Conta> listaContas) {
		return aplicarOutroFiltro(listaContas.stream().filter(c -> c.getSaldo() > 500000.0).collect(Collectors.toList()));
	}

}
