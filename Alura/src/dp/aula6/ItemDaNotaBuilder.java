package dp.aula6;

public class ItemDaNotaBuilder {

	String descricao;
	double valor;
	
	public ItemDaNotaBuilder comDescricao(String valor){
		this.descricao=valor;
		return this;
	}
	public ItemDaNotaBuilder comValor(double valor){
		this.valor=valor;
		return this;
	}
	public ItemDaNota constroi(){
		return new ItemDaNota(descricao, valor);
	}
}