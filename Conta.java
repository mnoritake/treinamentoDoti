package br.com.banco.modelo;

public class Conta {
	
	private String numero;
	private Agencia agencia;
	private Cliente cliente;
	private float saldo;
	
	public Conta() {
		super();
	}
	
	public Conta(String numero, Agencia agencia, Cliente cliente, float saldo) {
		super();
		this.numero = numero;
		this.agencia = agencia;
		this.cliente = cliente;
		this.saldo = saldo;
	}
	
	// deposito
	public void deposito (float valor) {
		saldo = saldo + valor;
	}
	
	//saque
	public String saque (float valor) {
		saldo = saldo - valor;
		return "Saldo: " + saldo + "\n";
	}
	
	//exibir saldo
	public String exibirSaldo () {
		return
				"Olá " + new Cliente().getAll() + 
				" o seu saldo é R$ " + saldo; 
		
	}
	//get all
	
	public String getAll() {
		return
				"Numero: " + numero + "\n" +
				"Agencia: " + agencia + "\n" +
				"Cliente: " + cliente + "\n" +
				"Saldo:" + saldo;
	}
	
	// setAll
	public void setAll(String numero, Agencia agencia, Cliente cliente, float saldo) {
		this.numero = numero;
		this.agencia = agencia;
		this.cliente = cliente;
		this.saldo = saldo;
	}
	// getters and setters
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public Agencia getAgencia() {
		return agencia;
	}
	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	

}
