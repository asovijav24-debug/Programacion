package Trim1.Tarea5;

import java.util.Scanner;

/*

 */
public class Ejercicio1 {

    /*

     */
    public static String comparar(int a, int b, int c, int d){
        if(a==b && a==c && a==d){
            return("Igual");

        }
        return "no";
    }

    /*

     */
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Dime un numero ");
        int num1 = entrada.nextInt();
        System.out.println("Dime un numero ");
        int num2 = entrada.nextInt();
        System.out.println("Dime un numero ");
        int num3 = entrada.nextInt();
        System.out.println("Dime un numero ");
        int num4 = entrada.nextInt();

        System.out.println(comparar(num1,num2,num3,num4));




    }

}
