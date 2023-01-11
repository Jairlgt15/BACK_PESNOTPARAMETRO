package ec.gob.cj.pesnot.sugerencia_externa.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "SUGERENCIAEXTERNA")
@EntityListeners(AuditingEntityListener.class)
public class SugerenciaExterna {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IDSUGERENCIAEXTERNA")
	private Long idSugerenciaExterna;
	
	@Column(name = "ASUNTOSUGERENCIAEXTERNA")
	private String asuntoSugerenciaExterna;
	
	@Column(name = "DETALLESUGERENCIAEXTERNA")
	private String detalleSugerenciaExterna;
	
	@Column(name = "NOMBREUSUARIOEXTERNO")
	private String nombreUsuarioExterno;
	
	@Column(name = "APELLIDOUSUARIOEXTERNO")
	private String apellidoUsuarioExterno;
	
	@Column(name = "CORREOUSUARIOEXTERNO")
	private String correoUsuarioExterno;
	
	@Column(name = "TELEFONOUSUARIOEXTERNO")
	private String telefonoUsuarioExterno;
	
	@Column(name = "FECHASUGERENCIAEXTERNA")
	private Date fechaSugerenciaExterna;
	
	@Column(name = "IDREVISOR")
	private Long idRevisor;
	
	@Column(name = "FECHAREVISION")
	private Date fechaRevision;
	
	@Column(name = "IDASIGNADO")
	private Long idAsignado;
	
	@Column(name = "FECHAATENCION")
	private Date fechaAtencion;
	
	@Column(name = "RESPUESTASUGERENCIAEXTERNA")
	private String respuestaSugerenciaExterna;
	
	@Column(name = "ESTADOACTIVO")
	private boolean estadoActivo;
	
	public SugerenciaExterna (){}

	public SugerenciaExterna(Long idSugerenciaExterna, String asuntoSugerenciaExterna, String detalleSugerenciaExterna,
			String nombreUsuarioExterno, String apellidoUsuarioExterno, String correoUsuarioExterno,
			String telefonoUsuarioExterno, Date fechaSugerenciaExterna, Long idRevisor, Date fechaRevision,
			Long idAsignado, Date fechaAtencion, String respuestaSugerenciaExterna, boolean estadoActivo) {

		this.idSugerenciaExterna = idSugerenciaExterna;
		this.asuntoSugerenciaExterna = asuntoSugerenciaExterna;
		this.detalleSugerenciaExterna = detalleSugerenciaExterna;
		this.nombreUsuarioExterno = nombreUsuarioExterno;
		this.apellidoUsuarioExterno = apellidoUsuarioExterno;
		this.correoUsuarioExterno = correoUsuarioExterno;
		this.telefonoUsuarioExterno = telefonoUsuarioExterno;
		this.fechaSugerenciaExterna = fechaSugerenciaExterna;
		this.idRevisor = idRevisor;
		this.fechaRevision = fechaRevision;
		this.idAsignado = idAsignado;
		this.fechaAtencion = fechaAtencion;
		this.respuestaSugerenciaExterna = respuestaSugerenciaExterna;
		this.estadoActivo = estadoActivo;
	}

	public Long getIdSugerenciaExterna() {
		return idSugerenciaExterna;
	}

	public void setIdSugerenciaExterna(Long idSugerenciaExterna) {
		this.idSugerenciaExterna = idSugerenciaExterna;
	}

	public String getAsuntoSugerenciaExterna() {
		return asuntoSugerenciaExterna;
	}

	public void setAsuntoSugerenciaExterna(String asuntoSugerenciaExterna) {
		this.asuntoSugerenciaExterna = asuntoSugerenciaExterna;
	}

	public String getDetalleSugerenciaExterna() {
		return detalleSugerenciaExterna;
	}

	public void setDetalleSugerenciaExterna(String detalleSugerenciaExterna) {
		this.detalleSugerenciaExterna = detalleSugerenciaExterna;
	}

	public String getNombreUsuarioExterno() {
		return nombreUsuarioExterno;
	}

	public void setNombreUsuarioExterno(String nombreUsuarioExterno) {
		this.nombreUsuarioExterno = nombreUsuarioExterno;
	}

	public String getApellidoUsuarioExterno() {
		return apellidoUsuarioExterno;
	}

	public void setApellidoUsuarioExterno(String apellidoUsuarioExterno) {
		this.apellidoUsuarioExterno = apellidoUsuarioExterno;
	}

	public String getCorreoUsuarioExterno() {
		return correoUsuarioExterno;
	}

	public void setCorreoUsuarioExterno(String correoUsuarioExterno) {
		this.correoUsuarioExterno = correoUsuarioExterno;
	}

	public String getTelefonoUsuarioExterno() {
		return telefonoUsuarioExterno;
	}

	public void setTelefonoUsuarioExterno(String telefonoUsuarioExterno) {
		this.telefonoUsuarioExterno = telefonoUsuarioExterno;
	}

	public Date getFechaSugerenciaExterna() {
		return fechaSugerenciaExterna;
	}

	public void setFechaSugerenciaExterna(Date fechaSugerenciaExterna) {
		this.fechaSugerenciaExterna = fechaSugerenciaExterna;
	}

	public Long getIdRevisor() {
		return idRevisor;
	}

	public void setIdRevisor(Long idrevisor) {
		this.idRevisor = idrevisor;
	}

	public Date getFechaRevision() {
		return fechaRevision;
	}

	public void setFechaRevision(Date fechaRevision) {
		this.fechaRevision = fechaRevision;
	}

	public Long getIdAsignado() {
		return idAsignado;
	}

	public void setIdAsignado(Long idAsignado) {
		this.idAsignado = idAsignado;
	}

	public Date getFechaAtencion() {
		return fechaAtencion;
	}

	public void setFechaAtencion(Date fechaAtencion) {
		this.fechaAtencion = fechaAtencion;
	}

	public String getRespuestaSugerenciaExterna() {
		return respuestaSugerenciaExterna;
	}

	public void setRespuestaSugerenciaExterna(String respuestaSugerenciaExterna) {
		this.respuestaSugerenciaExterna = respuestaSugerenciaExterna;
	}

	public boolean isEstadoActivo() {
		return estadoActivo;
	}

	public void setEstadoActivo(boolean estadoActivo) {
		this.estadoActivo = estadoActivo;
	}

	@Override
	public String toString() {
		return "SugerenciaExterna [idSugerenciaExterna=" + idSugerenciaExterna + ", asuntoSugerenciaExterna="
				+ asuntoSugerenciaExterna + ", detalleSugerenciaExterna=" + detalleSugerenciaExterna
				+ ", nombreUsuarioExterno=" + nombreUsuarioExterno + ", apellidoUsuarioExterno="
				+ apellidoUsuarioExterno + ", correoUsuarioExterno=" + correoUsuarioExterno
				+ ", telefonoUsuarioExterno=" + telefonoUsuarioExterno + ", fechaSugerenciaExterna="
				+ fechaSugerenciaExterna + ", idrevisor=" + idRevisor + ", fechaRevision=" + fechaRevision
				+ ", idAsignado=" + idAsignado + ", fechaAtencion=" + fechaAtencion + ", respuestaSugerenciaExterna="
				+ respuestaSugerenciaExterna + ", estadoActivo=" + estadoActivo + "]";
	}
	
	
}
