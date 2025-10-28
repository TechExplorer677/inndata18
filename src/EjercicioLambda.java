import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class EjercicioLambda {
    public static void main(String[] args) {
        List <String> listaNombre = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);
        String nom;
        int n;
        System.out.println("Cuantos nombres desea ingresar?");
        n = teclado.nextInt();
        teclado.nextLine();
        for (int i=0; i<n; i++){
            System.out.println("Ingrese el nombre: "+(i+1));
            nom = teclado.nextLine();
            listaNombre.add(nom);
        }
        List<String> listaPorNombre = listaNombre.stream().sorted().toList();
        System.out.println("Lista ordenada: "+listaPorNombre);
        System.out.println();
        List<String> listaEnMayusculas = listaPorNombre.stream().map(nombre->nombre.toUpperCase()).toList();
        System.out.println("Lista en mayuscula: "+listaEnMayusculas);
        System.out.println();
        List<String> listaFiltrada = listaEnMayusculas.stream().filter(nombre->nombre.endsWith("O")).toList();
        System.out.println("Lista Filtrada por la ultima letra: "+listaFiltrada);
    }
}
