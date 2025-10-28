import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SolicitarDatos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombre, edad, sexo, correo;
        Map<String, String> datos = new LinkedHashMap<>();

        System.out.println("Ingrese su nombre");
        nombre = teclado.nextLine();
        datos.put("Nombre",nombre);

        System.out.println("Ingrese su edad");
        edad = teclado.nextLine();
        datos.put("Edad", edad);

        System.out.println("Ingrese su sexo (H o M)");
        sexo = teclado.nextLine();
        datos.put("Sexo", sexo);

        System.out.println("Ingrese su correo electronico");
        correo = teclado.nextLine();
        datos.put("Correo", correo);

        for (String dato: datos.keySet()){
            System.out.println(dato+":" + datos.get(dato));
        }
    }
}
