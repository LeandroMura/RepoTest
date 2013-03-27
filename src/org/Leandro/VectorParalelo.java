package org.Leandro;
import java.util.Scanner;

public class VectorParalelo {
	private String [] nombres;
	private int[] edades;
	Scanner teclado;
	
	public void Cargar(){
		int cant;
		teclado = new Scanner(System.in);
		System.out.println("Ingrese cantidad de personas");
		cant=teclado.nextInt();
		nombres = new String[cant];
		edades = new int[cant];
		
		for(int i=0; i< edades.length;i++){
			System.out.println("Ingrese Nombre");
			nombres [i]=teclado.next();
			System.out.println("Ingrese edad");
			edades[i]= teclado.nextInt();
		}
	}
	
	public void imprimirMayores(){
		System.out.println("Personas mayores de edad");
		for(int i=0; i< edades.length; i++){
			if(edades[i] >= 18){
				System.out.println(nombres[i]+" edad: "+ edades[i]);
			}
		}
	}
	

}
