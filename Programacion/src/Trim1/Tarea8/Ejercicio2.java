package Trim1.Tarea8;

public class Ejercicio2 {

    public static int[] incrementarValores (int tabla[], int mult){

        for (int i = 0; i < tabla.length; i++){
            if (i != 0 && i != tabla.length - 1){
                tabla[i] *= mult;
            }
        }


        return tabla;
    }

    public static void main(String[] args) {
        int tabla[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int mult = 5;
        incrementarValores(tabla, mult);
        for (int i = 0; i < tabla.length; i++){
            System.out.println(tabla[i]);
        }
    }
}
