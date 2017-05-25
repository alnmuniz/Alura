package dp.aula2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import dp.aula5.EmAprovacao;
import dp.aula5.EstadoOrcamento;

public class Orcamento {
	public double valor;
    private List<Item> itens;
    
    public EstadoOrcamento estadoAtual = new EmAprovacao();

    public Orcamento(double valor) {
        this.valor = valor;
        this.itens = new ArrayList<Item>();
    }

    public double getValor() {
        return valor;
    }

    public List<Item> getItens() {
        return Collections.unmodifiableList(itens);
    }

    public void adicionaItem(Item item) {
        itens.add(item);
    }
    
    public void aplicaDescontoExtra(){
    	estadoAtual.aplicaDescontoExtra(this);
    }
}
