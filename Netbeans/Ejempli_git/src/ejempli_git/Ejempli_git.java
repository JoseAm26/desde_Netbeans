/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejempli_git;
;

import java.util.Random;

/**
 *
 * @author jose2
 */
public class Ejempli_git {

   public static int aleatorio () {
		Random rnd = new Random();
		int n = (int)(rnd.nextDouble() * 100.0);
		return n;		
	} 
	

	public static void rellenar_tabla (int tabla[][]) {
		for (int f=0; f<tabla.length; f++)
			for (int c=0; c<tabla[f].length; c++) {
				tabla[f][c] = aleatorio();				
			}
	}
	

	public static void ver_tabla (int tabla[][]) {
		System.out.print("\n Tabla:\n");	
		for (int f=0; f<tabla.length; f++) {
			for (int c=0; c<tabla[f].length; c++) {
				System.out.print ("\t"+ tabla[f][c]);
			}		
			System.out.println();
		}
	}
	

	public static void media_tabla_fila (int tabla[][]) {
		System.out.print("\n Tabla con la media por fila:\n");		
		for (int f=0; f<tabla.length; f++) {
			double suma = 0;
			for (int c=0; c<tabla[f].length; c++) {
				System.out.print ("\t"+ tabla[f][c]);
				suma += tabla[f][c];
			}		
			double media = suma/tabla[f].length;
			System.out.println("\tMedia: " + media);
		}
	}
	
	
	
	

	public static void ver_tabla_max_columna (int tabla[][]) {
		System.out.print("\n Tabla con los máximos por columna:\n");				
		for (int c=0; c<tabla[0].length; c++) {

			int max = tabla[0][c];

			for (int f=1; f<tabla.length; f++) {
				if (tabla[f][c]> max)
					max = tabla[f][c];
			}		
			System.out.print("\t"+max);
		}
		System.out.println();
	}
	
	
		
	public static void main (String[] args) {
		
		int m[][] = new int[4][5];
		
		rellenar_tabla (m);
		
		ver_tabla(m);
		
		media_tabla_fila(m);
		
		ver_tabla_max_columna(m);
		
		
		
	}
    
}
