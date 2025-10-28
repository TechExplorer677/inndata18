import java.util.Scanner;

public class MasaCorporal {
    public static void main (String[] args){
        Scanner in= new Scanner(System.in);
        String nombre;
        double peso, estatura, indiceMc;

        System.out.println("Ingrese su nombre");
        nombre= in.nextLine();
        System.out.println("Ingrese su peso en kilogramos");
        peso=in.nextDouble();
        System.out.println("Ingrese su estatura en metros");
        estatura=in.nextDouble();
        indiceMc=(peso/Math.pow(estatura, 2));
        System.out.println("Su nombre es: "+nombre);
        System.out.println("Su indice de masa corporal es: "+indiceMc);
    }
}
