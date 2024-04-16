package ar.edu.unju.fi.ejercicio07.model;

public class Empleado {


		  private String nombre;
		    private int legajo;
		    private float salario;

		    // Constantes
		    private static final float salarioMinimo = 210000;
		    private static final double AumentoMeritos = 20000.00;

		    // Constructor parametrizado
		    public Empleado(String nombre, int legajo, float salario) {
		        this.nombre = nombre;
		        this.legajo = legajo;
		        // Lógica para asignar el salario
		        if (salario >= salarioMinimo) {
		            this.salario = salario;
		        } else {
		            this.salario = salarioMinimo;
		            }
		        }

		        // Método para mostrar los datos del empleado
		        public void mostrarDatos() {
		            System.out.println("Nombre del empleado: " + nombre);
		            System.out.println("Legajo: " + legajo);
		            System.out.println("Salario $: " + salario);
		        }

		        // Método para dar un aumento al salario del empleado
		        public void darAumento() {
		            salario += AumentoMeritos;
		        }
		    
	}


