package Trim1.Tarea2;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args){
        int cont = 1;
        int max = 0;
        int min = 0;
        Scanner scanner = new Scanner(System.in);

        while (cont <=10){
            System.out.println("Escribe un numero");
            int num = scanner.nextInt();
            if(cont==1){
                max=num;
                min=num;
                }else if (num < min){
                    min = num;
                }else if(num > max)
                 max = num;

            cont++;
        }
        System.out.println("El numero mas grande es: " + max);
        System.out.println("El numero mas pequeño es: " + min);


    }
}
