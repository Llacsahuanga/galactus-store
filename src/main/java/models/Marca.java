package models;

import java.sql.Date;

public class Marca {
	
	private Integer idMarca;
    private String nombre;
    private String descripcion;
    private String imagenUrl;
    private String fabricanteUrl;
    private String estadoAuditoria;
    private Date fechaCreacion;
    
    
	public Integer getIdMarca() {
		return idMarca;
	}
	public void setIdMarca(Integer idMarca) {
		this.idMarca = idMarca;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getImagenUrl() {
		return imagenUrl;
	}
	public void setImagenUrl(String imagenUrl) {
		this.imagenUrl = imagenUrl;
	}
	public String getFabricanteUrl() {
		return fabricanteUrl;
	}
	public void setFabricanteUrl(String fabricanteUrl) {
		this.fabricanteUrl = fabricanteUrl;
	}
	public String getEstadoAuditoria() {
		return estadoAuditoria;
	}
	public void setEstadoAuditoria(String estadoAuditoria) {
		this.estadoAuditoria = estadoAuditoria;
	}
	public Date getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
    
    
    

}
