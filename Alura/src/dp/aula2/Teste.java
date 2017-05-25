package dp.aula2;

public class Teste {

	public static void main(String[] args) {
		CalculadorDeDesconto calc = new CalculadorDeDesconto();
		Orcamento o = new Orcamento(500);
		
		o.adicionaItem(new Item("item a", 100));
		o.adicionaItem(new Item("bli", 200));
		o.adicionaItem(new Item("LAPIS", 200));
		o.adicionaItem(new Item("CANETA", 100));
		
		System.out.println(calc.calculaDesconto(o));

	}

}
