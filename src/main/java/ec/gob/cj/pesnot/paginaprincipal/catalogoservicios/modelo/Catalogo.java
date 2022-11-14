package ec.gob.cj.pesnot.paginaprincipal.catalogoservicios.modelo;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CATALOGO")

public class Catalogo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDCATALOGO")
	private Long id;
	@Column(name = "NOMBRE")
	private String nombre;
	@Column(name = "ESTADOCATALAGO")
	private boolean estadoCatalogo;
	@Column(name = "ESTADOACTIVO")
	private boolean estadoActivo;
	
	
	public Catalogo() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Catalogo( String nombre, boolean estadoCatalogo, boolean estadoActivo) {
		super();
		this.nombre = nombre;
		this.estadoCatalogo = estadoCatalogo;
		this.estadoActivo = estadoActivo;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
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
	public boolean isEstadoActivo() {
		return estadoActivo;
	}
	public void setEstadoActivo(boolean estadoActivo) {
		this.estadoActivo = estadoActivo;
	}
	@Override
	public String toString() {
		return "Catalogo [id=" + id + ", nombre=" + nombre + ", estadoCatalogo=" + estadoCatalogo + ", estadoActivo="
				+ estadoActivo + "]";
	}
	
	
	
}
