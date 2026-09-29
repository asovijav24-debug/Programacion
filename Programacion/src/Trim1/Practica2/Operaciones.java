package Trim1.Practica2;

public class Operaciones {

    public static int sumar(int a, int b){
        int c = a + b;
        return c;
    }

    public static int restar(int a, int b){
        int c = a - b;
        return c;
    }

    public static int multiplicar(int a, int b){
        int c = a * b;
        return c;
    }

    public static int dividir(int a, int b){
        int c = a / b;
        return c;
    }

    public static int resto(int a, int b){
        int c = a % b;
        return c;
    }

    public static int cifras(String a){
        int c = a.length();
        return c;
    }

    public static int sumcifras(int a){
        int c = 0;
        while(a>0){
            c += a%10;
            a = a/10;
        }
        return c;
    }

    public static int primos(int a){
        int c = 0;
        while(a>0){
            c += a%10;
            a = a/10;
        }
        return c;
    }

    public static int factorial(int a){
        int c = 0;
        while(a>0){
            c += a%10;
            a = a/10;
        }
        return c;
    }

    public static int maxcomundivisor(int a){
        int c = 0;
        while(a>0){
            c += a%10;
            a = a/10;
        }
        return c;
    }





}
