package br.com.fiap.bean;

import br.com.fiap.annotation.Coluna;
import br.com.fiap.annotation.Tabela;

@Tabela(nome="TB_ALUNO")
public class Aluno {
		
	@Coluna(nome="nm_aluno")
	private String nome;
	
	@Coluna(nome="nr_aluno")
	private int rm;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getRm() {
		return rm;
	}
	public void setRm(int rm) {
		this.rm = rm;
	}
	
}
