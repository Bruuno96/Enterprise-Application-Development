package br.com.fiap.bean;

import javax.persistence.*;


@Entity
@Table(name="tb_grupo_challenge")
@SequenceGenerator(name="grupo_challenge", sequenceName = "sq_tb_grupo", allocationSize = 1)
public class GrupoChallenge {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "grupo")
	@Column(name="cd_grupo", nullable = false)
	private int cdGrupo;
	
	@Column(name="nm_grupo")
	private String nm_grupo;
	
	@OneToOne(mappedBy = "cdGrupo", cascade = CascadeType.ALL)
	private ProjetoChallenge projetoChallenge;
	
	
	
	// PADRÃO
	public GrupoChallenge() {}

	//CRIAR
	public GrupoChallenge(String nm_grupo) {
		super();
		this.nm_grupo = nm_grupo;
	}
	
	
	//ATUALIZAR
	public GrupoChallenge(int cdGrupo, String nm_grupo) {
		super();
		this.cdGrupo = cdGrupo;
		this.nm_grupo = nm_grupo;
	}

	

	public int getCdGrupo() {
		return cdGrupo;
	}

	public void setCdGrupo(int cdGrupo) {
		this.cdGrupo = cdGrupo;
	}

	public String getNm_grupo() {
		return nm_grupo;
	}

	public void setNm_grupo(String nm_grupo) {
		this.nm_grupo = nm_grupo;
	}
	
	
}
