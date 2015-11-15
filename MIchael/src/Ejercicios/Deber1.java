package Ejercicios;

import java.util.Scanner;

public class Deber1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("BIENVENIDOS A NUESTRO SISTEMA...");
		
		float suma;
		float promedio;
		suma=0;
		
		Scanner leer=new Scanner(System.in);
		
		for(int n=1;n<10;n++)
		{
			 System.out.println("ALUMNO"+n+":");
			 suma+=leer.nextFloat();
		}
		
		promedio=suma/3;
		
		System.out.println("EL PROMEDIO GENERAL DEL GRUPO ES...:"+promedio);
	}

}
