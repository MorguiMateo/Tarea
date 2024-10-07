import java.util.Scanner;

public class GeneradorRutinas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa tu nivel de condición física (principiante, intermedio, avanzado): ");
        String nivel = scanner.nextLine().toLowerCase();

        String rutina = "";

        switch (nivel) {
            case "principiante":
                rutina = "Rutina Semanal para Principiantes:\n" +
                        "Lunes: Caminata rápida - 20 minutos\n" +
                        "Martes: Yoga - 30 minutos\n" +
                        "Miércoles: Descanso\n" +
                        "Jueves: Ejercicios de fuerza (cuerpo) - 20 minutos\n" +
                        "Viernes: Caminata suave - 30 minutos\n" +
                        "Sábado: Baile - 30 minutos\n" +
                        "Domingo: Descanso";
                break;
            case "intermedio":
                rutina = "Rutina Semanal para Intermedios:\n" +
                        "Lunes: Correr - 30 minutos\n" +
                        "Martes: Nadar - 30 minutos\n" +
                        "Miércoles: Entrenamiento de fuerza (pesas) - 45 minutos\n" +
                        "Jueves: Ciclismo - 40 minutos\n" +
                        "Viernes: HIIT - 30 minutos\n" +
                        "Sábado: Yoga - 30 minutos\n" +
                        "Domingo: Descanso";
                break;
            case "avanzado":
                rutina = "Rutina Semanal para Avanzados:\n" +
                        "Lunes: Correr - 45 minutos\n" +
                        "Martes: Entrenamiento de fuerza (pesas) - 60 minutos\n" +
                        "Miércoles: Ciclismo - 60 minutos\n" +
                        "Jueves: Kickboxing - 45 minutos\n" +
                        "Viernes: HIIT - 40 minutos\n" +
                        "Sábado: Natación - 60 minutos\n" +
                        "Domingo: Descanso o actividad ligera";
                break;
            default:
                System.out.println("Nivel de condición física no válido! Intenta de nuevo.");
                scanner.close();
                return;
        }

        System.out.println(rutina);
        scanner.close();
    }
}
