public class EjemploArrays_Ejercicio1 {
    public static void main(String[] args) {
        /// declara una matriz (o array) de números enteros.
        int[] array;
        // asigna memoria para 10 números enteros
        array = new int[10];
        // iniciar primer elemento
        array[0] = 100;
        // iniciar segundo elemento
        array[1] = 200;
        // y así sucesívamente
        array[2] = 300;
        array[3] = 400;
        array[4] = 500;
        array[5] = 600;
        array[6] = 700;
        array[7] = 800;
        array[8] = 900;
        array[9] = 1000;


        System.out.println("Elemento en el índice 0: " + array[0]);
        System.out.println("Elemento en el índice 1: " + array[1]);
        System.out.println("Elemento en el índice 2: " + array[2]);
        System.out.println("Elemento en el índice 3: " + array[3]);
        System.out.println("Elemento en el índice 4: " + array[4]);
        System.out.println("Elemento en el índice 5: " + array[5]);
        System.out.println("Elemento en el índice 6: " + array[6]);
        System.out.println("Elemento en el índice 7: " + array[7]);
        System.out.println("Elemento en el índice 8: " + array[8]);
        System.out.println("Elemento en el índice 9: " + array[9]);
        /// Así es como siempre se tendrá que leer los arrays; con un bucle for que vaya de cero hasta lo extenso que sea nuestro array.
        System.out.println(" ");
        System.out.println("A partir de aqui es lo que tiene que salir.");
        System.out.println(" ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        // De la siguiente forma imprimos los arrays al revés.
        for (int i = array.length -1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }
}
