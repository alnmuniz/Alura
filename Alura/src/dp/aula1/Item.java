package dp.aula1;

public class Item {
	private String nome;
    private double valor;

    public Item(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
      return valor;
    }
     @Override
    public boolean equals(Object obj) {
    	// TODO Auto-generated method stub
    	return this.nome.equals(((Item)obj).nome);
    }
}