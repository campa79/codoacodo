// File CIRCUNFERENCIA.java

import java.io.*;

public class circunferencia {

	/* Dados el valor del radio de una circunferencia cuyo centro está
	ubicado en (0;0) y dadas las coordenadas (x;y) de un punto, la
	computadora informa si el punto pertenece a la circunferencia.   
	Alberto Campagna - Ejercicio 15 Guia Práctica Codo a codo */

	public static void main(String args[]) throws IOException {

		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double radio;
		double radionegativo;
		double valorx;
		double valory;

		System.out.println("Ingrese el valor del Radio de la circunferencia:");
		radio = Double.parseDouble(bufEntrada.readLine());
		radionegativo = radio*(-1);
		
		System.out.println("Ingrese el valor de X:");
		valorx = Double.parseDouble(bufEntrada.readLine());
		
		System.out.println("Ingrese el valor de Y:");
		valory = Double.parseDouble(bufEntrada.readLine());
		
		if (valorx <= radio && valory <= radio && valorx >= radionegativo && valory >= radionegativo) {
			System.out.println("Se encuentra dentro del círculo");
		} else {
			System.out.println("Se encuentra fuera del círculo.");
		}
	}
}

