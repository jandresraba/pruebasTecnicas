package com.examen.johan.primeraParte;

import java.util.Scanner;

public class PuntoB {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);		
		System.out.println("Ejecuntado el punto B");
        System.out.println("Digite el tamaño de la matriz ");
        String longitud= scanner.next();
        long tamañoMatriz = validarNumero(longitud);// validamos en caso que el numero venga con punto decimal o coma


        long[][] matriz = new long[(int) tamañoMatriz][(int) tamañoMatriz];
        long sumaDiagonal = 0;
        for (long i = 0; i < tamañoMatriz; i++) {
            for (long j = 0; j < tamañoMatriz; j++) {
                if (j < tamañoMatriz - 1 - i) {
                    matriz[(int) i][(int) j] = 1;
                } else if (j > tamañoMatriz - 1 - i) {
                    matriz[(int) i][(int) j] = 0; 
                } else {
                    long valor = tamañoMatriz - i;
                    matriz[(int) i][(int) j] = valor;
                    sumaDiagonal += valor; 
                }
            }
        }
        for (long i = 0; i < tamañoMatriz; i++) {
            for (long j = 0; j < tamañoMatriz; j++) {
                System.out.print(matriz[(int)i][(int)j] + " ");
            }
            System.out.println();
        }
        System.out.println(sumaDiagonal);
	}
	
	public static long validarNumero(String valor) {
	    long tamañoMatriz = 0;
	    if (valor.contains(".") || valor.contains(",")) {    	
	        String[] nuevoNumero = valor.contains(".") ? valor.split("\\.") :valor.split("\\,");
	        tamañoMatriz = Long.parseLong(nuevoNumero[0]);
	    } else {
	        tamañoMatriz = Long.parseLong(valor);
	    }
	    return tamañoMatriz;
	}
	
}
