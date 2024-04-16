package ar.edu.unju.fi.ejercicio03;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int numero;
		
		System.out.println("Ingrese un numero");
		numero = scanner.nextInt();
		if (numero%2 ==0) {
			numero = numero*3;
		}else {
			numero = numero*2;		
		}
				
		System.out.println(numero);
			
   
	}

}
