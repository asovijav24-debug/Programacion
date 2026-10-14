package Trim1.Tarea8;

public class Ejercicio5 {

    public static void mayorYmenor(String []a){
        int max = 0;
        int min = 0;
        for (int i = 0; i < a.length; i++){
            if (a[i].length() > max){
                max = i;
            }
            if (a[i].length() < min){
                min = i;
            }
        }
        System.out.println("La palabra mayor es: " + a[max]);
        System.out.println("La palabra menor es: " + a[min]);
    }
    public static void main(String[] args) {
        String []tabla = {"uno", "dois", "treis", "cuatrop", "cincoc"};
        mayorYmenor(tabla);
    }
}
