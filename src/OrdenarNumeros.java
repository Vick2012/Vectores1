
import java.util.Arrays;
import java.util.Random;

public class OrdenarNumeros {
    public static void main(String[] arg) {

        //crear tamaño vector
        int[] num = new int[10];

        //Generar 10 numeros aleatorios y almacenarlos en el vector
        Random rand = new Random();
        for (int i = 0; i < num.length; i++){
            num[i] = rand.nextInt(100); // Numeros aleatorios hasta 100
        }

        System.out.println("\n\t\tORDENAMIENTO DE NUMEROS");

        //mostrar vector original
        System.out.println("Vector Original:             " + Arrays.toString(num.clone()));

        //Ordenar vector en orden asecendente
        Arrays.sort(num);

        //Mostrac vector en orden ascendente
        System.out.println("Vector en orden Ascendente:  " + Arrays.toString(num));

        //Ordenar vector de forma descendente
        for (int i = 0; i < num.length / 2; i++) {
            int temp = num[i];
            num[i] = num[num.length - 1 - i];
            num[num.length - 1 - i] = temp;

        }
        //Mostrar vector en forma descendente
        System.out.println("Vector en Orden Descendente: " + Arrays.toString(num));

    }

}
