package ar.edu.unju.fi.ejercicio18.model;

public class DestinoTuristico {
	private String codigo;
	private String nombre;
	private double precio;
	private Pais pais;
	private int cantDias;
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
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	public int getCantDias() {
		return cantDias;
	}
	public void setCantDias(int cantDias) {
		this.cantDias = cantDias;
	}
	public DestinoTuristico(String codigo, String nombre, double precio, Pais pais, int cantDias) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
		this.pais = pais;
		this.cantDias = cantDias;
	}
	@Override
	public String toString() {
		return "Destino Turistico "+"\n"+
	           "Codigo: " + codigo + "\n"+
			   "Nombre: " + nombre + "\n"+
	           "Precio: " + precio + "\n"+
			   "Pais: " + pais + "\n"+
	           "Cantidad de Dias: " + cantDias + "\n";
	}
	
	

}
