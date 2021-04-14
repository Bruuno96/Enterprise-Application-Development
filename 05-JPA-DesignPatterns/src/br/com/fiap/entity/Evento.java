package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.*;

import org.hibernate.annotations.CreationTimestamp;

import jdk.jfr.Timestamp;

@Entity
@Table(name="tb_evento")
@SequenceGenerator(name="usuario", sequenceName = "sq_tb_evento", allocationSize = 1)
public class Evento {
	
	@Id
	@Column(name="cd_evento")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "evento")
	private int cdEvento;
	
	@Column(name="nm_evento", nullable = false, length = 60)
	private String nomeEvento;
	
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="dt_evento", nullable = false)
	private Calendar dataEvento;
	
	@Column(name="vl_ingresso", nullable = false)
	private double precoIngresso;
	
	@Column(name="ds_evento", nullable = false, length = 40)
	@Enumerated(EnumType.STRING)
	private TipoEvento tipoEvento;
	
	@Column(name="st_benificente", nullable = false)
	private boolean stBenificente;
	
	public Evento() {}
	
	// ATUALIZAR
	public Evento(int cdEvento, String nomeEvento, Calendar dataEvento, double precoIngresso, TipoEvento tipoEvento,
			boolean stBenificente) {
		super();
		this.cdEvento = cdEvento;
		this.nomeEvento = nomeEvento;
		this.dataEvento = dataEvento;
		this.precoIngresso = precoIngresso;
		this.tipoEvento = tipoEvento;
		this.stBenificente = stBenificente;
	}

	// CRIAR
	public Evento(String nomeEvento, Calendar dataEvento, double precoIngresso, TipoEvento tipoEvento,
			boolean stBenificente) {
		super();
		this.nomeEvento = nomeEvento;
		this.dataEvento = dataEvento;
		this.precoIngresso = precoIngresso;
		this.tipoEvento = tipoEvento;
		this.stBenificente = stBenificente;
	}

	public int getCdEvento() {
		return cdEvento;
	}

	public void setCdEvento(int cdEvento) {
		this.cdEvento = cdEvento;
	}

	public String getNomeEvento() {
		return nomeEvento;
	}

	public void setNomeEvento(String nomeEvento) {
		this.nomeEvento = nomeEvento;
	}

	public Calendar getDataEvento() {
		return dataEvento;
	}

	public void setDataEvento(Calendar dataEvento) {
		this.dataEvento = dataEvento;
	}

	public double getPrecoIngresso() {
		return precoIngresso;
	}

	public void setPrecoIngresso(double precoIngresso) {
		this.precoIngresso = precoIngresso;
	}

	public TipoEvento getTipoEvento() {
		return tipoEvento;
	}

	public void setTipoEvento(TipoEvento tipoEvento) {
		this.tipoEvento = tipoEvento;
	}

	public boolean isStBenificente() {
		return stBenificente;
	}

	public void setStBenificente(boolean stBenificente) {
		this.stBenificente = stBenificente;
	}
	
	

}
