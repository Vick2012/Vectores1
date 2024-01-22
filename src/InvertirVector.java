
import java.util.Scanner;

public class InvertirVector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar al usuario llenar el vector original
        int[] vectorOriginal = new int[5];
        System.out.println("Ingrese 5 números para llenar el vector:");

        for (int i = 0; i < vectorOriginal.length; i++) {
            System.out.print("Ingrese el valor para la posición " + i + ": ");
            vectorOriginal[i] = sc.nextInt();
        }

        // Mostrar el vector original y sus subíndices
        System.out.println("Vector original:");
        mostrarVectorConSubindices(vectorOriginal);

        // Invertir el vector y guardarlo en otro vector
        int[] vectorInvertido = invertirVector(vectorOriginal);

        // Mostrar el vector invertido y sus subíndices
        System.out.println("\nVector invertido:");
        mostrarVectorConSubindices(vectorInvertido);
    }

    // Método para invertir un vector
    private static int[] invertirVector(int[] vector) {
        int[] vectorInvertido = new int[vector.length];
        for (int i = 0; i < vector.length; i++) {
            vectorInvertido[i] = vector[vector.length - 1 - i];
        }
        return vectorInvertido;
    }

    // Método para mostrar un vector con sus subíndices
    private static void mostrarVectorConSubindices(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Índice " + i + ": " + vector[i]);
        }
    }
}
