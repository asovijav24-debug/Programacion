package Trim1.Practica2;

/*
Aqui estan todas las operaciones que se realizaran en el main de calculadora
 */
public class Operaciones {

    /*
    Suma 2 numero y dvuelve el resultado
     */
    public static int sumar(int a, int b){
        int c = a + b;
        return c;
    }

    /*
    Resta 2 numero y devuelve el resultado
     */
    public static int restar(int a, int b){
        int c = a - b;
        return c;
    }

    /*
    Multiplica 2 numero y devuelve el resultado
     */
    public static int multiplicar(int a, int b){
        int c = a * b;
        return c;
    }

    /*
    Divide 2 numero y devuelve el resultado
     */
    public static int dividir(int a, int b){
        int c = a / b;
        return c;
    }

    /*
    Divide 2 numero y devuelve el resto
     */
    public static int resto(int a, int b){
        int c = a % b;
        return c;
    }

    /*
    Cuenta la cantidad de cifras que tiene el numero
     */
    public static int cifras(int a){
        int b = 0;
        int c = 0;
        while(a>0){
            b += a%10;
            a = a/10;
            c++;
        }
        return c;
    }

    /*
    Suma las cifras de un numero, 123 sumara 1 + 2 + 3
     */
    public static int sumcifras(int a){
        int c = 0;
        while(a>0){
            c += a%10;
            a = a/10;
        }
        return c;
    }

    /*
    Comprueba si un numero es primo o no y devuelve true o false
     */
    public static boolean primos (int a){
        int b = 2;
        while(b != a){
            if (a%b == 0){
                return false;
            }else{
                b++;
            }
            return true;
        }
        return false;
    }

    /*
    Saca el factorial de un numero
     */
    public static int factorial(int a){
        int b = 0;
        while(a>0){
            if (b == 0) {
                b = a;
            }else {
                b *= a;
                a--;
            }
        }
        return b;
    }

    /*
    Saca el maximo comun divisor de un numero
     */
    public static int maxcomundivisor(int a, int b){
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            return a;
    }







}
