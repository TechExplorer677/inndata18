import java.util.Scanner;

public class Codicion4Numeros {
    public static void main (String[] args){
        Scanner teclado=new Scanner(System.in);
        System.out.println("Ingrese el valor 1");
        double a=teclado.nextDouble();
        System.out.println("Ingrese el valor 2");
        double b=teclado.nextDouble();
        System.out.println("Ingrese el valor 3");
        double c=teclado.nextDouble();
        System.out.println("Ingrese el valor 4");
        double d=teclado.nextDouble();
        if (a>b && a>c && a>d){
            System.out.println("El numero mayor es: "+ a);
        } else if (b>a && b>c && b>d) {
            System.out.println("El numero mayor es: "+ b);
        } else if (c>a && c>b && c>d) {
            System.out.println("El numero mayor es: "+ c);
        } else if (d>a && d>b && d>c) {
            System.out.println("El numero mayor es: "+ d);
        }else {
            System.out.println("Existen 2 o mas numeros iguales que son mayores");
        }
    }
}
