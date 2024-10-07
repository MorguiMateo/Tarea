import java.util.Scanner;

public class RecomendadorDeLibros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Cuál es tu género de libro favorito? (fantasía, misterio, romance, ciencia ficción)");
        String generoFavorito = scanner.nextLine().toLowerCase();

        String recomendacion = switch (generoFavorito) {
            case "fantasía" -> "Te recomendamos 'El Hobbit' de J.R.R. Tolkien.";
            case "misterio" -> "Te recomendamos 'El nombre de la rosa' de Umberto Eco.";
            case "romance" -> "Te recomendamos 'Orgullo y prejuicio' de Jane Austen.";
            case "ciencia ficción" -> "Te recomendamos 'Dune' de Frank Herbert.";
            default -> "Lo siento, no tengo recomendaciones para ese género.";
        };

        System.out.println(recomendacion);
        scanner.close();
    }
}
