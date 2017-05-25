package investimentos;

public class Teste {

	public static void main(String[] args) {

		ContaBancaria c = new ContaBancaria();
		c.setSaldo(1000.0);
		
		RealizadorDeInvestimento r = new RealizadorDeInvestimento();
		
		System.out.println(r.realizaInvestimento(c, new InvConservador()));
		System.out.println(r.realizaInvestimento(c, new InvModerado()));
		System.out.println(r.realizaInvestimento(c, new InvArrojado()));
		

	}

}
