package Trim1.practica3;

import java.util.Scanner;

public class ejercicio2 {

    public static void insertar(int[]a, int pos, int val){
        int comp = 0;
        int comp2 = 0;
        for (int i = pos;i<a.length;i++){
            if (i==pos){
                comp = a[i];
                a[i] = val;
            }else{
                comp2 = a[i];
                a[i] = comp;
                comp = comp2;
            }
        }
        System.out.print("tabla[] = {");
        for (int i = 0; i < a.length; i++){
            System.out.print(a[i]);
            if (i != a.length-1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vamos a crear el vector, cuantos huecos quieres que tenga");
        int tabla[] = new int[scanner.nextInt() + 1];
        for (int i = 0; i<tabla.length -1 ; i++){
            System.out.println("Inserte un valor en en tabla[" + i + "]");
            tabla[i] = scanner.nextInt();
        }
        System.out.println("Vector creado ");
        System.out.println("Su vector quedo tal que:");
        System.out.print("tabla[] = {");
        for (int i = 0; i < tabla.length; i++){
            System.out.print(tabla[i]);
            if (i != tabla.length-1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
        System.out.println("Que valor quiere introducir a continuacion");
        int val = scanner.nextInt();
        System.out.println("En que posicion desea colocarlo");
        int pos = scanner.nextInt();
        insertar(tabla, pos, val);
    }
}
