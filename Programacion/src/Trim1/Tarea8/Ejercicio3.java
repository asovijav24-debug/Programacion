package Trim1.Tarea8;

public class Ejercicio3 {


    public static void estadisticasTabla(int tabla[]){

        int post = 0;
        int nega = 0;
        int zero = 0;
        int par = 0;
        int inpar = 0;
        for (int i = 0; i < tabla.length; i++){

            if (tabla[i] == 0){
                zero++;
            }else {
                if (tabla[i] % 2 == 0) {
                    par++;
                } else {
                    inpar++;
                }
                if (tabla[i] < 0) {
                    nega++;
                } else if (tabla[i] > 0) {
                    post++;
                }
            }
        }
        System.out.println("Hay " + post + " numeros postivos ");
        System.out.println("Hay " + nega + " numeros negativos ");
        System.out.println("Hay " + zero + " numeros cero ");
        System.out.println("Hay " + par + " numeros pares ");
        System.out.println("Hay " + inpar + " numeros inpares ");
    }

    public static void main(String[] args) {
        int tabla[] = {1 ,2 ,3 ,4 ,5, 0 ,0 ,0 ,-1, -2, -3, -4, -5};
        estadisticasTabla(tabla);
    }
}
