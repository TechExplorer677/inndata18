import java.util.Scanner;

public class Par_Impar {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int numero;
        do{
        System.out.println("¿Desea ingresar un numero? Pulse 0 para salir");
        numero=teclado.nextInt();
            if (numero!=0){
                if (numero % 2 == 0){
                    System.out.println("Es numero par");
                }else {
                    System.out.println("Es numero impar");
                }
            }
        }while(numero!=0);
    }
}
