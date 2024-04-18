package ar.edu.unju.fi.ejercicio15;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Ingrese numero entero en el rango[5,10]");
		num = sc.nextInt();
		sc.nextLine();
		String[] nombre= new String[num];
		if(num>=5 && num<=10) {
			for(int i=0;i<nombre.length;i++) {
				System.out.println("Ingrese nombre de una persona: ");
			    nombre[i]=sc.nextLine();
		}
		    for(int i=0;i<nombre.length;i++) {
			    System.out.println("Posicion "+i+": "+nombre[i]);
		}
		    System.out.println("Posision Inversa");
		    for(int i=nombre.length-1;i>=0;i--) {
			    System.out.println("Posicion "+i+": "+nombre[i]);
		}
	  } else {
		  System.out.println("Numero fuera de rango.");
	  }
	}
}
