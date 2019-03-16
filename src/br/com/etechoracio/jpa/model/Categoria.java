package br.com.etechoracio.jpa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Table(name = "TBL_CATEGORIA")
@Entity
@Getter
@Setter
public class Categoria {

	@GeneratedValue
	@Id
	@Column(name = "ID_CATEGORIA")
	private Long id;

	@Column(name = "TX_DESCRICAO")
	private String descricao;

}
