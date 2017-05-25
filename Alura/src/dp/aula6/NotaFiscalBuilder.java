package dp.aula6;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import dp.aula7.AcaoAposGerarNota;

public class NotaFiscalBuilder {

	String razaoSocial;
	String cnpj;
	double valorBruto;
	double impostos;
	LocalDate dataDeEmissao = LocalDate.now();
	String observacoes;

	List<ItemDaNota> itens = new ArrayList<>();
	List<AcaoAposGerarNota> todasAcoes = new ArrayList<>();

	public NotaFiscalBuilder comAcao(AcaoAposGerarNota acao){
		this.todasAcoes.add(acao);
		return this;
	}
	
	public NotaFiscalBuilder comAcoes(List<AcaoAposGerarNota> acoes){
		this.todasAcoes.addAll(acoes);
		return this;
	}
	
	public NotaFiscalBuilder paraEmpresa(String valor) {
		razaoSocial = valor;
		return this;
	}

	public NotaFiscalBuilder paraCnpj(String valor) {
		cnpj = valor;
		return this;
	}
	
	public NotaFiscalBuilder comItem(ItemDaNota valor) {
		valorBruto += valor.getValor();
		impostos += valor.getValor()*0.05;
		itens.add(valor);
		return this;
	} 
	
	public NotaFiscalBuilder naDataAtual(){
		dataDeEmissao = LocalDate.now();
		return this;
	}
	
	public NotaFiscalBuilder naData(LocalDate valor){
		dataDeEmissao = valor;
		return this;
	}
	
	public NotaFiscalBuilder comObservacoes(String valor){
		observacoes=valor;
		return this;
	}
	
	public NotaFiscal constroi(){
		
		NotaFiscal nf =new NotaFiscal(razaoSocial, cnpj, valorBruto, impostos, dataDeEmissao, observacoes, itens); 
		
		todasAcoes.stream().forEach(a -> a.executa(nf));
		
		return nf;
	}

}
