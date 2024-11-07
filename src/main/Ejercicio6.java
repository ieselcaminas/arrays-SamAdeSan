
///6 Mínimo (M)
///
///Realiza un programa que imprima el menor de un array de 10 números
public class Ejercicio6 {
    public static void main(String[] args) {
        int[] numeros = {1, 6, 11, 30, 27};
        int min = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros [i] < min) {
                min = numeros [i];
            }
        }
        System.out.println(min);
    }
}
