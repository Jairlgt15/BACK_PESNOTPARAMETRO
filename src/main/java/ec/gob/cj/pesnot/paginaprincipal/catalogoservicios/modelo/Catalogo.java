package ec.gob.cj.pesnot.paginaprincipal.catalogoservicios.modelo;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "catalogo")

public class Catalogo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDCATALOGO")
	private BigDecimal id;
	@Column(name = "NOMBRE")
	private String nombre;
	@Column(name = "VALOREXTRA")
	private String valor;
	@Column(name = "IDESTADO")
	private Long idEstado;
	
	
	public Catalogo(String nombre, String valor, Long idEstado) {
		super();
		this.nombre = nombre;
		this.valor = valor;
		this.idEstado = idEstado;
	}
	public Catalogo() {

	}
	public BigDecimal getId() {
		return id;
	}
	public void setId(BigDecimal id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	public Long getIdEstado() {
		return idEstado;
	}
	public void setIdEstado(Long idEstado) {
		this.idEstado = idEstado;
	}
	@Override
	public String toString() {
		return "Catalogo [id=" + id + ", nombre=" + nombre + ", valor=" + valor + ", idEstado=" + idEstado + "]";
	}
	
	

}
