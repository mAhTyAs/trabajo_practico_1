package ar.edu.unju.fi.ejercicio18.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio18.model.DestinoTuristico;
import ar.edu.unju.fi.ejercicio18.model.Pais;

public class Main {

	public static void main(String[] args) {
		List<Pais> paises = new ArrayList<>();
		List<DestinoTuristico> destinos = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		paises.add(new Pais("AR", "Argentina"));
		paises.add(new Pais("BR", "Brasil"));
		paises.add(new Pais("CL", "Chile"));
		paises.add(new Pais("UY", "Uruguay"));
		paises.add(new Pais("PE", "Perú"));

		int op;
		do {
			System.out.println("\n--- Menú de opciones ---");
			System.out.println("1 - Alta de destino turístico");
			System.out.println("2 - Mostrar todos los destinos turísticos");
			System.out.println("3 - Modificar el país de un destino turístico");
			System.out.println("4 - Limpiar el ArrayList de destinos turísticos");
			System.out.println("5 - Eliminar un destino turístico");
			System.out.println("6 - Mostrar los destinos turísticos ordenados por nombre");
			System.out.println("7 - Mostrar todos los países");
			System.out.println("8 - Mostrar los destinos turísticos que pertenecen a un país");
			System.out.println("9 - Salir");
			System.out.print("Ingrese una opción: ");
			op = scanner.nextInt();
			scanner.nextLine();

			switch (op) {
			case 1:
				altaDestinoTuristico(scanner, destinos, paises);
				break;
			case 2:
				mostrarDestinosTuristicos(destinos);
				break;
			case 3:
				modificarPaisDestino(scanner, destinos, paises);
				break;
			case 4:
				limpiarDestinos(destinos);
				break;
			case 5:
				eliminarDestino(scanner, destinos, paises);
				break;
			case 6:
				mostrarDestinosOrdenados(destinos);
				break;
			case 7:
				mostrarPaises(paises);
				break;
			case 8:
				mostrarDestinosPorPais(scanner, destinos);
				break;
			default:
				if (op > 9) {
					System.out.println("Opción inválida. Intente nuevamente.");
				}

				break;
			}
		} while (op != 9);
	}

	private static void altaDestinoTuristico(Scanner scanner, List<DestinoTuristico> destinos, List<Pais> paises) {
		System.out.println("\n--- Alta de destino turístico ---");
		System.out.print("Ingrese el código del destino: ");
		String codigo = scanner.nextLine();
		System.out.print("Ingrese el nombre del destino: ");
		String nombre = scanner.nextLine();
		System.out.print("Ingrese el precio del destino: ");
		double precio = scanner.nextDouble();
		System.out.print("Ingrese la cantidad de días del destino: ");
		int cantidadDias = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Paises Disponibles");
		for(Pais p : paises) {
			System.out.print(p);	
		}
		System.out.println("Ingrese el código del país: ");
		String codigoPais = scanner.nextLine();
		boolean encontrado = false;
		for (Pais p : paises) {
			if (p.getCodigo().equalsIgnoreCase(codigoPais)) {
				DestinoTuristico nuevoDestino = new DestinoTuristico(codigo, nombre, precio, p, cantidadDias);
				destinos.add(nuevoDestino);
				encontrado = true;
			}
		}
		if(!encontrado) {
			System.out.println("País no encontrado");
		}
	}

	private static void mostrarDestinosTuristicos(List<DestinoTuristico> destinos) {
		for (DestinoTuristico destino : destinos) {
			System.out.println(destino);
		}
	}

	private static void modificarPaisDestino(Scanner scanner, List<DestinoTuristico> destinos, List<Pais> paises) {
		System.out.print("Ingrese el código del destino turístico: ");
		String codigoDestino = scanner.nextLine();
		System.out.print("Ingrese el nuevo código del país: ");
		String codigoPais = scanner.nextLine();
		boolean encontrado = false;
		for (DestinoTuristico destino : destinos) {
			for (Pais p : paises) {
				if (p.getCodigo().equalsIgnoreCase(codigoPais) && destino.getCodigo().equalsIgnoreCase(codigoDestino)) {
					destino.setPais(p);
				    encontrado = true;
				}
			}
		}
		if(!encontrado) {
			System.out.println("Destino turístico o país no encontrado.");
		}

	}

	private static void limpiarDestinos(List<DestinoTuristico> destinos) {
		destinos.clear();
	}

	private static void eliminarDestino(Scanner scanner, List<DestinoTuristico> destinos, List<Pais> paises) {
		System.out.print("Ingrese el código del destino turístico: ");
		String codigoDestino = scanner.nextLine();

		Iterator<DestinoTuristico> iterator = destinos.iterator();
		boolean encontrado = false;
		while (iterator.hasNext()) {
			DestinoTuristico destino = iterator.next();
			if (destino.getCodigo().equalsIgnoreCase(codigoDestino)) {
				iterator.remove();
				encontrado = true;
				break;
			}
		}
		if (!encontrado) {
			System.out.println("Destino turístico no encontrado.");
		}
	}

	private static void mostrarDestinosOrdenados(List<DestinoTuristico> destinos) {
		List<DestinoTuristico> destinosOrdenados = new ArrayList<>(destinos);
		Collections.sort(destinosOrdenados, (d1, d2) -> d1.getNombre().compareToIgnoreCase(d2.getNombre()));

		for (DestinoTuristico destino : destinosOrdenados) {
			System.out.println(destino);
		}
	}

	private static void mostrarPaises(List<Pais> paises) {
		for (Pais pais : paises) {
			System.out.println(pais);
		}
	}

	private static void mostrarDestinosPorPais(Scanner scanner, List<DestinoTuristico> destinos) {
		System.out.print("Ingrese el código del país: ");
		String codigoPais = scanner.nextLine();

		for (DestinoTuristico destino : destinos) {
			if (destino.getPais().getCodigo().equalsIgnoreCase(codigoPais)) {
				System.out.println(destino);
			}
		}
	}

}
