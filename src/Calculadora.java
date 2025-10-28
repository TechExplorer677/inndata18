import java.util.Scanner;

public class Calculadora {
    //psvm
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("""
                1. Suma
                2. Resta
                3. Multiplicacion
                4. Division
                5. Salir
                """);
        int opcion=0;
        while (opcion !=5) {
            System.out.println("¿Que opcion deseas?");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Estoy sumando");
                    suma();
                    break;
                case 2:
                    System.out.println("Estoy restando");
                    resta();
                    break;
                case 3:
                    System.out.println("Estoy multiplicando");
                    mul();
                    break;
                case 4:
                    System.out.println("Estoy dividiendo");
                    div();
                    break;
                case 5:
                    System.out.println("Fin del programa");
                    break;
                default:
                    System.out.println("Opcion no existente");
            }
        }
    }
    static double suma(){
        Scanner teclado = new Scanner(System.in);
        double n1;
        double n2;
        double resultado;
        System.out.println("Ingresa el numero 1");
        n1= teclado.nextDouble();
        System.out.println("Ingrese el numero 2");
        n2= teclado.nextDouble();
        resultado=(n1+n2);
        System.out.println("El resultado es: "+ resultado);
        return resultado;
    }
    static double resta(){
        Scanner teclado = new Scanner(System.in);
        double n1;
        double n2;
        double resultado;
        System.out.println("Ingresa el numero 1");
        n1= teclado.nextDouble();
        System.out.println("Ingrese el numero 2");
        n2= teclado.nextDouble();
        resultado=(n1-n2);
        System.out.println("El resultado es: "+ resultado);
        return resultado;
    }
    static double mul(){
        Scanner teclado = new Scanner(System.in);
        double n1;
        double n2;
        double resultado;
        System.out.println("Ingresa el numero 1");
        n1= teclado.nextDouble();
        System.out.println("Ingrese el numero 2");
        n2= teclado.nextDouble();
        resultado=(n1*n2);
        System.out.println("El resultado es: "+ resultado);
        return resultado;
    }
    static double div(){
        Scanner teclado = new Scanner(System.in);
        double n1;
        double n2;
        double resultado;
        System.out.println("Ingresa el numero 1");
        n1= teclado.nextDouble();
        System.out.println("Ingrese el numero 2");
        n2= teclado.nextDouble();
        resultado=(n1/n2);
        System.out.println("El resultado es: "+ resultado);
        return resultado;
    }
}
