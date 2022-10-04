package ec.gob.cj.pesnot.paginaprincipal.catalogoservicios.modelo;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name="Parametro")
public class Parametro {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="IDPARAMETROCATALOGO")
	private BigDecimal idParametro;
	

	@Column(name="IDCATALOGO")
	private BigDecimal idCatalogo;
	@Column(name="NUMEROVERSIONPARAMETROCATALOGO")
	private BigDecimal numero;
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
	
	
	
	public Parametro() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Parametro(BigDecimal idParametro, BigDecimal idCatalogo, BigDecimal numero, String descripcion, Date fecha,
			Date fechaInicio, Date fechaFin, boolean estadoActivo, boolean estadoParametroCatalogo) {
		super();
		this.idParametro = idParametro;
		this.idCatalogo = idCatalogo;
		this.numero = numero;
		this.descripcion = descripcion;
		this.fecha = fecha;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.estadoActivo = estadoActivo;
		this.estadoParametroCatalogo = estadoParametroCatalogo;
	}



	public BigDecimal getIdParametro() {
		return idParametro;
	}



	public void setIdParametro(BigDecimal idParametro) {
		this.idParametro = idParametro;
	}



	public BigDecimal getIdCatalogo() {
		return idCatalogo;
	}



	public void setIdCatalogo(BigDecimal idCatalogo) {
		this.idCatalogo = idCatalogo;
	}



	public BigDecimal getNumero() {
		return numero;
	}



	public void setNumero(BigDecimal numero) {
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



	@Override
	public String toString() {
		return "Parametro [idParametro=" + idParametro + ", idCatalogo=" + idCatalogo + ", numero=" + numero
				+ ", descripcion=" + descripcion + ", fecha=" + fecha + ", fechaInicio=" + fechaInicio + ", fechaFin="
				+ fechaFin + ", estadoActivo=" + estadoActivo + ", estadoParametroCatalogo=" + estadoParametroCatalogo
				+ "]";
	}
	
	

	
	

}
