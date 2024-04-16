package ar.edu.unju.fi.ejercicio07.main;

import java.util.Scanner;
import ar.edu.unju.fi.ejercicio07.model.Empleado;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese los datos para un nuevo empleado
        System.out.println("Ingrese el nombre del empleado:");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese el legajo del empleado:");
        int legajo = Integer.parseInt(scanner.nextLine());
        System.out.println("Ingrese el salario del empleado:");
        float salario = scanner.nextFloat();

        // Crear un objeto utilizando el constructor parametrizado
        Empleado empleado = new Empleado(nombre, legajo, salario);
        System.out.println("Datos del empleado:");
        empleado.mostrarDatos();
        empleado.darAumento();
        System.out.println("\nDespués de dar un aumento:");
        empleado.mostrarDatos();

        scanner.close();
    }
}