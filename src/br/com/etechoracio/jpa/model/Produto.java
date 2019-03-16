package br.com.etechoracio.jpa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "TBL_PRODUTO")
@Setter
@Getter
public class Produto {

	@Id
	@GeneratedValue
	@Column(name = "ID_PRODUTO")
	private Long id;

	@Column(name = "TX_NOME")
	private String nome;

	@Column(name = "NR_PRECO")
	private double preco;

	@JoinColumn(name = "ID_CATEGORIA")
	@ManyToOne(fetch=FetchType.LAZY)
	private Categoria categoria;

}
