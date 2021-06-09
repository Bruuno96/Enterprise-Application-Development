package br.com.fiap.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "TB_GS_HOTEL")
@SequenceGenerator(allocationSize = 1, name = "gs_hotel",sequenceName = "SQ_GS_HOTEL")
public class Hotel {
	
	@Id
	@Column(name="id_hotel")
	@GeneratedValue(generator = "gs_hotel", strategy = GenerationType.SEQUENCE)
	private Integer id;
	
	@Column(name="nm_hotel")
	private String nome;
	
	@Column(name="ft_hotel")
	private String foto;
	
	@Column(name="vl_preco")
	private Double preco;
	
	@Column(name="ds_descricao")
	private String descricao;
	
	@Column(name="nr_rating")
	private int rating;
	
	@Column(name="ds_link")
	private String link;
	
	@OneToMany(mappedBy = "hotel", cascade = CascadeType.PERSIST)
	private List<Reserva> reservas;
	
	 public void addReserva(Reserva reserva) {
			if (reserva == null)
				reservas = new ArrayList<>();
			//Adicionar o aluno no grupo (Lista)
			reservas.add(reserva);
			//Setar o grupo no aluno (Mapeia a FK, para inserir no banco)
			reserva.setHotel(this); //this referência ao próprio objeto
		}
	
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Endereco endereco;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="id_dica")
	private Dica dica;

	public Hotel() {}
	
	
	public Hotel(String nome, String foto, Double preco, String descricao, int rating, String link, Endereco endereco, Dica dica) {
		super();
		this.nome = nome;
		this.foto = foto;
		this.preco = preco;
		this.descricao = descricao;
		this.rating = rating;
		this.link = link;
		this.endereco = endereco;
		this.dica = dica;
	}

	

	public List<Reserva> getReservas() {
		return reservas;
	}


	public void setReservas(List<Reserva> reservas) {
		this.reservas = reservas;
	}


	public Endereco getEndereco() {
		return endereco;
	}


	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}


	public Dica getDica() {
		return dica;
	}


	public void setDica(Dica dica) {
		this.dica = dica;
	}


	public void setRating(int rating) {
		this.rating = rating;
	}


	public int getRating() {
		return rating;
	}

	public void setRatiing(int ratiing) {
		this.rating = ratiing;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	
	
	

}
