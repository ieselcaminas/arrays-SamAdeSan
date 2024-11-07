
/// Ejercicio 8
public class Ejercicio8 {
    public static int Positivos (int[] numeros) {
        int positivos = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i]>=0){
                positivos++;
            }
        }
        return positivos;
    }
    public static int Negativos(int[] numeros) {
        int negativos = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < 0){
                negativos++;
            }
        }
        return negativos;
    }
    public static void main(String[] args) {
        int[] numeros = {6, -2};
        System.out.println("Los positivos son: " + Positivos(numeros));
        System.out.println("Los negativos son: " + Negativos(numeros));
    }
}
