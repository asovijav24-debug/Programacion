package Trim1.Tarea2;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un numero");
        int numero1= scanner.nextInt();
        System.out.println("Introduce otro numero");
        int numero2= scanner.nextInt();

        if (numero1<numero2){
            while (numero1<=numero2){
                System.out.println(numero1);
                numero1++;
            }
        }else{
            while (numero2<=numero1) {
                System.out.println(numero2);
                numero2++;
            }
        }
    }
}
