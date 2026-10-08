package Trim1.Tarea8;

import java.util.Scanner;

public class Ejercicio1 {

    public static int calcularModa(int tabla[]) {
        int moda = tabla[0];
        int maxFrecuencia = 0;

        for (int i = 0; i < tabla.length; i++) {
            int frecuencia = 0;

            for (int j = 0; j < tabla.length; j++) {
                if (tabla[i] == tabla[j]) {
                    frecuencia++;
                }

            }

            if (frecuencia > maxFrecuencia) {
                maxFrecuencia = frecuencia;
                moda = tabla[i];
            }

        }
        return moda;
    }
    public static void main(String[] args) {
        int tabla[] = {1, 1, 2, 1, 4, 1, 2, 1};


        System.out.println("La mayor frecuencia la tiene el numero: " + calcularModa(tabla));
    }
}
