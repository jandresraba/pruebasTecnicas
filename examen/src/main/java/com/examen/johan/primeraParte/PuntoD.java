package com.examen.johan.primeraParte;

import java.util.Objects;
import java.util.Scanner;

public class PuntoD {
	public static void main(String[] args) {
		System.out.println("Ejecuntado el punto C");
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("INGRESE UN NUMERO ENTERO");
        int numero = scanner.nextInt();
        long cuadrado = (long) numero * numero;
        String cadenaNumero = String.valueOf(numero);
        String cadenaPotencia = String.valueOf(cuadrado);
        String validar = cadenaPotencia.substring(cadenaPotencia.length() - cadenaNumero.length());
        if(Objects.equals(cadenaNumero, validar)) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }
	}
}
