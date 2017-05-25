package dp.aula6;

public class Teste {

	public static void main(String[] args) {
		NotaFiscalBuilder nfb = new NotaFiscalBuilder();
		
		nfb.paraEmpresa("teste")
		.paraCnpj("123456789")
		.comItem(new ItemDaNotaBuilder().comDescricao("item 1").comValor(200.0).constroi())
		.comItem(new ItemDaNota("item 2", 300.0))
		.comItem(new ItemDaNota("item 3", 400.0))
		.naDataAtual()
		.comObservacoes("obs")
		;
		
		NotaFiscal nf = nfb.constroi();
		
		System.out.println(nf.getValorBruto());

	}

}
