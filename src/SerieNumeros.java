import java.util.Scanner;

public class SerieNumeros {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n, numero;
        double suma=0,promedio;
        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;
        System.out.println("Cuantos numeros desea ingresar?(Solo numeros enteros)");
        n = teclado.nextInt();
        for (int i=0; i<n;i++){
            System.out.println("Ingrese el numero "+ (i+1));
            numero = teclado.nextInt();
            suma+=numero;
            if (numero>maximo){
                maximo=numero;
            }
            if (numero<minimo){
                minimo=numero;
            }
        }
        promedio = (suma/n);
        System.out.println("La suma es: "+suma);
        System.out.println("El promedio es: "+promedio);
        System.out.println("El numero maximo es: "+maximo);
        System.out.println("El numero minimo es: "+minimo);
    }
}
