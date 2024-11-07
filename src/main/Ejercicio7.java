import java.util.Scanner;
 /// 7. Marco con Cadenas (M)
///
/// Escribe una función que recoja una lista de cinco cadenas, una por línea, y las imprima en un marco rectangular. Por ejemplo, la lista [ "Hola”, “esto”, “es”, “un”, “marco”]
public class Ejercicio7 {
    // metodo para hacer el cálculo del maximo número de cadenas.
    public static int calcularMaximo(String[] cadenas){
        int maxima;
        maxima = cadenas[0].length();
        for (int i = 0; i < cadenas.length; i++){
            if (cadenas[i].length() > maxima){
                maxima = cadenas[i].length();
            }
        }
        return maxima;
    }
    // metodo para insertar los asteriscos.
    public static String asteriscos(int maxima){
        String asteriscos = "";
        for (int i = 0; i < maxima + 4; i++){
            asteriscos += "*";
        }
        return asteriscos;
    }
    // Insertamos los datos en el main y luego los calculamos.
    public static void main(String[] args){
        String[] cadenas = new String[5];
        Scanner sc;
        sc = new Scanner(System.in);
        int maxima = 0;
        for (int i = 0; i < cadenas.length; i++){
            cadenas[i] = sc.next();
        }
        for (int i = 0; i < cadenas.length; i++){
            System.out.println("* " + cadenas[i]);
        }
        //longitud máxima
        maxima = calcularMaximo(cadenas);
        System.out.println(asteriscos(maxima));
        sc.close();
    }
}