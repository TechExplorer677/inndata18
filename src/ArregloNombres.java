import java.util.Scanner;

public class ArregloNombres {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        String [] nombres=new String[3];
        for (int i=0; i< nombres.length;i++){
            System.out.println("Ingrese un nombre ");
            nombres[i]=teclado.nextLine();
        }
        //barrido
        for (int i=0; i< nombres.length;i++) {
            System.out.println(nombres[i]+" ");
        }
    }
}
