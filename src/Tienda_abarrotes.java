import java.util.Scanner;

public class Tienda_abarrotes {

    public static void main (String[] args){
        Scanner in= new Scanner(System.in);
        double suma=0;
        double precio;
        String nombre;
        System.out.println("¿Cual es tu nombre?");
        nombre=in.nextLine();
        for(int i=0; i<3; i++){
            System.out.println("Ingresa el precio del producto"+(i+1));
            precio=in.nextDouble();
            suma+=precio;
        }
        System.out.println("Tu nombre es: "+nombre);
        System.out.println("El precio a pagar es: "+suma);
    }
}
