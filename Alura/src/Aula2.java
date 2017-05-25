import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class Aula2 {

	public static void main(String[] args) {
		
		//Object o = s -> System.out.println(s);
		
		new Thread(()->{System.out.println("Executando um Runnable");}).start();
		
		List<String> palavras = new ArrayList<>();
		palavras.add("aaaa");
		palavras.add("bbb");
		palavras.add("cc");
		palavras.add("d");
		
		Function<String, Integer> funcao = s -> s.codePointAt(0);		
		palavras.sort(String.CASE_INSENSITIVE_ORDER);
		
		palavras.forEach(System.out::println);
	}
	
}
