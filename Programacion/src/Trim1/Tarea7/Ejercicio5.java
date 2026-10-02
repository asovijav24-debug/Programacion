package Trim1.Tarea7;

public class Ejercicio5 {

    public static String[] contains(String []tabla, String []tabla2, int i){
        tabla2[i] = tabla[i];
        return tabla2;
    }

    public static void main(String[] args){
        String cadena = "Hola";
        String tabla[] ={"Hola","Buenas","Que tal","Bon dia","Arrivederchi"};
        String tabla2[] = new String[tabla.length];
        System.out.println("Te mostrare tabla2 : ");
        for (int i = 0; i<tabla.length;i++) {
            System.out.println(contains(tabla, tabla2, i)[i]);
        }
    }
}
