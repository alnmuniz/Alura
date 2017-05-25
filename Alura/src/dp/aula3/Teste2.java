package dp.aula3;

import java.time.LocalDate;
import java.util.Date;

public class Teste2 {

	public static void main(String[] args) {
		Conta c = new Conta("bb","asd","123","andre",345,100052632,0,"asd",new Date(),LocalDate.of(2016, 3, 1));
		
		c.deposita(100);
		
		c.debita(99);
		
		//c.debita(1);
		
		c.deposita(200);
		
	

	}

}
