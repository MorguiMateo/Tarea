import java.util.Scanner;

public class GeneradorPlanEstudio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cuántas horas al día puedes estudiar? ");
        int horasPorDia = scanner.nextInt();

        String[] materias = {"Matemáticas", "Física", "Química", "Historia", "Lengua", "Inglés", "Programación"};
        int totalHoras = horasPorDia * 7;
        int horasPorMateria = totalHoras / materias.length;

        System.out.println("\nPlan de Estudio Semanal:");
        for (String materia : materias) {
            System.out.println(materia + ": " + horasPorMateria + " horas");
        }

        scanner.close();
    }
}
