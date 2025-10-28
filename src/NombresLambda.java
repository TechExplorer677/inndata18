import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NombresLambda {
    public static void main(String[] args) {
        List<String> listaDeNombres = new ArrayList<>();
        listaDeNombres.add("Angel");
        listaDeNombres.add("Armando");
        listaDeNombres.add("Betty");
        listaDeNombres.add("Carolina");
        List<String> listaConA=listaDeNombres.stream().filter(name-> name.startsWith("A")).toList();
        System.out.println(listaConA);
        List<String> listaEnMayusculas = listaDeNombres.stream().map(nombre->nombre.toUpperCase()).toList();
        System.out.println(listaEnMayusculas);
        List<Integer> numeros= new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        Set<Integer> dobles= numeros.stream().map(numero->numero*2).collect(Collectors.toSet());
        System.out.println(dobles);
        Optional<Integer> s= numeros.stream().reduce((numero,suma)->suma+=numero);
        Integer s2= numeros.stream().mapToInt(Integer::intValue).sum();
        System.out.println(s2);
        System.out.println(s);

    }
}