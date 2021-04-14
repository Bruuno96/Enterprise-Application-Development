package br.com.fiap.entity;

import javax.persistence.*;

@Entity
@Table(name="TB_SALA")
@SequenceGenerator(name="sala", sequenceName = "SQ_TB_VENDA", allocationSize = 1)
public class Sala {

	@Id
	@Column(name="cd_sala", nullable = false)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sala")
	private int codigoSala;
	
	@Column(name="nm_sala", nullable = false, length = 60)
	private String nomeSala;
	
	@Column(name="nr_assento")
	private int numeroAssentos;
	
	
	public Sala() {}
	
	// CRIAR
	public Sala(String nomeSala, int numeroAssentos) {
		super();
		this.nomeSala = nomeSala;
		this.numeroAssentos = numeroAssentos;
	}
	
	
	// ATUALIZAR
	public Sala(int codigoSala, String nomeSala, int numeroAssentos) {
		super();
		this.codigoSala = codigoSala;
		this.nomeSala = nomeSala;
		this.numeroAssentos = numeroAssentos;
	}

	public int getCodigoSala() {
		return codigoSala;
	}

	public void setCodigoSala(int codigoSala) {
		this.codigoSala = codigoSala;
	}

	public String getNomeSala() {
		return nomeSala;
	}

	public void setNomeSala(String nomeSala) {
		this.nomeSala = nomeSala;
	}

	public int getNumeroAssentos() {
		return numeroAssentos;
	}

	public void setNumeroAssentos(int numeroAssentos) {
		this.numeroAssentos = numeroAssentos;
	}
	
	
//	TB_SALA
//	cd_sala NUMBER PK NOT NULL
//	nm_sala VARCHAR(50) NOT NULL
//	nr_assentos NUMBER

}
