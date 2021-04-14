package br.com.fiap.entity;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.persistence.*;

import org.hibernate.annotations.CreationTimestamp;


@Entity
@Table(name="TB_VENDA")
@SequenceGenerator(name="venda", sequenceName = "SQ_TB_VENDA", allocationSize = 1 )
public class Venda {
	
	@Id
	@Column(name="cd_venda")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "venda")
	private int cdVenda;
	
	@Column(name="vl_venda", nullable = false)
	private double vlVenda;
	
	@Column(name="nm_cliente", nullable = false, length = 50)
	private String nomeCliente;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="dt_venda", nullable = false)
	private Calendar dtVenda;
	
	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="dt_cadastro", nullable = false, updatable = false)
	private Calendar dtCadastro;
	
	@Column(name="nm_vendedor", nullable = false, length = 50)
	private String nomeVendedor;
	
	@Enumerated(EnumType.STRING)
	@Column(name="ds_cliente")
	private TipoCliente tipoCliente;
	
	// construtor padrão
	public Venda() {}
	

	// usar construtor quando for criar uma nova instancia no banco
	public Venda(double vlVenda, String nomeCliente, Calendar dtVenda, String nomeVendedor, TipoCliente tipoCliente) {
		super();
		this.vlVenda = vlVenda;
		this.nomeCliente = nomeCliente;
		this.dtVenda = dtVenda;
		this.nomeVendedor = nomeVendedor;
		this.tipoCliente = tipoCliente;
	}
	
	
	// usar construtor quando for atualizar
	public Venda(int cdVenda, double vlVenda, String nomeCliente, Calendar dtVenda, String nomeVendedor,
			TipoCliente tipoCliente) {
		super();
		this.cdVenda = cdVenda;
		this.vlVenda = vlVenda;
		this.nomeCliente = nomeCliente;
		this.dtVenda = dtVenda;
		this.nomeVendedor = nomeVendedor;
		this.tipoCliente = tipoCliente;
	}


	@Override
	public String toString() {
		SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyy HH:mm");
		return "Código: "+cdVenda+
			   "\nCliente: "+nomeCliente+
			   "\nValor: "+vlVenda+
			   "\nVendedor: "+nomeVendedor+
			   "\nTipo de cliente: "+tipoCliente+
			   "\nData da venda: "+formatador.format(dtVenda.getTime())+
			   "\nData de cadastro: "+formatador.format(dtCadastro.getTime());
		
	}
	public double getVlVenda() {
		return vlVenda;
	}

	public void setVlVenda(double vlVenda) {
		this.vlVenda = vlVenda;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public Calendar getDtVenda() {
		return dtVenda;
	}

	public void setDtVenda(Calendar dtVenda) {
		this.dtVenda = dtVenda;
	}

	public Calendar getDtCadastro() {
		return dtCadastro;
	}

	public void setDtCadastro(Calendar dtCadastro) {
		this.dtCadastro = dtCadastro;
	}

	public String getNomeVendedor() {
		return nomeVendedor;
	}

	public void setNomeVendedor(String nomeVendedor) {
		this.nomeVendedor = nomeVendedor;
	}

	public TipoCliente getTipoCliente() {
		return tipoCliente;
	}

	public void setTipoCliente(TipoCliente tipoCliente) {
		this.tipoCliente = tipoCliente;
	}

	public int getCdVenda() {
		return cdVenda;
	}
	
	public void setCdVenda(int cdVenda) {
		this.cdVenda = cdVenda;
	}
	
}
