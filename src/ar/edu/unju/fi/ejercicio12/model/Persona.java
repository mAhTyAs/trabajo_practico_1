package ar.edu.unju.fi.ejercicio12.model;

import java.util.Calendar;

public class Persona {
	String nombre;
	Calendar fechaNacimiento;
	public Persona(String nombre, Calendar fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
		this.nombre = nombre;
	}
    public int calcularAños() {
    	Calendar hoy = Calendar.getInstance();
		int añoActual= hoy.get(Calendar.YEAR);
		int añoNacimiento = fechaNacimiento.get(Calendar.YEAR);
    	int edad = añoActual-añoNacimiento;
    	int mesActual=hoy.get(Calendar.MONTH);
    	int mesNacimiento = fechaNacimiento.get(Calendar.MONTH);
    	int diaActual=hoy.get(Calendar.DAY_OF_MONTH);
    	int diaNacimiento=fechaNacimiento.get(Calendar.DAY_OF_MONTH);
         if (mesActual < mesNacimiento || (mesActual == mesNacimiento && diaActual < diaNacimiento)) {
             edad--; 
         }
		return edad;	
	}

    public String calcularZodiaco() {
    	int dia= fechaNacimiento.get(Calendar.DAY_OF_MONTH);
    	int mes = fechaNacimiento.get(Calendar.MONTH)+1;
    	if(dia<=21 && mes==3 || dia<=19 && mes==4) {
    		return "Aries";
    	}else if ((mes == 4 && dia >= 20) || (mes == 5 && dia <= 20)) {
            return "Tauro";
        } else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20)) {
            return "Géminis";
        } else if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 22)) {
            return "Cáncer";
        } else if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 22)) {
            return "Leo";
        } else if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)) {
            return "Virgo";
        } else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) {
            return "Libra";
        } else if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)) {
            return "Escorpio";
        } else if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)) {
            return "Sagitario";
        } else if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 19)) {
            return "Capricornio";
        } else if ((mes == 1 && dia >= 20) || (mes == 2 && dia <= 18)) {
            return "Acuario";
        } else {
            return "Piscis";
        }
    }  	
    	public String calcularEstacion() {
            int mes = fechaNacimiento.get(Calendar.MONTH) + 1;
            if (mes >= 3 && mes <= 6) {
                return "Otoño";
            } else if (mes >= 6 && mes <= 9) {
                return "Invierno";
            } else if (mes >= 9 && mes <= 11) {
                return "Otoño";
            } else {
                return "Verano";
            }
    	}
       
    public String getNombre() {
    	return nombre;
}
    public void setNombre() {
    	this.nombre=nombre;
}
    public Calendar getFechaNacimiento() {
    	return fechaNacimiento;
}
    public void setFechaNacimiento() {
    	this.fechaNacimiento = fechaNacimiento;
}

}
