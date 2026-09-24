package Trim1.CarreraNucleos;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class CarreraNucleos {

    private static final int LIMITE = 20_000_000;
    private static final int REPETICIONES = 5;

    public static void main(String[] args)
            throws InterruptedException, ExecutionException {

        int procesadoresLogicos = Runtime.getRuntime().availableProcessors();

        int numeroHilos = obtenerNumeroHilos(args, procesadoresLogicos);

        System.out.println("====================================");
        System.out.println("       CARRERA DE LOS NÚCLEOS");
        System.out.println("====================================");
        System.out.println("Procesadores lógicos disponibles: "
                + procesadoresLogicos);
        System.out.println("Hilos utilizados: " + numeroHilos);
        System.out.println("Límite de búsqueda: " + LIMITE);
        System.out.println();

        // Calentamiento de la JVM para reducir el efecto del JIT
        contarPrimos(2, 1_000_000, numeroHilos);

        double tiempoTotal = 0;
        int cantidadPrimos = 0;

        for (int prueba = 1; prueba <= REPETICIONES; prueba++) {

            long inicio = System.nanoTime();

            cantidadPrimos = contarPrimos(
                    2,
                    LIMITE,
                    numeroHilos
            );

            long fin = System.nanoTime();

            double tiempoSegundos =
                    (fin - inicio) / 1_000_000_000.0;

            tiempoTotal += tiempoSegundos;

            System.out.printf(
                    "Prueba %d: %.3f segundos%n",
                    prueba,
                    tiempoSegundos
            );
        }

        double tiempoMedio = tiempoTotal / REPETICIONES;

        System.out.println();
        System.out.println("Cantidad de números primos: "
                + cantidadPrimos);

        System.out.printf(
                "Tiempo medio: %.3f segundos%n",
                tiempoMedio
        );
    }

    private static int obtenerNumeroHilos(
            String[] args,
            int procesadoresLogicos) {

        if (args.length == 0) {
            return 1;
        }

        return switch (args[0].toLowerCase()) {
            case "logicos" -> procesadoresLogicos;
            case "doble" -> procesadoresLogicos * 2;
            default -> Integer.parseInt(args[0]);
        };
    }

    private static int contarPrimos(
            int inicio,
            int fin,
            int numeroHilos)
            throws InterruptedException, ExecutionException {

        ExecutorService ejecutor =
                Executors.newFixedThreadPool(numeroHilos);

        List<Future<Integer>> resultados = new ArrayList<>();

        int cantidadNumeros = fin - inicio + 1;
        int tamañoBloque =
                (cantidadNumeros + numeroHilos - 1) / numeroHilos;

        for (int i = 0; i < numeroHilos; i++) {

            int inicioBloque = inicio + i * tamañoBloque;
            int finBloque = Math.min(
                    inicioBloque + tamañoBloque - 1,
                    fin
            );

            if (inicioBloque > fin) {
                break;
            }

            Callable<Integer> tarea = () -> {
                int contador = 0;

                for (int numero = inicioBloque;
                     numero <= finBloque;
                     numero++) {

                    if (esPrimo(numero)) {
                        contador++;
                    }
                }

                return contador;
            };

            resultados.add(ejecutor.submit(tarea));
        }

        int totalPrimos = 0;

        for (Future<Integer> resultado : resultados) {
            totalPrimos += resultado.get();
        }

        ejecutor.shutdown();

        return totalPrimos;
    }

    private static boolean esPrimo(int numero) {

        if (numero < 2) {
            return false;
        }

        if (numero == 2) {
            return true;
        }

        if (numero % 2 == 0) {
            return false;
        }

        for (int divisor = 3;
             divisor <= numero / divisor;
             divisor += 2) {

            if (numero % divisor == 0) {
                return false;
            }
        }

        return true;
    }
}