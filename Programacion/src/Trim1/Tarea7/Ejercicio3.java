package Trim1.Tarea7;

public class Ejercicio3 {

    public static boolean contains(String []tabla, String cadena){
        boolean result = false;
        for (int i = 0; i<tabla.length;i++){
            if (tabla[i].equals(cadena)){
                result = true;
            }
        }
        return result;
    }

    public static void main(String[] args){

        String cadena = "Hola";
        String tabla[] ={"Hola","Buenas","Que tal","Bon dia","Arrivederchi"};

        System.out.println("True si coincide la palabra con el texto de nuestra tabla : " + contains(tabla, cadena));
    }
}
