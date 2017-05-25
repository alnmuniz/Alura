import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Formatter;

public class Aula6 {
	
	public static void main(String[] args) {
		LocalDate hoje = LocalDate.now();
		
		System.out.println(hoje);
		
		LocalDate _25jan2099 = LocalDate.of(2099, 1, 25);
		System.out.println(_25jan2099);
		
		Period periodo = Period.between(hoje, _25jan2099);
		System.out.println(periodo);
		
		DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println(hoje.format(f));
		
		
	}

}
