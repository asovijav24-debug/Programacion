package Trim1.Tarea10;

public class ejercicio1 {

    public static void main(String[] args) {

        String empleados[] = {"Javier Marías", "Antonio Muñoz", "Isabel Allende"};
        int salarios[][] = { {700, 900, 1300} , {1000, 950, 1080}, {1300, 930, 1200} };

        for (int i = 0; i < empleados.length; i++) {
            int suma = 0;
            System.out.print(empleados[i] + "-> ");
            for (int j = 0; j < empleados.length; j++) {

                suma += salarios[i][j];
                if (j == empleados.length - 1) {
                    System.out.println(salarios[i][j] + " = " + suma + "€");
                }else {
                    System.out.print(salarios[i][j] + " + ");
                }

            }

        }
    }
}
