// 3. DNI (F) Realiza un programa que lea un DNI sin letra y calcula la misma (usad un array para almacenar las letras)
package ArraysJava;
public class Ejercicio3 {
    public static void main(String[] args) {
        char []  letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B','N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K',	'E'};
        int dni = 73396505;
        int resto = dni % 23;
        char letra = letras[resto];
        System.out.println(letra);
    }
}
