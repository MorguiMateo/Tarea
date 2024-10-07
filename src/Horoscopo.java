import java.util.Scanner;

public class Horoscopo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce tu fecha de nacimiento (DD/MM/AAAA): ");
        String fecha = scanner.nextLine();
        String[] partes = fecha.split("/");
        int dia = Integer.parseInt(partes[0]);
        int mes = Integer.parseInt(partes[1]);

        String signo = "";
        String mensaje = "";

        switch (mes) {
            case 1:
                signo = (dia <= 20) ? "Capricornio" : "Acuario";
                mensaje = (dia <= 20) ? "Eres práctico y disciplinado." : "Eres innovador y libre.";
                break;
            case 2:
                signo = (dia <= 19) ? "Acuario" : "Piscis";
                mensaje = (dia <= 19) ? "Eres un pensador original." : "Eres intuitivo y compasivo.";
                break;
            case 3:
                signo = (dia <= 20) ? "Piscis" : "Aries";
                mensaje = (dia <= 20) ? "Eres imaginativo y artístico." : "Eres valiente y emprendedor.";
                break;
            case 4:
                signo = (dia <= 20) ? "Aries" : "Tauro";
                mensaje = (dia <= 20) ? "Eres enérgico y optimista." : "Eres estable y paciente.";
                break;
            case 5:
                signo = (dia <= 21) ? "Tauro" : "Géminis";
                mensaje = (dia <= 21) ? "Eres confiable y decidido." : "Eres versátil y curioso.";
                break;
            case 6:
                signo = (dia <= 21) ? "Géminis" : "Cáncer";
                mensaje = (dia <= 21) ? "Eres sociable y comunicativo." : "Eres sensible y protector.";
                break;
            case 7:
                signo = (dia <= 22) ? "Cáncer" : "Leo";
                mensaje = (dia <= 22) ? "Eres emocionalmente profundo." : "Eres carismático y generoso.";
                break;
            case 8:
                signo = (dia <= 23) ? "Leo" : "Virgo";
                mensaje = (dia <= 23) ? "Eres un líder natural." : "Eres analítico y perfeccionista.";
                break;
            case 9:
                signo = (dia <= 23) ? "Virgo" : "Libra";
                mensaje = (dia <= 23) ? "Eres práctico y detallista." : "Eres encantador y diplomático.";
                break;
            case 10:
                signo = (dia <= 23) ? "Libra" : "Escorpio";
                mensaje = (dia <= 23) ? "Eres equilibrado y justo." : "Eres apasionado y decidido.";
                break;
            case 11:
                signo = (dia <= 22) ? "Escorpio" : "Sagitario";
                mensaje = (dia <= 22) ? "Eres intenso y misterioso." : "Eres aventurero y optimista.";
                break;
            case 12:
                signo = (dia <= 21) ? "Sagitario" : "Capricornio";
                mensaje = (dia <= 21) ? "Eres filosófico y amoroso con la libertad." : "Eres ambicioso y auto-disciplinado.";
                break;
            default:
                System.out.println("Fecha inválida.");
                return;
        }

        System.out.println("Tu signo del zodiaco es: " + signo);
        System.out.println("Horóscopo: " + mensaje);
    }
}
