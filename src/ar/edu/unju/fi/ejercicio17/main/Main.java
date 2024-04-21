package ar.edu.unju.fi.ejercicio17.main;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio12.model.Persona;
import ar.edu.unju.fi.ejercicio17.model.Jugador;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);	
		List<Jugador> jugadores= new ArrayList<>();
		int num;
		do {
			System.out.println("\n"+"1-Alta de jugador");
			System.out.println("2-Mostrar los datos del jugador");
			System.out.println("3-Mostrar todos los jugadores ordenados por apellido");
			System.out.println("4-Modificar los datos de un jugador");
			System.out.println("5-Eliminar un jugador");
			System.out.println("6-Mostrar la cantidad total de jugadores que tiene el ArrayList");
			System.out.println("7-Mostrar la cantidad de jugadores que pertenecen a una nacionalidad");
			System.out.println("8-Salir");
			
			System.out.println("\n"+"Ingrese una opcion: ");
			num=sc.nextInt();
			sc.nextLine();
			try {
			    switch(num) {
			
			        case 1:   System.out.println("\n"+"Ingrese el nombre del jugador:");
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
			        Jugador jugador = new Jugador(nombre, apellido, fechaNacimiento, nacionalidad, estatura, peso, posicion);
			        jugadores.add(jugador);
				        break;
			        case 2: System.out.println("Ingrese nombre: ");
			                 nombre=sc.nextLine();
			                System.out.println("Ingrese apellido: ");
			                apellido=sc.nextLine();
			               for(Jugador l:jugadores) {
			            	   if(l.getNombre().equals(nombre)&& l.getApellido().equals(apellido)) {
			            		   System.out.println(l);
			            	   }	 
			               }
				        break;
			        case 3: Collections.sort(jugadores,Comparator.comparing(Jugador::getApellido));
			                System.out.println(jugadores);
			        
				
				        break;
			        case 4:
				
				        break;
			        case 5:
				
				        break;
			        case 6:  System.out.println("Cantidad de Jugadores: "+jugadores.size());
				
				        break;
			        case 7:
				
				        break;
		         
			        default:
				        System.out.println("NUMERO FUERA DE LISTA!!!");
			   }
			}catch(InputMismatchException e) {
				System.out.println("Ingrese");
			}
		}while(num!=8);
		
	 } 
	
       

        
        
    

}
