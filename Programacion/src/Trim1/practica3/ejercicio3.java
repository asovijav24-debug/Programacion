package Trim1.practica3;

import java.util.Scanner;

public class ejercicio3 {

    public static int buscar(String[] a, String b){
        int result = -1;
        for (int i = 0; i < a.length; i++){
            if (a[i].equals(b)) {
             result = i;
            }
        }
        return result;
    }


    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        String[] frutas = {"Manzana", "Pera", "Sandia", "Melon", "Aguacate"};
        System.out.println("Escribe una fruta");
        String a = scanner.nextLine();
        System.out.println(buscar(frutas, a));
    }
}