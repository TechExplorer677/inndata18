//Arreglo que muestre solo la vocales

import java.util.Scanner;

public class ArregloVocales {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String palabra;
        System.out.println("Ingrese una palabra");
        palabra = teclado.nextLine();
        char [] p = palabra.toCharArray();
        System.out.println("Las vocales son: ");
        for (int i=0; i< p.length; i++) {
            char c = p[i];
            if (c == 'a' || c== 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u' || c == 'U'){
                System.out.println(c);
            }
        }
    }
}
