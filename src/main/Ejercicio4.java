
/// 4 Media de un array (F)
///
/// Calcula la media de un array de 10 posiciones
public class Ejercicio4 {
    public static void main(String[] args) {
        // Crear el array de 10 posiciones
        int[] array = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50};
        int suma = 0;
        // Sumar todos los elementos del array
        for (int i = 0; i < array.length; i++) {
            suma += array[i];
        }
        // Calcular la media dividiendo la suma entre el número de elementos
        double media = (double) suma / array.length;
        // Mostrar el resultado
        System.out.println("La media del array es: " + media);
    }
}
