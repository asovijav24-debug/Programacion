package Trim1.Tarea2;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int cont = 0;
        int zero = 0;
        int mayor = 0;
        int menor = 0;

        while (cont<10){
            System.out.println("Introduce un numero");
            int num = scanner.nextInt();

            if (num == 0){
                zero++;
            }else if (num < 0) {
                menor++;
            } else if (num > 0) {
                mayor++;
            }
            cont++;
        }
        System.out.println("Has escrito "+ zero + " ceros, "+ menor + " menores que cero y "+ mayor +" mayores que cero");
    }
}
