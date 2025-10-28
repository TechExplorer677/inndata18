import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class JugadoresBarcelona {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String jugador;
        Set <String> jugadores = new HashSet<>();
        System.out.println("Ingrese los nombres de los jugadores ");
        for (int i=0; i<3; i++){
            System.out.println("Jugador: "+(i+1));
            jugador=teclado.nextLine();
            jugadores.add(jugador);
        }
        System.out.println("Jugadores del Barcelona");
        for (String nombres: jugadores){
            System.out.println(nombres);
        }
        if (jugadores.contains("Neymar JR")){
            System.out.println("El jugador Neymar JR se encuentra");
        }else {
            System.out.println("El jugador Neymar JR no se encuentra");
        }
    }
}
