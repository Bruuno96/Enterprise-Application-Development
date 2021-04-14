package br.com.fiap.entity;

import java.util.Calendar; 

import javax.annotation.processing.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="TB_PRODUTO")
@SequenceGenerator(name="produto", sequenceName = "SEQ_TB_PRODUTO", allocationSize = 1)
public class Produto {

	@Id
	@Column(name="cd_produto")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "produto" )
	private int cdProduto;
	
	@Column(name="Vl_produto", nullable = false)
	private double vlProduto;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="dt_cadastro", nullable = false)
	private Calendar cadastro;
	
	@Column(name="qtd_itens", nullable = false)
	private int quantidade;
	
	@Enumerated(EnumType.STRING)
	@Column(name="ds_categoria")
	private Categoria categoria;
	
	@Lob
	@Column(name="fl_foto")
	private byte[] foto;
	
	@Column(name="ds_descricao")
	private String descricao;
	
	@Column(name="nm_nome", length = 50, nullable = false)
	private String nome;
	
	@Column(name="ds_tamanho")
	@Enumerated(EnumType.STRING)
	private Tamanho tamanho;
}
