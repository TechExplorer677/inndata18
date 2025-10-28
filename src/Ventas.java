import java.util.Scanner;

public class Ventas {
    public static void main (String[] args){
        Scanner teclado=new Scanner(System.in);
        int ventas;
        System.out.println("¿Cuantas ventas realizaste?");
        ventas=teclado.nextInt();
        if (ventas>0){
            if (ventas < 20) {
                System.out.println("Ventas bajas");
            } else if (ventas >= 20 && ventas <= 40) {
                System.out.println("Ventas medias");
            } else {
                System.out.println("Ventas altas");
            }
        }else {
            System.out.println("No hay ventas negativas");
        }
    }
}
