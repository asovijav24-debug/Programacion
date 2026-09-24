package Trim1.practica1;

import java.util.Scanner;

/*
En este ejercicio vamos a pedirle al usuario su edad y le comentaremos si es mayor o menor de edad
 */
public class Ejercicio1 {

    /*
     En el main lo que tenemos es un scanner que usaremos para pedirle al usuario un numero que sera su edad y en caso
     de ser mayor o igual a 18 le diremos que es mayor de edad en caso contrario le diremos que es menor de edad
     */
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce tu edad: ");
        int edad = scanner.nextInt();

        if (edad >= 18){
            System.out.println("Felicidades, eres mayor de edad");
        }else{
            System.out.println("Eres menor de edad");
        }
    }
}
