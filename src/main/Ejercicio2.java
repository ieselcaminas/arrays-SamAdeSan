import java.util.Scanner;
/// 2 Orden inverso (F)
///
///Realiza un programa que lea 10 números y los muestre en orden inverso.
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[10]; // Array para almacenar los 10 números

        System.out.println("Introduce 10 números:");

        // Bucle para leer los 10 números y guardarlos en el array
        for (int i = 0; i <= 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            nums[i] = scanner.nextInt();
        }

        System.out.println("\nLos números en orden inverso son:");

        // Bucle para mostrar los números en orden inverso
        for (int i = 9; i >= 0; i--) {
            System.out.println(nums[i]);
        }
        scanner.close();
    }
}
