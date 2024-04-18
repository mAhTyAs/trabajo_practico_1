package ar.edu.unju.fi.ejercicio14;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Ingrese numero entero en el rango [3,10]:");
		num = sc.nextInt();
		int[] numero = new int[num];
		int suma= 0;
		if(num>=3 && num<=10) {
			for (int i=0;i< numero.length;i++) {
		
			    System.out.println("Ingrese numero: ");
			    numero[i]= sc.nextInt();
			    suma+=numero[i];
		}
		    for (int i=0;i< numero.length;i++) {
			     System.out.println("Pocision "+i+": "+numero[i]);
		}
		         System.out.println("Resultado suma: "+suma);
	    }else {
	    	System.out.println("Numero fuera de rango.");
	}
  }
}
