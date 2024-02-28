package com.examen.johan.primeraParte;

import java.util.Scanner;

public class PuntoA {
	public static void main(String[] args) {
		System.out.println("Ejecuntado el punto A");
		Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese las distancias del primer submarino separados por un espacion");
        String primeraUbicacion = scanner.nextLine(); // Solicitar datos por teclado primera ubicacion
        
        System.out.println("Ingrese las distancias  del segundo submarino separados por un espacion");
        String segundaUbicacion = scanner.nextLine(); // Solicitar datos por teclado primera ubicacion
        
        String primer[] = primeraUbicacion.split(" ");
        String segunda[] = segundaUbicacion.split(" " );// 7 8 9
        
        double distanci = Math.sqrt(Math.pow(Double.parseDouble(segunda[0]) - Double.parseDouble(primer[0]), 2) + Math.pow(Double.parseDouble(segunda[1]) - Double.parseDouble(primer[1]), 2));

        double suma = Double.parseDouble(primer[2]) + Double.parseDouble(segunda[2]);

        if (distanci <= suma) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }
	}
}
