package Trim1.Tarea5;

public class Ejercicio9 {

    public static void cara(){
        String a[] = new String[5];
        a[0] = " `+++++++`";
        a[1] = " (| º º |)";
        a[2] = "  |  >  |";
        a[3] = "  | '-' |";
        a[4] = "  +-----+";

        for (int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }

    }

    public static void main(String[] args){
        cara();
    }
}
