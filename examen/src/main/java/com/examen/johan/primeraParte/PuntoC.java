package com.examen.johan.primeraParte;

import java.util.Scanner;

public class PuntoC {
	public static void main(String[] args) {
		System.out.println("Ejecuntado el punto C");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese cantidad de casos a probar");
        int cantidadCasosEvaluar = scanner.nextInt();
        for (int i = 0; i < cantidadCasosEvaluar; i++) {
        	System.out.println("PRIMER DATO");
            int primerDato = scanner.nextInt();
            System.out.println("SEGUNDO DATO");
            int segundoDato = scanner.nextInt();

            long totalCompra = (long) primerDato * segundoDato;

            System.out.println("EVADE IMPUESTO?: ");
            if (totalCompra >= 10000 && totalCompra < 100000) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
        }

	}
}
