package Trim1.practica1;

import java.util.Scanner;

/*
Hay que hacer un "banco" que tu le das una cantidad de dinero y te lo divide en la cantidad de billetes que te lo da
siempre priorizando los mas grande para dar la menor cantidad
 */
public class Ejercicio4 {

    /*
    basicmanete le pides el numero de billetes suponiendo que te lo entregan bien el numero, luego eso si es mas de
    50 lo divide en 50 y eso se guarda en cincuenta, luego el numero que te ha dado guardas en el el resto y asi con
    todos y luego muestras por pantalla
     */
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
