  import java.util.Scanner;

public class T1_C1_PlanillaDeAgua_Dueñas {

    static double leerConsumo(Scanner sc) {
        double m3;

        System.out.print("Ingrese el consumo: ");
        m3 = sc.nextDouble();

        while (m3 < 0) {
            System.out.print("No puede ser negativo. Ingrese otra vez: ");
            m3 = sc.nextDouble();
        }

        return m3;
    }

    static double calcularValor(double m3) {
        double valor;

        if (m3 <= 15) {
            valor = m3 * 0.40;
        } else {
            valor = 15 * 0.40 + (m3 - 15) * 0.75;
        }

        return valor + 2.50;
    }

    static void mostrarPlanilla(double m3, double valor) {
        System.out.println("Consumo: " + m3 + " m3");
        System.out.println("Total a pagar: $" + valor);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double consumo = leerConsumo(sc);
        double total = calcularValor(consumo);
        mostrarPlanilla(consumo, total);
    }
}
