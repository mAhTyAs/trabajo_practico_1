package ar.edu.unju.fi.ejercicio09.model;

public class Producto {
    private String nombre;
    private String codigo;
    private double precio;
    private int descuento;

    // Constructor por defecto
    public Producto() {
    }

    // Getter y setter para el atributo nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter y setter para el atributo codigo
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    // Getter y setter para el atributo precio
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // Getter y setter para el atributo descuento
    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    // Método para calcular el descuento
    public double calcularDescuento() {
        if (descuento > 0 && descuento <= 50) {
            double porcentajeDescuento = descuento / 100.0;
            return precio * (1 - porcentajeDescuento);
        } else {
            return precio;
        }
    }
}