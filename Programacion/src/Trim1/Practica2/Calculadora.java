package Trim1.Practica2;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int cont = 0;
        int slct = -1;

        while(slct != 0){

            System.out.println("MENU DE OPERACIONES");
            System.out.println("===================");
            System.out.println("0  -  FINALIZAR");
            System.out.println("1  -  SUMAR DOS ENTEROS");
            System.out.println("2  -  RESTAR DOS ENTEROS");
            System.out.println("3  -  MULTIPLICAR DOS ENTEROS");
            System.out.println("4  -  DIVIDIR DOS ENTEROS");
            System.out.println("5  -  CALCULAR EL RESTO DE DOS ENTEROS");
            System.out.println("6  -  CALCULAR EL NUMERO DE CIFRAS DE UN ENTERO");
            System.out.println("7  -  SUMAR LAS CIFRAS DE UN ENTERO");
            System.out.println("8  -  COMPROBAR SI UN ENTERO ES PRIMO");
            System.out.println("9  -  CALCULAR EL FACTORIAL DE UN NUMERO");
            System.out.println("10  -  CALCULAR EL MAXIMO DIVISOR DE DOS NUMEROS");
            System.out.println(" ");
            slct = scanner.nextInt();


            switch (slct){
                case 0:
                    cont++;
                    break;
                case 1:
                    System.out.println("INTRODUCE UN NUMERO PARA SUMAR");
                    int a = scanner.nextInt();
                    System.out.println("INTRODUCE OTRO PARA SUMAR");
                    int b= scanner.nextInt();
                    System.out.println("El resultado de tu opereacion es: " + Operaciones.sumar(a, b));
                    break;
                case 2:
                    System.out.println("INTRODUCE UN NUMERO PARA RESTAR");
                    int c = scanner.nextInt();
                    System.out.println("INTRODUCE OTRO PARA RESTAR");
                    int d= scanner.nextInt();
                    System.out.println("El resultado de tu opereacion es: " + Operaciones.restar(c, d));
                    break;
                case 3:
                    System.out.println("INTRODUCE UN NUMERO PARA MULTIPLICAR");
                    int e = scanner.nextInt();
                    System.out.println("INTRODUCE OTRO PARA MULTIPLICAR");
                    int f= scanner.nextInt();
                    System.out.println("El resultado de tu opereacion es: " + Operaciones.multiplicar(e, f));
                    break;
                case 4:
                    System.out.println("INTRODUCE UN NUMERO PARA DIVIDIR");
                    int g = scanner.nextInt();
                    System.out.println("INTRODUCE OTRO PARA DIVIDIR");
                    int h = scanner.nextInt();
                    System.out.println("El resultado de tu opereacion es: " + Operaciones.dividir(g, h));
                    break;
                case 5:
                    System.out.println("INTRODUCE UN NUMERO PARA CALCULAR EL RESTO");
                    int i = scanner.nextInt();
                    System.out.println("INTRODUCE OTRO PARA RESTO");
                    int j = scanner.nextInt();
                    System.out.println("El resultado de tu opereacion es: " + Operaciones.resto(i, j));
                    break;
                case 6:
                    System.out.println("INTRODUCE UN NUMERO PARA QUE TE CUENTE EL NUMERO DE CIFRAS DE ESE NUMERO");
                    String k = scanner.nextLine();
                    System.out.println("El resultado de tu opereacion es: " + Operaciones.cifras(k));
                    break;
                case 7:
                    System.out.println("INTRODUCE UN NUMERO PARA QUE TE CUENTE EL NUMERO DE CIFRAS DE ESE NUMERO");
                    int l = scanner.nextInt();
                    System.out.println("El resultado de tu opereacion es: " + Operaciones.sumcifras(l));
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    break;
                default:
                    System.out.println("OPCION NO VALIDA");
            }
        }

    }
}
