import java.util.InputMismatchException;
import java.util.Scanner;

public class ExcepcionNumeros {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean valido= false;
        try {
            while (!valido) {
                try {
                    double numeros;
                    System.out.println("Ingrese un numero");
                    numeros = teclado.nextDouble();
                    valido = true;
                } catch (InputMismatchException e) {
                    System.out.println("Error has ingresado una letra");
                    teclado.next();
                }
            }
        }finally {
            System.out.println("Fin del programa");
        }
        System.out.println("Numero ingresado correctamente");
    }
}
