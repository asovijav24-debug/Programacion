package Trim1.practica1;

import java.util.Scanner;

/*
Se debe desarollar un programa que muestre la fecha escribiendole la fecha en formato aaaammdd y mostrarlo como una fecha
 */
public class Ejercicio3 {

    /*
    En este ejercicio use el escaner para meter el formato de numero pedido como un string luego en 3 variables diferentes
    pille los numeros de cada uno de ellos y los añadi a los strings y luego hice otro llamado fechaformat con el ormato
    realizado correctamente
     */
    public static void main(String[] args){

        Scanner scaner = new Scanner(System.in);

        System.out.println("Introduce una fecha en formato 8 cifras (aaaammdd): ");
        String fecha = scaner.nextLine();

        String año= fecha.substring(0,4);
        String mes = fecha.substring(4, 6);
        String dia = fecha.substring(6, 8);

        String fechaformat = dia+ "/" + mes + "/" + año;

        System.out.println("La fecha que escribiste es: " + fechaformat);
    }
}
