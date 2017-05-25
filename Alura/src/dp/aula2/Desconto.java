package dp.aula2;

public interface Desconto {
	
	double desconta(Orcamento orcamento);
    void setProximo(Desconto proximo);
}
