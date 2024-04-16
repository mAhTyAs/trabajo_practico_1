package ar.edu.unju.fi.ejercicio04;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int numero;
		System.out.println("Ingrese numero");
		 numero = scanner.nextInt();
		int i=1;
		int prod=1;
		 while (numero>=0 && numero<=10 && i<=numero) {
			prod  = prod*i ;
			i++;
		 }
		 numero=prod;
		 System.out.println(numero);
	}

}
