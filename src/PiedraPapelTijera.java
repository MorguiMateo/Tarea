import java.util.Random;
import java.util.Scanner;

public class PiedraPapelTijera {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] opciones = {"Piedra", "Papel", "Tijera"};

        System.out.print("Elige piedra, papel o tijera: ");
        String eleccionUsuario = scanner.nextLine();

        int indiceComputadora = random.nextInt(3);
        String eleccionComputadora = opciones[indiceComputadora];

        System.out.println("Tu elección: " + eleccionUsuario);
        System.out.println("Elección de la computadora: " + eleccionComputadora);

        if (eleccionUsuario.equalsIgnoreCase(eleccionComputadora)) {
            System.out.println("¡Es un empate!");
        } else if (
                (eleccionUsuario.equalsIgnoreCase("Piedra") && eleccionComputadora.equals("Tijera")) ||
                        (eleccionUsuario.equalsIgnoreCase("Papel") && eleccionComputadora.equals("Piedra")) ||
                        (eleccionUsuario.equalsIgnoreCase("Tijera") && eleccionComputadora.equals("Papel"))
        ) {
            System.out.println("¡Ganaste!");
        } else {
            System.out.println("¡Perdiste!");
        }

        scanner.close();
    }
}
