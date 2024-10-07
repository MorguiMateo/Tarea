import java.util.Scanner;

public class CalculadoraCostoViaje {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la distancia del viaje en kilómetros: ");
        double distancia = scanner.nextDouble();

        System.out.print("Ingrese el consumo de combustible en litros por kilómetro: ");
        double consumo = scanner.nextDouble();

        System.out.print("Ingrese el precio del combustible por litro: ");
        double precioPorLitro = scanner.nextDouble();

        double costoTotal = distancia * consumo * precioPorLitro;

        System.out.printf("El costo total del viaje es: %.2f\n", costoTotal);

        scanner.close();
    }
}
