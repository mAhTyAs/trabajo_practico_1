package ar.edu.unju.fi.ejercicio08.model;

public class CalculadoraEspecial {
    private int n;

    // Constructor por defecto
    public CalculadoraEspecial() {
    }

    // Getter y setter para el atributo n
    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    // Método para calcular la sumatoria
    public double calcularSumatoria() {
        double sumatoria = 0;
        for (int k = 1; k <= n; k++) {
            sumatoria += (k * (k + 1.0) / 2.0) / 2.0;
        }
        return sumatoria;
    }

    // Método para calcular la productoria
    public double calcularProductoria() {
        double productoria = 1;
        for (int k = 1; k <= n; k++) {
            productoria *= k * (k + 4);
        }
        return productoria;
    }
}