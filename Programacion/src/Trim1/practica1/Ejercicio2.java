package Trim1.practica1;

import java.util.Scanner;

/*
En este ejercicio tenemos que hacer un numero aleatorio para que el usuario lo adivine y contar los itentos que
tardo en encontrarlo
 */
public class Ejercicio2 {

    /*
    En el main tenemos un numero max y minimo para definir el numero aleatorio junto al math.random, una variable de
    intentos que sumaremos al final de el bucle cada vez que se falle el numero y con un if comprobaremos si el numero
     que introdujo es el correcto y si es asi cambiaremos el valor encontrado a true para acabar el bucle
     */
    public static void main(String[] args){
        int intentos = 0;
        int max = 20;
        int min = 0;
        int num = (int) (Math.random() * (max- min +1)) + min;
        Scanner scanner = new Scanner(System.in);

        boolean encontrado = false;

        while (encontrado ==false){
            System.out.println("Introduce un numero y busca el numero aleatorio entre 1 y 20: ");
            int result = scanner.nextInt();

            if(result == num){
                encontrado=true;
            }else if(result>num){
                System.out.println("El numero es menor que ese");
            }else{
                System.out.println("El numero es mayor");
            }
            intentos++;
        }
        System.out.println("Felicidades, encontraste el numero aleatorio que era " + num);
        System.out.println("Has tardado " + intentos + " intentos en conseguirlo");

    }
}
