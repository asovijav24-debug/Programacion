package Trim1.Tarea5;

import java.util.Scanner;

/*

 */
public class Ejercicio4 {

    /*

     */
    public static int contarletras(String a){
        int result = a.length();
        return result;
    }

    /*

     */
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime una palabra");

        String palabra = scanner.nextLine();

        System.out.println("Tu palabra tiene: " + contarletras(palabra) + " letras");
    }
}
