package ArraysJava;
//5 Máximo (M)
//Realiza un programa que pida diez números e imprima el mayor
public class Ejercicio5 {
    public static void main(String[] args) {
        int[] numeros = {1, 4, 11, 30, 27};
        int max = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros [i] > max) {
                max = numeros [i];
            }
        }
        System.out.println(max);
    }
}
