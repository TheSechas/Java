package com.liceolapaz.des.sgg;

import java.util.Random;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        // Pedir número a buscar
        pedirNumeroBucar();
        // Leer número y almacenarlo
        int numeroUsuario = leerNumero();
        // Pedir número máximo de intentos
        pedirMaximoIntentos();
        // Leer máximo de intentos y almacenarlo
        int maximoIntentos = leerNumero();
        // Crear variable para almacenar intentos actuales
        int intentosActuales = 0;
        // Mientras nos queden intentos
        while(intentosActuales < maximoIntentos) {
            // Generar número y almacenarlo
            int numeroGenerado = generarNumero(1, 10);
            // Aumentar numero de intentos actuales
            intentosActuales++;
            // Mostrar el número generado
            System.out.println("El número generado fue: " + numeroGenerado);
            // Comprobar si es el número buscado
            comprobarNumero(numeroUsuario, numeroGenerado, intentosActuales, maximoIntentos);
            // Si encontramos el número, salir del bucle
            if (numeroGenerado == numeroUsuario)
                break;
        }
    }

    private static void comprobarNumero(int numeroUsuario, int numeroGenerado, int intentosActuales, int maximoIntentos) {
        if (numeroUsuario == numeroGenerado) {
            System.out.println("El número ha sido encontrado en " + intentosActuales + " intento(s)");
        } else if (intentosActuales >= maximoIntentos) {
            System.out.println("El número no ha sido encontrado en " + maximoIntentos + " intento(s)");

        }
    }
    private static int generarNumero(int min, int max) {
        Random generadorAleatorio = new Random();
        int numeroAleatorio = generadorAleatorio.nextInt((max - min) + 1) + min;
        return numeroAleatorio;
    }

    private static void pedirMaximoIntentos() {
        System.out.print("Escriba el número máximo de intentos: ");
    }

    private static int leerNumero() {
        Scanner teclado = new Scanner(System.in);
        return teclado.nextInt();
    }

    private static void pedirNumeroBucar() {
        System.out.print("Escriba un número entero entre 1 y 10: ");
    }
}
