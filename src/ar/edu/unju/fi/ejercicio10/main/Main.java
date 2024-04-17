package ar.edu.unju.fi.ejercicio10.main;

import java.util.Scanner;
import ar.edu.unju.fi.ejercicio10.model.Pizza;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        for (int i=1;i<=3;i++) {
        	Pizza datosPizza = new Pizza(); 
        	System.out.println("Ingrese datos de la Pizza "+i);
            System.out.println("Ingrese diametro (20,30 o 40): ");
            datosPizza.setDiametro(Integer.parseInt(scanner.nextLine()));
            System.out.println("Tiene ingredientes especiales (true/false): ");
            datosPizza.setIngredientesEspeciales(Boolean.parseBoolean(scanner.nextLine()));
            datosPizza.calcularArea();
            datosPizza.calcularPrecio();
            System.out.println("**Pizza "+i +"**");
            System.out.println("Diametro="+datosPizza.getDiametro());
            System.out.println("Ingredientes especiales="+datosPizza.isIngredientesEspeciales());
            System.out.println("Precio Pizza="+ datosPizza.getPrecio());
            System.out.println("Area de la pizza="+ datosPizza.getArea());
        
        }
    }
}