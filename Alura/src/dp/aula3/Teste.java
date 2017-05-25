package dp.aula3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Teste {

	public static void main(String[] args) {
		Conta c1 = new Conta("bb", "rua", "656454", "ze", 123, 123456, 321.23, "bb@asd", new Date(), LocalDate.of(2099, 1, 25));
		
		ArrayList<Conta> lista = new ArrayList<>();
		lista.add(c1);
		lista.add(new Conta("bb", "rua", "656454", "asd", 123, 123457, 21.23, "bb@asd", new Date(), LocalDate.of(2099, 1, 25)));
		lista.add(new Conta("bb", "rua", "656454", "asd", 123, 123458, 1.23, "bb@asd", new Date(), LocalDate.of(2016, 3, 1)));
		lista.add(new Conta("bb", "rua", "656454", "andre", 123, 123459, 987643211.23, "bb@asd", new Date(), LocalDate.of(2016, 3, 2)));
		
		Filtro f1 = new FiltroMenorQue100(new FiltroAbertaNoMes());
		Filtro f2 = new FiltroMaiorQue500Mil(new FiltroAbertaNoMes());
		
		System.out.println(f1.filtrar(lista));
		System.out.println(f2.filtrar(lista));

	}

}
