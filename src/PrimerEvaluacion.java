import java.util.*;

public class PrimerEvaluacion {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        List <Integer> numeros = new ArrayList<>();
        int n, numero;
        boolean valido = false;
        try {
            while (!valido){
                try {
                    System.out.println("Cuantos numeros desea ingresar?");
                    n = teclado.nextInt();

                    for (int i = 0; i < n; i++) {
                        System.out.println("Ingrese el numero: " + (i + 1));
                        numero = teclado.nextInt();
                        numeros.add(numero);
                    }
                    List<Integer> listaMayorQue = numeros.stream().filter(num -> num > 10).toList();
                    System.out.println("Numeros mayores que 10: " + listaMayorQue);

                    List<Integer> listaNumPorDos = listaMayorQue.stream().map(num -> num * 2).toList();
                    System.out.println("Numeros multiplicados por 2 despues del filtrado: " + listaNumPorDos);

                    Integer listasumatotal2 = listaNumPorDos.stream().mapToInt(Integer::intValue).sum();
                    System.out.println("La suma total de los numeros es: " + listasumatotal2);

                    valido = true;
                }catch (InputMismatchException e) {
                    System.out.println("Error has ingresado un caracter no valido verifica y comienza de nuevo");
                    teclado.next();
                }
            }
        } finally {
            System.out.println("Programa finalizado");
        }
    }
}
