package ar.edu.unju.fi.ejercicio16;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] nombres=new String[5];
		List lista= new ArrayList<>();
		for(int i=0;i<nombres.length;i++) {
			System.out.println("Ingrese Nombre");
			nombres[i]=sc.nextLine();
		lista.add(nombres[i]);
		}
	//Mostrar Valores Guardados
		int i=0;
		System.out.println("Valores Guardados");
		while (i<nombres.length) {	
			System.out.println(i+": "+nombres[i]);
			i++;
		}
		//Mostrar tamaño del Array
		int j=nombres.length;
		System.out.println("Tamaño del Array: "+j);
		//Eliminar Elemento del indice
		byte num;
		do {
			System.out.println("Ingrese indice a eliminar: ");
			num = sc.nextByte();
			lista.remove(num);
		}while(num<0 && num>=5);
		//Mostrar Arreglo con elemento eliminado
		System.out.println("Valores Guaradados Luego de la Eliminacion");
		for(  Object m:lista) {
			int indice = lista.indexOf(m);
			System.out.println(indice+": "+m);			
		}					
	 }

  }
  


