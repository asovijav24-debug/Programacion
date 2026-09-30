package Trim1.Sistemas;


public class RecorridoPorColumnas {

    private static final int TAMANO = 5_000;
    private static final int REPETICIONES = 5;

    public static void main(String[] args) {

        int[][] matriz = crearMatriz();

        System.out.println("=================================");
        System.out.println("     RECORRIDO POR COLUMNAS");
        System.out.println("======================0.246790 ===========");
        System.out.println("Tamaño: " + TAMANO + " x " + TAMANO);
        System.out.println();

        // Calentamiento de la JVM
        recorrerMatriz(matriz);

        double tiempoTotal = 0;
        long sumaFinal = 0;

        for (int prueba = 1; prueba <= REPETICIONES; prueba++) {

            long inicio = System.nanoTime();

            sumaFinal = recorrerMatriz(matriz);

            long fin = System.nanoTime();

            double tiempo =
                    (fin - inicio) / 1_000_000_000.0;

            tiempoTotal += tiempo;

            System.out.printf(
                    "Prueba %d: %.6f segundos%n",
                    prueba,
                    tiempo
            );
        }

        System.out.println();
        System.out.println("Resultado de la suma: " + sumaFinal);

        System.out.printf(
                "Tiempo medio: %.6f segundos%n",
                tiempoTotal / REPETICIONES
        );
    }

    private static int[][] crearMatriz() {

        int[][] matriz = new int[TAMANO][TAMANO];

        for (int fila = 0; fila < TAMANO; fila++) {
            for (int columna = 0; columna < TAMANO; columna++) {
                matriz[fila][columna] = (fila + columna) % 100;
            }
        }

        return matriz;
    }

    private static long recorrerMatriz(int[][] matriz) {

        long suma = 0;

        for (int columna = 0; columna < matriz[0].length; columna++) {
            for (int fila = 0; fila < matriz.length; fila++) {

                suma += matriz[fila][columna];
            }
        }

        return suma;
    }
}