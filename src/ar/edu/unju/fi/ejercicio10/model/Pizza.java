package ar.edu.unju.fi.ejercicio10.model;
public class Pizza {
	    private int diametro;
	    private double precio;
	    private double area;
	    private boolean ingredientesEspeciales;
	    private final float adicionalIngredientesEspeciales20 = 500;
	    private final float adicionalIngredientesEspeciales30 = 750;
	    private final float adicionalIngredientesEspeciales40 = 1000;
	   
	    //metodos accesores
	    public int getDiametro() {
	    	return diametro;
	    }
	    public void setDiametro(int diametro) {
	    	this.diametro = diametro;
	    }
	    public double getPrecio() {
	    	return precio;
	    }
	    public void setPrecio(double precio) {
	    	this.precio = precio;
	    }
	    public double getArea() {
	    	return area;
	    }
	    public void setArea(double area) {
	    	this.area = area;
	    }
	    public boolean isIngredientesEspeciales() {
	    	return ingredientesEspeciales;
	    }
	    public void setIngredientesEspeciales(boolean ingredientesEspeciales) {
	    	this.ingredientesEspeciales = ingredientesEspeciales;
	    }
	   
	    public Pizza() {
	    	
	    }
	    
	    public void calcularPrecio() {
	    	if (diametro==20) {
	    		precio= ingredientesEspeciales == true ? 4500 + adicionalIngredientesEspeciales20:4500  ;
	    	}
	    	else {
	    		if (diametro == 30) {
	    			precio = ingredientesEspeciales == true ? 4800 + adicionalIngredientesEspeciales30:4800 ;
	    		}else {
	    			if (diametro==40) {
	    				precio= ingredientesEspeciales == true ? 5500 + adicionalIngredientesEspeciales40:5500;
	    			}
	    		}	
	    	}
	    }
	    
	    public void calcularArea() {
	    	area=Math.PI*Math.pow(diametro/2.0, 2);
	    }

	}
