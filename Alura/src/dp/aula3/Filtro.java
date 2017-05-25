package dp.aula3;

import java.util.List;

public abstract class Filtro {

	private Filtro outroFiltro;

	public Filtro() {
		// TODO Auto-generated constructor stub
	}
	
	public Filtro(Filtro outroFiltro) {
		this.outroFiltro = outroFiltro;
		// TODO Auto-generated constructor stub
	}
	
	public abstract List<Conta> filtrar (List<Conta> listaContas);
	
	public List<Conta> aplicarOutroFiltro (List<Conta> listaContas){
		if (outroFiltro==null) return listaContas;
		return outroFiltro.filtrar(listaContas);
	}

}
