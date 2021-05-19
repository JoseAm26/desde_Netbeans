/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo;

import Ejercicio1.teclado;

/**
 *
 * @author jose2
 */
public class Clase {
    public static void introduce_actividad_horas (String [] semana, String [] actividades, int [] horas) {
		
		for (int i=0; i<semana.length; i++) {
			actividades[i] = teclado.leer_cadena ("Introduce la actividad del " + semana[i] + ": ");
			horas[i] = teclado.leer_entero ("Introduce el número de horas de la actividad: " +actividades[i] + " del " + semana[i] + ": ");
		}
	 
	}	

	public static void ver_actividad_horas_precio (String [] semana, String [] actividades, int [] horas) {
		System.out.println ("\nPrecio de las actividades semanales: ");
		
		for (int i=0; i<semana.length; i++) {
			System.out.println (semana [i] + ": " + actividades[i] + " horas: " + horas[i] + ", precio total " + (horas[i]*15.50));					
		}	
		
	}	

	public static void buscar_actividad (String [] semana, String [] actividades, int [] horas) {
		String actividad = teclado.leer_cadena ("\nIntroduce la actividad a buscar: ");
		boolean encontrado = false;	
		int total_horas = 0;
		
		for (int i=0; i<semana.length; i++) {
			if (actividad.equals (actividades[i])) {
				encontrado = true;
				System.out.println ("Encontrada actividad en el día " + semana [i]);
				total_horas += horas[i];
			}											
		}	
		
		if (!encontrado)
			System.out.println ("Actividad no encontrada!!");
		else
			System.out.println ("Total de horas semanales: " + total_horas);		
	} 
	
	
	
	
		
	public static void main (String args[]) {		

		String semana [] = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};		
		

		String actividades[] = new String [7];
		int horas [] = new int[7];
		

		introduce_actividad_horas (semana, actividades, horas);
		

		ver_actividad_horas_precio (semana, actividades, horas);		
		

		buscar_actividad (semana, actividades, horas);
		
	}
}
