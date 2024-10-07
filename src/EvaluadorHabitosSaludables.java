import java.util.Scanner;

public class EvaluadorHabitosSaludables {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Cuántas horas duermes al día?");
        int horasDeSueño = scanner.nextInt();

        System.out.println("¿Cuántas horas haces ejercicio al día?");
        int horasDeEjercicio = scanner.nextInt();

        System.out.println("¿Cuántas comidas saludables consumes al día?");
        int comidasSaludables = scanner.nextInt();

        String evaluacion = "";

        if (horasDeSueño < 7) {
            evaluacion += "Deberías dormir más de 7 horas al día.\n";
        } else {
            evaluacion += "Tienes un buen hábito de sueño.\n";
        }

        if (horasDeEjercicio < 1) {
            evaluacion += "Intenta hacer al menos 1 hora de ejercicio al día.\n";
        } else {
            evaluacion += "¡Excelente! Haces suficiente ejercicio.\n";
        }

        if (comidasSaludables < 3) {
            evaluacion += "Consume más comidas saludables, al menos 3 al día.\n";
        } else {
            evaluacion += "Muy bien, mantienes una alimentación saludable.\n";
        }

        System.out.println("Evaluación de tus hábitos saludables:");
        System.out.println(evaluacion);

        scanner.close();
    }
}
