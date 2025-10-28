import java.util.Scanner;

public class EcuacionGrado2 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Ingrese el valor de a");
        double a = in.nextDouble();
        System.out.println("Ingrese el valor de b");
        double b = in.nextDouble();
        System.out.println("Ingrese el valor de c");
        double c = in.nextDouble();
        double resultado1, resultado2;
        double x=((Math.pow(b,2))-((4*a)*c));
        resultado1= (-b-Math.sqrt(x))/(2*a);
        resultado2= (-b+Math.sqrt(x))/(2*a);;
        System.out.println("El resultado 1 es: "+resultado1);
        System.out.println("El resultado 2 es: "+resultado2);
    }
}
