package br.org.generation.lojagames.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_categoria")
public class Categoria {
	
	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	//@Id -> Especifica a chave primária de uma entidade  @Table
	
	
	@NotNull(message = "Tipo é obrigatório")
	@Size(min = 5)
	private String tipo;
	
	@OneToMany(mappedBy = "categoria",cascade = CascadeType.ALL)
	//Especifica uma associação de muitos valores com multiplicidade de um para muitos
	@JsonIgnoreProperties("categoria")
	/*Anotação que pode ser usada para suprimir a serialização de propriedades ou 
	 *ignorar o processamento de propriedades JSON lidas*/
	private List<Produto> produto;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public List<Produto> getProduto() {
		return produto;
	}

	public void setProduto(List<Produto> produto) {
		this.produto = produto;
	}
	
	

}