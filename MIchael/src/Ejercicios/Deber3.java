package Ejercicios;

import java.util.Scanner;

public class Deber3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int n;
		double acum=0;
		System.out.println("BIENVENIDOS A NUESTRO SISTEMA...");
		double [] num= new double[50];
		for(n=0;n<50;n++) {
		System.out.println("INGRESAR SUS NOTAS POR FAVOR");
		num[n]=sc.nextDouble();
		acum=acum+num [n];
		
		}

		acum=acum/50;
		System.out.println("SU PROMEDIO ES...:"+acum);
		if(acum<7){
			System.out.println("USTED ESTA REPROBADO");
		}
		else if(acum>7){
			System.out.println("USTED ESTA APROBADO");
		}
	}

}
