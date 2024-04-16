package ar.edu.unju.fi.ejercicio09.main;

import java.util.Scanner;
import ar.edu.unju.fi.ejercicio09.model.Producto;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear 3 objetos de la clase Producto
        for (int i = 1; i <= 3; i++) {
            System.out.println("Ingrese los datos del producto " + i + ":");
            Producto producto = new Producto();

            System.out.println("Nombre del producto:");
            producto.setNombre(scanner.nextLine());

            System.out.println("Código del producto:");
            producto.setCodigo(scanner.nextLine());

            System.out.println("Precio del producto:");
            producto.setPrecio(Double.parseDouble(scanner.nextLine()));

            System.out.println("Descuento del producto (%):");
            producto.setDescuento(Integer.parseInt(scanner.nextLine()));

            // Mostrar los datos ingresados y el resultado del descuento
            System.out.println("Datos del producto " + i + ":");
            System.out.println("Nombre: " + producto.getNombre());
            System.out.println("Código: " + producto.getCodigo());
            System.out.println("Precio: " + producto.getPrecio());
            System.out.println("Descuento: " + producto.getDescuento() + "%");
            System.out.println("Precio con descuento: " + producto.calcularDescuento());
            System.out.println();
        }

        scanner.close();
    }
}