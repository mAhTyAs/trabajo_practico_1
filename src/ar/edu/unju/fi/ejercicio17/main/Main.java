package ar.edu.unju.fi.ejercicio17.main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.Iterator;

import ar.edu.unju.fi.ejercicio17.model.Jugador;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<Jugador> jugadores = new ArrayList<>();
		int num;

		do {
			System.out.println("\n" + "1-Alta de jugador");
			System.out.println("2-Mostrar los datos del jugador");
			System.out.println("3-Mostrar todos los jugadores ordenados por apellido");
			System.out.println("4-Modificar los datos de un jugador");
			System.out.println("5-Eliminar un jugador");
			System.out.println("6-Mostrar la cantidad total de jugadores que tiene el ArrayList");
			System.out.println("7-Mostrar la cantidad de jugadores que pertenecen a una nacionalidad");
			System.out.println("8-Salir");

			System.out.println("\n" + "Ingrese una opcion: ");
			num = sc.nextInt();
			sc.nextLine();
			
				switch (num) {

				case 1:
					System.out.println("\n" + "Ingrese el nombre del jugador:");
					String nombre = sc.nextLine();
					System.out.println("Ingrese el apellido del jugador:");
					String apellido = sc.nextLine();
					System.out.println("Ingrese la fecha de nacimiento del jugador (YYYY-MM-DD):");
					LocalDate fechaNacimiento = LocalDate.parse(sc.nextLine());
					System.out.println("Ingrese la nacionalidad del jugador:");
					String nacionalidad = sc.nextLine();
					System.out.println("Ingrese la estatura del jugador:");
					double estatura = sc.nextDouble();
					System.out.println("Ingrese el peso del jugador:");
					int peso = sc.nextInt();
					System.out.println("Ingrese la posición del jugador (delantero, medio, defensa, arquero):");
					sc.nextLine(); // Limpiar el buffer del scanner
					String posicion = sc.nextLine();
					Jugador jugador = new Jugador(nombre, apellido, fechaNacimiento, nacionalidad, estatura, peso,
							posicion);
					jugadores.add(jugador);
					break;
				case 2:
					System.out.println("Ingrese nombre: ");
					nombre = sc.nextLine();
					System.out.println("Ingrese apellido: ");
					apellido = sc.nextLine();
					for (Jugador l : jugadores) {
						if (l.getNombre().equals(nombre) && l.getApellido().equals(apellido)) {
							System.out.println(l);
						}
					}
					break;
				case 3:
					Collections.sort(jugadores, Comparator.comparing(Jugador::getApellido));
					System.out.println(jugadores);

					break;
				case 4:
					modificarJugador(sc,jugadores);

					break;
				case 5:
					System.out.println("Ingrese Nombre: ");
					nombre = sc.nextLine();
					System.out.println("Ingrese Apellido: ");
					apellido = sc.nextLine();
					Iterator<Jugador> iterator = jugadores.iterator();
					while (iterator.hasNext()) {
						Jugador j = iterator.next();
						if (j.getNombre().equals(nombre) && j.getApellido().equals(apellido)) {
							iterator.remove();
						}

					}

					break;
				case 6:
					System.out.println("Cantidad de Jugadores: " + jugadores.size());

					break;
				case 7: 
					System.out.print("Ingrese Nacionalidad del Jugador: ");
					String nac= sc.nextLine();
					int cant=0;
					for (Jugador l : jugadores) {
						if (l.getNacionalidad().equals(nac)) {
						      cant++;
						}
					}
					System.out.println("Cantidad de Jugadores: "+cant);

					break;

				default:
					if(num>8) {
						System.out.println("NUMERO FUERA DE LISTA!!!");	
					}
					
				}
			
		} while (num != 8);

	}


private static void modificarJugador(Scanner scanner, List<Jugador> jugadores) {
   
    System.out.print("Ingrese el nombre del jugador: ");
    String nombre = scanner.nextLine();
    System.out.print("Ingrese el apellido del jugador: ");
    String apellido = scanner.nextLine();

    for (Jugador jugador : jugadores) {
        if (jugador.getNombre().equalsIgnoreCase(nombre) && jugador.getApellido().equalsIgnoreCase(apellido)) {
            System.out.println("Ingrese los nuevos datos del jugador:");

            System.out.print("Nuevo nombre: ");
            jugador.setNombre(scanner.nextLine());

            System.out.print("Nuevo apellido: ");
            jugador.setApellido(scanner.nextLine());

            System.out.print("Nueva fecha de nacimiento (YYYY-MM-DD): ");
            jugador.setFechaNacimiento(LocalDate.parse(scanner.nextLine()));

            System.out.print("Nueva nacionalidad: ");
            jugador.setNacionalidad(scanner.nextLine());

            System.out.print("Nueva estatura: ");
            jugador.setEstatura(scanner.nextDouble());

            System.out.print("Nuevo peso: ");
            jugador.setPeso(scanner.nextInt());
            scanner.nextLine();
            System.out.print("Nueva posición: ");
            jugador.setPosicion(scanner.nextLine());

            break;
        }
    }

}
}