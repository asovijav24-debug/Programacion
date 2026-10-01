package Trim1.practicavictoria;

public class Operaciones {
    public static int sumar(int a, int b) {
        int c = a + b;
        return c;
    }

    public static int restar(int a, int b) {
        int c = a - b;
        return c;
    }

    public static int multiplicar(int a, int b) {
        int c = a * b;
        return c;
    }

    public static int dividir(int a, int b) {
        int c = a / b;
        return c;
    }

    public static int resto(int a, int b) {
        int c = a % b;
        return c;
    }

    public static int numero_cifras(int a) {
        int cifras = 0;

        while(a != 0) {
            a = a / 10;
            cifras++;
        }
        return cifras;
    }
}
