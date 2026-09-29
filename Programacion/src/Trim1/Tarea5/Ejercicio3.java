package Trim1.Tarea5;

import java.util.Scanner;

/*

 */
public class Ejercicio3 {

    /*

     */
    public static String acortar(String a){
        String result = a.substring(0,a.length()-1);
        return result;
    }

    /*

     */
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribeme una palabra y le acortare la ultima letra");
        String fras = scanner.nextLine();
        System.out.println(acortar(fras));
    }
}
