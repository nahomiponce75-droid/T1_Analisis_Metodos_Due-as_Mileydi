import java.util.Scanner;

public class T1_C2_Notas_Dueñas {

    static double promedio(double a, double b, double c) {
        return (a + b + c) / 3;
    }

    static String estado(double nota) {
        if (nota >= 14) {
            return "Aprobado";
        } else if (nota >= 9) {
            return "Supletorio";
        } else {
            return "Reprobado";
        }
    }

    static double necesitaEnSupletorio(double nota) {
        return 28 - nota;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la primera nota: ");
        double a = sc.nextDouble();

        System.out.print("Ingrese la segunda nota: ");
        double b = sc.nextDouble();

        System.out.print("Ingrese la tercera nota: ");
        double c = sc.nextDouble();

        double nota = promedio(a, b, c);

        System.out.println("Promedio: " + nota);
        System.out.println("Estado: " + estado(nota));

        if (nota >= 9 && nota < 14) {
            System.out.println(
                "Necesita en supletorio: " + necesitaEnSupletorio(nota)
            );
        }
    }
}
