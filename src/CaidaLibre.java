import java.util.Scanner;

public class CaidaLibre {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Ingrese la velocidad inicial en m/s");
        double Vo = in.nextDouble();
        System.out.println("Ingrese el tiempo en segundos");
        double t = in.nextDouble();
        double g = 9.8;
        double V = Vo + g * t;
        System.out.println("La velocidad del objeto es: " + V + " m/s");
    }
}
