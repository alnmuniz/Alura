import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Aula4 {

	public static void main(String[] args) {
		
		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));
		
		cursos.sort(Comparator.comparingInt(Curso::getAlunos));
		
		cursos.stream()
			.filter(c -> c.getAlunos() > 50)
			.forEach(System.out::println);
		
		int sum = cursos.stream()
			.filter(c -> c.getAlunos() >= 100)
			.mapToInt(Curso::getAlunos)
			.sum();
			;
			
		System.out.println(sum);
		
		System.out.println(cursos.stream().findAny().get().getNome());
		
		cursos.stream()
			.map(Curso::getNome)
			.forEach(System.out::println);
			;
		
		OptionalDouble average = cursos.stream()
			.mapToInt(Curso::getAlunos)
			.average();
		
		average.ifPresent(System.out::println);
		
		List<Curso> collect = cursos.stream()
			.filter(c -> c.getAlunos() > 50)
			.collect(Collectors.toList())
			;

	}

}

class Curso {
    private String nome;
    private int alunos;

    public Curso(String nome, int alunos) {
        this.nome = nome;
        this.alunos = alunos;
    }

    public String getNome() {
        return nome;
    }

    public int getAlunos() {
        return alunos;
    }
    
    @Override
    public String toString() {    	
    	return getNome();
    }
}