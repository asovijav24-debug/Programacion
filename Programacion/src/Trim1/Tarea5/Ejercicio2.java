package Trim1.Tarea5;

import java.util.Scanner;

/*

 */
public class Ejercicio2 {

    /*a

     */
    public static boolean comparar(double a, double b){
        if (a>=0.0 && a<=1.0 && b>=0.0 && b<=1.0)
            return true;
        return false;
    }

    /*

     */
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Dame dos numeros y te dire si estan entre 0 y 1");
        System.out.println("Dame un numero");
        double num1 = scanner.nextDouble();
        System.out.println("Dame otro numero");
        double num2 = scanner.nextDouble();

        System.out.println(comparar(num1, num2));
    }
}
