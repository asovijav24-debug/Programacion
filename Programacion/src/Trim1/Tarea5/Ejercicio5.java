package Trim1.Tarea5;

import java.util.Scanner;

/*
* En este ejercicio hare un programa que detecte en una frase que escribio el usuario cuantas veces escribio "aa"
 */
public class Ejercicio5 {

    /*
    * Aqui comparamos con substring y equals para saber cuatas veces escribio "aa"
     */
    public static int contaraa(String a){
        int cont = 0;
        String compare = "aa";
        for (int i = 0; i < a.length()-1; i++){
            if (a.substring(i, i+2).equals(compare))
                cont++;
        }
        return cont;
    }

    /*
    * Este es el main que le pide al usuario la frase y invoca el metodo y se la envia
     */
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una palabra aleatoria en plan abbbaaabbbaabbaababa");
        String palabra = scanner.nextLine();
        System.out.println("Has escrito " + contaraa(palabra) + " veces aa");
    }
}
