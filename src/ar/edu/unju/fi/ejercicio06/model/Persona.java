package ar.edu.unju.fi.ejercicio06.model;
import java.time.LocalDate;
public class Persona{
	private float dni;
	private String nombre;
	private LocalDate fechaNacimiento;
	private String provincia;


public Persona() {
	super();
}
    
 
	public Persona(float dni, String nombre, LocalDate fechaNacimiento, String provincia) {
		super ();
		this.dni = dni;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.provincia = provincia;
	}
	public Persona(String provincia) {
		super();
		this.provincia = "Jujuy";
	}
	

	}


