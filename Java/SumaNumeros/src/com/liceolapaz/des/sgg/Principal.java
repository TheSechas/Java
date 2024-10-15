package com.liceolapaz.des.sgg;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        // Pedir al usuario 10 número enteros
        pedirNumero();
        // Leer números y almacenarlos
        int[] numeros = new int[10];
        int contador = 0;
        do {
            numeros[contador] = leerNumero();
            contador++;
        } while(contador < 10);
        // Calcular resultado de la suma
        int resultado = calcularSuma(numeros);
        // Escribir resultado de la suma
        System.out.println("El resultado de la suma es: " + resultado);
    }

    private static int calcularSuma(int[] numeros) {
        int totalSuma = 0;
        for (int i = 0; i < numeros.length; i++) {
            totalSuma += numeros[i];
        }
        return totalSuma;
    }

    private static int leerNumero() {
        Scanner teclado = new Scanner(System.in);
        return teclado.nextInt();
    }

    private static void pedirNumero() {
        System.out.println("Escriba 10 números enteros:");
    }
}
