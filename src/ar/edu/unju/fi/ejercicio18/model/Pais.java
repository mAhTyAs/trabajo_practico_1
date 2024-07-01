package ar.edu.unju.fi.ejercicio18.model;

public class Pais {
	private String codigo;
	private String nombre;
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Pais(String codigo, String nombre) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return "Pais "+"\n"+ 
	            "Codigo: "+ codigo +
				"\n"+" Nombre: " + nombre + "\n";
	}
	
	

}
