package br.com.fiap.bean;

import br.com.fiap.annotation.Coluna;

public class Cliente {
	
	@Coluna(nome="cd_cliente")
	private int codigo;
	
	@Coluna(nome="nm_cliente")
	private String nome;
	
	@Coluna(nome="nr_cpf", tamanho = 10)
	private String cpf;
	
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}
