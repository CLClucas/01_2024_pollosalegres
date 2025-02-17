package com.sinensia.pollosalegres.backend.integration.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name="ESTABLECIMIENTOS")
public class EstablecimientoPL implements Serializable {
	
	@Id
	private Long codigo;
	
	private String nombreComercial;
	
	@Embedded
	private DireccionPL direccion;
	
	@Embedded
	private DatosContactoPL datosContacto;
	
	@Temporal(TemporalType.DATE)
	private Date fechaInauguracion;
	
	public EstablecimientoPL() {
		// No args constructor
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getNombreComercial() {
		return nombreComercial;
	}

	public void setNombreComercial(String nombreComercial) {
		this.nombreComercial = nombreComercial;
	}

	public DireccionPL getDireccion() {
		return direccion;
	}

	public void setDireccion(DireccionPL direccion) {
		this.direccion = direccion;
	}

	public DatosContactoPL getDatosContacto() {
		return datosContacto;
	}

	public void setDatosContacto(DatosContactoPL datosContacto) {
		this.datosContacto = datosContacto;
	}

	public Date getFechaInauguracion() {
		return fechaInauguracion;
	}

	public void setFechaInauguracion(Date fechaInauguracion) {
		this.fechaInauguracion = fechaInauguracion;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof EstablecimientoPL)) {
			return false;
		}
		EstablecimientoPL other = (EstablecimientoPL) obj;
		return Objects.equals(codigo, other.codigo);
	}

}
