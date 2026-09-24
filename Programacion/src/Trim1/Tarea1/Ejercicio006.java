package Trim1.Tarea1;

import java.util.Scanner;

public class Ejercicio006 {

    public static void main(String[] args){

        Scanner scaner = new Scanner(System.in);

        System.out.println("Dime un numero y te mostrare la tabla de multiplicar de dicho numero");
        int numero = scaner.nextInt();
        System.out.println("La tabla de multiplicar del numero " + numero + "es la siguiente:");

        for (int i = 1; i<=10; i++){
            System.out.println(numero + " * " + i + " = " + (numero*i));
        }
    }
}
