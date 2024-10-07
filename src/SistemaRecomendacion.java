import java.util.Scanner;

public class SistemaRecomendacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Cuál es tu género de película favorito? (acción, comedia, drama, ciencia ficción)");

        String genero = scanner.nextLine().toLowerCase();
        String recomendacion = "";

        switch (genero) {
            case "acción":
                recomendacion = "Te recomendamos 'Mad Max: Fury Road'.";
                break;
            case "comedia":
                recomendacion = "Te recomendamos 'Superbad'.";
                break;
            case "drama":
                recomendacion = "Te recomendamos 'The Shawshank Redemption'.";
                break;
            case "ciencia ficción":
                recomendacion = "Te recomendamos 'Inception'.";
                break;
            default:
                recomendacion = "Lo siento, no tenemos recomendaciones para ese género.";
                break;
        }

        System.out.println(recomendacion);
        scanner.close();
    }
}
