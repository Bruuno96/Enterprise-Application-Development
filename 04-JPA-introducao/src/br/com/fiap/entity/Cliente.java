package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.*;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name="TB_CLIENTE")

// allocationSize == incremento que o banco de dados vai fazer
// name == nome da sequence no java, ultilizado no generator
@SequenceGenerator(sequenceName="SQ_CLIENTE", name = "cliente", allocationSize = 1)
public class Cliente {
	
	@Id
	@Column(name="cd_cliente")
	@GeneratedValue(strategy= GenerationType.SEQUENCE, generator= "cliente")
	private int codigo;
	
	@Column(name="nm_nome", nullable = false)
	private String nome;
	
	@Column(name="ds_email", length = 50, nullable = false)
	private String email;
	
//	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="dt_dataNascimento", nullable = false)
	private Calendar dataNascimento;
	
	@Enumerated(EnumType.STRING)
	@Column(name="ds_genero")
	private Genero genero; 
	
	@Lob // Blob no banco , grava arquivos
	@Column(name = "fl_foto")
	private byte[] foto;

	
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Calendar getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public byte[] getFoto() {
		return foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
	}
	
	
	
	

}
