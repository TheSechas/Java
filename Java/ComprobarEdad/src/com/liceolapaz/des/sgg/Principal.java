package com.liceolapaz.des.sgg;

import java.util.Scanner;

public class Principal {
    private static final int ANHO_ACTUAL = 2022;

    public static void main(String[] args) {
        // Pedir año de nacimineto al usuario
        pedirAnho();
        // Leer el año y almacenarlo
        int anho = leerAnho();
        // Escribir mensaje
        escribirMensaje(anho);
    }

    private static void escribirMensaje(int anho) {
        String mensaje = "";
        if (anho > ANHO_ACTUAL) {
            mensaje = "No puedes haber nacido en el futuro";
        } else if (ANHO_ACTUAL - anho < 18) {
            mensaje = "No puedes pasar";
        } else if (ANHO_ACTUAL - anho > 150) {
            mensaje = "Eres demasiado mayor para poder entrar";
        } else {
            mensaje = "Puedes pasar";
        }
        System.out.println(mensaje);
    }

    private static int leerAnho() {
        Scanner teclado = new Scanner(System.in);
        return teclado.nextInt();
    }

    private static void pedirAnho() {
        System.out.print("Escriba su año de nacimiento: ");
    }
}
