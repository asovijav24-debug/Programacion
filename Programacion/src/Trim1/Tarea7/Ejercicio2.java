package Trim1.Tarea7;

public class Ejercicio2 {

    public static double average(double []tabla){
        double result = 0;
        for (int i = 0; i<tabla.length;i++){
            result += tabla[i];
        }
        result = result/tabla.length;
        return result;
    }

    public static void main(String[] args){
        double tabla[] ={1,2,3,4,5};
        System.out.println("El promedio de los numeros de la tabla es: " + average(tabla));
    }
}
