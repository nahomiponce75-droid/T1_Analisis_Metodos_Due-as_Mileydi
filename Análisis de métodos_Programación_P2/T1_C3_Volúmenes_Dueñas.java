import java.util.Scanner;

public class T1_C3_Volúmenes_Dueñas {

    static double volumen(double lado) {
        return lado * lado * lado;
    }

    static double volumen(double radio, double altura) {
        return 3.14 * radio * radio * altura;
    }

    static double volumen(double largo, double ancho, double altura) {
        return largo * ancho * altura;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Cubo");
        System.out.println("2. Cilindro");
        System.out.println("3. Prisma rectangular");
        System.out.print("Elija una opción: ");
        int opcion = sc.nextInt();

        if (opcion == 1) {
            System.out.print("Ingrese el lado: ");
            double lado = sc.nextDouble();
            System.out.println("Volumen: " + volumen(lado));

        } else if (opcion == 2) {
            System.out.print("Ingrese el radio: ");
            double radio = sc.nextDouble();

            System.out.print("Ingrese la altura: ");
            double altura = sc.nextDouble();

            System.out.println("Volumen: " + volumen(radio, altura));

        } else if (opcion == 3) {
            System.out.print("Ingrese el largo: ");
            double largo = sc.nextDouble();

            System.out.print("Ingrese el ancho: ");
            double ancho = sc.nextDouble();

            System.out.print("Ingrese la altura: ");
            double altura = sc.nextDouble();

            System.out.println("Volumen: " + volumen(largo, ancho, altura));

        } else {
            System.out.println("Opción incorrecta.");
        }
    }
}
