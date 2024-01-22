import java.util.Scanner;

public class NotasUniversidad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el nombre del estudiante y la asignatura
        System.out.print("Ingrese el nombre del estudiante: ");
        String nombreEstudiante = scanner.nextLine();
        System.out.print("Ingrese la asignatura: ");
        String asignatura = scanner.nextLine();

        // Crear un vector para almacenar las notas totales
        double[] notasTotales = new double[12];

        // Solicitar las notas para cada corte
        for (int corte = 1; corte <= 3; corte++) {
            System.out.println("\nCorte " + corte + ":");

            // 1° Parcial
            System.out.print("Ingrese la nota del 1° parcial: ");
            notasTotales[(corte - 1) * 4] = scanner.nextDouble();

            // Q.T.T.E
            System.out.println("Ingrese las 3 notas de Q.T.T.E:");
            for (int i = 1; i <= 3; i++) {
                System.out.print("Nota " + i + ": ");
                notasTotales[(corte - 1) * 4 + i] = scanner.nextDouble();
            }
        }

        // Calcular notas promedio y ponderadas
        double[] promediosQTTExCorte = new double[3];
        double[] ponderadasxCorte = new double[3];

        for (int corte = 1; corte <= 3; corte++) {
            // Calcular promedio de Q.T.T.E
            double sumaQTTExCorte = 0;
            for (int i = 1; i <= 3; i++) {
                sumaQTTExCorte += notasTotales[(corte - 1) * 4 + i];
            }
            promediosQTTExCorte[corte - 1] = sumaQTTExCorte / 3;

            // Calcular nota ponderada
            ponderadasxCorte[corte - 1] = notasTotales[(corte - 1) * 4] * 0.25 + promediosQTTExCorte[corte - 1] * 0.75;
        }

        // Mostrar los resultados
        System.out.println("\nResultados para el estudiante " + nombreEstudiante + " en la asignatura de " + asignatura + ":");
        for (int corte = 1; corte <= 3; corte++) {
            System.out.println("\nCorte " + corte + ":");
            System.out.println("NOTA DEL " + corte + "° PARCIAL: " + notasTotales[(corte - 1) * 4]);
            System.out.println("NOTA PROMEDIO DE Q.T.T.E DEL " + corte + "° CORTE: " + promediosQTTExCorte[corte - 1]);
            System.out.println("NOTA PONDERADA DEL " + corte + "° CORTE: " + ponderadasxCorte[corte - 1]);
        }

        // Calcular y mostrar la nota ponderada final
        double ponderadaFinal = (ponderadasxCorte[0] + ponderadasxCorte[1] + ponderadasxCorte[2]) / 3;
        System.out.println("\nNOTA PONDERADA FINAL: " + ponderadaFinal);

        // Indicar si el estudiante aprobó o reprobó
        if (ponderadaFinal >= 3.0) {
            System.out.println("El estudiante APROBÓ la asignatura.");
        } else {
            System.out.println("El estudiante REPROBÓ la asignatura.");
        }
    }
}
