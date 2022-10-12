package ec.gob.cj.pesnot.paginaprincipal.catalogoservicios.modelo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Parametro")
public class Parametro {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="IDPARAMETROCATALOGO")
	private Long idParametro;
	
	@JoinColumn(name = "IDCATALOGO", insertable = false, updatable = false)
	@ManyToOne(targetEntity = Catalogo.class, fetch = FetchType.EAGER)
	private Catalogo catalogo;
	
	@Column(name="NUMEROVERSIONPARAMETROCATALOGO")
	private Long numero;
	@Column(name="DESCRIPCIONPARAMETROCATALOGO")
	private String descripcion;
	@Column(name="FECHAPARAMETROCATALOGO")
	private Date fecha;
	@Column(name="FECHAINICIOPARAMETROCATALOGO")
	private Date fechaInicio;
	@Column(name="FECHAFINPARAMETROCATALOGO")
	private Date fechaFin;
	@Column(name="ESTADOACTIVO")
	private boolean estadoActivo;
	@Column(name="ESTADOPARAMETROCATALOGO")
	private boolean estadoParametroCatalogo;
	@Column(name="NOMBREPARAMETRO")
	private String nombreParametro;
	@Column(name="VALORPARAMETROCATALOGO")
	private Long valorParametro;
	
	
	
	public Parametro() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Parametro(Long idParametro, Catalogo catalogo, Long numero, String descripcion, Date fecha, Date fechaInicio,
			Date fechaFin, boolean estadoActivo, boolean estadoParametroCatalogo, String nombreParametro,
			Long valorParametro) {
		super();
		this.idParametro = idParametro;
		this.catalogo = catalogo;
		this.numero = numero;
		this.descripcion = descripcion;
		this.fecha = fecha;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.estadoActivo = estadoActivo;
		this.estadoParametroCatalogo = estadoParametroCatalogo;
		this.nombreParametro = nombreParametro;
		this.valorParametro = valorParametro;
	}
	public Parametro( Catalogo catalogo, Long numero, String descripcion, Date fecha, Date fechaInicio,
			Date fechaFin, boolean estadoActivo, boolean estadoParametroCatalogo, String nombreParametro,
			Long valorParametro) {
		super();
		this.catalogo = catalogo;
		this.numero = numero;
		this.descripcion = descripcion;
		this.fecha = fecha;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.estadoActivo = estadoActivo;
		this.estadoParametroCatalogo = estadoParametroCatalogo;
		this.nombreParametro = nombreParametro;
		this.valorParametro = valorParametro;
	}



	public Long getIdParametro() {
		return idParametro;
	}



	public void setIdParametro(Long idParametro) {
		this.idParametro = idParametro;
	}



	public Catalogo getCatalogo() {
		return catalogo;
	}



	public void setCatalogo(Catalogo catalogo) {
		this.catalogo = catalogo;
	}



	public Long getNumero() {
		return numero;
	}



	public void setNumero(Long numero) {
		this.numero = numero;
	}



	public String getDescripcion() {
		return descripcion;
	}



	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}



	public Date getFecha() {
		return fecha;
	}



	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}



	public Date getFechaInicio() {
		return fechaInicio;
	}



	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}



	public Date getFechaFin() {
		return fechaFin;
	}



	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}



	public boolean isEstadoActivo() {
		return estadoActivo;
	}



	public void setEstadoActivo(boolean estadoActivo) {
		this.estadoActivo = estadoActivo;
	}



	public boolean isEstadoParametroCatalogo() {
		return estadoParametroCatalogo;
	}



	public void setEstadoParametroCatalogo(boolean estadoParametroCatalogo) {
		this.estadoParametroCatalogo = estadoParametroCatalogo;
	}



	public String getNombreParametro() {
		return nombreParametro;
	}



	public void setNombreParametro(String nombreParametro) {
		this.nombreParametro = nombreParametro;
	}



	public Long getValorParametro() {
		return valorParametro;
	}



	public void setValorParametro(Long valorParametro) {
		this.valorParametro = valorParametro;
	}



	@Override
	public String toString() {
		return "Parametro [idParametro=" + idParametro + ", catalogo=" + catalogo + ", numero=" + numero
				+ ", descripcion=" + descripcion + ", fecha=" + fecha + ", fechaInicio=" + fechaInicio + ", fechaFin="
				+ fechaFin + ", estadoActivo=" + estadoActivo + ", estadoParametroCatalogo=" + estadoParametroCatalogo
				+ ", nombreParametro=" + nombreParametro + ", valorParametro=" + valorParametro + "]";
	}
	
	
	

}