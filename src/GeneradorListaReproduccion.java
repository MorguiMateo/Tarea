import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class GeneradorListaReproduccion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> playlists = new HashMap<>();
        playlists.put("feliz", List.of("Happy - Pharrell Williams", "Walking on Sunshine - Katrina and the Waves", "Good Vibrations - The Beach Boys"));
        playlists.put("triste", List.of("Someone Like You - Adele", "Fix You - Coldplay", "Tears Dry on Their Own - Amy Winehouse"));
        playlists.put("enérgico", List.of("Uptown Funk - Mark Ronson", "Can't Stop the Feeling! - Justin Timberlake", "Stronger - Kanye West"));
        playlists.put("relajado", List.of("Weightless - Marconi Union", "Sunset Lover - Petit Biscuit", "River Flows in You - Yiruma"));

        System.out.println("Ingrese su estado de ánimo (feliz, triste, enérgico, relajado): ");
        String estado = scanner.nextLine().toLowerCase();

        List<String> canciones = playlists.get(estado);

        if (canciones != null) {
            System.out.println("Lista de reproducción para estado de ánimo '" + estado + "': ");
            for (String cancion : canciones) {
                System.out.println("- " + cancion);
            }
        } else {
            System.out.println("Estado de ánimo no reconocido. Intente nuevamente.");
        }

        scanner.close();
    }
}
