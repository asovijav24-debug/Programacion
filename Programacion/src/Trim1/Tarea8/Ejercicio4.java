package Trim1.Tarea8;

import java.util.Arrays;

public class Ejercicio4 {

    public static String[] copiarTabla(String[] a){
        String tablacool[] = new String[a.length];

        for (int i = 0; i < a.length; i++) {
            tablacool[a.length-1-i] = a[i];
        }

        return tablacool;
    }
    public static void main(String[] args) {
        String tabla[] = {"uno", "dos", "tres", "cuatro", "Cinco"};
        String[] tablainverida = copiarTabla(tabla);
        System.out.println("Tabla Nueva:");
        for (int i = 0; i < tabla.length; i++) {

            System.out.println(tablainverida[i]);

        }
        System.out.println("Tabla Original:");
        for (int i = 0; i < tabla.length; i++) {

            System.out.println(tabla[i]);
        }
    }
}
