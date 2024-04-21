package ar.edu.unju.fi.ejercicio17.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Jugador {
	String nombre;
	String apellido;
	LocalDate fechaNacimiento;
	String nacionalidad;
	double estatura;
	int peso;
	String posicion;
	int edad;
	
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
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public double getEstatura() {
		return estatura;
	}
	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public String getPosicion() {
		return posicion;
	}
	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad= edad;
	}
	
	public int calcularEdad() {
		LocalDate fechaHoy = LocalDate.now();
		int edad = fechaHoy.getYear()-fechaNacimiento.getYear();
		this.edad=edad;
		return edad;
	}
	public Jugador() {
		
	}
	
	public Jugador(String nombre,String apellido,LocalDate fechaNancimiento,String nacionalidad,double estatura,int peso,String posicion) {
		this.nombre=nombre;
		this.apellido=apellido;
		this.fechaNacimiento=fechaNancimiento;
		this.nacionalidad=nacionalidad;
		this.estatura=estatura;
		this.posicion=posicion;
		this.peso=peso;
		this.edad=calcularEdad();
	}
	public void mostrarDatos() {
		System.out.println("Nombre: "+nombre);
		System.out.println("Apellido: "+apellido);
		System.out.println("Fecha de Nacimiento: "+fechaNacimiento);
		System.out.println("Nacionalidad: "+nacionalidad);
		System.out.println("Estatura: "+estatura);
		System.out.println("Peso: "+peso+"kg");
		System.out.println("Posicion: "+posicion);
		System.out.println("Edad: "+calcularEdad());
	}
	   public String toString() {
		   DateTimeFormatter formatter= DateTimeFormatter.ofPattern("dd-MM-yyyy");
		   return "\n"+"Jugador\n"
		   		+ "Nombre: "+nombre+ "\n"+
		   		"Apellido: "+apellido+ "\n"+
		   		"Fecha de Nacimiento: "+fechaNacimiento.format(formatter)+ "\n"+
		   		"Nacionalidad: "+nacionalidad+ "\n"+
		   		"Estatura: "+estatura+ "\n"+
		   		"Peso: "+peso+ "\n"+
		   		"Posicion: "+posicion+ "\n"+
		   		"Edad: "+edad;
	   }

}
