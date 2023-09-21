
import java.util.Scanner;

public class sumrec {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Programa para hacer una Sumatoria");
        System.out.println("-------------------------------------");

        System.out.println("Por favor, introduzca el valor que corresponda a Y: ");
        int y = input.nextInt();

        System.out.println("Por favor, introduzca el valor que corresponda a Z: ");
        System.out.println("----");
        int z = input.nextInt();

        int result = suma(y, z);

        System.out.println("Resultado de Sumatoria: " + result);
    }

    public static int suma(int y, int z) {
        if (y == z) {
            return y * y;
        } else {
            return y * y + suma(y + 1, z);
        }
    }}
