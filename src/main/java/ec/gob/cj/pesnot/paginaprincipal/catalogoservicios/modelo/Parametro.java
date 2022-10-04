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
	@Column(name="IDPARAMETRO")
	private BigDecimal idParametro;
	

	@Column(name="IDCATALOGO")
	private BigDecimal idCatalogo;
	@Column(name="NOMBRE")
	private String nombre;
	@Column(name="NUMERO")
	private BigDecimal numero;
	@Column(name="TEXTO")
	private String texto;
	@Column(name="FECHA")
	private Date fecha;
	@Column(name="FECHAINICIO")
	private Date fechaInicio;
	@Column(name="FECHAFIN")
	private Date fechaFin;
	@Column(name="IDESTADO")
	private Long idEstado;
	@Column(name="OBSERVACION")
	private String observacion;
	
	
	
	public Parametro() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Parametro(BigDecimal idParametro, BigDecimal idCatalogo, String nombre, BigDecimal numero, String texto,
			Date fecha, Date fechaInicio, Date fechaFin, Long idEstado, String observacion) {
		super();
		this.idParametro = idParametro;
		this.idCatalogo = idCatalogo;
		this.nombre = nombre;
		this.numero = numero;
		this.texto = texto;
		this.fecha = fecha;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.idEstado = idEstado;
		this.observacion = observacion;
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
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public BigDecimal getNumero() {
		return numero;
	}
	public void setNumero(BigDecimal numero) {
		this.numero = numero;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
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
	public Long getIdEstado() {
		return idEstado;
	}
	public void setIdEstado(Long idEstado) {
		this.idEstado = idEstado;
	}
	public String getObservacion() {
		return observacion;
	}
	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}


	@Override
	public String toString() {
		return "Parametro [idParametro=" + idParametro + ", idCatalogo=" + idCatalogo + ", nombre=" + nombre
				+ ", numero=" + numero + ", texto=" + texto + ", fecha=" + fecha + ", fechaInicio=" + fechaInicio
				+ ", fechaFin=" + fechaFin + ", idEstado=" + idEstado + ", observacion=" + observacion + "]";
	}
	
	

}
