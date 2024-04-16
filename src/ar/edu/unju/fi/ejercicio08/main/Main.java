package ar.edu.unju.fi.ejercicio08.main;

import java.util.Scanner;
import ar.edu.unju.fi.ejercicio08.model.CalculadoraEspecial;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el valor de n
        System.out.println("Ingrese el valor de n:");
        int n = Integer.parseInt(scanner.nextLine());

        // Crear un objeto de la clase CalculadoraEspecial
        CalculadoraEspecial calculadora = new CalculadoraEspecial();
        calculadora.setN(n);

        // Calcular y mostrar la sumatoria
        System.out.println("La sumatoria es: " + calculadora.calcularSumatoria());

        // Calcular y mostrar la productoria
        System.out.println("La productoria es: " + calculadora.calcularProductoria());

        scanner.close();
    }
}