import java.util.Scanner;

public class CalculadoraIndiceFelicidad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nivel de satisfacción con la vida (1-10): ");
        int satisfaccionVida = scanner.nextInt();

        System.out.print("Nivel de estrés (1-10): ");
        int nivelEstres = scanner.nextInt();

        System.out.print("Nivel de salud (1-10): ");
        int nivelSalud = scanner.nextInt();

        if (satisfaccionVida < 1 || satisfaccionVida > 10 || nivelEstres < 1 || nivelEstres > 10 || nivelSalud < 1 || nivelSalud > 10) {
            System.out.println("Por favor, introduce valores entre 1 y 10.");
            scanner.close();
            return;
        }

        double indiceFelicidad = (satisfaccionVida - nivelEstres + nivelSalud) / 2.0;

        System.out.printf("\nTu índice de felicidad es: %.2f\n", indiceFelicidad);

        scanner.close();
    }
}
