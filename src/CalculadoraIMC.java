import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce tu peso en kilogramos: ");
        double peso = scanner.nextDouble();

        System.out.print("Introduce tu altura en metros: ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);

        String categoria;
        if (imc < 18.5) {
            categoria = "bajo peso";
        } else if (imc < 24.9) {
            categoria = "peso normal";
        } else if (imc < 29.9) {
            categoria = "sobrepeso";
        } else {
            categoria = "obesidad";
        }

        System.out.printf("Tu IMC es: %.2f\n", imc);
        System.out.println("Categoría: " + categoria);

        switch (categoria) {
            case "bajo peso":
                System.out.println("Recomendación: Considera consultar a un profesional de la salud para aumentar tu peso.");
                break;
            case "peso normal":
                System.out.println("Recomendación: Mantén tu estilo de vida saludable.");
                break;
            case "sobrepeso":
                System.out.println("Recomendación: Realiza actividad física regularmente y cuida tu alimentación.");
                break;
            case "obesidad":
                System.out.println("Recomendación: Es recomendable consultar a un profesional de la salud.");
                break;
        }

        scanner.close();
    }
}
