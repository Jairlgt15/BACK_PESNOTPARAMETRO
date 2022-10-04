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
	@Column(name = "ESTADOCATALAGO")
	private boolean estadoCatalogo;
	@Column(name = "ESTADOACTIVO")
	private boolean estadoactivo;
		
	
	public Catalogo(String nombre, String valor, Long idEstado) {
		super();
		this.nombre = nombre;
		this.estadoCatalogo = true;
		this.estadoactivo= true;
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
	public boolean isEstadoCatalogo() {
		return estadoCatalogo;
	}
	public void setEstadoCatalogo(boolean estadoCatalogo) {
		this.estadoCatalogo = estadoCatalogo;
	}
	public boolean isEstadoactivo() {
		return estadoactivo;
	}
	public void setEstadoactivo(boolean estadoactivo) {
		this.estadoactivo = estadoactivo;
	}
	@Override
	public String toString() {
		return "Catalogo [id=" + id + ", nombre=" + nombre + ", estadoCatalogo=" + estadoCatalogo + ", estadoactivo="
				+ estadoactivo + "]";
	}
	

	
	

}
