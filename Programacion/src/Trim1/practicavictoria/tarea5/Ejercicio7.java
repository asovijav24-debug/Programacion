package Trim1.practicavictoria.tarea5;

import java.util.Scanner;

public class Ejercicio7 {
    public static boolean esNumeroFeo (int a) {
        if (a <= 0) {
            return false;
        }
        while (a % 2 == 0) {
            a = a / 2;
        }
        while (a % 3 == 0) {
            a = a / 3;
        }
        while (a % 5 == 0) {
            a = a / 5;
        }
        if (a == 1) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String [] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un numero entero");
        int num = entrada.nextInt();

        if(esNumeroFeo(num) == true ) {
            System.out.println(num + " es un número feo");
        } else {
            System.out.println(num + " no es un número feo");
        }
    }
}
