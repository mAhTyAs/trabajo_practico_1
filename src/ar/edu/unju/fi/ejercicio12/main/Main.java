package ar.edu.unju.fi.ejercicio12.main;
import java.util.Calendar;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio12.model.Persona;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese nombre: ");
		String nombre= sc.nextLine();
		System.out.println("Ingrese fecha de nacimiento(dd/mm/yyyy)");
		String fechaNac= sc.nextLine();
		String[] partesFecha = fechaNac.split("/");
	        int dia = Integer.parseInt(partesFecha[0]);
	        int mes = Integer.parseInt(partesFecha[1]) - 1;
	        int año = Integer.parseInt(partesFecha[2]);
		Calendar fechaNacimiento = Calendar.getInstance();
		fechaNacimiento.set(año, mes, dia);
		Persona datos = new Persona(nombre,fechaNacimiento);
		System.out.println("Nombre: "+nombre);
		System.out.println("Fecha nacimiento: "+fechaNac);
		System.out.println("Edad: "+datos.calcularAños()+" años");
		System.out.println("Signo del zodiaco: "+ datos.calcularZodiaco());
		System.out.println("Estacion: "+datos.calcularEstacion());

	}

}
