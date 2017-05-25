package dp.aula1;

public class CalculadoraDeImposto {
	public double calcular(Orcamento o, Imposto i){
		return i.calculaImposto(o);
	}
}