package br.com.banco.modelo;

public class Agencia {

	
	private int numero;
	private String nome;
	private Endereco endereco;
	
	
	public Agencia() {
		super();
	}
	public Agencia(int numero, String nome, Endereco endereco) {
		super();
		this.numero = numero;
		this.nome = nome;
		this.endereco = endereco;
	}
	
	// setAll
	public void setAll(int numero, String nome, Endereco endereco) {
		this.numero = numero;
		this.nome = nome;
		this.endereco = endereco;
	}
	
	//getAll
	
	public String getAll() {
		return 
				"Numero: " + numero + "\n" +
				"Nome  : " + nome   + "\n" +
				"Endereco: " + endereco;
	}
	
	// getters and setters
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
	
	
	
	
}
