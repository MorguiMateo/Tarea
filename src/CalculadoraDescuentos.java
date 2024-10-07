import java.util.Scanner;

public class CalculadoraDescuentos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el precio del producto: ");
        double precio = scanner.nextDouble();

        System.out.println("Introduce la categoría del cliente (estudiante, adulto, jubilado): ");
        String categoria = scanner.next().toLowerCase();

        double descuento = 0.0;

        switch (categoria) {
            case "estudiante":
                descuento = 0.10;
                break;
            case "adulto":
                descuento = 0.05;
                break;
            case "jubilado":
                descuento = 0.15;
                break;
            default:
                System.out.println("Categoría no válida.");
                scanner.close();
                return;
        }

        double precioFinal = precio - (precio * descuento);
        System.out.printf("El precio final después de aplicar el descuento es: %.2f\n", precioFinal);

        scanner.close();
    }
}
