package Trim1.Tarea7;

public class Ejercicio1 {

    public static int sum(int []tabla){
        int result = 0;
        for (int i = 0; i<tabla.length;i++){
            result += tabla[i];
        }
        return result;
    }

    public static void main(String[] args){

        int tabla[] ={1,2,3,4,5};

        System.out.println("El resultado de la suma de la tabla es : " + sum(tabla));
    }

}
