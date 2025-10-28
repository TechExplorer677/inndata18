import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class Persona {
    String nombre;
    String contrasena;
    String correo;
    String status;
    String noCuenta;

    public Persona(String nombre, String contrasena, String correo, String status, String noCuenta) {
        this.nombre = nombre;
        this.contrasena = contrasena;
        this.correo = correo;
        this.status = status;
        this.noCuenta = noCuenta;
    }

    @Override
    public String toString() {
        return nombre + " - " + correo + " - " + status + " - " + noCuenta;
    }
}
public class EjercicioLambdaPedirDatos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        List<Persona> listaPersonas = new ArrayList<>();
        String nombre, contrasena, correo, status, NoCuenta;
        System.out.println("Ingrese su nombre");
        nombre = teclado.nextLine();

        System.out.println("Ingrese su contraseña");
        contrasena = teclado.nextLine();

        System.out.println("Ingrese su status");
        status = teclado.nextLine();

        System.out.println("Ingrese su correo");
        correo = teclado.nextLine();

        System.out.println("Ingrese su numero de cuenta");
        NoCuenta = teclado.nextLine();

        listaPersonas.add(new Persona(nombre, contrasena, correo, status, NoCuenta));
        // Filtrar personas con status "desactivado"
        List<Persona> filtradoStatus = listaPersonas.stream()
                .filter(p -> p.status.equalsIgnoreCase("desactivado")).toList();

        System.out.println("Persona(s) con status desactivado: " + filtradoStatus);
    }
}
