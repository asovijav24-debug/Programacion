package Trim1.practica3;

/*
* Se debe desarrollar un programa en Java que, dado un vector de enteros, muestre por pantalla el
numero de enteros positivos, el numero de enteros negativos, el numero de ceros, el numero de enteros
pares y el numero de enteros pares del vector dado.
 */
public class ejercicio1 {

    /*
    * Esta funcion se dedica a contar los numeros positivos, negativos, los ceros, los pares y impares y
    * te imprime por pantalla la cantidad de cada uno
     */
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

    /*
    * Este es nuestro main en el cual tenemos la tabla con los numeros que tenemos que contar y llamamos
    * a la funcion insertando dicha tabla
     */
    public static void main(String[] args) {
        int tabla[] = {1 ,2 ,3 ,4 ,5, 0 ,0 ,0 ,-1, -2, -3, -4, -5};
        estadisticasTabla(tabla);
    }
}
