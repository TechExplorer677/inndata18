import java.util.Scanner;

public class Promedio_Edad {
    public static void main (String[] args){
        Scanner teclado=new Scanner(System.in);

        String desicion;
        int edad;
        float cal;

        do {
            double suma=0, promedio=0;
            String Nombre;
            System.out.println("Ingrese nombre del alumno");
            Nombre = teclado.nextLine();
            System.out.println("Ingrese su edad");
            edad = teclado.nextInt();
            for (int i = 0; i < 3; i++) {
                System.out.println("Ingrese la calificacion " + (i + 1));
                cal = teclado.nextFloat();
                suma += cal;
            }

            promedio = suma / 3;
            if (promedio >= 6) {
                System.out.println("Tu promedio es " + promedio + ", aprobado");
            } else {
                System.out.println("No aprobado. Tu promedio es " + promedio);
            }
            if (edad >= 18) {
                System.out.println("Mayor de edad");
            } else {
                System.out.println("Menor de edad");
            }
            teclado.nextLine();
            System.out.println("Desea repetir el proceso? coloca S para si y N para no");
            desicion = teclado.nextLine();
            suma=0;
        }while (!desicion.equals("N"));
    }
}
