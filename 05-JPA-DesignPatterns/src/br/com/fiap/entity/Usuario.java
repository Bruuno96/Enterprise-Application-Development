package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.*;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name="TB_EAD_USUARIO")
@SequenceGenerator(name="usuario", sequenceName="SQ_TB_USUARIO", allocationSize = 1)
public class Usuario {
	
	@Id
	@Column(name="cd_usuario")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "usuario")
	private int codigo;
	
	@Column(name="nm_usuario", nullable = false, length = 60)
	private String nome;
	
	@Column(name="dt_cadastro", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	@CreationTimestamp
	private Calendar dataCadastro;
	
	@Enumerated(EnumType.STRING)
	@Column(name="ds_tipo", nullable = false, length = 2)
	private Tipo tipo;

	public Usuario() {}
	
	// CRIAR
	public Usuario(String nome, Tipo tipo) {
		this.nome = nome;
		this.tipo = tipo;
	}
	
	// ATUALIZAR
	public Usuario(int codigo, String nome, Tipo tipo) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.tipo = tipo;
	}

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

	public Calendar getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Calendar dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
	
	
	
}
