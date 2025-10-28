import java.util.Scanner;

public class SalarioEstatura {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        String nombre= teclado.nextLine();
        System.out.println("Ingrese su altura en cm");
        int altura=teclado.nextInt();
        System.out.println("Ingrese su salario");
        int salario=teclado.nextInt();
        //Clasificar la altura
        if (altura>0){
            if (altura<162){
                System.out.println("Altura baja");
            } else if (altura>=162 && altura<=172) {
                System.out.println("Altura media");
            }else {
                System.out.println("Eres alto");
            }
        }else {
            System.out.println("La altura no puede ser negativa");
        }
        //Clasificar el salario
        if (salario>0){
            if (salario<8000){
                System.out.println("Ingreso bajo");
            } else if (salario>=8000 && salario<=20000) {
                System.out.println("Ingreso medio");
            }else {
                System.out.println("Ingreso alto");
            }
        }else {
            System.out.println("El salario no puede ser negativo");
        }
    }
}
