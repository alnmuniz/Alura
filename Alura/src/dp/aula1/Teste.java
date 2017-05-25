package dp.aula1;

public class Teste {

//	public static void main(String[] args) {
//		DPAula1 aula = new DPAula1();
//		
//		CalculadoraDeImposto calc = aula.new CalculadoraDeImposto();
//		
//		Orcamento o = aula.new Orcamento(1236.12);
//		
//		calc.calcular(o, aula.new ICMS());
//		
//		calc.calcular(o, aula.new ISS());
//
//	}
	
//	public static void main(String[] args) {
//		DPAula1 aula = new DPAula1();
//		
//		CalculadoraDeImposto calc = aula.new CalculadoraDeImposto();
//		
//		calc.calcular(aula.new Orcamento( 236.12), aula.new ICCC());
//		calc.calcular(aula.new Orcamento(1236.12), aula.new ICCC());
//		calc.calcular(aula.new Orcamento(3236.12), aula.new ICCC());
//
//	}
	
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		CalculadoraDeImposto calc = new CalculadoraDeImposto();
		
		Orcamento o = new Orcamento(501);
		
		o.adicionaItem(new Item("item a", 100));
		o.adicionaItem(new Item("LAPIS", 200));
		o.adicionaItem(new Item("LAPIS", 200));
		o.adicionaItem(new Item("CANETA", 100));
		
		System.out.println(calc.calcular(o, new ICPP()));
		System.out.println(calc.calcular(o, new ICPP(new ICCC(new ICMS(new ISS())))));
		System.out.println(calc.calcular(o, new ICKV()));
		System.out.println(calc.calcular(o, new IHIT()));
		System.out.println(calc.calcular(o, new IMA( new ICCC(new ICKV(new ICPP())))));
	}
	

}
