package dp.aula1;

public abstract class Imposto {
	
	protected Imposto outroImposto;
	
	public Imposto(){}
	
	public Imposto(Imposto outroImposto){
		this.outroImposto = outroImposto;		
	}
	public abstract double calculaImposto(Orcamento o);
	public double calculaOutroImposto(Orcamento o){
		if (outroImposto==null) return 0;
		return outroImposto.calculaImposto(o);
	}
}