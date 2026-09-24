package Trim1.practica1;

import java.util.Scanner;

/*
El programa pregunta al usuario por un n uumero entero en el intervalo [1, 10] y le informa por
pantalla de su equivalencia como n uumero romano.
 */
public class Ejercicio5 {

    /*
    He echo un caso para cada numero del 1 al 10 en el que depende el numero que ponga se le escribira un resultado o otro
     */
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Dime un numero entre 1 y 10 y te dire el equivalente romano:");
        int numero = scanner.nextInt();

        if (numero == 1) {
            System.out.println("El número " + numero + " en romano es: I");
        } else if (numero == 2) {
            System.out.println("El número " + numero + " en romano es: II");
        } else if (numero == 3) {
            System.out.println("El número " + numero + " en romano es: III");
        } else if (numero == 4) {
            System.out.println("El número " + numero + " en romano es: IV");
        } else if (numero == 5) {
            System.out.println("El número " + numero + " en romano es: V");
        } else if (numero == 6) {
            System.out.println("El número " + numero + " en romano es: VI");
        } else if (numero == 7) {
            System.out.println("El número " + numero + " en romano es: VII");
        } else if (numero == 8) {
            System.out.println("El número " + numero + " en romano es: VIII");
        } else if (numero == 9) {
            System.out.println("El número " + numero + " en romano es: IX");
        } else if (numero == 10) {
            System.out.println("El número " + numero + " en romano es: X");
        } else {
            System.out.println("Error: el número debe estar entre 1 y 10.");
        }

    }
}
