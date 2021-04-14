package br.com.fiap.bean;

import javax.persistence.*;

@Entity
@Table(name="tb_nano_course")
@SequenceGenerator(name="nano_course", sequenceName = "sq_tb_evento", allocationSize = 1)
public class NanoCourses {
	
	@Id
	@Column(name="cd_nano_course")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="nano_course")
	private int cdNanoCourse;
	
	@Column(name="nm_course", nullable = false, length = 70)
	private String nmCourse;
	
	@Column(name="nr_aulas", nullable = false)
	private int nrAulas;
	
	@Column(name="nr_creditos")
	private int nrCreditos;
	
	@Enumerated(EnumType.STRING)
	@Column(name="ds_nivel", nullable = false, length = 20)
	private Nivel ds_nivel;

	public NanoCourses() {}
	
	
	// ATUALIZAR
	public NanoCourses(int cdNanoCourse, String nmCourse, int nrAulas, int nrCreditos, Nivel ds_nivel) {
		super();
		this.cdNanoCourse = cdNanoCourse;
		this.nmCourse = nmCourse;
		this.nrAulas = nrAulas;
		this.nrCreditos = nrCreditos;
		this.ds_nivel = ds_nivel;
	}


	// CADASTRAR
	public NanoCourses(String nmCourse, int nrAulas, int nrCreditos, Nivel ds_nivel) {
		super();
		this.nmCourse = nmCourse;
		this.nrAulas = nrAulas;
		this.nrCreditos = nrCreditos;
		this.ds_nivel = ds_nivel;
	}



	public int getCdNanoCourse() {
		return cdNanoCourse;
	}

	public void setCdNanoCourse(int cdNanoCourse) {
		this.cdNanoCourse = cdNanoCourse;
	}

	public String getNmCourse() {
		return nmCourse;
	}

	public void setNmCourse(String nmCourse) {
		this.nmCourse = nmCourse;
	}

	public int getNrAulas() {
		return nrAulas;
	}

	public void setNrAulas(int nrAulas) {
		this.nrAulas = nrAulas;
	}

	public int getNrCreditos() {
		return nrCreditos;
	}

	public void setNrCreditos(int nrCreditos) {
		this.nrCreditos = nrCreditos;
	}

	public Nivel getDs_nivel() {
		return ds_nivel;
	}

	public void setDs_nivel(Nivel ds_nivel) {
		this.ds_nivel = ds_nivel;
	}

	
	
	
	
	
	

}
