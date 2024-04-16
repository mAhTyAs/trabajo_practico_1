package ar.edu.unju.fi.ejercicio05;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Scanner scanner = new Scanner(System.in);
		int num;
		System.out.println("Ingrese numero 1 al 9: ");
		num = scanner.nextInt();
		if (num>=1 && num<=9) {
			for(int i=0;i<=10;i++)
				System.out.println(num+"x"+i+"="+num*i);
		}
		else {
			System.out.println("El numero ingresado es incorrecto");
		}
				
	    }
	}


