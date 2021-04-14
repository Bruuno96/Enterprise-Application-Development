package br.com.fiap.bean;

import java.util.Calendar;

import javax.persistence.*;

@Entity
@Table(name="tb_projeto_challenge")
@SequenceGenerator(name="projeto_challenge", sequenceName = "sq_tb_projeto", allocationSize = 1)
public class ProjetoChallenge {
	
	@Id
	@Column(name="cd_evento")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "projeto_challenge")
	private int cdProjeto;
	
	@Column(name="nm_projeto", nullable = false, length = 60)
	private String nmProjeto;
	
	@Column(name="ds_tema", nullable = false, length = 60)
	private String descTema;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="dt_entrega", nullable = false)
	private Calendar dtEntrega;
	
	@Column(name="vl_nota", nullable = false)
	private double vlNota;
	
	// MAPAEAMENTO...
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY) // Cascade faz a alteração por cascata fazendo com que o projeto cadastre o grupo
	@JoinColumn(name="cdGrupo")
	private GrupoChallenge cdGrupo;
	

	//PADRÃO
	public ProjetoChallenge() {}
	
	//ATUALIZAR
	public ProjetoChallenge(int cdProjeto, String nmProjeto, String descTema, Calendar dtEntrega, double vlNota) {
		super();
		this.cdProjeto = cdProjeto;
		this.nmProjeto = nmProjeto;
		this.descTema = descTema;
		this.dtEntrega = dtEntrega;
		this.vlNota = vlNota;
	}
	
	//CRIAR
	public ProjetoChallenge(String nmProjeto, String descTema, Calendar dtEntrega, double vlNota,
			GrupoChallenge cdGrupo) {
		super();
		this.nmProjeto = nmProjeto;
		this.descTema = descTema;
		this.dtEntrega = dtEntrega;
		this.vlNota = vlNota;
		this.cdGrupo = cdGrupo;
	}
	
	public GrupoChallenge getNomeGrupo() {
		return cdGrupo;
	}

	public void setCdGrupo(GrupoChallenge cdGrupo) {
		this.cdGrupo = cdGrupo;
	}
	
	public int getCdProjeto() {
		return cdProjeto;
	}
	public void setCdProjeto(int cdProjeto) {
		this.cdProjeto = cdProjeto;
	}
	public String getNmProjeto() {
		return nmProjeto;
	}
	public void setNmProjeto(String nmProjeto) {
		this.nmProjeto = nmProjeto;
	}
	public String getDescTema() {
		return descTema;
	}
	public void setDescTema(String descTema) {
		this.descTema = descTema;
	}
	public Calendar getDtEntrega() {
		return dtEntrega;
	}
	public void setDtEntrega(Calendar dtEntrega) {
		this.dtEntrega = dtEntrega;
	}
	public double getVlNota() {
		return vlNota;
	}
	public void setVlNota(double vlNota) {
		this.vlNota = vlNota;
	}

	
	

}
