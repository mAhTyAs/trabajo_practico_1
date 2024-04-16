package ar.edu.unju.fi.ejercicio06.model;
import java.time.LocalDate;
public class Persona{
	private String dni;
	private String nombre;
	private LocalDate fechaNacimiento;
	private String provincia;
	
	//Metodos accesores
    public String getDni() {
    	return dni;
    }
    public void setDni(String dni) {
    	this.dni = dni;
    }
    
    public String getNombre() {
    	return nombre;
    }
    public void setNombre(String nombre) {
    	this.nombre = nombre;
    }
    
    public LocalDate getFechaNacimiento() {
    	return fechaNacimiento;
    }
    public void setFechaNacimiento(LocalDate fechaNacimiento) {
    	this.fechaNacimiento = fechaNacimiento;
    }
    
    public String getProvincia() {
    	return provincia;
    }
    public void setProvincia(String provincia) {
    	this.provincia = provincia;
    }
    //Calcular edad
    public int calcularEdad() {
    	LocalDate fechaActual = LocalDate.now();
    	return fechaActual.getYear()-fechaNacimiento.getYear();
    }
    
    //Verificar si es mayor
    public boolean esMayorEdad() {
    	return calcularEdad() >=18;
    }
    
    //Mostrar datos
    public void mostrarDatos() {
    	System.out.println("DNI: "+dni);
    	System.out.println("Nombre: "+nombre);
    	System.out.println("Fecha de Nacimiento: "+fechaNacimiento);
    	System.out.println("Provincia: "+provincia);
    	if (esMayorEdad()) {
    		System.out.println("La persona es mayor de edad");
    	}
    	else {
    		System.out.println("La persona no es mayor de edad");
    	}
    }
    
    //Constructor por defecto
	public Persona() {
	// TODO Auto-generated constructor stub
} 
	//constructor parametrizado 
	public Persona(String dni, String nombre, LocalDate fechaNacimiento, String provincia) {
		
		this.dni = dni;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.provincia = provincia;
	}
	
	//constructor que inicialice dni,nombre,fecha de nacimiento
	public Persona(String dni, String nombre, LocalDate fechaNacimiento) {
		this.dni = dni;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.provincia = "Jujuy";
	}
	

	}


