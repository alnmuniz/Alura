package dp.aula5;

import dp.aula2.Orcamento;

public class Teste {


	public static void main(String[] args) {
		Orcamento o = new Orcamento(500.0);
		
		o.aplicaDescontoExtra();
		o.aplicaDescontoExtra();
		o.aplicaDescontoExtra();
		
		System.out.println(o.getValor());
		
		o.estadoAtual.aprova(o);
		
		o.aplicaDescontoExtra();
		o.aplicaDescontoExtra();
		o.aplicaDescontoExtra();
		
		System.out.println(o.getValor());
		
		o.estadoAtual.finaliza(o);
		
		o.aplicaDescontoExtra();
		
	}

}
