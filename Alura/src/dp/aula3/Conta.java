package dp.aula3;

import java.time.LocalDate;
import java.util.Date;

public class Conta {
	
	String nomeBanco;
	String endereço;
	String telefone;
	String titular;
	int agencia;
	long numeroConta;
	protected double saldo;
	String email;
	Date dataAutal = new Date();
	LocalDate dataAbertura;
	protected EstadoConta estadoAtual;
		
	public Conta(String nomeBanco, String endereço, String telefone, String titular, int agencia, long numeroConta,
			double saldo, String email, Date dataAutal, LocalDate dataAbertura) {
		super();
		this.nomeBanco = nomeBanco;
		this.endereço = endereço;
		this.telefone = telefone;
		this.titular = titular;
		this.agencia = agencia;
		this.numeroConta = numeroConta;
		this.saldo = saldo;
		this.email = email;
		this.dataAutal = dataAutal;
		this.dataAbertura = dataAbertura;
		
		if (saldo>=0)
			estadoAtual = new Positiva();
		else
			estadoAtual = new Negativa();
	}

	@Override
	public String toString() {
		return new String(titular+" "+numeroConta+" "+saldo+" "+dataAbertura);
	}


	public String getNomeBanco() {
		return nomeBanco;
	}
	public void setNomeBanco(String nomeBanco) {
		this.nomeBanco = nomeBanco;
	}
	public String getEndereço() {
		return endereço;
	}
	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public long getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(long numeroConta) {
		this.numeroConta = numeroConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDataAutal() {
		return dataAutal;
	}
	public void setDataAutal(Date dataAutal) {
		this.dataAutal = dataAutal;
	}
	
	public LocalDate getDataAbertura() {
		return dataAbertura;
	}
	
	public void setDataAbertura(LocalDate dataAbertura) {
		this.dataAbertura = dataAbertura;
	}
	
	public void deposita(double valor){
		estadoAtual.deposita(this, valor);
	}
	
	public void debita(double valor){
		estadoAtual.debita(this, valor);
	}
	
	

}
