package ar.edu.unju.fi.ejercicio06.main;
import ar.edu.unju.fi.ejercicio06.model.Persona;
import java.util.Scanner;
import java.time.LocalDate;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
		//Persona utilizando constructor por defecto
        System.out.println("Ingrese datos de persona1");
		System.out.println("Ingrese DNI: ");
		String dni = sc.nextLine();
		System.out.println("Ingrese Nombre: ");
		String nombre = sc.nextLine();
		System.out.println("Ingrese Fecha de Nacimiento(YYYY-MM-dd): ");
		LocalDate fechaNacimiento = LocalDate.parse(sc.nextLine());
		System.out.println("Ingrese Provincia: ");
		String provincia = sc.nextLine();
        Persona persona01 = new Persona();
        persona01.setDni(dni);
		persona01.setNombre(nombre);
		persona01.setFechaNacimiento(fechaNacimiento);
		persona01.setProvincia(provincia);
		persona01.mostrarDatos();
		System.out.println();
		//Persona utilizando constructor parametrizado
		System.out.println("Ingrese datos de persona2");
		System.out.println("Ingrese DNI: ");
		 dni = sc.nextLine();
		System.out.println("Ingrese Nombre: ");
		 nombre = sc.nextLine();
		System.out.println("Ingrese Fecha de Nacimiento(YYYY-MM-dd): ");
		 fechaNacimiento = LocalDate.parse(sc.nextLine());
		System.out.println("Ingrese Provincia: ");
		 provincia = sc.nextLine();
		Persona persona02 = new Persona();
		persona02.setDni(dni);
		persona02.setNombre(nombre);
		persona02.setFechaNacimiento(fechaNacimiento);
		persona02.setProvincia(provincia);
	    persona02.mostrarDatos();
	    System.out.println();
		//Persona utilizando contructor dni,nombre y fecha
	    System.out.println("Ingrese datos de persona3");
		System.out.println("Ingrese DNI: ");
		 dni = sc.nextLine();
		System.out.println("Ingrese Nombre: ");
		 nombre = sc.nextLine();
		System.out.println("Ingrese Fecha de Nacimiento(YYYY-MM-dd): ");
		 fechaNacimiento = LocalDate.parse(sc.nextLine());
		System.out.println("Ingrese Provincia: ");
		 provincia = sc.nextLine();
		Persona persona03 = new Persona();
		persona03.setDni(dni);
		persona03.setNombre(nombre);
		persona03.setFechaNacimiento(fechaNacimiento);
		persona03.setProvincia(provincia);
		persona03.mostrarDatos();
		System.out.println();	    
	}

}
