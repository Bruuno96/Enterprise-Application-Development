package br.com.fiap.entity;

import java.util.Calendar;
import javax.persistence.*;

@Entity
@Table(name="TB_GS_RESERVA")
@SequenceGenerator(allocationSize = 1, sequenceName = "SQ_GS_RESERVA", name = "gs_reserva")
public class Reserva {
	
	@Id
	@Column(name = "id_reserva")
	@GeneratedValue(generator = "gs_reserva",strategy = GenerationType.SEQUENCE)
	private Integer id;
	
	@Column(name="vl_preco_total")
	private Double precoTotal;
	
	@Column(name="dt_entrada")
	@Temporal(TemporalType.DATE)
	private Calendar entrada;
	
	@Column(name="dt_saida")
	@Temporal(TemporalType.DATE)
	private Calendar saida;
	
	@ManyToOne
	@JoinColumn(name = "id_usuario")
	private Usuario usuario;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_hotel")
	private Hotel hotel;
	
	public Reserva() {}
	

	public Reserva(Double precoTotal, Calendar entrada, Calendar saida) {
		super();
		this.precoTotal = precoTotal;
		this.entrada = entrada;
		this.saida = saida;
	}


	

	public Usuario getUsuario() {
		return usuario;
	}



	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}


	public Hotel getHotel() {
		return hotel;
	}



	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}



	public Double getPrecoTotal() {
		return precoTotal;
	}

	public void setPrecoTotal(Double precoTotal) {
		this.precoTotal = precoTotal;
	}

	public Calendar getEntrada() {
		return entrada;
	}

	public void setEntrada(Calendar entrada) {
		this.entrada = entrada;
	}

	public Calendar getSaida() {
		return saida;
	}

	public void setSaida(Calendar saida) {
		this.saida = saida;
	}
	
	

}
