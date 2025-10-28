import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Diccionario {
    public static void main(String[] args) {
        //HashMap no existe orden
        //TreeMap le de un orden natural o conforme el codigo ascii
        //LinkedHashMap En orden que nosotros le decimos
        Map<String, Integer> puntuaciones = new HashMap<>();

        //Agregando elementos (pares clave-valor)
        puntuaciones.put("Ana",1500);
        puntuaciones.put("Ernesto", 2000);
        puntuaciones.put("Carlos", 1200);
        System.out.println(puntuaciones);
        puntuaciones.put("Ernesto",3000);
        System.out.println(puntuaciones);
        System.out.println("La puntiacion de Ernesto es: "+puntuaciones.get("Ernesto")); //["Ernesto"];
        for (String nombre: puntuaciones.keySet()){
            System.out.println(nombre+ " -> "+ puntuaciones.get(nombre));
        }
        puntuaciones.remove("Ernesto");
        System.out.println(puntuaciones);
    }
}
