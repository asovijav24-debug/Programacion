package Trim1.Tarea1;

import java.util.Scanner;

public class Ejercicio005 {

    public static void main (String[] args){

        Scanner scaner = new Scanner(System.in);

        System.out.println("Introduce un numero");
        int numero1= scaner.nextInt();
        System.out.println("Introduce otro numero");
        int numero2= scaner.nextInt();

        System.out.println(numero1 + " + "+ numero2 + " = " + (numero1+numero2));
        System.out.println(numero1 + " - "+ numero2 + " = " + (numero1-numero2));
        System.out.println(numero1 + " * "+ numero2 + " = " + (numero1*numero2));
        System.out.println(numero1 + " / "+ numero2 + " = " + (numero1/numero2));
        System.out.println(numero1 + " % "+ numero2 + " = " + (numero1%numero2));

    }
}
