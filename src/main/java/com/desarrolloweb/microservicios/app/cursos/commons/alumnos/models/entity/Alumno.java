package com.desarrolloweb.microservicios.app.cursos.commons.alumnos.models.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotEmpty;
import javax.persistence.PrePersist;
import java.util.Date;


@Entity
@Table(name="alumnos")
public class Alumno {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY )
private Long id;

	@NotEmpty
private String nombre;
	
	@NotEmpty
private String apellido;

@Column(name = "create_at")
@Temporal(TemporalType.DATE)
private Date createAt;

@PrePersist
public void PrePersist() {
	this.createAt = new Date();
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

public String getApellido() {
	return apellido;
}

public void setApellido(String apellido) {
	this.apellido = apellido;
}

public Date getCreateAt() {
	return createAt;
}

public void setCreateAt(Date createAt) {
	this.createAt = createAt;
}

@Override
public boolean equals(Object obj) {
if (this == obj) {
	return true;
}
if (!(obj instanceof Alumno)) {
	return false;
	
}
Alumno a = (Alumno) obj;
	return this.id != null && this.id.equals(a.getId());
}


}
