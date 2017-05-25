package dp.aula3;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class FiltroAbertaNoMes extends Filtro {

	public FiltroAbertaNoMes() {
		// TODO Auto-generated constructor stub
	}

	public FiltroAbertaNoMes(Filtro outroFiltro) {
		super(outroFiltro);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Conta> filtrar(List<Conta> listaContas) {
		return aplicarOutroFiltro(listaContas.stream().filter(c -> c.getDataAbertura().getMonth().equals(LocalDate.now().getMonth())).collect(Collectors.toList()));
	}

}
