package Trim1.practicavictoria;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int option = -1;

        while(option != 0) {
            System.out.println("MENU DE OPERACIONES");
            System.out.println("====================");
            System.out.println("0 - Finalizar");
            System.out.println("1 - Sumar dos enteros");
            System.out.println("2 - Restar dos enteros");
            System.out.println("3 - Multiplicar dos enteros");
            System.out.println("4 - Dividir dos enteros");
            System.out.println("5 - Calcular el resto de dos enteros");
            System.out.println("6 - Calcular el número de cifras de un entero");
            System.out.println("7 - Sumar las cifras de dos enteros");
            System.out.println("8 - Comprobar si un entero es primo");
            System.out.println("9 - Calcular el factorial de un número");
            System.out.println("10 - Calcular el máximo común divisor de dos números");
            System.out.println("                 ");
            System.out.println("Seleccione una operación [0-10]:");

            option = entrada.nextInt();

            switch(option) {
                case 0:
                    break;
                case 1:
                    System.out.println("Introduce el primer sumando");
                    int sumando1 = entrada.nextInt();
                    System.out.println("Introduce el segundo sumando");
                    int sumando2 = entrada.nextInt();
                    System.out.println("El resultado de la operación es " + Operaciones.sumar(sumando1, sumando2));
                    break;
                case 2:
                    System.out.println("Introduce el primer entero");
                    int restando1 = entrada.nextInt();
                    System.out.println("Introduce el segundo entero");
                    int restando2 = entrada.nextInt();
                    System.out.println("El resultado de la operación es " + Operaciones.restar(restando1, restando2));
                    break;
                case 3:
                    System.out.println("Introduce el primer entero");
                    int multiplicar1 = entrada.nextInt();
                    System.out.println("Introduce el segundo entero");
                    int multiplicar2 = entrada.nextInt();
                    System.out.println("El resultado de la operación es " + Operaciones.multiplicar(multiplicar1, multiplicar2));
                    break;
                case 4:
                    System.out.println("Introduce el primer entero");
                    int dividir1 = entrada.nextInt();
                    System.out.println("Introduce el segundo entero");
                    int dividir2 = entrada.nextInt();
                    System.out.println("El resultado de la operación es " + Operaciones.dividir(dividir1, dividir2));
                    break;
                case 5:
                    System.out.println("Introduce el primer entero");
                    int resto1 = entrada.nextInt();
                    System.out.println("Introduce el segundo entero");
                    int resto2 = entrada.nextInt();
                    System.out.println("El resultado de la operación es " + Operaciones.resto(resto1, resto2));
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    break;
            }
            }
    }
}
