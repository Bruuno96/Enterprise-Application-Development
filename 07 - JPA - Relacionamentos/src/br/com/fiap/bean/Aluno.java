package br.com.fiap.bean;

import java.util.Calendar;

import javax.persistence.*;

@Entity
@SequenceGenerator(name="aluno", sequenceName = "sq_tb_aluno", allocationSize = 1)
@Table(name="tb_aluno")
public class Aluno {
	
	
	@Id
	@Column(name="cd_aluno")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "aluno")
	private int cdAluno;
	
	@Column(name="nm_aluno", nullable = false, length = 60)
	private String nmAluno;
	
	@Enumerated(EnumType.STRING)
	@Column(name="ds_genero", nullable = false)
	private Genero genero;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="dt_nascimento", nullable = false)
	private Calendar dtNascimento;
	
	
	
	
	public Aluno() {}

	// ATUALIZAR
	public Aluno(int cdAluno, String nmAluno, Genero genero, Calendar dtNascimento) {
		super();
		this.cdAluno = cdAluno;
		this.nmAluno = nmAluno;
		this.genero = genero;
		this.dtNascimento = dtNascimento;
	}

	// CRIAR ALUNO
	public Aluno(String nmAluno, Genero genero, Calendar dtNascimento) {
		super();
		this.nmAluno = nmAluno;
		this.genero = genero;
		this.dtNascimento = dtNascimento;
	}

	public int getCdAluno() {
		return cdAluno;
	}

	public void setCdAluno(int cdAluno) {
		this.cdAluno = cdAluno;
	}

	public String getNmAluno() {
		return nmAluno;
	}

	public void setNmAluno(String nmAluno) {
		this.nmAluno = nmAluno;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public Calendar getDtNascimento() {
		return dtNascimento;
	}

	public void setDtNascimento(Calendar dtNascimento) {
		this.dtNascimento = dtNascimento;
	}
	
	
	

}
