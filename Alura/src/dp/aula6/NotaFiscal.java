package dp.aula6;

import java.time.LocalDate;
import java.util.List;

public class NotaFiscal {

	String razaoSocial;
	String cnpj;
	double valorBruto;
	double impostos;
	LocalDate dataDeEmissao;
	String observacoes;
	
	List<ItemDaNota> itens;

	public NotaFiscal(String razaoSocial, String cnpj, double valorBruto, double impostos, LocalDate dataDeEmissao,
			String observacoes, List<ItemDaNota> itens) {
		super();
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
		this.valorBruto = valorBruto;
		this.impostos = impostos;
		this.dataDeEmissao = dataDeEmissao;
		this.observacoes = observacoes;
		this.itens = itens;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public String getCnpj() {
		return cnpj;
	}

	public double getValorBruto() {
		return valorBruto;
	}

	public double getImpostos() {
		return impostos;
	}

	public LocalDate getDataDeEmissao() {
		return dataDeEmissao;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public List<ItemDaNota> getItens() {
		return itens;
	}	
	
	
	
}
