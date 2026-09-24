package Trim1.practica1;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args){

        Scanner scaner = new Scanner(System.in);
        System.out.println("Cantidad a retirar positiva y multiplo de 10:");
        int retirada = scaner.nextInt();

        int diez = 0;
        int veinte = 0;
        int cincuenta = 0;

        if(retirada >=50){
            cincuenta=retirada/50;
            retirada = retirada%50;
        }
        if(retirada>=20){
            veinte=retirada/20;
            retirada=retirada%20;
        }
        if(retirada>=10){
            diez =retirada/10;
        }
        System.out.println("Billetes    Euros");
        System.out.println(" ====       ====");
        System.out.println("  "+diez +"          10");
        System.out.println("  "+veinte +"          20");
        System.out.println("  "+cincuenta +"          50");
    }
}
