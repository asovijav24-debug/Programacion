package Trim1.Tarea7;

public class Ejercicio4 {

    public static int indexContains(String []tabla, String cadena){
        int result = -1;
        for (int i = 0; i<tabla.length;i++){
            if (tabla[i].equals(cadena)){
                result = i;
            }
        }
        return result;
    }

    public static void main(String[] args){

        String cadena = "Bon dia";
        String tabla[] ={"Hola","Buenas","Que tal","Bon dia","Arrivederchi"};

        System.out.println("Te voy a dar el valor de el indice el coincidente en la tabla : " + indexContains(tabla, cadena));
    }
}
