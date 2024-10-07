import java.util.Scanner;

public class CalculadoraCalorias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu peso en kilogramos: ");
        double peso = scanner.nextDouble();

        System.out.print("Ingresa la duración del ejercicio en minutos: ");
        double duracion = scanner.nextDouble();

        System.out.println("Selecciona el tipo de ejercicio:");
        System.out.println("1. Correr");
        System.out.println("2. Nadar");
        System.out.println("3. Andar en bicicleta");
        int tipoEjercicio = scanner.nextInt();

        double caloriasQuemadas = 0;

        switch (tipoEjercicio) {
            case 1: // Correr
                caloriasQuemadas = peso * duracion * 0.1;
                break;
            case 2: // Nadar
                caloriasQuemadas = peso * duracion * 0.13;
                break;
            case 3: // Andar en bici
                caloriasQuemadas = peso * duracion * 0.08;
                break;
            default:
                System.out.println("Tipo de ejercicio no válido!");
                return;
        }

        System.out.printf("Calorías quemadas: %.2f%n", caloriasQuemadas);

        scanner.close();
    }
}
