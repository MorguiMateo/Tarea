import java.util.Scanner;

public class SistemaRecomendacionActividades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Cómo te sientes hoy? (feliz, triste, enérgico, relajado)");
        String estadoAnimo = scanner.nextLine().toLowerCase();

        String recomendacion = "";

        switch (estadoAnimo) {
            case "feliz":
                recomendacion = "Disfruta de un paseo por el parque o pasa tiempo con amigos.";
                break;
            case "triste":
                recomendacion = "Escucha música alegre o haz una actividad creativa como pintar.";
                break;
            case "enérgico":
                recomendacion = "Haz ejercicio, sal a correr o prueba una clase de baile.";
                break;
            case "relajado":
                recomendacion = "Dedica tiempo a meditar o a leer un buen libro.";
                break;
            default:
                recomendacion = "Estado de ánimo no reconocido. Por favor, ingresa feliz, triste, enérgico o relajado.";
        }

        System.out.println("Recomendación: " + recomendacion);

        scanner.close();
    }
}
