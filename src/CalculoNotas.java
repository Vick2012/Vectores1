import java.util.Scanner;

public class CalculoNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario ingresar 3 notas del 15%
        double[] notas = new double[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Ingrese la nota " + (i + 1) + " del 15%: ");
            notas[i] = scanner.nextDouble();
        }

        // Calcular el promedio
        double promedio = calcularPromedio(notas);

        // Encontrar la nota más alta y su posición
        int posicionNotaMaxima = encontrarPosicionNotaMaxima(notas);
        double notaMaxima = notas[posicionNotaMaxima];

        // Encontrar la nota más baja y su posición
        int posicionNotaMinima = encontrarPosicionNotaMinima(notas);
        double notaMinima = notas[posicionNotaMinima];

        // Calcular el ponderado o nota final
        double ponderado = calcularPonderado(notas);

        // Mostrar los resultados
        System.out.println("\nResultados:");
        System.out.println("Promedio: " + promedio);
        System.out.println("Nota más alta: " + notaMaxima + " (Posición: " + posicionNotaMaxima + ")");
        System.out.println("Nota más baja: " + notaMinima + " (Posición: " + posicionNotaMinima + ")");
        System.out.println("Ponderado o nota final: " + ponderado);
    }

    // Método para calcular el promedio
    private static double calcularPromedio(double[] notas) {
        double suma = 0;
        for (double nota : notas) {
            suma += nota;
        }
        return suma / notas.length;
    }

    // Método para encontrar la posición de la nota más alta
    private static int encontrarPosicionNotaMaxima(double[] notas) {
        int posicionMaxima = 0;
        for (int i = 1; i < notas.length; i++) {
            if (notas[i] > notas[posicionMaxima]) {
                posicionMaxima = i;
            }
        }
        return posicionMaxima;
    }

    // Método para encontrar la posición de la nota más baja
    private static int encontrarPosicionNotaMinima(double[] notas) {
        int posicionMinima = 0;
        for (int i = 1; i < notas.length; i++) {
            if (notas[i] < notas[posicionMinima]) {
                posicionMinima = i;
            }
        }
        return posicionMinima;
    }

    // Método para calcular el ponderado o nota final
    //formula ponderado Ponderado= Nota1×Peso1 + Nota2×Peso2 +...+ NotaN×PesoN
    private static double calcularPonderado(double[] notas) {
        return notas[0] * 0.15 + notas[1] * 0.15 + notas[2] * 0.15;
    }
}
